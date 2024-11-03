public class testbai3_1 {
    public static void main(String[] args) {
        bai3_1 c1 = new bai3_1(2, 4);

        if (c1.equals(3, 4)) {
            System.out.println("c1 bang (3, 4)");
        }
        bai3_1 c2 = new bai3_1(1, 3);
        c1.addInto(c2);
        System.out.println("c1 sau khi cong: " + c1);
    }
}

