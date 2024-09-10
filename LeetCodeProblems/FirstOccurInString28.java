public class FirstOccurInString28 {
    static int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        for(int i = 0; i <= haystackLength - needleLength; i++){
            if(haystack.substring(i , i + needleLength).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int result = strStr(haystack, needle);
        System.out.println(result);
    }
}
