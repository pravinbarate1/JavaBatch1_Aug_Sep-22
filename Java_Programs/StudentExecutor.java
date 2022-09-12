class Student{
    static int id;
    String name;
    float m1,m2,m3;
    String collegeName;
    int n = 5;

    String getName(){
        return name;
    }
    int getNoHoursStudy(){
        return n;
    }

    String getGrade(){
        return "Distinction";
    }

    float getTotalMarks(){
        return (m1+m2+m3);
    }
} // Student

class StudentExecutor{
    public static void main(String arg[]){
        Student student1 = new Student();
        Student.id = 1;       
        student1.name = "Rohit";
        student1.m1 = 60.00f;
        student1.m2 = 70.00f;
        student1.m3 = 82.21f;
        student1.collegeName = "Sinhgad";

        //int a;

        System.out.println(student1.getNoHoursStudy());
        System.out.println(student1.getGrade());
        System.out.println(student1.getTotalMarks());
        System.out.println(student1.getName());

        Student student2 = null;
        System.out.println("printing student2 before initialization :: "+student2);
        student2 = new Student();

        student2.id = 2;
        student2.name = "Saurav";
        student2.m1 = 62.00f;
        student2.m2 = 71.00f;
        student2.m3 = 83.21f;
        student2.collegeName = "JSPM";

        System.out.println(student2.getNoHoursStudy());
        System.out.println(student2.getGrade());
        System.out.println(student2.getTotalMarks());
        System.out.println(student2.getName());

        System.out.println(student1.toString());
        System.out.println(student2.toString());


    }
}