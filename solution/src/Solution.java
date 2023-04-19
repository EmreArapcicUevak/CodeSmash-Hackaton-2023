import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codeListCount = scanner.nextInt();


        ArrayList<String> codeList = new ArrayList<String>();

        for (int i = 0; i < codeListCount; i++)
        {
            String codeListItem = scanner.nextLine();
            codeList.add(codeListItem);
        }

        int shoppingCartCount = scanner.nextInt();


        ArrayList<String> shoppingCart = new ArrayList<String>();

        for (int i = 0; i < shoppingCartCount; i++)
        {
            String shoppingCartItem = scanner.nextLine();
            shoppingCart.add(shoppingCartItem);
        }

        int foo = Foo.IsBuyerWinner(codeList, shoppingCart);

        System.out.println(foo);
    }
}