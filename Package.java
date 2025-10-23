
public static void Package() {
    String[] bookingsPac = {"นวดแผนไทย", "นวดน้ำมัน", "อบสมุนไพร", "อโรม่า", "นวดหลัง", "นวดเท้า", "สปาหน้า"};
    String[] bookingsSet = new String[3];
    bookingsSet[0] = bookingsPac[0] + ", " + bookingsPac[1] + ", " + bookingsPac[2];
    bookingsSet[1] = bookingsPac[3] + ", " + bookingsPac[4] + ", " + bookingsPac[6] + ", " + bookingsPac[5];
    bookingsSet[2] = bookingsPac[0] + ", " + bookingsPac[1] + ", " + bookingsPac[2] + ", " + bookingsPac[6] + ", " + bookingsPac[3];
    double[] priceSet = {600, 700, 900};
    double[] pricePac = {300, 300, 700, 900, 200, 100, 500};
    int choice = 0, num = 0;
    int n2 = 0;
    boolean condition = true;
    keepPackage = "";
    Price = 0;
    while (condition) {

        System.out.println("หมายเลขรูปแบบการบริการซ");
        System.out.println("[ 1 ] รูปแบบ Set package\n[ 2 ] รูปแบบ Package");
        num = sc.nextInt();
        if (!(num > 0 && num >= 2)) {
            System.out.println("'มีข้อผิดพลาดกรุณาใส่หมายเลขอีกครั้ง'");
        }
        if (num == 1) {
            System.out.println("หมายเลขบริการ แบบ Set package");
            for (int i = 0; i < bookingsSet.length; i++) {
                System.out.println("[ " + (i + 1) + " ] : " + bookingsSet[i] + " : ราคา " + priceSet[i] + " บาท");
            }
            choice = sc.nextInt();
            if (choice > 0 && choice <= 3) {
                System.out.print("ลูกค้าเลือก" + "[ " + choice + " ] : " + bookingsSet[choice - 1] + " : ราคา " + priceSet[choice - 1] + " บาท");
                keepPackage += "[ " + choice + " ] : " + bookingsSet[choice - 1] + " : ราคา " + priceSet[choice - 1] + " บาท";
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
                System.out.println("หมายเลขบริการ แบบ Package");
                for (int j = 0; j < bookingsPac.length; j++) {
                    System.out.println("[ " + (j + 1) + " ] : " + bookingsPac[j] + " : ราคา " + pricePac[j] + " บาท");
                }
                System.out.print("เลือกหมายเลขบริการ : ");
                choice = sc.nextInt();
                if (choice > 0 && choice <= 7) {
                    System.out.print("ลูกค้าเลือก" + "[ " + choice + " ] : " + bookingsPac[choice - 1] + " : ราคา " + pricePac[choice - 1] + " บาท");
                    keepPackage += "[ " + choice + " ] : " + bookingsPac[choice - 1] + " : ราคา " + pricePac[choice - 1] + " บาท" + "\n";
                    Price += pricePac[choice - 1];
                    condition = false;
                } else {
                    System.out.println("'มีข้อผิดพลาดกรุณาใส่หมายเลขอีกครั้ง'");
                }
            }
        }
    }
}