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

        if (words.length < lines * 8) {
            System.out.println("Not enough text. Sorry.");
            System.exit(0);
        }

        printLines(words, lines);
        
        scan.close();
    }

    /*
     * Name: printLines
     * @param: words (String[])
     * @param: lines (int)
     * 
     * Desc: prints out the words in a random order, restricted by the amount of lines
     *          currently 8 words per line
     * 
     */
    public static void printLines(String[] words, int lines) {
        for (int i = 0; i < lines; i++) {

            for (int j = 0; j < 8; j++) {
                int randNum = (int)(Math.random() * words.length);

                while (words[randNum] == null) {
                    randNum = (int)(Math.random() * words.length);
                }
                
                System.out.print(words[randNum] + " ");
                words[randNum] = null;
            }
            System.out.println();
        }
    }
}
