public class IfElse {
    public void min() {
        int a = 50, b = 110, c = 5, d = 110, amount = 1, max = 0;
        if (a >= b && a >= c && a >= d) {
            max = a;
            if (a == b) {
                amount = amount + 1;
            }
            if (a == c) {
                amount = amount + 1;
            }
            if (a == d) {
                amount = amount + 1;
            }
        } else if (b >= a && b >= c && b >= d) {
            max = b;
            if (b == a) {
                amount = amount + 1;
            }
            if (b == c) {
                amount = amount + 1;
            }
            if (b == d) {
                amount = amount + 1;
            }
        } else if (c >= a && c >= b && c >= d) {
            max = c;
            if (c == a) {
                amount = amount + 1;
            }
            if (c == b) {
                amount = amount + 1;
            }
            if (c == d) {
                amount = amount + 1;
            }
        } else {
            max = d;
            if (d == a) {
                amount = amount + 1;
            }
            if (d == b) {
                amount = amount + 1;
            }
            if (d == c) {
                amount = amount + 1;
            }
        }
        System.out.println("amount" + amount);
        System.out.println(" max " + max);
    }
}