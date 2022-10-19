class TwoDArray{
    public static void main(String [] args){
        int [][] arr = {
                        {10,20,30},
                        {40,50,60},
                        {70,80,90}
                       };

        for(int i = 0; i<3; i++){   //outer for loop always works with rows
            for(int j = 0; j<4; j++){   // inner for always works with column    0 1 2 3

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}