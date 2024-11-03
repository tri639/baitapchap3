public class testbai3_2 {
    public static void main(String[] args) {
        bai3_2 p1 = new bai3_2(2, 4, 6);
        bai3_2 p2 = new bai3_2(3, 5, 7);

        bai3_2 sum = p1.add(p2);
        System.out.println(sum);

        bai3_2 product = p1.multiply(p2);
        System.out.println(product);
    }
}
