Date - 05/23/2026
Problem - 347 Top k Frequent Element
How I solved it?
- I used Min heap and HashMap

Code - class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
for(int n : nums){
    map.put(n, map.getOrDefault(n , 0) +1);
}
PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
for(int n : map.keySet()){
    heap.add(n);
    if(heap.size() > k){
        heap.poll();
    }
}
int arr [] = new int[k];
for(int i=0; i<k; i++){
arr[i] = heap.poll();
}
return arr;

    }
}


Step 1 -So first i created an hashMap for storing all the element and there frequencys 
Step 2 - Created an Min heap using PriorityQueue and lamda function (a,b) -> map.get(a) - map.get(b))
Step 3- I added all the values from map to heap via.add and checked if the size of heap is greater than the K than remove the minimum value heap.poll
Step 4 - Created a new array with the length of k which stores our output i runned a for loop on array and did arr[i] = heap.poll() which stored the maximum values in arr and poll() means removeing so it remove the value and store it in arr 
