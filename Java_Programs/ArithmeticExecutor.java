class Arithmetic{    

    int addition(int a, int b){   // Non Static Method
        int c = a+b;
        return c;
    }

    static int substraction(int a, int b){  // static method
        return a-b;
    }
}

class ArithmeticExecutor{
    public static void main(String [] args){     // Static Method
        Arithmetic arithmetic = new Arithmetic();

        int res = arithmetic.addition(10,20);

        System.out.println(res);

        System.out.println(arithmetic.addition(30,40));

        System.out.println(Arithmetic.substraction(20, 30));
    }
}