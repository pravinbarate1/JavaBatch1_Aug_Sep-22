class FinalArray{
    public static void main(String [] args){
        final int[] arr = {10,20,30};

        int [] arr1 = {10,20,30};

        arr = arr1;

        System.out.println("a[0] = "+arr[0]);
        
        arr [0] = 20;

        System.out.println("a[0] = "+arr[0]);
    }
}