class SwitchCaseForm1{
    public static void main(String [] args){
        int day = Integer.parseInt(args[0]);
        String dayType;

        switch(day){

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType =  "Weekday";
                break;
            case 6:
            case 7:
                dayType = "Weekend";
                break;
            default:
                dayType = "Invalid dayType";
        }
        System.out.println("Day Type :: "+dayType);

    }
}