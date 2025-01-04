package Day10;

import Day9.LinkedList;

public class HashTable<K, V> {
    private ArrayList<LinkedList<MyMapNode<K, V>>> bucketArray;
    private int numBuckets;

    public HashTable(int size) {
        bucketArray = new ArrayList<>(size);
        numBuckets = size;
        for (int i = 0; i < size; i++) {
            bucketArray.add(new LinkedList<>());
        }
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode()) % numBuckets;
    }

    public void add(K key, V value) {
        int index = getBucketIndex(key);
        LinkedList<MyMapNode<K, V>> bucket = bucketArray.get(index);
        for (MyMapNode<K, V> node : bucket) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        bucket.add(new MyMapNode<>(key, value));
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        LinkedList<MyMapNode<K, V>> bucket = bucketArray.get(index);
        for (MyMapNode<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    public void display() {
        for (int i = 0; i < numBuckets; i++) {
            LinkedList<MyMapNode<K, V>> bucket = bucketArray.get(i);
            for (MyMapNode<K, V> node : bucket) {
                System.out.println(node.key + ": " + node.value);
            }
        }
    }
    public void remove(K key) {
        int index = getBucketIndex(key);
        LinkedList<MyMapNode<K, V>> bucket = bucketArray.get(index);
        bucket.removeIf(node -> node.key.equals(key));
    }

}

