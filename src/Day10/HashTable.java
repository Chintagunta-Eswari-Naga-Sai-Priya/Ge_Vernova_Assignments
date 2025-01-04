package Day10;

import Day9.LinkedList;
public class HashTable<K, V> {
    private LinkedList<MyMapNode<K, V>> bucketArray;

    public HashTable() {
        bucketArray = new LinkedList<>();
    }

    public void add(K key, V value) {
        MyMapNode<K, V> newNode = new MyMapNode<>(key, value);
        bucketArray.add(newNode);
    }

    public V get(K key) {
        for (MyMapNode<K, V> node : bucketArray) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    public void display() {
        for (MyMapNode<K, V> node : bucketArray) {
            System.out.println(node.key + ": " + node.value);
        }
    }
}
