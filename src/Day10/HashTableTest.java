package Day10;

public class HashTableTest {
    public static void main(String[] args) {
        String sentence = "To be or not to be";
        String[] words = sentence.split(" ");

        HashTable<String, Integer> hashTable = new HashTable<>();
        for (String word : words) {
            Integer count = hashTable.get(word);
            if (count == null) {
                hashTable.add(word, 1);
            } else {
                hashTable.add(word, count + 1);
            }
        }
        hashTable.display(); // Output: Word frequencies
    }
}
