class CharCategoryDataType{
    public static void main(String [] args){
        char a = 65;
        int b = 65;

        System.out.println("value of a :: "+a);
        System.out.println("value of b :: "+b);

        int startRange = 65;
        int endRange = 90;

        for(int i = startRange; i<= endRange; i++){
            System.out.println("i = "+i+" "+(char)i);
        }

    }
}