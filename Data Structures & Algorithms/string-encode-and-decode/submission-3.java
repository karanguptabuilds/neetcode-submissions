class Solution {

    public String encode(List<String> strs) {
        // to encode the string: use the scheme: length+#+ actual String
        // use the stringbuilder method in the first place to build the String
        StringBuilder sb = new StringBuilder();
        for (String s : strs){
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        // create a list to store the strings in the first place
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int hash = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, hash));
            i = hash + 1;
            res.add(str.substring(i, i + len));
            i += len;
        }
        return res;
    }
}
