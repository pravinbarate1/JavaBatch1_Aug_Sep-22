class ArithmeticOperation{

    public int addition(int a, int b){
        int c = a + b;
        return c;
    }

    public int subtraction(int a, int b){
        return a-b;
    }

    public int multiplication(int a, int b){
        return a * b;
    }

    public float division(float a, float b){
        return a/b;
    }

    public int modulus(int a, int b){
        return a%b;
    }
}

class ArithmeticExecutor1{
    public static void main(String [] args){

        ArithmeticOperation ao = new ArithmeticOperation();

        System.out.println("Addition = "+ ao.addition(10,20));

        System.out.println("Substraction = "+ ao.subtraction(20,5));

        System.out.println("Multiplication = "+ ao.multiplication(4,5));

        System.out.println("Division = "+ ao.division(48,5));


        System.out.println("Modulus = "+ ao.modulus(20,3));

    }
}