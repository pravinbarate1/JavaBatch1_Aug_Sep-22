class FinalMethodClass{
    final public void print(){
        System.out.println("Final Method");
    }

    public void print1(){
        System.out.println("Non-Final Method");
    }
}

class FinalChildClass extends FinalMethodClass{
    public void print1(){
        System.out.println("Non-Final Method FinalChildClass");
    }
}

class Executor{
    public static void main(String [] args){
        FinalChildClass fc = new FinalChildClass();
        fc.print();
        fc.print1();
    }
}