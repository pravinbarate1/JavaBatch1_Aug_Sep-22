class MultiplicationTable{
    public static void main(String [] args){
        int i = 1;       
        
        while(i <= 10){
            int j = i;
            int k = 1;

            while(k <= 10){
                System.out.println(j*k);
            }
            System.out.println();
        }
    }
}