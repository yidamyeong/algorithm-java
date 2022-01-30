package basic;

public class Sort {
    public String[] solution(String[] strings, int n) {

        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                int front = strings[i].charAt(n);
                int rear = strings[j].charAt(n);

                if (front > rear) {
                    swapElements(strings, i, j);
                } else if (front == rear) {
                    int compareResult = strings[i].compareTo(strings[j]);
                    if (compareResult > 0) {
                        swapElements(strings, i, j);
                    }
                }
            }
        }

        return strings;
    }

    private void swapElements(String[] strings, int index1, int index2) {
        String temp = strings[index1];
        strings[index1] = strings[index2];
        strings[index2] = temp;
    }
}
