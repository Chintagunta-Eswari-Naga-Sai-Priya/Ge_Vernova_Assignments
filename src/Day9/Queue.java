package Day9;

public class Queue<T> {
    private LinkedList<T> linkedList = new LinkedList<>();

    public void enqueue(T data) {
        linkedList.add(data);
    }

    public void display() {
        linkedList.display();
    }
}
