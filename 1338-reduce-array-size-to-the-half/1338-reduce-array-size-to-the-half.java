class Solution {
    public int minSetSize(int[] arr) {
        int arrSize = arr.length;
        int minSetSize = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int number: arr) {
            if(!map.containsKey(number)) {
                map.put(number, 1);
            } else {
                map.put(number, map.get(number) + 1);
            }
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue(map.size(), Map.Entry.comparingByValue(Comparator.reverseOrder()));
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            heap.add(entry);
        }
        
        while(arrSize > (arr.length/2)) {
            Map.Entry<Integer,Integer> maxNumber = heap.poll();
            arrSize -= maxNumber.getValue();
            minSetSize++;
        }
        
        return minSetSize;
    }
}