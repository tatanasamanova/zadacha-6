class Formula2 {
    double a;
    double b;
    double c;

    public Formula2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void displayFormula() {
        double y = Math.sqrt(b * b - 4 * a * c) / 2;
        System.out.println(y);
    }



    public void main(String []args){
        Formula2 formm=new Formula2(3,4,5.2);
        formm.displayFormula();
        formm.c=5;
        Formula2 formm2=new Formula2(5,6,8.8);
        formm2.displayFormula();
        formm.a=5;
    }

}

