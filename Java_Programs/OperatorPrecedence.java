class OperatorPrecedence{
    public static void main(String [] args){
        float a = 2;
        float b = 5;  

        float c = (a + (b * (a / b))); // 1st Expr => 2 + 10 / 5; 2nd Expr. => 2 + 2 ; last we will get 4 as outpu 

        System.out.println("c :: "+c);
    }
}