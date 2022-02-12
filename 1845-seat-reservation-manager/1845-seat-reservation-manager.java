class SeatManager {
    PriorityQueue<Integer> pq;
    public SeatManager(int n) {
        pq = new PriorityQueue<>(n);
        for(int j=1; j<=n ; j++)
            pq.add(j);
    }
    
    public int reserve() {
        return pq.remove();
    }
    
    public void unreserve(int seatNumber) {
        pq.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */