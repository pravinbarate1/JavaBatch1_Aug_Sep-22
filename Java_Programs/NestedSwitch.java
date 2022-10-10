class NestedSwitch{
    public static void main(String [] args){
        String branch = args[0];
        int year = Integer.parseInt(args[1]);

        switch(year){

            case 1:
                System.out.println("courses :: Match, English, Science");
                break;
            case 2:
                switch(branch){ 
                    case "E&TC":
                        System.out.println("Course is Telecommunication Engineering");
                        break;
                    case "CSE":
                        System.out.println("Course is Computer Application Engineering");
                        break;
                    default:
                        System.out.println("Common Course Environmental Studies");
                }
                break;
            default :
                System.out.println("No Courses");
            
        }
    }
}