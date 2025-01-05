package Day14;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchWords {

    public static List<String> readWordsFromFile(String filename) {
        List<String> words = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] wordArray = line.split(",");
                Collections.addAll(words, wordArray);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return words;
    }

    public static boolean binarySearch(List<String> words, String searchWord) {
        int left = 0, right = words.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (words.get(mid).equals(searchWord))
                return true;
            else if (words.get(mid).compareTo(searchWord) < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        List<String> words = readWordsFromFile("words.txt");
        Collections.sort(words);

        String searchWord = "example"; // Replace with user input if needed

        if (binarySearch(words, searchWord)) {
            System.out.println("The word '" + searchWord + "' was found in the list.");
        } else {
            System.out.println("The word '" + searchWord + "' was not found in the list.");
        }
    }
}
