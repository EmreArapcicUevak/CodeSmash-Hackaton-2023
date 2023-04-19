import java.util.ArrayList;
import java.util.*

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

    private boolean checkFruit(String codeFruit, String shoppingFruit){
	return codeFruit.equals(shoppingFruit) || codeFruit.equals("anything") && !shoppingFruit.equals("nothing");
    }

    public static int IsBuyerWinner(ArrayList<String> codeList, ArrayList<String> shoppingCart) {
		
	Iterator<ArrayList<String>> codeItterator = codeList.iterator();
	Iterator<String> shoppingCartItterator = shoppingCart.iterator();
	
	ArrayList<String> currentCodeList = codeItterator.next();
	Iterator<String> currentCodeListIterator = currentCodeList.iterator();

	String currentShoppingItem = shoppingCartItterator.next();
	int offset = 0;

	for (int i = shoppingCart.size(); i > 0; i--){
		String curShopItem = currentShoppingItem.next();

		if (currentCodeList.size() > i)
			return 0;
		else if checkFruit(currentCodeListIterator.next(), curShopItem) {
			boolean patternFound = true;
			while (currentCodeListIterator.hasNext()){
				i--;
				if !checkFruit(currentCodeListIterator.next(), currentShoppingItem.next()) {
					patternFound = false;
					currentCodeListIterator = currentCodeList.iterator();
					break;
				}
			}

			if (patternFound){
				if (codeItterator.hasNext())
					currentCodeList = codeItterator.next();
				else
					return 1;
			}
		}
	}

	return 0;
    }
}
