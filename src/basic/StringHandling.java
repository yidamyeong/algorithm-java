package basic;

public class StringHandling {

    public boolean solution(String s) {
        boolean answer = s.length() == 4 || s.length() == 6;

        try {
            Integer.parseInt(s);
        } catch (Exception e) {
            answer = false;
        }

        return answer;
    }

}
