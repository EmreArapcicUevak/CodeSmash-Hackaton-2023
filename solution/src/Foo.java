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

	for (int i = 0; i < shoppingCart.length; i++){
		// Check if there is enough elements left to compare to save time
		if (currentCodeList.length > shoppingCart.length - i - 1) 
			return 0;
		else if (checkFruit(currentCodeList[0],shoppingCart[i])) {
			boolean patternFound = true;

			for (int j = 1; j < currentCodeList.length; j++){
				if (!checkFruit(currentCodeList[j],shoppingCart[i + 1])) {
					patternFound = false;
					break;
				}else
					i++;
			}
			
			if (patternFound){
				if (codeList.length - 1 != curIndex){
					curIndex++;
					currentCodeList = codeList[curIndex];
				}else
					return 1;
			}
		}
	}

	return 0;
    }
}
