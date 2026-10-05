class Solution {
    public String shortestPalindrome(String s) {
        String r = new StringBuilder(s).reverse().toString();
        String t = s + "#" + r;

        int[] lps = new int[t.length()];

        for (int i = 1; i < t.length(); i++) {
            int j = lps[i - 1];

            while (j > 0 && t.charAt(i) != t.charAt(j))
                j = lps[j - 1];

            if (t.charAt(i) == t.charAt(j))
                j++;

            lps[i] = j;
        }

        return new StringBuilder(s.substring(lps[t.length() - 1]))
                .reverse()
                .toString() + s;
    }
}