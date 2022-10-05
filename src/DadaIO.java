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
     * @param words (String[])
     * @param lines (int)
     * 
     * Purpose: 
     *      1. creates a tempArray to perserve the original
     *      2. randomly prints user specified amount of lines with 8 words per row
     *      3. sets printed word to null to eliminate duplicate printing
     * 
     */
    public static void printLines(String[] words, int lines) {

        String[] tempWords = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            tempWords[i] = words[i];
        }

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < 8; j++) {
                int randNum = (int)(Math.random() * tempWords.length);

                while (tempWords[randNum] == null) {
                    randNum = (int)(Math.random() * tempWords.length);
                }
                
                System.out.print(tempWords[randNum] + " ");

                tempWords[randNum] = null;
            }
            System.out.println();
        }
    }
}
