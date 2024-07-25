import java.util.Scanner;

public class TraduireDesMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recevoir le message de l'utilisateur

        System.out.println("Veuillez entrer votre message");
        String message = scanner.nextLine();

        // Conversion et affichage des résultats
        System.out.println("Conversions des caractères");
        for (char ch : message.toCharArray()){
            int asciiValue = (int) ch;
            String binary = Integer.toBinaryString(asciiValue);
            String octal = Integer.toOctalString(asciiValue);

            System.out.printf("Caractère: %c | ASCII: %d | Binaire: %s | Octal: %s\n",
                    ch, asciiValue, binary, octal);
        }
    }
}
