import java.util.Scanner;

public class Package {

    //ไว้แสดงเมนูบริการให้เลือก 
    public static void showServiceMenu() {
        System.out.println("\n----- เมนูบริการในสปา -----");
        System.out.println("1. นวดแผนไทย 300 ต่อชั่วโมง ");
        System.out.println("2. นวดน้ำมัน 300 ต่อชั่วโมง");
        System.out.println("3. สปาหน้า 500 ต่อชั่วโมง");
        System.out.println("4. อบสมุนไพร 700 ต่อชั่วโมง");
        System.out.println("5. อโรมา 900 ต่อชั่วโมง");
        System.out.println("-------------------------");

        System.out.print("กรุณาเลือกบริการ (1-5): ");
        Scanner scanner = new Scanner(System.in);
        int serviceChoice = scanner.nextInt();

        switch (serviceChoice) {
            case 1:
                System.out.println("คุณเลือกบริการ: นวดแผนไทย");
                break;
            case 2:
                System.out.println("คุณเลือกบริการ: นวดน้ำมัน");
                break;
            case 3:
                System.out.println("คุณเลือกบริการ: สปาหน้า");
                break;
            case 4:
                System.out.println("คุณเลือกบริการ: อบสมุนไพร");
                break;
            case 5:
                System.out.println("คุณเลือกบริการ: อโรมา");
                break;
            default:
                System.out.println("บริการที่เลือกไม่ถูกต้อง");
                break;
        }

    }



    public static void main(String[] args) {
        showServiceMenu();

    }
}