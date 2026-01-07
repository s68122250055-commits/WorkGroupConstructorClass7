public class TestGymstaff {
    public static void main(String[] args) {

        // ทดสอบการสร้างพนักงาน (Constructor) 
        // คนที่ 1: พนักงานใหม่ (ใช้ Constructor 1)
        Gymstaff staff1 = new Gymstaff("Somchai", "Trainer");
        staff1.setStaffID("ST001"); // มากำหนด ID ทีหลัง

        // คนที่ 2: มีข้อมูลครบ (ใช้ Constructor 2)
        Gymstaff staff2 = new Gymstaff("ST002", "Maree", "Manager");

        // ทดสอบการแสดงผลสถานะ
        System.out.println("Checking Status:");
        System.out.println(staff1.checkWorkStatus());
        System.out.println(staff2.checkWorkStatus());

        System.out.println("---------------------------------");

        // ทดสอบการเปลี่ยนแปลงข้อมูล (Encapsulation)
        System.out.println("Update: Maree goes on leave...");
        staff2.setStatus("On Leave");
        System.out.println(staff2.checkWorkStatus());

        System.out.println("---------------------------------");

        // ทดสอบการทำงานของ Static Variable 
        // staffCount ต้องนับรวมพนักงานทุกคนในคลาส
        System.out.println("Current Total Staff: " + Gymstaff.staffCount);
     }
}
