class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n1 = s1.length();
        int n2 = s2.length();

        if (n1 > n2) return false;

       /* // frequency of s1
        int[] s1Count = new int[26];
        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }

        // try every substring of length n1
        for (int i = 0; i <= n2 - n1; i++) {

            int[] temp = new int[26];

            // build frequency for substring
            for (int j = i; j < i + n1; j++) {
                temp[s2.charAt(j) - 'a']++;
            }

            // compare both
            if (matches(s1Count, temp)) {
                return true;
            }
        }

        return false;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }*/

    char[] s1Arr = s1.toCharArray();
    Arrays.sort(s1Arr);
    String sortedS1 =new String(s1Arr);
    for(int i=0;i<s2.length();i++){
        for(int j=i;j<s2.length();j++){
            char[] subStr = s2.substring(i, j+1).toCharArray();
            Arrays.sort(subStr);
            String sortedS2 = new String(subStr);
            if(sortedS2.equals(sortedS1)){
                return true;
            }
        }
    }
    return false;
    }
}