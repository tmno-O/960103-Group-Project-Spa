import java.util.Scanner;
public class Package {
    public static String getPackageName(String package_id){
        String packagePrint = "";
        String[] product_name = {
                "[1] นวดแผนไทย",
                "[2] นวดน้ำมัน",
                "[3] นวดประคบสมุนไพร",
                "[4] ซาวหน้า",
                "[5] อบสมุนไพร",
                "[6] อโรม่า",
                "[7] นวดหลัง",
                "[8] นวดเท้า",
                "[9] สปาหน้า"
        };
        String[] package_name = {
                "แพ็คเกจ [A] : นวดแผนไทย + นวดหลัง + นวดเท้า",
                "แพ็คเกจ [B] : นวดน้ำมัน + อบสมุนไพร + สปาหน้า",
                "แพ็คเกจ [C] : นวดประคบสมุนไพร + ซาวหน้า + อโรม่า"
        };
        for(int i = 0 ; i < product_name.length ; i++){
            packagePrint += product_name[i]+" \n";
        } packagePrint += "\n";
         for(int i = 0 ; i < package_name.length ; i++){
            packagePrint += package_name[i]+" \n";
        }

        if(package_id == ""){
            System.out.println(packagePrint);
        } else if (package_id == "B") {
            package_id = package_name[1];
        } else if (package_id == "C") {
            package_id = package_name[2];
        }else if(package_id == "A"){
            package_id = package_name[0];
        }else if(package_id == "1"){
            package_id = product_name[0];
        }
        else{
            package_id = "Enter again";
        }
        System.out.println(package_id);

        return package_id;
    }
    public static void main(String[] args) {
        String choice ="";
        Scanner input = new Scanner(System.in);
        System.out.println(getPackageName(choice));
        System.out.println("Select your package : ");
        choice = input.nextLine();
        getPackageName(choice);
    }
}
