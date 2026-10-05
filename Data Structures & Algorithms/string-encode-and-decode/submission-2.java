class Solution {

    public String encode(List<String> strs) {
        // encode a list of strings
        // use a stringbuilder to generate the string
        // coded string should follow the format: length + # + string
        StringBuilder sb = new StringBuilder();
        for(String  s : strs){
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        // make a list to return back the decoded string
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int hash = str.indexOf('#', i); // searching index of hash
            int len = Integer.parseInt(str.substring(i, hash)); // convert back to the number
            i = hash + 1;
            res.add(str.substring(i, i + len));
            i += len;
        }
        return res;

    }
}
