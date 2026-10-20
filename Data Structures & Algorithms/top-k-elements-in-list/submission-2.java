class Solution {
    public int[] topKFrequent(int[] nums, int k) {
   if(nums.length == k) return nums;
HashMap<Integer, Integer> map = new HashMap<>();
   for(int num : nums){
    map.put(num , map.getOrDefault(num, 0)+1);
   }
   
   PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
   for(int num : map.keySet()){
        maxHeap.add(num);
        if(maxHeap.size() > k){
            maxHeap.poll();
        }
   }
   int [] arr = new int[k];
   for(int i =0 ; i< arr.length; i++){
    arr[i] = maxHeap.poll();
   }
   return arr;
    }
}
