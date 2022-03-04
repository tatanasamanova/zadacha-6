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
        double y1=b * b-4*a*c;
        double y = Math.sqrt(y1) / 2;
        System.out.println(y);
    }



    public static void main(String []args){
        Formula2 formm=new Formula2(1,4,2);
        formm.displayFormula();
        formm.c=5;
        Formula2 formm2=new Formula2(2,8.8,4  );
        formm2.displayFormula();
        formm.a=5;
    }

}

