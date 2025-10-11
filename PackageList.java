import java.util.Scanner;
public class PackageList {

    public static String getPackageName(String package_id) {
        String packagePrint = "";
        String[] product_name = {
                "[1] นวดแผนไทย",
                "[2] นวดน้ำมัน",
                "[3] นวดประคบสมุนไพร",
                "[4] ซาวหน้า",
                "[5] อบสมุนไพร",
                "[6] อโรม่า",
                "[7] นวดหลัง",
                "[8] นวดเท้า",
                "[9] สปาหน้า"
        };
        String[] package_name = {
                "แพ็คเกจ [A] : นวดแผนไทย + นวดหลัง + นวดเท้า",
                "แพ็คเกจ [B] : นวดน้ำมัน + อบสมุนไพร + สปาหน้า",
                "แพ็คเกจ [C] : นวดประคบสมุนไพร + ซาวหน้า + อโรม่า"
        };

        // แสดงรายการทั้งหมด
        for (String product : product_name) {
            packagePrint += product + "\n";
        }
        packagePrint += "\n";
        for (String pkg : package_name) {
            packagePrint += pkg + "\n";
        }

        // ถ้ายังไม่เลือก ให้แสดงเมนูทั้งหมด
        if (package_id.isEmpty()) {
            System.out.println(packagePrint);
            return "";
        }

        // เลือกแพ็กเกจหรือบริการ
        switch (package_id.toUpperCase()) {
            case "A":
                return package_name[0];
            case "B":
                return package_name[1];
            case "C":
                return package_name[2];
            case "1":
                return product_name[0];
            case "2":
                return product_name[1];
            case "3":
                return product_name[2];
            case "4":
                return product_name[3];
            case "5":
                return product_name[4];
            case "6":
                return product_name[5];
            case "7":
                return product_name[6];
            case "8":
                return product_name[7];
            case "9":
                return product_name[8];
            default:
                return "กรุณาเลือกใหม่ (A–C หรือ 1–9)";
        }
    }


class Booking {
    String fullName;
    String phoneNumber;
    String dateTime;
    String serviceType;
    String healthInfo;

    public Booking(String fullName, String phoneNumber, String dateTime, String serviceType, String healthInfo) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.dateTime = dateTime;
        this.serviceType = serviceType;
        this.healthInfo = healthInfo;
    }

    public void displayBooking() {
        System.out.println("----------------------------------------------");
        System.out.println("ชื่อ-นามสกุล: " + fullName);
        System.out.println("เบอร์โทรศัพท์: " + phoneNumber);
        System.out.println("วันและเวลาใช้บริการ: " + dateTime);
        System.out.println("ประเภทบริการ: " + serviceType);
        System.out.println("ข้อมูลสุขภาพ: " + healthInfo);
    }
}

public class SpaBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("กรอกจำนวนการจองที่ต้องการบันทึก: ");
        int n = sc.nextInt();
        sc.nextLine(); // ล้าง buffer

        Booking[] bookings = new Booking[n];

        addBookings(bookings, sc);
        displayAllBookings(bookings);

        sc.close();
    }

    // Method 1: เพิ่มข้อมูลการจอง
    public static void addBookings(Booking[] bookings, Scanner sc) {
        for (int i = 0; i < bookings.length; i++) {
            System.out.println("\n=== กรอกข้อมูลการจองที่ " + (i + 1) + " ===");
            System.out.print("ชื่อ-นามสกุล: ");
            String name = sc.nextLine();

            System.out.print("เบอร์โทรศัพท์: ");
            String phone = sc.nextLine();

            System.out.print("วันและเวลาใช้บริการ (เช่น 2025-10-10 14:00): ");
            String dateTime = sc.nextLine();

            // แสดงเมนูบริการ
            System.out.println("\nกรุณาเลือกบริการหรือแพ็กเกจที่ต้องการ:");
            PackageList.getPackageName(""); // แสดงเมนูทั้งหมด
            System.out.print("พิมพ์รหัสบริการ (A–C หรือ 1–9): ");
            String choice = sc.nextLine();
            String service = PackageList.getPackageName(choice);

            System.out.print("ข้อมูลสุขภาพ (โรคประจำตัว, ตั้งครรภ์, ฯลฯ): ");
            String health = sc.nextLine();

            bookings[i] = new Booking(name, phone, dateTime, service, health);
        }
    }

    // Method 2: แสดงข้อมูลทั้งหมด
    public static void displayAllBookings(Booking[] bookings) {
        System.out.println("\n===== ข้อมูลการจองทั้งหมด =====");
        for (Booking booking : bookings) {
            booking.displayBooking();
        }
    }
}
}
