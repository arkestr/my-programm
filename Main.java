public class Main {
    public static void main(String[] args) {
        int[] Array = {-6, -5, 0, 6, 8};
        int min = 0;
        min = Array[0];
        int max = 0;
        int iMax = 0;
        max = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (min >= Array[i]) {
                min = Array[i];
            }
            if (max <= Array[i]) {
                max = Array[i];
                iMax = i;
            }
        }
        int max1 = max;
        for (int i = 0; i < Array.length; i++) {
            if (min == Array[i]) {
                Array[i] = max;
            }
            if (max == Array[i]) {
                Array[iMax] = min;
            }
            System.out.println(Array[i]);
        }
        System.out.println(min);
    }
}