import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int codeListCount = scanner.nextInt();
        scanner.nextLine();


        String[][] codeList = new String[codeListCount][];

        for (int i = 0; i < codeListCount; i++) {
            String codes = scanner.nextLine();
            codeList[i] = codes.split(" ", 0);
        }

        String shoppingCartString = scanner.nextLine();
        String[] shoppingCart = shoppingCartString.split(" ", 0);

        int foo = Foo.IsBuyerWinner(codeList, shoppingCart);
        System.out.println(foo);
    }
}
