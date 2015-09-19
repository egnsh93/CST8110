import java.util.Scanner;

public class Lab7
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        String s;
        String words[];
        
        int[] wordLength = new int[200];
        
        for (int i = 0; i < wordLength.length; i++) {
            wordLength[i] = 0;
        }

        // Get the string from the user
        System.out.println("Enter the phrase: ");
        s = input.nextLine();

        
        // Split the string into words
        words = s.split("[.,1234567890!@#$%^&*()_+\\s+]");
        
        System.out.println("Number of words: " + words.length);

        for (String word : words)
        {
            wordLength[word.length()]++;
        }
        
        for (int i = 0; i < wordLength.length; i++)
        {
            System.out.println(i + " " + wordLength[i]);
        }
        // Iterate through each word
//        for (int i = 0; i < words.length; i++)
//        {
//           
//            System.out.println(words[i] + " is " + words[i].length() + " letters long");
//        }

        input.close();

    }

}
