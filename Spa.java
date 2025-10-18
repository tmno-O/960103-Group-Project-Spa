import java.util.Locale;
import java.util.Scanner;
public class Spa {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Variable
        int max_user_id = 0;

        // User Array
        int[] user_id = new int[10000];
        String[] user_name = new String[10000];
        String[] user_phone_number = new String[10000];
        String[] user_email = new String[10000];
        // colum 1 = นวดแผนไทย 2 = นวดน้ำมัน 3 = นวดประคบสมุนไพร 4.ซาวหน้า 5.อบสมุนไพร 6.อโรม่า 7.นวดหลัง 8.นวดเท้า 9.สปาหน้า
        int[][] user_usage = new int[9][10000];

        // Input Variable
        int input_int;
        double input_double;
        String input_String;

        while (true) {
            System.out.println("--------------- [ Command Menu ] ---------------");
            System.out.println("Enter [ 1 ] to add new user");
            System.out.println("Enter [ 2 ] to add user usage");
            System.out.println("Enter [ 3 ] to calculate service charge");
            System.out.println("Enter [ 0 ] to exit this program");
            System.out.print("Enter number here : ");
            input_int = input.nextInt();
            if (input_int == 0) {
                System.out.print("Goodbye :)");
                break;
            }
            if (input_int < 0 || input_int > 5) {
                System.out.print("Error : You input the wrong number");
                System.out.print("Please try again ..");
                continue;
            }
            // เพิ่ม user ใหม่
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
                System.out.println("Enter [ Y ] to confirm this information");
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
                    continue;
                }
            }

            // เพิ่มการใช้งานของ user
            if (input_int == 2) {
                System.out.println("--------------- [ Add User Usage ] ---------------");
                System.out.print("Enter user id : ");
                input_int = input.nextInt();
                int selected_user_id = input_int;
                System.out.println("You selected user id : "+input_int);
                if (user_name[input_int].equals("") && user_email[input_int].equals("") && user_phone_number[input_int].equals("")) {
                    System.out.print("Don't have information for user id "+input_int);
                    System.out.print("Please add new user before.");
                } else {
                    System.out.print("Username : "+user_name[input_int]+"\n");
                    System.out.print("Email : "+user_email[input_int]+"\n");
                    System.out.print("Phone : "+user_phone_number[input_int]+"\n");
                    System.out.print("Confirm this information ? \nEnter [ Y ] to confirm this information\nEnter [ N ] to cancle\nEnter ( Y or N ) here : ");
                    input_String = input.next();
                    if (input_String.equals("N")) {
                        System.out.println("Okay...Back to home");
                    }
                    while (true) {
                        if (input_String.equals("Y")) {
                           System.out.println("[ Edit User Usage Menu ]");
                           System.out.print("Enter 1 to add Thai massage 1 time\nEnter 2 to add Oil massage 1 time\nEnter 3 to add Herbal compress massage 1 time\nEnter 4 to add Facical sauna 1 time\nEnter 5 to add Herbal steam 1 time\nEnter 6 to add Aromatherapy 1 time\nEnter 7 to add Back massage\nEnter 8 to add Foot massage 1 time\nEnter 9 to add Facial spa 1 time\n");
                           System.out.print("Enter number here : ");
                           input_int = input.nextInt();
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
                           }
                           System.out.println("Do you want to do again ?");
                           System.out.println("Enter [ Y ] to do again");
                           System.out.println("Enter [ N ] to exit to home");
                           input_String = input.next();
                           if (input_String.equals("Y")) {
                               System.out.println("Okay..");
                           }
                           if (input_String.equals("N")) {
                               System.out.println("Exit to home...");
                               break;
                           }
                        }
                    }
                }
            }
        }
    }
}
