class VariableDeclarationNInitialization{
    

    public static void main(String [] args){
        int a = 10;
        int b = 20;
        int c = 0; 

        c = a + b; // it will place addition value of a + b i.e . 30 c becomes 30
        a = 20;
        
        a = 0;
        System.out.println("value of  c after initilization ::: "+c);
    }
}