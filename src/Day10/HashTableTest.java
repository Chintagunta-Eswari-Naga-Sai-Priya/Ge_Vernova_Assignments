package Day10;
public class HashTableTest {
    public static void main(String[] args) {
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words = paragraph.split(" ");

        HashTable<String, Integer> hashTable = new HashTable<>(10);
        for (String word : words) {
            Integer count = hashTable.get(word);
            if (count == null) {
                hashTable.add(word, 1);
            } else {
                hashTable.add(word, count + 1);
            }
        }
        hashTable.display();

        System.out.println("Removing 'avoidable':");
        hashTable.remove("avoidable");
        hashTable.display(); // "avoidable" should be removed
    }
}
