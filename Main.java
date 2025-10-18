//Dew

import java.util.Scanner;

public class Main{
    //DEW//
    public static String keepPackage = "";
    public static int userNum = 1;
    public static String[][] AllUserId = new String[userNum][4];
    public static int[][] AllBooking = new int[userNum][3];
    public static Scanner sc = new Scanner(System.in);
    public static double Price = 0;
    public static boolean stop = true;
    //DEW//

    //TON//
    public static void show_Id(){
        // Variable
        int max_user_id = 0;
        // User Array
        int[] user_id = new int[10000];
        String[] user_name = new String[10000];
        String[] user_phone_number = new String[10000];
        String[] user_email = new String[10000];
        int input_int ;
        String input_String = "";
        boolean op = true;
        while (op) {
            System.out.println("--------------- [ Command Menu ] ---------------");
            System.out.println("ใส่ค่า [ 1 ] ลูกค้าใหม่");/* 
            System.out.println("ใส่ค่า [ 2 ] แก้ไขข้อมูลลูกค้า");*/
            System.out.println("ใส่ค่า [ 2 ] ออกจากโปรแกรม");
            System.out.print("Enter number here : ");
            input_int = sc.nextInt();
            if (!sc.hasNextInt()) {
                System.out.print("ใส่เลขใหม่อีกครั้ง");
                continue;
            }
            if (input_int == 2) {
                System.out.print("Goodbye :)");
                stop = false;
                op = false;
                break;
            }
            if (input_int < 0 || input_int > 2) {
                System.out.print("Error : You input the wrong number");
                System.out.print("Please try again ..");
                continue;
            }

           
            
            if (input_int == 1) {
                System.out.println("--------------- [ Add New User ] ---------------");
                System.out.println(" ID ลูกค้า : "+ userNum);
                user_id[max_user_id] = userNum;
                System.out.print("ชื่อลูกค้า : ");
                user_name[max_user_id] = sc.next();
                sc.next();
                System.out.print("เบอโทร :");
                user_phone_number[max_user_id] = sc.next();
                System.out.print("emailลูกค้า : ");
                user_email[max_user_id] = sc.next();
                System.out.println("[ ! ] ข้อมูลลูกค้า");
                System.out.println("id : "+max_user_id);
                System.out.println("ชื่อ : "+user_name[max_user_id]);
                System.out.println("เบอโทร : "+user_phone_number[max_user_id]);
                System.out.println("email : "+user_email[max_user_id]);
                System.out.println("");
                System.out.println("ยืนยันข้อมูล");
                System.out.println("ใส่ค่า [ Y ] ตกลงและบันทึก");
                System.out.println("ใส่ค่า [ N ] ไม่ตกลง");
                input_String = sc.next();
                input_String = input_String.toUpperCase();
            
                if (input_String.equals("N")) {
                    System.out.println("แก้ไขข้อมูลลูกค้า");
                    user_name[max_user_id] = "";
                    user_phone_number[max_user_id] = "";
                    user_email[max_user_id] = "";
                    continue;
                }

                if (input_String.equals("Y")) {
                    System.out.println("บันทึกข้อมูลเรียบร้อย "+max_user_id);
                    //TON//

                    //DEW//
                    userNum = max_user_id;
                     AllUserId[userNum][0] = user_name[max_user_id];
                     AllUserId[userNum][1] = user_phone_number[max_user_id];
                     AllUserId[userNum][2] = user_email[max_user_id];
                     System.err.println(AllUserId[userNum]);
                    max_user_id += 1;
                    op = false;
                    //DEW//

                    
                }

            }


            
            


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
                AllBooking[userNum][0]=userNum;
                AllBooking[userNum][1]= hour;
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
        int n2 =0;
        boolean condition = true;
        keepPackage = "";
        Price = 0;
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
        Price= priceSet[choice-1] ;
        condition = false;

        }else{
            System.out.println("'มีข้อผิดพลาดกรุณาใส่หมายเลขอีกครั้ง'");
        }  
    }
        if(num == 2){
        System.out.print("เลือกจำนวน Package :");
        n2 = sc.nextInt();
        for(int i=0;i<n2;i++){
        System.out.println("หมายเลขบริการ แบบ Package");
        for(int j=0;j< bookingsPac.length;j++){
            System.out.println("[ "+(j+1)+" ] : "+bookingsPac[j] + " : ราคา "+pricePac[j]+" บาท");
        }
        System.out.print("เลือกหมายเลขบริการ : ");
        choice = sc.nextInt();
        if(choice > 0 && choice <= 7){
         System.out.print("ลูกค้าเลือก"+"[ "+ choice +" ] : "+bookingsPac[choice-1] + " : ราคา "+pricePac[choice-1]+" บาท");
        keepPackage += "[ "+ choice +" ] : "+bookingsPac[choice-1] + " : ราคา "+pricePac[choice-1]+" บาท"+"\n";
        Price += pricePac[choice-1] ;
        condition = false;
        }else{
            System.out.println("'มีข้อผิดพลาดกรุณาใส่หมายเลขอีกครั้ง'");
        }
        }
        }

        }
    } //fasai//


    //DEW//
    public static void Bill(){
        AllUserId[0][0] = "ID ลูกค้า : ";
        AllUserId[0][1] = "ชื่อลูกค้า : ";
        AllUserId[0][2] = "เบอร์โทร : ";
        AllUserId[0][3] = "Email : ";

        System.out.println("--------------- [ Command Total ] ---------------");
        System.out.println(AllUserId[0][0]+ userNum);
        System.out.println(AllUserId[0][1] + AllUserId[userNum][0] );
        System.out.println(AllUserId[0][2] + AllUserId[userNum][1] );
        System.out.println(AllUserId[0][3] + AllUserId[userNum][2] );
        System.out.println(AllUserId[0][0] + AllUserId[userNum][1] );
        System.out.println(keepPackage);
        System.out.println("Total : "+Price);
        System.out.println("-------------------- [ end ] ----------------------");
    }//DEW//


    //DEW//
    public static void main(String[]args){
        while (stop) {
        show_Id();
        if(stop == false){
            break;
        }
        Package();
        Employee();
        Bill();
         userNum++;
        }

    }
    //DEW//
//

}
