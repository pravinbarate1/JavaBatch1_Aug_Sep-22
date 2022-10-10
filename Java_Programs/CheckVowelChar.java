class CheckVowelChar{
    public static void main(String [] args){

        char ch = args[0].charAt(0);
        
        switch(ch){

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Character is Vowel");
                break;                
            default:
                System.out.println("Character is not Vowel");
        }
    }
}