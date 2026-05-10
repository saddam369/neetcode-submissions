class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll(" ", "").replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);
        int l = 0;
        int r = str.length() - 1;
        boolean res = true;
        while (l < r) {
                if (str.charAt(l) != str.charAt(r)) {
                    return false;
                }
            l++;
            r--;
        }

        return res;
    }
}
