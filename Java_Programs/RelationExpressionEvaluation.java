class RelationExpressionEvaluation{
    public static void main(String [] args){

        int a = Integer.parseInt(args[0]);  // 10
        int b = Integer.parseInt(args[1]);  // 20

        int a1 = 10;

        boolean b1 = a > b;  // false
        boolean b2 = a < b;  // true
        boolean b3 = a >= b; // false
        boolean b4 = a <= b; // true
        boolean b5 = a == b; // false
        boolean b6 = a != b; // true

        System.out.println(" b1 ::: "+b1);
        System.out.println(" b2 ::: "+b2);
        System.out.println(" b3 ::: "+b3);
        System.out.println(" b4 ::: "+b4);
        System.out.println(" b5 ::: "+b5);
        System.out.println(" b6 ::: "+b6);




    }
}