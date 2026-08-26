class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    
   HashMap<String , List<String>> map = new HashMap<>();
  // for(String s : strs){
  //   char [] cha = new char[26];
  //   for(char c : s.toCharArray() ){
  //       cha[ c -'a']++;
  //   }
  //   String key = Arrays.toString(cha);
  //   map.computeIfAbsent(key, x -> new ArrayList()).add(s);
  // }
  // return new ArrayList<>(map.values());
    
    for(String st : strs){
      char[] words = st.toCharArray();
      Arrays.sort(words);
      String key = new String(words);
      if(!map.containsKey(key)){
       map.put(key ,new ArrayList<>());

      }
      map.get(key).add(st);
          }
          return new ArrayList<>(map.values());
    }}