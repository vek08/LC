class Solution {
    public boolean wordPattern(String pattern, String s) {
        int n = pattern.length();
        String[] words = s.split(" ");
        int m = words.length;
        HashMap<Character,String> cMap = new HashMap<>();
        HashMap<String,Character> sMap = new HashMap<>();
        if(n!=m) return false;
       
        for(int i=0;i<n;i++){
            char ch = pattern.charAt(i);
            String word = words[i];

            if(cMap.containsKey(ch)){
                    if(!cMap.get(ch).equals(word)) return false;
            } 
            else cMap.put(ch,word);

            if(sMap.containsKey(word)){
                if(sMap.get(word)!=ch) return false;
            }else sMap.put(word,ch);
        }
        return true;
    }
}