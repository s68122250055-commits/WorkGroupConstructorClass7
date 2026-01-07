public class TestGymstaff {
    public static void main(String[] args) {

        // --- ทดสอบการสร้างพนักงาน (Constructor) ---
        // คนที่ 1: พนักงานใหม่ (ใช้ Constructor 1)
        Gymstaff s1 = new Gymstaff("Somchai", "Trainer");
        s1.setStaffID("ST001"); // มากำหนด ID ทีหลัง

        // คนที่ 2: มีข้อมูลครบ (ใช้ Constructor 2)
        Gymstaff s2 = new Gymstaff("ST002", "Maree", "Manager");

        // --- ทดสอบการแสดงผลสถานะ ---
        System.out.println("Checking Status:");
        System.out.println(s1.checkWorkStatus());
        System.out.println(s2.checkWorkStatus());

        System.out.println("---------------------------------");

        // --- ทดสอบการเปลี่ยนแปลงข้อมูล (Encapsulation) ---
        System.out.println("Update: Maree goes on leave...");
        s2.setStatus("On Leave");
        System.out.println(s2.checkWorkStatus());

        System.out.println("---------------------------------");

        // --- ทดสอบการทำงานของ Static Variable ---
        // จุดนี้สำคัญมาก: staffCount ต้องนับรวมพนักงานทุกคนในคลาส
        System.out.println("Current Total Staff: " + Gymstaff.staffCount);
    }
}