import java.util.Scanner;
public class Spa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user_count = 0;
        String[] name = new String[10000];
        String[] phone = new String[10000];
        String[] email = new String[10000];
        int user_usage[][] = new int[10000][9];
        System.out.println("Hello !! welcome to spa management system");
        while (true) {
            System.out.println("------------- [ Menu ] -------------");
            System.out.println("Enter 1 to add new user");
            System.out.println("Enter 2 to open user control panel");
            System.out.println("Enter 3 to show all customer information");
            System.out.println("------------------------------------");
            System.out.print("Enter number : ");
            int user_input_1 = input.nextInt();
            if (user_input_1 == 1) {
                System.out.print("Enter customer name : ");
                name[user_count] = input.next();
                System.out.print("Enter customer phone number : ");
                phone[user_count] = input.next();
                System.out.print("Enter customer email : ");
                email[user_count] = input.next();
                System.out.println("Added to user id"+user_count);
                System.out.println("Name : "+name[user_count]);
                System.out.println("Phone : "+phone[user_count]);
                System.out.println("Email : "+email[user_count]);
                user_count ++;
            } else if (user_input_1 == 2) {
                System.out.println("[ Customer control panal ]");
                System.out.print("Enter customer ID :");
                int choice_2_user_input = input.nextInt();
                System.out.println("You Entered : "+choice_2_user_input);
                System.out.println("------------- User Information -------------");
                System.out.println("Name : "+name[choice_2_user_input]);
                System.out.println("Phone : "+phone[choice_2_user_input]);
                System.out.println("Email : "+email[choice_2_user_input]);
                System.out.println("--------------------------------------------");
                System.out.println("What do you want to do ?");
                System.out.println("1. Edit user usage");
                System.out.println("--------------------------------------------");
                System.out.print("Enter number here : ");
                int choice_2_1_user_input =  input.nextInt();
                // เดี๋ยวกูมาทำต่อไอ้เหี้ยกูไม่ไหวแล้ว
            } else if (user_input_1 == 3) {
                for (int i = 0; i < user_input_1; i++) {
                    System.out.println("--------------------------");
                    System.out.println("User ID : "+i);
                    System.out.println("Name : "+name[i]);
                    System.out.println("Phone : "+phone[i]);
                    System.out.println("Email : "+email[i]);
                }
            }
        }
    }
}
