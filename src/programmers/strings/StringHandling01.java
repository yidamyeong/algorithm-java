package programmers.strings;

public class StringHandling01 {

    public boolean convertToNumber(String s) {
        boolean answer = s.length() == 4 || s.length() == 6;

        try {
            Integer.parseInt(s);
        } catch (Exception e) {
            answer = false;
        }

        return answer;
    }

    public String appendChar(int n) {
        StringBuilder answer = new StringBuilder();

        int w = 0;
        while (w < n / 2) {
            answer.append("수박");
            w += 1;
        }

        if (n % 2 == 0) {
            return answer.toString();
        } else {
            return answer.append("수").toString();
        }
    }

    public String getMiddleChar(String s) {
        String answer = "";
        int i = 0;

        if (s.length() % 2 == 0) {
            // 4 -> 1, 2 (index)
            // 6 -> 2, 3
            // 8 -> 3, 4

            i = (s.length() - 2) / 2;
            answer = "" + s.charAt(i) + s.charAt(i + 1);

        } else {
            // 3 -> 1 (index)
            // 5 -> 2

            i = s.length() / 2;
            answer = "" + s.charAt(i);
        }

        return answer;
    }

}
