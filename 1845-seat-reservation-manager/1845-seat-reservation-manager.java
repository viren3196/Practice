class SeatManager {
    PriorityQueue<Integer> pq;
    //List<Integer> avlSeats;
    // int[] heap;
    // int size;
    public SeatManager(int n) {
        pq = new PriorityQueue<>(n);
        // avlSeats = new ArrayList<>();
        for(int j=1; j<=n ; j++)
            pq.add(j);
    }
    
    //3 4 5 
    
    public int reserve() {
        return pq.remove();
        // int temp = avlSeats.get(0);
        // avlSeats.remove(0);
        // return temp;
    }
    
    public void unreserve(int seatNumber) {
        pq.add(seatNumber);
        // int i;
        // for(i=0 ; i<avlSeats.size() ; i++){
        //     if(seatNumber<avlSeats.get(i)){
        //         break;
        //     }    
        // }
        // avlSeats.add(i,seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */