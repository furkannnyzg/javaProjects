package integralilealanhesaplama;

public class Integralilealanhesaplama {

    public static void main(String[] args) {
        double A = 0.0, h = 0.01, i, f1, f2, b = 1.0, s = 5.0;
        f1 = b * b;
        for (i = b + h; i <= 5; i += h) {
            f2 = i * i;
            A = A + ((f1 + f2) + h) / 2;
            f1 = f2;

        }

        System.out.println(A);
    }

}
