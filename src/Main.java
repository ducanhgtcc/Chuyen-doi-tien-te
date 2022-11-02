import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mời nhập số tiền USD:");
        Scanner scanner = new Scanner(System.in);
        double USD = scanner.nextDouble();
        double VND = 24000;
        System.out.println("Giá trị VND: " + (USD * VND));
    }
}
