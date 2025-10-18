//Dew

import java.util.Scanner;

public class Main{
    public static void show_Id(){
         Scanner input = new Scanner(System.in);
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
            System.out.println("Enter [ 1 ] to add new user");
            System.out.println("Enter [ 2 ] to edit user usage");
            System.out.println("Enter [ 3 ] to calculate service charge");
            System.out.println("Enter [ 4 ] to exit this program");
            System.out.print("Enter number here : ");
            input_int = input.nextInt();
            if (input_int == 5) {
                System.out.print("Goodbye :)");
                break;
            }
            if (input_int < 0 || input_int > 5) {
                System.out.print("Error : You input the wrong number");
                System.out.print("Please try again ..");
                continue;
            }
            if (input_int == 1) {
                System.out.println("--------------- [ Add New User ] ---------------");
                System.out.print("User ID : "+max_user_id);
                user_id[max_user_id] = max_user_id;
                System.out.print("Enter user name : ");
                user_name[max_user_id] = input.next();
                System.out.print("Enter user phone number :");
                user_phone_number[max_user_id] = input.next();
                System.out.print("Enter user email : ");
                user_email[max_user_id] = input.next();
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
                input_String = input.next();
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
                    max_user_id += 1;
                    op = false;
                }
            }

        }
    }

    //Kit

    // --- Data Definition (Class-level constants/fields) ---
    private static final int[][] EMPLOYEE_SHIFTS = {
        {1, 8, 12, 0}, // ID 1: 8 AM - 12 PM (Available hours: 8, 9, 10, 11)
        {2, 12, 16, 0}, // ID 2: 12 PM - 4 PM (Available hours: 12, 13, 14, 15)
        {3, 16, 20, 0}  // ID 3: 4 PM - 8 PM (Available hours: 16, 17, 18, 19)
    };
    private static final String[] STAFF_NAMES = {"A", "B", "C"};
    private static boolean[][] booked = new boolean[EMPLOYEE_SHIFTS.length][24];
    // --- End Data Definition ---

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ระบบจองเวลานวด (Massage Booking System)");
        
        // The main booking loop
        while (true) {
            System.out.print("\nกรอกเวลาที่ต้องการนวด (8-20) นาฬิกา : ");
            if (!sc.hasNextInt()) {
                System.out.println("❌ กรุณาใส่เฉพาะตัวเลขชั่วโมงเท่านั้น (8-20)");
                sc.next(); // Consume the invalid input
                continue;
            }
            int hour = sc.nextInt();

            if (hour < 8 || hour > 20) {
                System.out.println("❌ กรุณาใส่ชั่วโมงให้อยู่ในช่วง 8 ถึง 20 นาฬิกา");
                continue;
            }

            // Call the method to process the booking
            processBooking(hour);
        }
    }

    /**
     * Finds the index of the employee who is working during the specified hour.
     * * @param hour The requested hour (0-23).
     * @return The employee index (0, 1, or 2), or -1 if no one is working.
     */
    public static int findWorkingEmployeeIndex(int hour) {
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
    public static void processBooking(int hour) {
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
    }

    
}
