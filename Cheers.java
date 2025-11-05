//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
        String input1 = args[0];
        //to check if print a or an
        boolean checkIfAn = false;
        int input2 = Integer.parseInt(args[1]);
        char[] anLetters = {'A', 'E', 'F', 'H', 'I', 
        'L', 'M', 'N', 'O', 'R','S', 'X'};
        //loops input1 and checks in inside loop if input1.charAt(i) == anLetters[j]
        for(int i = 0; i < input1.length(); i++){
            for(int j = 0; j < anLetters.length; j++){
                if(input1.charAt(i) == anLetters[j]){
                    System.out.println("Give me an " + input1.charAt(i) + ": " + input1.charAt(i) + "!");
                    checkIfAn = true;
                }
            }
            if(!checkIfAn){
                System.out.println("Give me a " + input1.charAt(i) + ": " + input1.charAt(i) + "!");
            }
            checkIfAn = false;
        }
        System.out.println("What does that spell?");
        for(int i = 0; i < input2; i++){
            System.out.println(input1 + "!!!");
        }
    }
}
