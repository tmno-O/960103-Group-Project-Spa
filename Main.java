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