//Dew
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    //DEW//
    public static String keepPackage = "";
    public static int userNum = 10000;
    public static String[][] AllUserId = new String[userNum][4];
    public static int[][] AllBooking = new int[userNum][3];
    public static Scanner sc = new Scanner(System.in);
    public static double Price = 0;
    public static boolean stop = true;
    //public static int ID = 0;//dew
    public static int checkUserId= 0;//ton 
    public static int select_service_number ;
    

    //TON//
    public static void main(String[]args){
        // Scanner
        //Scanner input = new Scanner(System.in);
        // Variable
        int max_user_id = 0;
        // User Array
        int[] user_id = new int[10000];
        String[] user_name = new String[10000];
        String[] user_phone_number = new String[10000];
        String[] user_email = new String[10000];
        // colum 1 = นวดแผนไทย 2 = นวดน้ำมัน 3 = นวดประคบสมุนไพร 4.ซาวหน้า 5.อบสมุนไพร 6.อโรม่า 7.นวดหลัง 8.นวดเท้า 9.สปาหน้า
        int[][] user_usage = new int[9][10000];


        // Display user usage


        // Input Variable
        int input_int;
        // double input_double;
        String input_String;
        boolean op = true;
        userNum = 1;
        while (op) {
            System.out.println("\n--------------- [ Command Menu ] ---------------\n");
            System.out.println("Enter [ 1 ] to add new user");
            System.out.println("Enter [ 2 ] to add user usage");
            //System.out.println("Enter [ 3 ] to display user usage");//ton
            System.out.println("Enter [ 3 ] to booking service ");//dew
            System.out.println("Enter [ 4 ] to calculate service charge");//dew
            System.out.println("Enter [ 0 ] to exit this program");//ton
            System.out.print("Enter number here : ");
            
            //dew
            while(!sc.hasNextInt()){//ถ้าไม่ป้อนตัวเลขบังคับให้ใส่เลขใหม่ (: (: (:
                System.out.println("Error : You input wrong!!!");
                System.out.println("Please try again ..");
                sc.next(); // ล้างค่าที่ป้อนไม่ใช่ตัวเลขไม่งั้นมันจะทำงานไม่ได้   ******
                System.out.print("Enter number here : ");
                
            }//dew
            input_int = sc.nextInt();
                
            if (input_int == 0) {
                System.out.print("Goodbye :)");
                continue;
            }

            if (input_int < 0 && input_int > 4) {
                System.out.print("Error : You input the wrong number");
                System.out.print("Please try again ..");
                continue;
            }

            // เพิ่ม user ใหม่
            if (input_int == 1) {
                checkUserId = 1;
                System.out.println("\n--------------- [ Add New User ] ---------------\n");
                System.out.println("User ID : "+max_user_id);
                user_id[max_user_id] = max_user_id;//ton
                userNum = max_user_id;//dew
                System.out.print("Enter user name : ");//ton
                user_name[max_user_id] = sc.next();
                System.out.print("Enter user phone number :");
                user_phone_number[max_user_id] = sc.next();
                System.out.print("Enter user email : ");
                user_email[max_user_id] = sc.next();
                System.out.print("");
                System.out.println("[ ! ] User Information");
                System.out.println("User id : "+(max_user_id));
                System.out.println("User name : "+user_name[max_user_id]);
                System.out.println("User phone number : "+user_phone_number[max_user_id]);
                System.out.println("User email address : "+user_email[max_user_id]);
                System.out.println("");
                System.out.println("Confirm this information ?");
                System.out.println("Enter [ Y ] to confirm this information");
                System.out.println("Enter [ N ] to cancel");
                input_String = sc.next();
                input_String = input_String.toUpperCase();//TON//

                //DEW//
                AllUserId[userNum][0] = user_name[max_user_id];
                AllUserId[userNum][1] = user_phone_number[max_user_id];
                AllUserId[userNum][2] = user_email[max_user_id];
                //max_user_id++;//DEW//

                if (input_String.equals("N")) {//TON//
                    System.out.println("All user information removed");
                    user_name[max_user_id] = "";
                    user_phone_number[max_user_id] = "";
                    user_email[max_user_id] = "";
                    continue;//TON//

                }
                //TON//
                if (input_String.equals("Y")) {
                    System.out.println("All user information saved at user id "+(max_user_id+1));

                    max_user_id ++;//DEW//

//                    op = false;//DEW// ถ้าจะย้ายไป method อื่นให้ user กด 0 ดีกว่านะ  // 


                }/*if  (sc.hasNextInt()){
                    System.out.println("Try again !!!");
                } */

            }

            //TON//
            // เพิ่มการใช้งานของ user
            if (input_int == 2) {
                System.out.println("\n--------------- [ Add User Usage ] ---------------\n");
                System.out.print("Enter user id : ");
                input_int = sc.nextInt(); 
                userNum = input_int;
                int selected_user_id = input_int;
                System.out.println("You selected user id : "+input_int);
                if(checkUserId == 0){
                    System.out.print("Please add new user before.");
                }

                //แก้บัคให้หน่อยเวลาใส่่เลขเกินกว่าที่จะมีid user พอดีพิมดูแล้วมันบัคอยู่//
                else if ( user_name[input_int].equals("") && user_email[input_int].equals("") && user_phone_number[input_int].equals("")) {
                    System.out.print("Don't have information for user id "+input_int);
                    System.out.print("Please add new user before.");
                    sc.nextInt();
                    continue;
                } else {
                    System.out.print("\nUsername : "+user_name[input_int]+"\n");
                    System.out.print("Email : "+user_email[input_int]+"\n");
                    System.out.print("Phone : "+user_phone_number[input_int]+"\n"); //TON//

                AllUserId[userNum][0] = user_name[input_int];//DEW//
                AllUserId[userNum][1] = user_phone_number[input_int];
                AllUserId[userNum][2] = user_email[input_int];
                //DEW//

                        //ตรงนี้ติดบัคใครก็ได้ช่วยแก้ใหหน่อย//  )://TON//
                    System.out.print("Confirm this information ? \nEnter [ Y ] to confirm this information\nEnter [ N ] to cancle\nEnter ( Y or N ) here : ");
                    input_String = sc.next();
                    if (input_String.equals("N")) {
                        System.out.println("Okay...Back to home");
                        break;
                    }
                    //while (true) {
                        if (input_String.equals("Y")) {
                            System.out.println("[ Edit User Usage Menu ]");/* //TON
                            System.out.print("Enter 1 to add Thai massage 1 time\nEnter 2 to add Oil massage 1 time\nEnter 3 to add Herbal compress massage 1 time\nEnter 4 to add Facical sauna 1 time\nEnter 5 to add Herbal steam 1 time\nEnter 6 to add Aromatherapy 1 time\nEnter 7 to add Back massage\nEnter 8 to add Foot massage 1 time\nEnter 9 to add Facial spa 1 time\n");
                            System.out.print("Enter number here : ");
                            input_int = sc.nextInt();
                            if (input_int > 0 && input_int < 10) {
                                user_usage[input_int - 1][selected_user_id] += 1;
                                if (input_int == 1) {
                                    System.out.print("Added Thai massage Usage 1 time to user id : "+selected_user_id);
                                }
                                if (input_int == 2) {
                                    System.out.println("Added Oil massage Usage 1 time to user id : "+selected_user_id);
                                }
                                if (input_int == 3) {
                                    System.out.println("Added Herbal compress massage Usage 1 time to user id : "+selected_user_id);
                                }
                                if (input_int == 4) {
                                    System.out.println("Added Facial sauna Usage 1 time to user id : "+selected_user_id);
                                }
                                if (input_int == 5) {
                                    System.out.println("Added Herbal steam Usage 1 time to user id : "+selected_user_id);
                                }
                                if (input_int == 6) {
                                    System.out.println("Added Aromatherapy Usage 1 time to user id : "+selected_user_id);
                                }
                                if (input_int == 7) {
                                    System.out.println("Added Back massage Usage 1 time to user id : "+selected_user_id);
                                }
                                if (input_int == 8) {
                                    System.out.println("Added Foot massage Usage 1 time to user id : "+selected_user_id);
                                }
                                if (input_int == 8) {
                                    System.out.println("Added Facial spa Usage 1 time to user id : "+selected_user_id);
                                }
                            } else {
                                System.out.println("You Entered the wrong number");
                            }*/
                            Package();
                            Employee();
                            System.out.println("\nDo you want to do again ?");
                            System.out.println("Enter [ Y ] to do again");
                            System.out.println("Enter [ N ] to exit to home");
                            input_String = sc.next();
                            if (input_String.equals("Y")) {
                                System.out.println("Okay..");
                            }
                            if (input_String.equals("N")) {
                                System.out.println("Exit to home...");
                                break;
                            }
                        }
                    //}
                }
            }
            /*if (input_int == 3) {
                while (true) {
                    System.out.print("Enter User ID : ");
                    input_int = sc.nextInt();
                    if(checkUserId == 0){
                    System.out.println("Please add new user before.");
                    break;
                    }
                    if (user_name[input_int].equals("") || user_email[input_int].equals("") || user_phone_number.equals("")) {
                        System.out.println("You ented the wrong number !");
                        System.out.println("Please try again");
                    } else {
                        int selected_user_id = input_int;
                        System.out.println("User Information");
                        System.out.println("Username : "+user_name[selected_user_id]);
                        System.out.println("Email : "+user_email[selected_user_id]);
                        System.out.println("Phone : "+user_phone_number[selected_user_id]);
                        System.out.println("");
                        System.out.print("Confirm this information ? \nEnter [ Y ] to confirm this information\nEnter [ N ] to cancle\nEnter ( Y or N ) here : ");
                        input_String = sc.next();
                        if (!input_String.equals("Y") || !input_String.equals("N")) {
                            System.out.println("You ented the wrong number");
                            System.out.println("Please try again");
                        }
                        if (input_String.equals("N")) {
                            System.out.println("Okay....");
                            break;
                        }
                        if (input_String.equals("Y")) {
                            int selected_user_usage_total = 0;
                            for (int i = 0; i < 9; i++) {
                                if (i == 0) {
                                    System.out.println("Thai massage "+user_usage[i][selected_user_id]+" times");
                                    selected_user_usage_total += user_usage[i][selected_user_id];
                                }
                                if (i == 1) {
                                    System.out.println("Thai massage "+user_usage[i][selected_user_id]+" times");
                                    selected_user_usage_total += user_usage[i][selected_user_id];
                                }
                                if (i == 2) {
                                    System.out.println("Thai massage "+user_usage[i][selected_user_id]+" times");
                                    selected_user_usage_total += user_usage[i][selected_user_id];
                                }
                                if (i == 3) {
                                    System.out.println("Thai massage "+user_usage[i][selected_user_id]+" times");
                                    selected_user_usage_total += user_usage[i][selected_user_id];
                                }
                                if (i == 4) {
                                    System.out.println("Thai massage "+user_usage[i][selected_user_id]+" times");
                                    selected_user_usage_total += user_usage[i][selected_user_id];
                                }
                                if (i == 5) {
                                    System.out.println("Thai massage "+user_usage[i][selected_user_id]+" times");
                                    selected_user_usage_total += user_usage[i][selected_user_id];
                                }
                                if (i == 6) {
                                    System.out.println("Thai massage "+user_usage[i][selected_user_id]+" times");
                                    selected_user_usage_total += user_usage[i][selected_user_id];
                                }
                                if (i == 7) {
                                    System.out.println("Thai massage "+user_usage[i][selected_user_id]+" times");
                                    selected_user_usage_total += user_usage[i][selected_user_id];
                                }
                                if (i == 8) {
                                    System.out.println("Thai massage "+user_usage[i][selected_user_id]+" times");
                                    selected_user_usage_total += user_usage[i][selected_user_id];
                                }
                            }
                            System.out.println("Total : "+selected_user_usage_total);
                            Package();
                            Employee();
                            continue;
                        }//ton
                    }
                }

            }*/
            //dew
            if (input_int == 3) {
                if(checkUserId == 0){
                    System.out.println("Please add new user before.");
                    continue;
                }
                Package();
                Employee();
                continue;
            }
            if (input_int == 4) {
                if(checkUserId == 0){
                    System.out.println("Please add new user before.");
                    continue;
            }
                Bill();
                continue;
            }//dew
        }

    }
    //TON//
    ////////////////////////
    // --- Data Definition (Class-level constants/fields) ---
    private static final int[][] EMPLOYEE_SHIFTS = {
            {1, 8, 12, 0}, // ID 1: 8 AM - 12 PM (Available hours: 8, 9, 10, 11)
            {2, 12, 16, 0}, // ID 2: 12 PM - 4 PM (Available hours: 12, 13, 14, 15)
            {3, 16, 20, 0}  // ID 3: 4 PM - 8 PM (Available hours: 16, 17, 18, 19)
    };
    private static final String[] STAFF_NAMES = {"A", "B", "C"};
    private static boolean[][] booked = new boolean[EMPLOYEE_SHIFTS.length][24];
    // --- End Data Definition ---

     //KIT//
    public static void Employee() { //KIT//
        //boolean op = true;
        System.out.println("ระบบจองเวลานวด (Massage Booking System)");

        // The main booking loop
        //while (op) {
            System.out.print("\nกรอกเวลาที่ต้องการนวด (8-20) นาฬิกา : ");
            if (!sc.hasNextInt()) {
                System.out.println("❌ กรุณาใส่เฉพาะตัวเลขชั่วโมงเท่านั้น (8-20)");
                sc.next(); // Consume the invalid input
                //continue;
            }
            int hour = sc.nextInt();

            if (hour < 8 || hour > 20) {
                System.out.println("❌ กรุณาใส่ชั่วโมงให้อยู่ในช่วง 8 ถึง 20 นาฬิกา");
                //continue;
            }

            // Call the method to process the booking
            processBooking(hour);
            //KIT//

           
        //}
    }

    /*
     * Finds the index of the employee who is working during the specified hour.
     * * @param hour The requested hour (0-23).
     * @return The employee index (0, 1, or 2), or -1 if no one is working.
     */
    public static int findWorkingEmployeeIndex(int hour) { //KIT//
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
    public static void processBooking(int hour) { //KIT//
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
                        //kit//

                         //DEW//
                        AllBooking[userNum][0]=userNum;
                        AllBooking[userNum][1]= hour;
                        //DEW//
                        
                        //kit//
            } else {
                // Already booked
                System.out.println("⛔ เวลา " + hour + " โมง หมอ " + STAFF_NAMES[checkindex] + " ไม่ว่างแล้ว");
            }//
        }
    } //KIT//


    //fasai//
   public static void Package() {
        String[] bookingsPac = { "นวดแผนไทย", "นวดน้ำมัน", "อบสมุนไพร", "อโรม่า", "นวดหลัง", "นวดเท้า", "สปาหน้า" };
        String[] bookingsSet = new String[3];
        bookingsSet[0] = bookingsPac[0] + ", " + bookingsPac[1] + ", " + bookingsPac[2];
        bookingsSet[1] = bookingsPac[3] + ", " + bookingsPac[4] + ", " + bookingsPac[6] + ", " + bookingsPac[5];
        bookingsSet[2] = bookingsPac[0] + ", " + bookingsPac[1] + ", " + bookingsPac[2] + ", " + bookingsPac[6] + ", "
                + bookingsPac[3];
        double[] priceSet = { 600, 700, 900 };
        double[] pricePac = { 300, 300, 700, 900, 200, 100, 500 };
        int choice = 0, num = 0;
        int n2 = 0;
        boolean condition = true;
        keepPackage = "";
        Price = 0;
        while (condition) {

            System.out.println("หมายเลขรูปแบบการบริการซ");
            System.out.println("[ 1 ] รูปแบบ Set package\n[ 2 ] รูปแบบ Package\n[ 3 ] แบบมีส่วนลด");
            num = sc.nextInt();
            if (!(num > 0 && num >= 2)) {
                System.out.println("'มีข้อผิดพลาดกรุณาใส่หมายเลขอีกครั้ง'");
            }
            if (num == 1) {
                System.out.println("\nหมายเลขบริการ แบบ Set package");
                for (int i = 0; i < bookingsSet.length; i++) {
                    System.out.println("[ " + (i + 1) + " ] : " + bookingsSet[i] + " : ราคา " + priceSet[i] + " บาท");
                }
                choice = sc.nextInt();
                if (choice > 0 && choice <= 3) {
                    System.out.print("ลูกค้าเลือก : " + "[ " + choice + " ] : " + bookingsSet[choice - 1] + " : ราคา "
                            + priceSet[choice - 1] + " บาท");
                    keepPackage += "[ " + choice + " ] : " + bookingsSet[choice - 1] + " : ราคา " + priceSet[choice - 1]
                            + " บาท";
                    Price = priceSet[choice - 1];
                    condition = false;

                } else {
                    System.out.println("'มีข้อผิดพลาดกรุณาใส่หมายเลขอีกครั้ง'");
                }
            }
            if (num == 2) {
                System.out.print("เลือกจำนวน Package :");
                n2 = sc.nextInt();
                for (int i = 0; i < n2; i++) {
                    System.out.println("\nsหมายเลขบริการ แบบ Package");
                    for (int j = 0; j < bookingsPac.length; j++) {
                        System.out
                                .println("[ " + (j + 1) + " ] : " + bookingsPac[j] + " : ราคา " + pricePac[j] + " บาท");
                    }
                    System.out.print("เลือกหมายเลขบริการ : ");
                    choice = sc.nextInt();
                    if (choice > 0 && choice <= 7) {
                        System.out.println("ลูกค้าเลือก : " + "[ " + choice + " ] : " + bookingsPac[choice - 1]
                                + " : ราคา " + pricePac[choice - 1] + " บาท");
                        keepPackage += "[ " + choice + " ] : " + bookingsPac[choice - 1] + " : ราคา "
                                + pricePac[choice - 1] + " บาท" + "\n";
                        Price += pricePac[choice - 1];
                        condition = false;
                    } else {
                        System.out.println("'มีข้อผิดพลาดกรุณาใส่หมายเลขอีกครั้ง'");
                    }
                }
                System.out.println("\nสิ่งที่ลูกค้าเลือกทั้งหมด : \n" + keepPackage);
            }//fasai//


            // Ton Calculate
            if (num == 3) {
                ArrayList<String> user_selected_service_name = new ArrayList<>();
                ArrayList<Double> user_selected_service_price = new ArrayList<>();
                while (true) {
                    int user_input_number = 0;
                    System.out.print(
                            "\n[ 1 ] เพิ่มบริการที่ต้องการใช้บริการ\n[ 2 ] แสดงรายการทั้งหมด\n[ 3 ] ยกเลิกบริการที่ได้เลือกไว้\n[ 4 ] คำนวณราคาทั้งหมด\n");
                    System.out.print("เลือกสิ่งที่ต้องการจะทำ: ");
                    user_input_number = sc.nextInt();

                    if (user_input_number == 1) {
                        while (true) {
                            
                            System.out.println("เลือกบริการที่ลูกค้าต้องการ");
                            String[] list_of_service_name = { "นวดแผนไทย", "นวดน้ำมัน", "นวดประคบสมุนไพร", "ซาวหน้า",
                                    "อบสมุนไพร", "อโรม่า", "นวดหลัง", "นวดเท้า", "สปาหน้า" };
                            Double[] list_of_service_price = { 100.0, 200.0, 300.0, 400.0, 500.0, 600.0, 700.0, 800.0,
                                    900.0 };

                            for (int i = 0; i < list_of_service_name.length; i++) { // เปลี่ยน <= เป็น <
                                System.out.println("[ " + (i + 1) + " ] " + list_of_service_name[i] + " ราคา : "
                                        + list_of_service_price[i]);
                            }

                            System.out.println("[ 0 ] หากไม่ต้องการเพิ่มบริการใดๆ");
                            System.out.print("โปรดเลือกหมายเลขบริการที่ท่านต้องการ: ");
                            select_service_number = sc.nextInt();//ton
                            //keepPackage += "\n[ "+select_service_number+ " ]"+ list_of_service_name[select_service_number-1]+ " : " + list_of_service_price[select_service_number-1]+"\n";
                            Price += list_of_service_price[select_service_number-1];//dew
                            if (select_service_number == 0)//ton  //เค้าแก้ๆแล้วใส่่เลข 0 มันก็ออกไปเลยจากโลกนี้อะ/
                                break; // เพิ่ม break เพื่อออกจากลูปย่อย

                            // แก้เงื่อนไขให้ถูก
                            if (select_service_number > 0 && select_service_number <= list_of_service_name.length) {
                                user_selected_service_name.add(list_of_service_name[select_service_number - 1]);
                                user_selected_service_price.add(list_of_service_price[select_service_number - 1]);
                            } else {
                                System.out.println("หมายเลขไม่ถูกต้อง");
                            }
                        }
                    }

                    if (user_input_number == 2) {
                        System.out.println("รายการทั้งหมด");
                        for (int i = 0; i < user_selected_service_name.size(); i++) { // เปลี่ยน <= เป็น <
                            System.out.println("รายการที่ " + (i + 1) + " : " + user_selected_service_name.get(i));
                        }
                        System.out.println(" ");
                    }
                    if (user_input_number == 3) {
                        int list_price = 0;
                        for (int i = 0; i < user_selected_service_price.size(); i ++) {
                            list_price += user_selected_service_price.get(i);
                        }
                        while (true) {
                            System.out.println("\nเลือกหมายเลขที่ท่านต้องการจะยกเลิก");
                            for (int i = 0; i < user_selected_service_name.size(); i++) {
                                System.out.println("รายการที่ " + (i + 1) + " : " + user_selected_service_name.get(i));
                            }
                            System.out.println("กด [ 0 ] หากไม่ต้องการยกเลิกบริการใดๆ\n");
                            int cancle_user_selected_number = sc.nextInt();
                            if (cancle_user_selected_number == 0) {
                                break;
                            }
                            if (cancle_user_selected_number > 0 && cancle_user_selected_number <= user_selected_service_name.size()) {
                                System.out.println(user_selected_service_name.get(cancle_user_selected_number - 1) + " ถูกลบออกไปแล้ว");
                                user_selected_service_name.remove(cancle_user_selected_number - 1);
                                user_selected_service_price.remove(cancle_user_selected_number - 1);
                            } else {
                                System.out.println("ท่านกดผิดโปรดดำเนินการใหม่อีกครั้ง");
                            }
                        }
                    }
                    if (user_input_number == 4) {
                        double current_price = 0.0;
                        boolean get_discount = false;
                        for (int i = 0; i < user_selected_service_name.size(); i++) {
                            current_price += user_selected_service_price.get(i);
                        }
                        if (user_selected_service_name.size() >= 5 && user_selected_service_name.size() <= 9 && get_discount == false) {
                            current_price = Price * 0.9;
                            System.out.println("คุณได้รับส่วนลดระดับ Premium ( 10% ) "+/*check_premium(current_price)*/Price);
                            get_discount = true;
                        }
                        if (user_selected_service_name.size() > 10 && get_discount == false) {
                            current_price = Price * 0.8;
                            System.out.println("คุณได้รับส่วนลดระดับ VIP ( 20% )"+/*check_vip(current_price)*/Price);
                            get_discount = true;
                        }
                    }
                }
            }
            // Ton //
        }
    }
    


    //DEW//
    public static void Bill(){

        System.out.println("--------------- [ Command Total ] ---------------");
        /*if(AllUserId[userNum][0] == ""){
            System.out.println("Enter user ID :");
            AllUserId[userNum][0] = sc.next();
            System.out.println("Enter user name :");
            AllUserId[userNum][1] = sc.next();
            System.out.println("Enter user Email  :");
            AllUserId[userNum][2] = sc.next();
        }*/
        System.out.println("ID : "+ userNum);
        System.out.println("Name : " + AllUserId[userNum][0] );
        System.out.println("Phone number : " + AllUserId[userNum][1] );
        System.out.println("Email : "+ AllUserId[userNum][2] );
        System.out.println("Time : "+ AllBooking[userNum][1] );
        // 
        System.out.println(keepPackage);
        System.out.println("Total : "+Price);
        System.out.println("-------------------- [ end ] ----------------------");
        userNum ++;
        Price = 0;
        keepPackage = "";
    }//DEW//


  
//

}
