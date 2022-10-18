class SumOfArrayElements{
    public static void main(String [] args1){
        int [] arr = new int[]{10,20,30,40,50}; // sum of array elements 150
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            sum += arr[i]; // substitution will happen like this sum = sum + arr[i]
        }

        System.out.println("Sum or array elements is :: "+sum);
        
    }
}