package gb.HomeWorkApp;

public class Main {

    public static void main(String[] args) {
        System.out.println(summ(13, 5));
        positivnegdniv(6);
        namber(-2);
        stringint("Intl", 6);
        System.out.println(year(2022));

    }

    public static boolean summ(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void positivnegdniv(int x) {
        if (x > 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }

    }

    public static boolean namber(int z) {
        if (z < 0) {
            return true;
        }
        return false;
    }

    public static void stringint(String App, int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(App);
        }
    }

    public static boolean year(int y) {

            if (y % 4 == 0 ) {
                return true;
            }
        return false;

    }
}

