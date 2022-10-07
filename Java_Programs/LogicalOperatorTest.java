class LogicalOperatorTest{
    public static void main(String [] args){
        int a = Integer.parseInt(args [0]);
        int b = Integer.parseInt(args [1]);
        int c = Integer.parseInt(args [2]);
        int d = Integer.parseInt(args [3]);

        if(a>b && c>d){
            System.out.println("a>b && c>d :: executed");
        }

        
        if(a>b || c>d){
            System.out.println("a>b || c>d :: executed");
        }

        
        if(a != b){
            System.out.println("a != b :: executed");
        }
    }
}