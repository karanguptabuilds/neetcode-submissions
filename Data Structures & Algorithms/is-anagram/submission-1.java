class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            countS.put(sChar, 1 + countS.getOrDefault(sChar, 0));
            countT.put(tChar, 1 + countT.getOrDefault(tChar, 0));
        }
        for(Character c : countS.keySet()){
            if(!countS.get(c).equals(countT.getOrDefault(c,0))){
                return false;
            }
        }
        return true;

    }
}
