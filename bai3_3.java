import java.math.BigInteger;

public class bai3_3 {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("11111111111111111111111111111111111111111111111111111111");
        BigInteger b2 = new BigInteger("22222222222222222222222222222222222222222222222222222222");

        BigInteger sum = b1.add(b2);
        System.out.println("Sum: " + sum);

        BigInteger product = b1.multiply(b2);
        System.out.println("Product: " + product);
    }
}
