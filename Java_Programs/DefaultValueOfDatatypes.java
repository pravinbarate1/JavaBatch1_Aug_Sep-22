class DefaultValueOfDatatypes{
    static byte b = 10;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char c;
    boolean b1;
    int x1;

    public static void main(String [] args){
        DefaultValueOfDatatypes dvod = new DefaultValueOfDatatypes();

        b = 20;

        System.out.println("Default value of b :: "+DefaultValueOfDatatypes.b);
        System.out.println("Default value of s :: "+s);
        System.out.println("Default value of i :: "+i);
        System.out.println("Default value of l :: "+l);
        System.out.println("Default value of f :: "+f);
        System.out.println("Default value of d :: "+d);
        System.out.println("Default value of c :: "+c);
        System.out.println("Default value of b1 :: "+dvod.b1);

        DefaultValueOfDatatypes.print();
        dvod.print1();
    }

    public static void print(){
        System.out.println("Static method");
    }

    public void print1(){
        System.out.println("Non - Static method");

    }
}