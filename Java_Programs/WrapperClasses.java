class WrapperClasses{
    public static void main(String [] args){

        byte b = Byte.parseByte(args[0]); 
        short s = Short.parseShort(args[1]);
        int i = Integer.parseInt(args[2]);
        long l = Long.parseLong(args[3]);
        float f = Float.parseFloat(args[4]);
        double d = Double.parseDouble(args[5]);
        boolean b1 = Boolean.parseBoolean(args[6]);  // "true" or "false"

        b1 = true;

        System.out.println("b = "+b);
        System.out.println("s = "+s);
        System.out.println("i = "+i);
        System.out.println("l = "+l);
        System.out.println("f = "+f);
        System.out.println("d = "+d);
        System.out.println("b1 = "+b1);

    }
}