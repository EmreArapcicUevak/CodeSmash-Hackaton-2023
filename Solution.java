import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
	
	// Make a scanner to read from the standard input
        Scanner scanner = new Scanner(System.in);

	// Save the input taken from the standard input
        int codeListCount = scanner.nextInt();
        
	// Clear buffer
	scanner.nextLine();


	// Create a dynamic matrix 
        String[][] codeList = new String[codeListCount][];

	// Ask for all fruit codes
        for (int i = 0; i < codeListCount; i++) {
            // Read the codes from the standard input
	    String codes = scanner.nextLine();

	    // Split the gotten string and put the seperate strings into an array. Ignore empty string
            codeList[i] = codes.split(" ", 0);
        }


	// Get the shopping cart string from the standard input
        String shoppingCartString = scanner.nextLine();
        String[] shoppingCart = shoppingCartString.split(" ", 0);

	// call the function
        int foo = Foo.IsBuyerWinner(codeList, shoppingCart);
        // print out the functions output to the standard output
	System.out.println(foo);
    }
}
