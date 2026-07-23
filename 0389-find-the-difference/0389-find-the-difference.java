class Solution {
    public char findTheDifference(String s, String t) {
        String str = s + t;
        int res = 0;
        for(int i = 0; i <str.length();i++){
            res ^= str.charAt(i);
        }
        return (char)res;
    }
}