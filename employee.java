import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] employee = {{1, 8, 12, 0},{2, 12, 16, 0},{3, 16, 20, 0}};
        String[] staff = {"A", "B", "C"};
        
        boolean[][] booked = new boolean[employee.length][24];

        while (true) {
            System.out.print("กรอกเวลาที่ต้องการนวด : ");
            int hour = sc.nextInt();

            
            int checkindex = -1;
            for (int i = 0; i < employee.length; i++) {
                int start = employee[i][1];
                int end = employee[i][2];
                if (hour >= start && hour < end) {
                    checkindex = i;
                    break;
                }
            }

            if (checkindex == -1) {
                System.out.println("ไม่มีหมอทำงานในเวลา " + hour + " โมง");
            } else {
                if (!booked[checkindex][hour]) {
                    booked[checkindex][hour] = true;
                    System.out.println("จองสำเร็จ! หมอ " + staff[checkindex] + 
                                       " (ID " + employee[checkindex][0] + ") เวลา " + hour + " โมง");
                } else {
                    System.out.println("เวลา " + hour + " โมง หมอ " + staff[checkindex] + " ไม่ว่างแล้ว");
                }
            }
        }
    }
}