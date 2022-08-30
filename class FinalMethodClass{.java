class FinalMethodClass{
    final public void print(){
        Sytem.out.println("Final Method");
    }

    public void print1(){
        System.out.println("Non-Final Method");
    }
}

class FinalChildClass extends FinalMethodClass{
    public void print1(){
        System.out.println("Non-Final From FinalChildClass ");
    }

    public void print(){
        Sytem.out.println("Overidden Method from FinalChildClass");
    }

}