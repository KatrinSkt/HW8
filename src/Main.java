import java.util.Formatter;

public class Main {
    private static Formatter Arrays;

    public static void main(String[] args) {
        System.out.println("Задача 1");

        int[] weight = new int[]{1, 2, 3};
        for (int i = 0; i < weight.length; i++) {
            System.out.println(weight[i]);
        }

        double[] weight2 = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < weight2.length; i++) {
            System.out.println(weight2[i]);
        }

        int[] weights = new int[11];
        weights[0] = 984;
        weights[9] = 6454;
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }

        System.out.println("Задача 2");
        weight = new int[]{1, 2, 3};
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i != 2) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        weight2 = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < weight2.length; i++) {
            System.out.print(weight2[i]);
            if (i != 2) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        weights = new int[11];
        weights[0] = 984;
        weights[9] = 6454;
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i]);
            if (i != 10) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        System.out.println("Задача 3");
        weight = new int[]{1, 2, 3};
        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        weight2 = new double[]{1.57, 7.654, 9.986};
        for (int i = weight2.length - 1; i >= 0; i--) {
            System.out.print(weight2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        weights = new int[11];
        weights[0] = 984;
        weights[9] = 6454;
        for (int i = weights.length - 1; i >= 0; i--) {
            System.out.print(weights[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        System.out.println("Задача 4");
        weight = new int[]{1, 2, 3};
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0) {
                weight[i] += 1;
            }
        }
        System.out.println(java.util.Arrays.toString(weight));
    }
}
