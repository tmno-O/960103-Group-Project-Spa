//Dew

import java.util.Scanner;

public class Main{
    //DEW//
    public static String keepPackage = "";
    public static int userNum = 1;
    public static String[][] AllUserId = new String[userNum][4];
    public static Scanner sc = new Scanner(System.in);


    //DEW//

    //TON//
    public static void show_Id(){
<<<<<<< HEAD
<<<<<<< HEAD
        Scanner input = new Scanner(System.in);
=======
         Scanner input = new Scanner(System.in);
>>>>>>> 21252789dc621deecff1dda34a4cfb94f3694698
=======
>>>>>>> c6eab906a127ba396f23d5f4d3d0fe4cc489ebb6
        // Variable
        int max_user_id = 0;
        // User Array
        int[] user_id = new int[10000];
        String[] user_name = new String[10000];
        String[] user_phone_number = new String[10000];
        String[] user_email = new String[10000];
        int input_int;
        String input_String;
        boolean op = true;
        while (op) {
            System.out.println("--------------- [ Command Menu ] ---------------");
            System.out.println("ใส่ค่า [ 1 ] ลูกค้าใหม่");
            System.out.println("ใส่ค่า [ 2 ] แก้ไขข้อมูลลูกค้า");
            System.out.println("ใส่ค่า [ 3 ] คำนวนบิล");
            System.out.println("ใส่ค่า [ 4 ] ออกจากโปรแกรม");
            System.out.print("Enter number here : ");
            input_int = sc.nextInt();
            if (input_int == 4) {
                System.out.print("Goodbye :)");
                break;
            }
            if (input_int < 0 || input_int > 4) {
                System.out.print("Error : You input the wrong number");
                System.out.print("Please try again ..");
                continue;
            }
            if (input_int == 1) {
                System.out.println("--------------- [ Add New User ] ---------------");
                System.out.print("User ID : "+max_user_id);
                user_id[max_user_id] = max_user_id;
                System.out.print("Enter user name : ");
                user_name[max_user_id] = sc.next();
                System.out.print("Enter user phone number :");
                user_phone_number[max_user_id] = sc.next();
                System.out.print("Enter user email : ");
                user_email[max_user_id] = sc.next();
                System.out.print("");
                System.out.println("[ ! ] User Information");
                System.out.println("User id : "+max_user_id);
                System.out.println("User name : "+user_name[max_user_id]);
                System.out.println("User phone number : "+user_phone_number[max_user_id]);
                System.out.println("User email address : "+user_email[max_user_id]);
                System.out.println("");
                System.out.println("Confirm this information ?");
                System.out.println("Enter [ Y ] to confirm is information");
                System.out.println("Enter [ N ] to cancel");
                input_String = sc.next();
                input_String = input_String.toUpperCase();
                if (input_String.equals("N")) {
                    System.out.println("All user information removed");
                    user_name[max_user_id] = "";
                    user_phone_number[max_user_id] = "";
                    user_email[max_user_id] = "";
                    continue;
                }
                if (input_String.equals("Y")) {
                    System.out.println("All user information saved at user id "+max_user_id);
                    //TON//

                    //DEW//
                    userNum = max_user_id;
                     AllUserId[userNum][0] = user_name[max_user_id];
                     AllUserId[userNum][1] = user_phone_number[max_user_id];
                     AllUserId[userNum][2] = user_name[max_user_id];
                     AllUserId[userNum][3] = user_email[max_user_id];
                    max_user_id += 1;
                    op = false;
                    //DEW//

                    
                }
        }
    }
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
}
=======

        }
    }//TON//


    //KIT//
    // --- Data Definition (Class-level constants/fields) ---
    private static final int[][] EMPLOYEE_SHIFTS = {
        {1, 8, 12, 0}, // ID 1: 8 AM - 12 PM (Available hours: 8, 9, 10, 11)
        {2, 12, 16, 0}, // ID 2: 12 PM - 4 PM (Available hours: 12, 13, 14, 15)
        {3, 16, 20, 0}  // ID 3: 4 PM - 8 PM (Available hours: 16, 17, 18, 19)
    };
    private static final String[] STAFF_NAMES = {"A", "B", "C"};
    private static boolean[][] booked = new boolean[EMPLOYEE_SHIFTS.length][24];
    // --- End Data Definition ---

     public static void Employee() {//KIT//
        boolean op = true;
        System.out.println("ระบบจองเวลานวด (Massage Booking System)");
        
        // The main booking loop
        while (op) {
            System.out.print("\nกรอกเวลาที่ต้องการนวด (8-20) นาฬิกา : ");
            int hour = sc.nextInt();
            if (!sc.hasNextInt()) {
                System.out.println("❌ กรุณาใส่เฉพาะตัวเลขชั่วโมงเท่านั้น (8-20)");
                sc.next(); // Consume the invalid input
                continue;
            }
            if (hour < 8 || hour > 20) {
                System.out.println("❌ กรุณาใส่ชั่วโมงให้อยู่ในช่วง 8 ถึง 20 นาฬิกา");
                continue;
            }//KIT//

            //DEW//
            if(hour > 8 || hour < 20) {
                op = false;
            }//DEW//

            // Call the method to process the booking
            processBooking(hour);
        }
    }
    

    /**
     * Finds the index of the employee who is working during the specified hour.
     * * @param hour The requested hour (0-23).
     * @return The employee index (0, 1, or 2), or -1 if no one is working.
     */
    public static int findWorkingEmployeeIndex(int hour) {//KIT//
        for (int i = 0; i < EMPLOYEE_SHIFTS.length; i++) {
            int start = EMPLOYEE_SHIFTS[i][1]; // Shift Start
            int end = EMPLOYEE_SHIFTS[i][2];   // Shift End
            
            // Check if the hour falls within the shift (Start <= hour < End)
            if (hour >= start && hour < end) {
                return i; // Return the index of the working employee
            }
        }
        return -1; // No employee is working
    }

    /**
     * Attempts to book the massage for the given hour and prints the result.
     * * @param hour The requested hour for the booking.
     */
    public static void processBooking(int hour) {//KIT//
        int checkindex = findWorkingEmployeeIndex(hour);

        if (checkindex == -1) {
            System.out.println("❌ ไม่มีหมอทำงานในเวลา " + hour + " โมง");
        } else {
            // Found a working employee, now check availability
            if (!booked[checkindex][hour]) {
                // Booking successful
                booked[checkindex][hour] = true;
                System.out.println("✅ จองสำเร็จ! หมอ " + STAFF_NAMES[checkindex] + 
                                   " (ID " + EMPLOYEE_SHIFTS[checkindex][0] + 
                                   ") เวลา " + hour + " โมง");
            } else {
                // Already booked
                System.out.println("⛔ เวลา " + hour + " โมง หมอ " + STAFF_NAMES[checkindex] + " ไม่ว่างแล้ว");
            }
        }
    } //KIT//

    //fasai//
    public static void Package(){
        String[]bookingsPac = {"นวดแผนไทย","นวดน้ำมัน","อบสมุนไพร","อโรม่า","นวดหลัง","นวดเท้า","สปาหน้า"};
        String[]bookingsSet = new String[3];
        bookingsSet[0] = bookingsPac[0]+", "+bookingsPac[1]+", "+bookingsPac[2];
        bookingsSet[1] = bookingsPac[3]+", "+bookingsPac[4]+", "+bookingsPac[6]+", "+bookingsPac[5];
        bookingsSet[2] = bookingsPac[0]+", "+bookingsPac[1]+", "+bookingsPac[2]+", "+bookingsPac[6]+", "+bookingsPac[3];
        double[]priceSet = {600,700,900};
        double[]pricePac = {300,300,700,900,200,100,500};
        int choice = 0, num = 0;
        
        boolean condition = true;

        while (condition) {
        System.out.println("หมายเลขรูปแบบการบริการซ");
        System.out.println("[ 1 ] รูปแบบ Set package\n[ 2 ] รูปแบบ Package");
        num = sc.nextInt();
        if(!(num > 0 && num >= 2)){
            System.out.println("'มีข้อผิดพลาดกรุณาใส่หมายเลขอีกครั้ง'");
        }
        if(num ==1){
        System.out.println("หมายเลขบริการ แบบ Set package");
        for(int i=0;i< bookingsSet.length;i++){
            System.out.println("[ "+(i+1)+" ] : "+bookingsSet[i] + " : ราคา "+priceSet[i]+" บาท");
        }
        choice = sc.nextInt();
        if(choice > 0 && choice <= 3){
        System.out.print("ลูกค้าเลือก"+"[ "+ choice +" ] : "+bookingsSet[choice-1] + " : ราคา "+priceSet[choice-1]+" บาท");
        keepPackage += "[ "+ choice +" ] : "+bookingsSet[choice-1] + " : ราคา "+priceSet[choice-1]+" บาท";
        condition = false;

        }else{
            System.out.println("'มีข้อผิดพลาดกรุณาใส่หมายเลขอีกครั้ง'");
        }  
    }
        if(num == 2){
    
        System.out.println("หมายเลขบริการ แบบ Package");
        for(int i=0;i< bookingsPac.length;i++){
            System.out.println("[ "+(i+1)+" ] : "+bookingsPac[i] + " : ราคา "+pricePac[i]+" บาท");
        }
        System.out.print("เลือกหมายเลขบริการ : ");
        choice = sc.nextInt();
        if(choice > 0 && choice <= 7){
         System.out.print("ลูกค้าเลือก"+"[ "+ choice +" ] : "+bookingsPac[choice-1] + " : ราคา "+pricePac[choice-1]+" บาท");
        keepPackage += "[ "+ choice +" ] : "+bookingsPac[choice-1] + " : ราคา "+pricePac[choice-1]+" บาท";
        condition = false;
        }else{
            System.out.println("'มีข้อผิดพลาดกรุณาใส่หมายเลขอีกครั้ง'");
        }
        }
        }
    } //fasai//

    //DEW//
    public static void main(String[]args){
        show_Id();
        Package();
        Employee();
    }//DEW//
