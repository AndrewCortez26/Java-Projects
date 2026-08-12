
public class main {
	public static void main(String[] args) {
        // Loop through all possible values for T, O, G, and D (from 0 to 9)
        for (int T = 0; T <= 9; T++) {
            for (int O = 0; O <= 9; O++) {
                if (T == O) continue;  // Ensure T and O are different
                
                for (int G = 0; G <= 9; G++) {
                    if (G == T || G == O) continue;  // Ensure G is different from T and O
                    
                    for (int D = 0; D <= 9; D++) {
                        if (D == T || D == O || D == G) continue;  // Ensure D is different from T, O, and G
                        
                        // Calculate TOO and GOOD
                        int TOO = 100 * T + 11 * O;
                        int GOOD = 1000 * G + 110 * O + D;
                        
                        // Check if the equation 4 * TOO == GOOD holds
                        if (4 * TOO == GOOD) {
                            // Output the solution
                            System.out.println("Solution found:");
                            System.out.println("T = " + T);
                            System.out.println("O = " + O);
                            System.out.println("G = " + G);
                            System.out.println("D = " + D);
                            System.out.println("TOO = " + TOO);
                            System.out.println("GOOD = " + GOOD);
                            return;  // Terminate the program once a solution is found
                        }
                    }
                }
            }
        }

        // If no solution is found
        System.out.println("No solution found.");
    }
}

