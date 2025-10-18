/* 
import java.util.Scanner;
 
public class employee {  //Kit

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
     *//* 
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
     *//* 
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
            }//
        }
    }
}
*/