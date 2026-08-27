class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxLength = 0;
      for(int num : nums){
        set.add(num);
              }
      for(int num : set){
        if(!set.contains(num -1)){
            int currentNum = num;
            int currentStreak = 1;

            while(set.contains(currentNum + 1)){
                currentNum++;
                currentStreak++;
         
            }
              maxLength = Math.max(maxLength , currentStreak);
        }
      
      }
      return maxLength;
    }
}
