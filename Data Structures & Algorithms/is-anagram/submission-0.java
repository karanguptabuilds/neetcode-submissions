class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> word1 = new HashMap<>();
        Map<Character, Integer> word2 = new HashMap<>();

        for(char w1 : s.toCharArray()){
            word1.put(w1, word1.getOrDefault(w1, 0) + 1);
        }
        for(char w2 : t.toCharArray()){
            word2.put(w2, word2.getOrDefault(w2, 0) + 1);
        }

        return word1.equals(word2);
    }
}
