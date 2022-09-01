import java.util.Scanner;

public class HeightCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the height calculator!");
        System.out.print("Enter your height in inches: ");
        int height = getInputInt();
        HeightCalculation calculation = new HeightCalculation(height);
        pretendCalculationIsHappening();
        String result1 = calculation.currentHeight();
        System.out.println(result1);
    }

    public static int getInputInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void pretendCalculationIsHappening() {
        System.out.println("Calculating...");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ignored) {
            // doesn't do anything if sleep is interrupted, just go on
        }
    }
}
