class Solution {
    public boolean isPalindrome(String s) {

   
   String input = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
   int l = 0; 
   int r = input.length()-1;
   while(l<r){
    if(input.charAt(l) != input.charAt(r)){
      return false;
    }
    l++;
    r--;
   }
   return true;
    }
}
