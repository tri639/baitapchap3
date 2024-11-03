public class bai3_2 {
    private double[] coeffs;

    public bai3_2(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] != 0) {
                result.append(coeffs[i]);
                if (i > 1) {
                    result.append("x^" + i);
                } else if (i == 1) {
                    result.append("x");
                }
                if (i > 0 && coeffs[i - 1] > 0) {
                    result.append(" + ");
                } else if (i > 0 && coeffs[i - 1] < 0) {
                    result.append(" - ");
                }
            }
        }
        return result.toString();
    }
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }
    public bai3_2 add(bai3_2 right) {
        int maxLength = Math.max(this.coeffs.length, right.coeffs.length);
        double[] resultCoeffs = new double[maxLength];

        for (int i = 0; i < maxLength; i++) {
            resultCoeffs[i] = (i < this.coeffs.length ? this.coeffs[i] : 0) +
                    (i < right.coeffs.length ? right.coeffs[i] : 0);
        }

        return new bai3_2(resultCoeffs);
    }
    public bai3_2 multiply(bai3_2 right) {
        int resultLength = this.coeffs.length + right.coeffs.length - 1;
        double[] resultCoeffs = new double[resultLength];

        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < right.coeffs.length; j++) {
                resultCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }

        return new bai3_2(resultCoeffs);
    }
}



