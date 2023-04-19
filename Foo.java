import java.util.ArrayList;
import java.util.*;

public class Foo
{
    /*
     * Complete the 'IsBuyerWinner' function below.
     *
     * The function is expected to return an Integer.
     * The function accepts following parameters:
     *  1. List (STRING_ARRAY) - codeList
     *  2. List (STRING_ARRAY) - shoppingCart
     */

    private static boolean checkFruit(String codeFruit, String shoppingFruit){
	return codeFruit.equals(shoppingFruit) || codeFruit.equals("anything") && !shoppingFruit.equals("nothing");
    }

    public static int IsBuyerWinner(String[][] codeList,String[] shoppingCart) {
	String[] currentCodeList = codeList[0];
	int curIndex = 0;
	boolean patternFound = true;

	for (int i = 0; i < shoppingCart.length; i++){
		// Check if there is enough elements left to compare to save time
		if (currentCodeList.length > shoppingCart.length - i)
			return 0;
		else if (checkFruit(currentCodeList[0],shoppingCart[i])) { // If there are enough elements, and the first element match start comparing other elements
			patternFound = true;

			for (int j = 1; j < currentCodeList.length; j++){
				if (!checkFruit(currentCodeList[j],shoppingCart[i + 1])) {
					// If at any point the elements stop matching, break out
					patternFound = false;
					break;
				}else
					i++;
			}
			
			if (patternFound){
				if (codeList.length - 1 != curIndex){
					// If all elements matched but the there are still more codes to go through
					curIndex++;
					currentCodeList = codeList[curIndex];
				}else // If all elements matched and no more codes were left to go over
					return 1;
			}
		}
	}

	return 0;
    }
}
