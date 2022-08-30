final class Rules{
    public void printRules(){
        System.out.println("This fixed rules");
    }
}

class ChangeRules{
    public void printRules(){
        System.out.println("Changing the rules");
    }
}

class FinalAtClassLevel{
    public static void main(String [] args){
        ChangeRules cr = new ChangeRules();
        cr.printRules();

        Rules r = new Rules();
        r.printRules();
    }
}