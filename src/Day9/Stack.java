package Day9;
public class Stack<T> {
    private LinkedList<T> linkedList = new LinkedList<>();

    public void push(T data) {
        linkedList.addFirst(data);
    }

    public T pop() {
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList.removeFirst();
    }

    public T peak() {
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList.getHead();
    }

    public void display() {
        linkedList.display();
    }
}


