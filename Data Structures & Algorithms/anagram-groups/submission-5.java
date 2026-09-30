class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();

        // sort the string by freq count of each word
        for(int i = 0; i < strs.length; i++){
            int[] freq = new int[26]; // sort the freq count

            for(char c : strs[i].toCharArray()){
                freq[c - 'a']++;
            }
            String key = Arrays.toString(freq);
            group.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);

        }
        return new ArrayList<>(group.values());
    }
}
