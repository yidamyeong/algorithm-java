package programmers.numbers;

public class Submultiple01 {
    public int calculateByNumberOfSubmultiple(int left, int right) {
        int answer = 0;

        // 약수의 개수가 홀수 ? 제곱수일 경우에만 해당. 1, 4, 9, 16, 25, 36, 49 등
        // 제곱근이 자연수라면 여기서 말하는 제곱수 (소수점까지 생각할필요 없음)

        for (int num = left; num < right + 1; num++) {
            // 루트(제곱근) 변수
            int r = 1;

            while (r * r < num) {
                r = r + 1;
            }
            if (r * r == num) {
                // num 은 제곱수
                answer -= num;
            } else {
                answer += num;
            }
        }

        return answer;
    }

}
