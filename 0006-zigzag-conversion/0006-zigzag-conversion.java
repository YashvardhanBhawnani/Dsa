class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        List<StringBuilder> l = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            l.add(new StringBuilder());
        }
        int i = 0, row = 0;
        boolean dir = true;
        while (i < s.length()) {
            if (dir) {
                while (row < numRows && i < s.length()) {
                    l.get(row++).append(s.charAt(i++));
                }
                dir = false;
                row = numRows - 2;
            } else {
                while (row >= 0 && i < s.length()) {
                    l.get(row--).append(s.charAt(i++));
                }
                dir = true;
                row = 1;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuilder sb : l) {
            ans.append(sb);
        }
        return ans.toString();
    }
}