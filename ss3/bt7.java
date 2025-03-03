package ss3;

import java.util.Scanner;

public class bt7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 3 cạnh tam giác để tính toán:");
        double canh1 = scanner.nextDouble();
        double canh2 = scanner.nextDouble();
        double canh3 = scanner.nextDouble();

        if (canh1 + canh2 > canh3 && canh1 + canh3 > canh2 && canh2 + canh3 > canh1) {
            double chuVi = canh1 + canh2 + canh3;
            System.out.println("Chu vi: " + chuVi);
            double p = chuVi / 2;
            double dienTich = Math.sqrt(p * (p - canh1) * (p - canh2) * (p - canh3));
            System.out.println("Diện tích: " + dienTich);

            if (canh1 == canh2 && canh2 == canh3) {
                System.out.println("Tam giác đều");
            } else if (canh1 == canh2 || canh2 == canh3 || canh1 == canh3) {
                System.out.println("Tam giác cân");
            } else if (Math.pow(canh1, 2) + Math.pow(canh2, 2) == Math.pow(canh3, 2) ||
                    Math.pow(canh1, 2) + Math.pow(canh3, 2) == Math.pow(canh2, 2) ||
                    Math.pow(canh2, 2) + Math.pow(canh3, 2) == Math.pow(canh1, 2)) {
                System.out.println("Tam giác vuông");
            } else {
                System.out.println("Tam giác thường");
            }
        } else {
            System.out.println("Không thể tạo ra tam giác, vui lòng nhập lại.");
        }

        scanner.close();
    }
}
