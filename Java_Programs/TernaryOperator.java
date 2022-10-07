class TernaryOperator{
    public static void main(String [] args){
        int a = Integer.parseInt(args[0]); // 2 
        int b = Integer.parseInt(args[1]); // 4
        int c = Integer.parseInt(args[2]); // 8

        int max = (a>b) ? (a>c?a:c) : (b>c?b:c);

        System.out.println("max number is :: "+max);
    }
}