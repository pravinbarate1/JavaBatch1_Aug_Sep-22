class NestedDoWhile{
    public static void main(String [] arsg){

        int i = 1;     

        do{  // outer loop
            int j = 1;

            do{ // inner loop
                System.out.print(" * ");
                j++;
            }while(j<=i);

            System.out.println();
            
            i++;
        }while(i<=3);
    }
}