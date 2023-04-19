import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codeListCount = scanner.nextInt();
        scanner.nextLine();


        ArrayList<ArrayList<String>> codeList = new ArrayList<ArrayList<String>>();

        for (int i = 0; i < codeListCount; i++) {
            int listCount = scanner.nextInt();
            scanner.nextLine();
            ArrayList<String> list = new ArrayList<String>();
            for (int j = 0; j < listCount; j++) {
                String codeListItem = scanner.nextLine();
                list.add(codeListItem);
            }
            codeList.add(list);
        }

        int shoppingCartCount = scanner.nextInt();
        scanner.nextLine();


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