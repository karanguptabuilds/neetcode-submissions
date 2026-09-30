class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // çreate a hashmap for grouping the anagrams:
        Map<String, List<String>> group = new HashMap<>();

        // for each string in strs, sort them out and hash as keys that contain the anagrams to it
        for(int i = 0; i < strs.length; i++){
            char[] chars = strs[i].toCharArray(); // aed -> [a,e,d]
            // aed -> a d e
            Arrays.sort(chars);
            String key = new String(chars);

            group.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(group.values());
    }
}
