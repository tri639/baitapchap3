
    public class bai3_1 {
        private double real = 0.0;
        private double imag = 0.0;

        public bai3_1() {
            real = 0.0;
            imag = 0.0;
        }

        public bai3_1(double real, double imag) {
            this.real = real;
            this.imag = imag;
        }

        public double getReal() {
            return real;
        }

        public void setReal(double real) {
            this.real = real;
        }

        public double getImag() {
            return imag;
        }
        public void setImag(double imag) {
            this.imag = imag;
        }
        public void setValue(double real, double imag) {
            this.real = real;
            this.imag = imag;
        }
        public String toString() {
            return "(" + real + " + " + imag + "i)";
        }
        public boolean isReal() {
            return (real == 0);
        }
        public boolean isImaginary() {
            return (imag == 0);
        }
        public boolean equals(double real, double imag) {
            return (this.real == real && this.imag == imag);
        }
        public boolean equals(bai3_1 another) {
            return (this.real == another.real && this.imag == another.imag);
        }
        public double magnitude() {
            return Math.sqrt(real * real + imag * imag);
        }
        public bai3_1 addInto(bai3_1 right) {
            this.real += right.real;
            this.imag += right.imag;
            return this;
        }
        public bai3_1 addNew(bai3_1 right) {
            return new bai3_1(this.real + right.real, this.imag + right.imag);
        }
    }


