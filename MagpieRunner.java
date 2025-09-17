// Eunice Chan
// 2025-09-17

import java.util.Scanner;

public class MagpieRunner {

    public static void main(String[] args) {
        Magpie maggie = new Magpie();
        System.out.println(maggie.getGreeting());

        Scanner in = new Scanner(System.in);
        String statement = in.nextLine();

        while (!statement.equalsIgnoreCase("bye")) { // case-insensitive check
            String response = maggie.getResponse(statement);
            System.out.println(response);

            statement = in.nextLine();
        }

        // Print final goodbye
        System.out.println(maggie.getResponse("bye"));

        in.close();
    }
}
