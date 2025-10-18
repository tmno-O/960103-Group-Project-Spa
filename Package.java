//Fasai
/*
import java.util.Scanner;
    public class Package {

        //ไว้แสดงเมนูบริการให้เลือก //fasai
        public static void ServiceMenu() {
            System.out.println("\n----- เมนูบริการใน -----");
            System.out.println("1.นวดแผนไทย");
            System.out.println("2.นวดน้ำมัน");
            System.out.println("3.สปาหน้า");
            System.out.println("4.อบสมุนไพร");
            System.out.println("5.อโรม่า");
            System.out.println("-------------------------");
        }

        //ไว้แสดงข้อมูลการจองทั้งหมดจ้า อิอิ  //fasai
        public static void IdBookings(String[][] bookings) {
            System.out.println("\n===== ข้อมูลการจองทั้งหมด =====");
            for (int i = 0; i < bookings.length; i++) {
                System.out.println("ข้อมูลการจอง " + (i + 1));
                System.out.println("ชื่อ-นามสกุล: " + bookings[i][0]);
                System.out.println("เบอร์โทรศัพท์: " + bookings[i][1]);
                System.out.println("วันและเวลา: " + bookings[i][2]);
                System.out.println("ประเภทบริการ: " + bookings[i][3]);
                System.out.println("ข้อมูลสุขภาพ: " + bookings[i][4]);
                System.out.println("------------------------------");
            }
        }


        //fasai
        
        //ไว้แสดงเมนูบริการให้เลือก //fasai
        public static void showServiceMenu() {
            System.out.println("\n----- เมนูบริการใน -----");
            System.out.println("1.นวดแผนไทย");
            System.out.println("2.นวดน้ำมัน");
            System.out.println("3.สปาหน้า");
            System.out.println("4.อบสมุนไพร");
            System.out.println("5.อโรม่า");
            System.out.println("-------------------------");
        }

        //ไว้แสดงข้อมูลการจองทั้งหมดจ้า อิอิ  //fasai
        public static void showAllBookings(String[][] bookings) {
            System.out.println("\n===== ข้อมูลการจองทั้งหมด =====");
            for (int i = 0; i < bookings.length; i++) {
                System.out.println("ข้อมูลการจอง " + (i + 1));
                System.out.println("ชื่อ-นามสกุล: " + bookings[i][0]);
                System.out.println("เบอร์โทรศัพท์: " + bookings[i][1]);
                System.out.println("วันและเวลา: " + bookings[i][2]);
                System.out.println("ประเภทบริการ: " + bookings[i][3]);
                System.out.println("ข้อมูลสุขภาพ: " + bookings[i][4]);
                System.out.println("------------------------------");
            }
        }


        //fasai
        public static void main(String[] args) { 
            Scanner sc = new Scanner(System.in);

            //รับจำนวนการจอง
            System.out.print("กรอกจำนวนการจองที่ต้องการบันทึก: ");
            int n = sc.nextInt();
            sc.nextLine();

            //สำหรับเก็บข้อมูลลูกค้า
            //[แถว = จำนวนการจอง],[คอลัมน์ = รายละเอียดแต่ละอย่าง]
            String[][] bookings = new String[n][5];
            //ลูปรับข้อมูลจากผู้ใช้
            for (int i = 0; i < n; i++) {
                System.out.println("\n=== กรอกข้อมูลการจองที่ " + (i + 1) + " ===");

                System.out.print("ชื่อ-นามสกุล: ");
                bookings[i][0] = sc.nextLine();

                System.out.print("เบอร์โทรศัพท์: ");
                bookings[i][1] = sc.nextLine();

                System.out.print("วันและเวลาใช้บริการ (ตัวอย่าง 16-10-2568 12:00 *โปรดพิมพ์ตามตัวอย่างเท่านั้น*): ");
                bookings[i][2] = sc.nextLine();


                
                //เรียกเมธอดแสดงเมนูบริการ
                showServiceMenu();
                
                System.out.print("เลือกหมายเลขบริการ (1-5): ");
                String choice = sc.nextLine();
                //แปลงตัวเลขเป็นชื่อบริการ
                switch (choice) {
                    case "1": bookings[i][3] = "นวดแผนไทย";break;//300
                    case "2": bookings[i][3] = "นวดน้ำมัน"; break;//300
                    case "3": bookings[i][3] = "สปาหน้า"; break;//500
                    case "4": bookings[i][3] = "อบสมุนไพร"; break;//700
                    case "5": bookings[i][3] = "อโรม่า"; break;//900

                    default: bookings[i][3] = "ไม่ทราบประเภทบริการ"; break;   
                } 
               
            
            

                System.out.print("ข้อมูลสุขภาพ (เช่น โรคประจำตัว, ตั้งครรภ์, เคยผ่าตัด, ฯลฯ): ");
                bookings[i][4] = sc.nextLine();
            }
        
            //แสดงข้อมูลทั้งหมดจ้า
            showAllBookings(bookings);
        }
    


}*/