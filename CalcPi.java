// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int numOfTerms = Integer.parseInt(args[0]);
        double piApprox = 0.0;
        for(int i = 0; i < numOfTerms; i++){
            if(i % 2 == 0){
                piApprox += 1.0 / (2 * (i + 1) - 1);
            }
            else{
                piApprox -= 1.0 / (2 * (i + 1) - 1);
            }
        }
        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated: " + piApprox * 4.0);
	}
}
