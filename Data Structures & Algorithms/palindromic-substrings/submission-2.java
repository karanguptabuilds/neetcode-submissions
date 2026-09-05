class Solution {
    public int countSubstrings(String s) {
        int res = 0;
        
        for(int i = 0; i < s.length(); i++){
            res += palindrome(s, i, i);
            res +=palindrome(s, i, i+1);
        }
        return res;
    }
    private int palindrome(String s, int l, int r){
        int count = 0;

        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            count++;
            l--;
            r++;
        }
        return count;
    }
}
