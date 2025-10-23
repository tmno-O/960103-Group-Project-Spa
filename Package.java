public static void Package() {
    // อาร์เรย์เก็บชื่อบริการแต่ละประเภท
    String[] bookingsPac = { "นวดแผนไทย", "นวดน้ำมัน", "อบสมุนไพร", "อโรม่า", "นวดหลัง", "นวดเท้า", "สปาหน้า" };
    
    // อาร์เรย์เก็บชุดแพคเกจ (รวมหลายบริการ)
    String[] bookingsSet = new String[3];
    // แพคเกจที่ 1: นวดแผนไทย + นวดน้ำมัน + อบสมุนไพร
    bookingsSet[0] = bookingsPac[0] + ", " + bookingsPac[1] + ", " + bookingsPac[2];
    // แพคเกจที่ 2: อโรม่า + นวดหลัง + สปาหน้า + นวดเท้า
    bookingsSet[1] = bookingsPac[3] + ", " + bookingsPac[4] + ", " + bookingsPac[6] + ", " + bookingsPac[5];
    // แพคเกจที่ 3: นวดแผนไทย + นวดน้ำมัน + อบสมุนไพร + สปาหน้า + อโรม่า
    bookingsSet[2] = bookingsPac[0] + ", " + bookingsPac[1] + ", " + bookingsPac[2] + ", " + bookingsPac[6] + ", "
            + bookingsPac[3];
    
    // อาร์เรย์เก็บราคาแพคเกจ (600, 700, 900 บาท)
    double[] priceSet = { 600, 700, 900 };
    
    // อาร์เรย์เก็บราคาบริการแต่ละอย่าง
    double[] pricePac = { 300, 300, 700, 900, 200, 100, 500 };
    
    // ตัวแปรเก็บตัวเลือกที่ผู้ใช้เลือก
    int choice = 0, num = 0;
    // ตัวแปรเก็บจำนวนแพคเกจที่ลูกค้าต้องการ
    int n2 = 0;
    // ตัวแปรควบคุมลูป (true = ยังทำอยู่, false = หยุด)
    boolean condition = true;
    
    // เคลียร์ข้อมูลเก่า
    keepPackage = "";
    Price = 0;
    
    // ลูปหลัก: วนเรื่อยๆ จนกว่าลูกค้าเลือกบริการสำเร็จ
    while (condition) {
        // แสดงเมนูให้เลือกประเภทบริการ
        System.out.println("หมายเลขรูปแบบการบริการซ");
        System.out.println("[ 1 ] รูปแบบ Set package\n[ 2 ] รูปแบบ Package\n[ 3 ] แบบมีส่วนลด");
        
        // รับตัวเลือกจากผู้ใช้
        if (!sc.hasNextInt()) {
            System.out.println("กรุณากรอกตัวเลขเท่านั้น");
            sc.nextLine();
            continue;
        }
        num = sc.nextInt();
        
        // ตรวจสอบว่ากรอกตัวเลขถูกต้องหรือไม่ (ต้องอยู่ระหว่าง 1-3)
        if (!(num > 0 && num <= 3)) {
            System.out.println("'มีข้อผิดพลาดกรุณาใส่หมายเลขอีกครั้ง'");
            continue;
        }
        
        // ถ้าเลือก 1 = แพคเกจชุด
        if (num == 1) {
            System.out.println("\nหมายเลขบริการ แบบ Set package");
            
            // แสดงรายการแพคเกจทั้งหมด
            for (int i = 0; i < bookingsSet.length; i++) {
                System.out.println("[ " + (i + 1) + " ] : " + bookingsSet[i] + " : ราคา " + priceSet[i] + " บาท");
            }
            
            // รับตัวเลือกแพคเกจจากผู้ใช้
            if (!sc.hasNextInt()) {
                System.out.println("กรุณากรอกตัวเลขเท่านั้น");
                sc.nextLine();
                continue;
            }
            choice = sc.nextInt();
            
            // ตรวจสอบว่าตัวเลือกถูกต้อง (1-3)
            if (choice > 0 && choice <= 3) {
                // แสดงการยืนยันการเลือก
                System.out.print("ลูกค้าเลือก : " + "[ " + choice + " ] : " + bookingsSet[choice - 1] + " : ราคา "
                        + priceSet[choice - 1] + " บาท\n");
                
                // เก็บรายละเอียดที่เลือก
                keepPackage += "[ " + choice + " ] : " + bookingsSet[choice - 1] + " : ราคา " + priceSet[choice - 1]
                        + " บาท";
                
                // เก็บราคารวม
                Price = priceSet[choice - 1];
                
                // หยุดลูป (เสร็จสิ้น)
                condition = false;
            } else {
                System.out.println("'มีข้อผิดพลาดกรุณาใส่หมายเลขอีกครั้ง'");
            }
        }
        
        // ถ้าเลือก 2 = แพคเกจแบบเลือกเพิ่มเติม
        else if (num == 2) {
            System.out.print("เลือกจำนวน Package :");
            // รับจำนวนบริการที่ต้องการ
            if (!sc.hasNextInt()) {
                System.out.println("กรุณากรอกตัวเลขเท่านั้น");
                sc.nextLine();
                continue;
            }
            n2 = sc.nextInt();
            
            if (n2 <= 0) {
                System.out.println("จำนวนต้องมากกว่า 0");
                continue;
            }
            
            // ลูปสำหรับให้เลือกบริการหลายครั้ง
            for (int i = 0; i < n2; i++) {
                System.out.println("\nหมายเลขบริการ แบบ Package");
                
                // แสดงรายการบริการทั้งหมด
                for (int j = 0; j < bookingsPac.length; j++) {
                    System.out.println("[ " + (j + 1) + " ] : " + bookingsPac[j] + " : ราคา " + pricePac[j] + " บาท");
                }
                
                System.out.print("เลือกหมายเลขบริการ : ");
                // รับตัวเลือกบริการจากผู้ใช้
                if (!sc.hasNextInt()) {
                    System.out.println("กรุณากรอกตัวเลขเท่านั้น");
                    sc.nextLine();
                    i--;
                    continue;
                }
                choice = sc.nextInt();
                
                // ตรวจสอบว่าตัวเลือกถูกต้อง (1-7)
                if (choice > 0 && choice <= 7) {
                    // แสดงการยืนยันการเลือก
                    System.out.println("ลูกค้าเลือก : " + "[ " + choice + " ] : " + bookingsPac[choice - 1]
                            + " : ราคา " + pricePac[choice - 1] + " บาท");
                    
                    // เพิ่มรายละเอียดที่เลือก
                    keepPackage += "[ " + choice + " ] : " + bookingsPac[choice - 1] + " : ราคา "
                            + pricePac[choice - 1] + " บาท" + "\n";
                    
                    // เพิ่มราคารวม
                    Price += pricePac[choice - 1];
                } else {
                    System.out.println("'มีข้อผิดพลาดกรุณาใส่หมายเลขอีกครั้ง'");
                }
            }
            
            // แสดงสรุปการเลือกทั้งหมด
            System.out.println("\nสิ่งที่ลูกค้าเลือกทั้งหมด : \n" + keepPackage);
            // หยุดลูป (เสร็จสิ้น)
            condition = false;
        }
        
        // ถ้าเลือก 3 = แพคเกจแบบมีส่วนลด (อยู่ระหว่างพัฒนา)
        if (num == 3) {
            System.out.println("ระบบส่วนลดอยู่ระหว่างพัฒนา");
            condition = false;
        }
    }
}