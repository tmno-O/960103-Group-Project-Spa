import java.util.Scanner;
public class Spa {
    public static void  main(String[] args) {
        Scanner input = new Scanner(System.in);
        // user id start at 0
        int user_id = 0;
        // user info
        // note 0 is name , 1 is phone , 2 is email
        String[][] user_info = new String[3][10000];
        // user usage
        // 1 is นวดแผนไทย
        // 2 is นวดน้ำมัน
        // 3 is นวดประคบสมุนไพร
        // 4 is ซาวหน้า
        // 5 is อบสมุนไพร
        // 6 is อโรม่า
        // 7 is นวดหลัง
        // 8 is นวดเท้า
        // 9  is สปาหน้า
        String[][] user_usage = new String[9][10000];
        System.out.println("Hello !! welcome to spa management system.");
        while (true) {
            System.out.println("------------ [ Command Menu ] ------------");
            System.out.println("Enter 1 to add new user");
            System.out.println("Enter 2 to edit user usage");
            System.out.println("Enter 0 to exit");
            System.out.println("------------------------------------------");
            System.out.print("Enter your choice here : ");
            // Variable for select choice
            int select_choice = input.nextInt();
            if (select_choice == 1) {
                System.out.println("------------ [ Add new user ] ------------");
                System.out.print("Enter user name : ");
                user_info[0][user_id] = input.next();
                System.out.print("Enter user phone number : ");
                user_info[1][user_id] = input.next();
                System.out.print("Enter user email : ");
                user_info[2][user_id] = input.next();
                System.out.println("You added Name : "+user_info[0][user_id]+" , Phone :  "+user_info[1][user_id]+" , Email : "+user_info[2][user_id]+" to user id "+user_id);
                user_id++;
            } else if (select_choice == 0) {
                break;
            }
        }
    }
}
