public static String[] bookingsPac = { "นวดแผนไทย", "นวดน้ำมัน", "อบสมุนไพร", "อโรม่า", "นวดหลัง", "นวดเท้า", "สปาหน้า" };
    public static String[] bookingsSet = new String[3];

    //farsai 682110184//
    public static void SetPackage() {
        bookingsSet[0] = bookingsPac[0] + ", " + bookingsPac[1] + ", " + bookingsPac[2];
        bookingsSet[1] = bookingsPac[3] + ", " + bookingsPac[4] + ", " + bookingsPac[6] + ", " + bookingsPac[5];
        bookingsSet[2] = bookingsPac[0] + ", " + bookingsPac[1] + ", " + bookingsPac[2] + ", " + bookingsPac[6] + ", " + bookingsPac[3];
        double[] priceSet = { 600, 700, 900 };
        System.out.println("\nหมายเลขบริการ แบบ Set package");
                for (int i = 0; i < bookingsSet.length; i++) {
                    System.out.println("[ " + (i + 1) + " ] : " + bookingsSet[i] + " : ราคา " + priceSet[i] + " บาท");
                }
    }
    //farsai 682110184//
    public static void Package() {
        bookingsSet[0] = bookingsPac[0] + ", " + bookingsPac[1] + ", " + bookingsPac[2];
        bookingsSet[1] = bookingsPac[3] + ", " + bookingsPac[4] + ", " + bookingsPac[6] + ", " + bookingsPac[5];
        bookingsSet[2] = bookingsPac[0] + ", " + bookingsPac[1] + ", " + bookingsPac[2] + ", " + bookingsPac[6] + ", " + bookingsPac[3];
        double[] priceSet = { 600, 700, 900 };
        double[] pricePac = { 300, 300, 700, 900, 200, 100, 500 };
        int choice = 0, num = 0;
        int n2 = 0;
        boolean condition = true;
        Price = 0;
        while (condition) {

            System.out.println("หมายเลขรูปแบบการบริการ");
            System.out.println("[ 1 ] รูปแบบ Set package\n[ 2 ] รูปแบบ Package\n[ 3 ] แบบมีส่วนลด");
            System.out.print("เลือกสิ่งที่ต้องการจะทำ: ");
            num = sc.nextInt();
            if (!(num > 0 && num >= 2)) {
                System.out.println("'มีข้อผิดพลาดกรุณาใส่หมายเลขอีกครั้ง'");
            }
            if (num == 1) {
             SetPackage();
                choice = sc.nextInt();
                if (choice > 0 && choice <= 3) {
                    System.out.print("ลูกค้าเลือก : " + "[ " + choice + " ] : " + bookingsSet[choice - 1] + " : ราคา " + priceSet[choice - 1] + " บาท");
                    keepPackage += "[ " + choice + " ] : " + bookingsSet[choice - 1] + " : ราคา " + priceSet[choice - 1] + " บาท";
                    Price = priceSet[choice - 1];
                    condition = false;

                } else {
                    System.out.println("'มีข้อผิดพลาดกรุณาใส่หมายเลขอีกครั้ง'");
                }
            }
            if (num == 2) {
                System.out.print("ต้องการเลือกกี่ Package :");
                n2 = sc.nextInt();
                for (int i = 0; i < n2; i++) {
                    System.out.println("\nsหมายเลขบริการ แบบ Package");
                    for (int j = 0; j < bookingsPac.length; j++) {
                        System.out.println("[ " + (j + 1) + " ] : " + bookingsPac[j] + " : ราคา " + pricePac[j] + " บาท");
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
            }

            //Ton//
            if (num == 3) {
                ArrayList<String> user_selected_service_name = new ArrayList<>();
                ArrayList<Double> user_selected_service_price = new ArrayList<>();
                while (true) {
                    int user_input_number = 0;
                    System.out.print("\n[ 1 ] เพิ่มบริการที่ต้องการใช้บริการ\n[ 2 ] แสดงรายการทั้งหมด\n[ 3 ] ยกเลิกบริการที่ได้เลือกไว้\n[ 4 ] ดำเนินการต่อ\n");
                    System.out.print("เลือกสิ่งที่ต้องการจะทำ: ");
                    user_input_number = sc.nextInt();

                    if (user_input_number == 1) {
                        while (true) {

                            System.out.println("เลือกบริการที่ลูกค้าต้องการ");
                            String[] list_of_service_name = { "นวดแผนไทย", "นวดน้ำมัน", "นวดประคบสมุนไพร", "ซาวหน้า", "อบสมุนไพร", "อโรม่า", "นวดหลัง", "นวดเท้า", "สปาหน้า" };
                            Double[] list_of_service_price = { 100.0, 200.0, 300.0, 400.0, 500.0, 600.0, 700.0, 800.0, 900.0 };

                            for (int i = 0; i < list_of_service_name.length; i++) { // เปลี่ยน <= เป็น <
                                System.out.println("[ " + (i + 1) + " ] " + list_of_service_name[i] + " ราคา : "
                                        + list_of_service_price[i]);
                            }

                            System.out.println("[ 0 ] หากไม่ต้องการเพิ่มบริการใดๆ");

                            System.out.print("โปรดเลือกหมายเลขบริการที่ท่านต้องการ: ");
                            select_service_number = sc.nextInt();//ton
//<<<<<<< HEAD
                            keepPackage += "[ " + select_service_number + " ] : " + bookingsSet[select_service_number - 1] + " : ราคา " + priceSet[select_service_number - 1]+"\n"; 
                            if (select_service_number == 0)//ton  //เค้าแก้ๆแล้วใส่่เลข 0 มันก็ออกไปเลยจากโลกนี้อะ/ //=======
                            if (select_service_number == 0)//ton //>>>>>>> a591ee0f2bdf97021405d002c6b387151051ddaa
                                break; // เพิ่ม break เพื่อออกจากลูปย่อย

                            // แก้เงื่อนไขให้ถูก
                            if (select_service_number > 0 && select_service_number <= list_of_service_name.length) {
                                Price += list_of_service_price[select_service_number-1];//Dew 682110117
                                user_selected_service_name.add(list_of_service_name[select_service_number - 1]);
                                user_selected_service_price.add(list_of_service_price[select_service_number - 1]);
                                System.out.println("สำเร็จ!!");
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

                        boolean get_discount = false;
                        if (user_selected_service_name.size() > 7 && get_discount == false) {
//<<<<<<< HEAD
//<<<<<<< HEAD
                            keepPackage += Price + "\nบาท : ลดไป : "+(Price*0.2)+" บาท\n";//Dew 682110117
                            Price = Price * 0.8;//Dew 682110117
                            System.out.println("คุณได้รับส่วนลดระดับ VIP ( 20% ) : "+/*check_vip(current_price)*/Price+"บาท");
                            keepPackage += "\nคุณได้รับส่วนลดระดับ VIP ( 20% ) : "+ Price+"บาท\n";
//=======
                            Price = Price * 0.8;
//=======
                            Price = cal_20per(Price);
//>>>>>>> 5f608f12df35e5d27435a65844b410fec0d442ad
                            System.out.println("คุณได้รับส่วนลดระดับ VIP ( 20% )"+ Price);
//>>>>>>> a591ee0f2bdf97021405d002c6b387151051ddaa
                            get_discount = true;
                        }

                        if (user_selected_service_name.size() >= 3 && user_selected_service_name.size() <= 9 && get_discount == false) {
//<<<<<<< HEAD
                            keepPackage += Price + "\nบาท : ลดไป : "+(Price*0.1)+" บาท\n";//Dew 682110117
                            Price = Price * 0.9;
//<<<<<<< HEAD
                            System.out.println("คุณได้รับส่วนลดระดับ Premium ( 10% ) "+/*check_premium(current_price)*/Price+"บาท");
                            keepPackage += "\nคุณได้รับส่วนลดระดับ Premium ( 10% ) : "+ Price+"บาท\n";
//=======
//=======
                            Price = cal_10per(Price);
//>>>>>>> 5f608f12df35e5d27435a65844b410fec0d442ad
                            System.out.println("คุณได้รับส่วนลดระดับ Premium ( 10% ) "+ Price);
//>>>>>>> a591ee0f2bdf97021405d002c6b387151051ddaa
                            get_discount = true;
                        }

                        for (int i = 0; i < user_selected_service_name.size(); i++) {
                            keepPackage += "\nรายการที่ " + (i + 1) + " : " + user_selected_service_name.get(i);
                        }
                        condition = false;
                        break;
                    }

                }// Ton Calculate But Kit,Dew 682110117 Edit
            }
        }
    }