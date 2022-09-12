class StudentDetails{
    int id;
    String name;
    static String city;

    void printDetail(){
        System.out.println("id = "+id);
        System.out.println("name = "+name);
        System.out.println("city = "+city);
    }
}

class StaticNNonStaticExecutor{
    public static void main(String [] args){

        StudentDetails studentDetails1 = new StudentDetails();
        studentDetails1.id = 1;
        studentDetails1.name = "Ram";
        
        StudentDetails.city = "Pune";

        studentDetails1.printDetail();


        StudentDetails studentDetails2 = new StudentDetails();
        studentDetails2.id = 2;
        studentDetails2.name = "Shyam";

        studentDetails2.printDetail();
    }
}