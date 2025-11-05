// Demonstrates the Collatz conjecture.

public class Collatz {
	public static void main(String args[]) {
	    int highestNum = Integer.parseInt(args[0]);
        String mode = args[1];
        int collatzNum = 0;
        int count = 0;
        for(int i = 0; i < highestNum; i++){
            while(collatzNum != 1){
                if(collatzNum == 0){
                    collatzNum = 1;
                }
                count++;
                if(mode.equals("v")){
                    System.out.print(collatzNum + " ");
                }
                if(collatzNum % 2 == 0){
                    collatzNum /= 2;
                }
                else{
                    collatzNum = collatzNum * 3 + 1;
                }
            }
            if(mode.equals("v")){
                    System.out.println("1 (" + (count + 1) + ")");
                }
            collatzNum = i + 2;
            count = 0;
        }
        System.out.println("Every one of the first " + highestNum + " hailstone sequences reached 1.");
	}
}
