class CommandLineArguments{
    public static void main(String [] args){

        int a;
        int b;

        String a1;
        String b1;

        a1 = args[0];
        b1 = args[1];

        String c1 = a1+b1;

        System.out.println("c1 = "+c1);
    
        a = Integer.parseInt(args[0]);  // Reading command line arguments
        b = Integer.parseInt(args[1]);  // Reading command line arguments

        int c = a + b;

        System.out.println("c = "+ c);
    }
}