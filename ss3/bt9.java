package ss3;

import java.util.Scanner;

public class bt9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số hợp lệ (100-999): ");
        int number = scanner.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Số nhập vào không hợp lệ");
        } else {
            int hundreds = number / 100;
            int tens = (number % 100) / 10;
            int units = number % 10;

            System.out.print(convertHundreds(hundreds));
            if (tens == 0 && units == 0) {
                System.out.println("");
            } else {
                System.out.print(" " + convertTens(tens, units));
            }
        }
        scanner.close();
    }

    public static String convertHundreds(int num) {
        switch (num) {
            case 1: return "Một trăm";
            case 2: return "Hai trăm";
            case 3: return "Ba trăm";
            case 4: return "Bốn trăm";
            case 5: return "Năm trăm";
            case 6: return "Sáu trăm";
            case 7: return "Bảy trăm";
            case 8: return "Tám trăm";
            case 9: return "Chín trăm";
            default: return "";
        }
    }

    public static String convertTens(int tens, int units) {
        if (tens == 0) {
            return convertUnits(units);
        } else if (tens == 1) {
            switch (units) {
                case 0: return "mười";
                case 1: return "mười một";
                case 2: return "mười hai";
                case 3: return "mười ba";
                case 4: return "mười bốn";
                case 5: return "mười lăm";
                case 6: return "mười sáu";
                case 7: return "mười bảy";
                case 8: return "mười tám";
                case 9: return "mười chín";
                default: return "";
            }
        } else {
            String tensWord = "";
            switch (tens) {
                case 2: tensWord = "hai mươi"; break;
                case 3: tensWord = "ba mươi"; break;
                case 4: tensWord = "bốn mươi"; break;
                case 5: tensWord = "năm mươi"; break;
                case 6: tensWord = "sáu mươi"; break;
                case 7: tensWord = "bảy mươi"; break;
                case 8: tensWord = "tám mươi"; break;
                case 9: tensWord = "chín mươi"; break;
            }

            if (units == 0) return tensWord;
            else return tensWord + " " + convertUnits(units);
        }
    }

    public static String convertUnits(int num) {
        switch (num) {
            case 1: return "một";
            case 2: return "hai";
            case 3: return "ba";
            case 4: return "bốn";
            case 5: return "năm";
            case 6: return "sáu";
            case 7: return "bảy";
            case 8: return "tám";
            case 9: return "chín";
            default: return "";
        }
    }
}