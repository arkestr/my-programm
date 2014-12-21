public class IfElse {
    public void min() {
        int a = 10, b = 0, c = 5, d = 100, amount = 1;

        if (a >= b && a >= c && a >= d) {
            System.out.println(" max " + a);
            if (a == b) {
                amount = amount + 1;
            }
            if (a == c) {
                amount = amount + 1;
            }
            if (a == d) {
                amount = amount + 1;
            }
            System.out.println("amount " + amount);
        } else if (b >= a && b >= c && b >= d) {
            if (b == a) {
                amount = amount + 1;
            }
            if (b == c) {
                amount = amount + 1;
            }
            if (b == d) {
                amount = amount + 1;
            }
            System.out.println(" max " + b);
            System.out.println("amount " + amount);
        } else if (c >= a && c >= b && c >= d) {
            if (c == a) {
                amount = amount + 1;
            }
            if (c == b) {
                amount = amount + 1;
            }
            if (c == d) {
                amount = amount + 1;
            }
            System.out.println(" max " + c);
            System.out.println("amount" + amount);
        } else {
            if (d == a) {
                amount = amount + 1;
            }
            if (d == b) {
                amount = amount + 1;
            }
            if (d == c) {
                amount = amount + 1;
            }
            System.out.println(" max " + d);
            System.out.println("amount" + amount);
        }


    }

}


/*
public static void main(String[] args) {
        int a = 100, b = 80, c = 32, d = 10;
        if (a < b && a < c && a < d) {
            System.out.println("of four number: " + a + " " + b + " " + c + " " + d + " " + " minimal: " + a);
        } else {
            if (b <  a && b < c && b < d) {
                System.out.println("of four number: " + a + " " + b + " " + c + " " + d + " " + " minimal: " + b);
            } else {
                if (c < a && c < b && c < d) {
                    System.out.println("of four number: " + a + " " + b + " " + c + " " + d + " " + " minimal: " + c);
                } else {
                        System.out.println("of four number: " + a + " " + b + " " + c + " " + d + " " + " minimal: " + d);

                }
            }
        }
    }
}

 */

/*
if (a < b && a < c && a < d) {
            System.out.println("of four number: " + a + " " + b + " " + c + " " + d + " " + " minimal: " + a);
        } else if (b < a && b < c && b < d) {
            System.out.println("of four number: " + a + " " + b + " " + c + " " + d + " " + " minimal: " + b);
        } else if (c < a && c < b && c < d) {
            System.out.println("of four number: " + a + " " + b + " " + c + " " + d + " " + " minimal: " + c);
        } else {
            System.out.println("of four number: " + a + " " + b + " " + c + " " + d + " " + " minimal: " + d);
        }
 */

