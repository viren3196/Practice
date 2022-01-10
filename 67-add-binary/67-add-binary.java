class Solution {
    public String addBinary(String a, String b) {
        String res = "";
        if(a.length() < b.length()){
            String temp = a;
            a = b;
            b = temp;
        }
        int carry = 0;
        for(int i=b.length()-1, j=a.length()-1 ; i>=0 ; i--,j--){
            int num1 = b.charAt(i)-'0';
            int num2 = a.charAt(j)-'0';
            int ans = num1+num2+carry;
            if(ans == 3){
                res = "1" + res;  
                carry = 1;
            }
            else if(ans == 2){
                res = "0" + res;  
                carry = 1;
            } else{
                res = String.valueOf(ans) + res;    
                carry = 0;
            }
        }
        System.out.println(res);
        for(int i=a.length()-b.length()-1 ; i>=0 ; i--){
            int num2 = a.charAt(i)-'0';
            int ans = num2+carry;
            if(ans == 2){
                res = "0" + res;  
                carry = 1;
            } else{
                res = String.valueOf(ans) + res;    
                carry = 0;
            }
        }
        if(carry==1){
            res = "1" + res;
        }
        return res;
    }
}