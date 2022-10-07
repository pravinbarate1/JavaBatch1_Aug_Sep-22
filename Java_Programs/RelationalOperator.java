class RelationalOperator{
    public static void main(String [] args){
        int a = Integer.parseInt(args[0]);  // 20 
        int b = Integer.parseInt(args[1]);  // 20

        if(a > b){ // a > b is evaluated as true or false
            System.out.println("a is greater than b");            
        }

        if(a < b){
            System.out.println("a is less than b");
        }

        
        if(a >= b){ // a = 30 & b = 20 or b = 30
            System.out.println("a is greater than or equal to b");
        }

        
        if(a <= b){
            System.out.println("a is less than or equal b");
        }

        
        if(a == b){
            System.out.println("a is equals to b");
        }

        
        if(a != b){ //10 != 20
            System.out.println("a is not equal to b");
        }
    }
}

/* D:\Java_Batch1\JavaBatch1_Aug_Sep-22\Java_Programs> javac .\RelationalOperator.java
PS D:\Java_Batch1\JavaBatch1_Aug_Sep-22\Java_Programs> java RelationalOperator 10 20
a is less than b
a is less than or equal b
a is not equal tob 
                                    
PS D:\Java_Batch1\JavaBatch1_Aug_Sep-22\Java_Programs> java RelationalOperator 20 10
a is greater than b
a is greater than or equal to b
a is not equal tob

PS D:\Java_Batch1\JavaBatch1_Aug_Sep-22\Java_Programs> java RelationalOperator 20 20
a is greater than or equal to b
a is less than or equal b
a is equals to b */