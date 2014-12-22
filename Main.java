
public class Main {
    public static void main(String[] args) {
        String searchMe = "моя программа работает";
        int k = 0;
        int max = searchMe.length();
        char symb = 'о';
        boolean find = false;
        for (int i = 0; i < max; i++) {
            if (searchMe.charAt(i) == symb) {
                k = k + 1;
                if (k >= 2) {
                    find = true;
                    break;
                }
            }
        }
        if (find)
            System.out.println("Символы '" + symb + "' найдены в строке");
        else
            System.out.println("Символов '" + symb + "' меньше чем 2");
    }
}
