class ConditionalStatement{
    public static void main(String [] args){
        int age = Integer.parseInt(args[0]);
        String name = args[1];

        if(age >= 18){
            System.out.println("Congratualations !! "+name + " you are eligible for the voting");
        }else{
            System.out.println("Sorry !! "+name + " you are not eligible for the voting");
        }

    }
}