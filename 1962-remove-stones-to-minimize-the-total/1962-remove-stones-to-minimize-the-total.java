class Solution {
    public int minStoneSum(int[] piles, int k) {
       PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
       int sum = 0;
        
        for(int number: piles) {
            heap.add(number);
        }

        for(int i=0; i<k; i++) {
            int maximum = heap.poll();
            maximum -= maximum/2;
            heap.add(maximum);
        }

        for(int i=0; i<piles.length; i++) {
            sum += heap.poll();
        }

        return sum;
    }
}