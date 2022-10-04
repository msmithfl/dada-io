import java.util.Scanner;

public class DadaIO {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, I'm Dada.io!\n");
        System.out.println("Feed me a news article and I'll write a poem for you.");

        String article = scan.nextLine();
        String words[] = article.split(" ");

        System.out.println("\nThanks, that tasted like shit.");
        System.out.println("How many lines should this masterpiece be?");

        int lines = scan.nextInt();
        System.out.println();

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < 8; j++) {
                int randNum = (int)(Math.random() * words.length);
                System.out.print(words[randNum] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
