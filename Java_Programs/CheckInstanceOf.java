class CheckInstanceOf{
    public static void main(String [] args){
        CheckInstanceOf cio = new CheckInstanceOf();

        String str = new String();

        System.out.println(cio instanceof CheckInstanceOf);// This will print or return true because it satisfies the condiation and cio is the type of CheckInstanceOf
        System.out.println(cio instanceof Test);// it will give error in compile time because the type of Test can't be converted to CheckInstanceOf
    }
}

class Test{

}