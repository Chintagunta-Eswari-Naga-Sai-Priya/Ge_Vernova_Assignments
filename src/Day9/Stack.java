package Day9;

public class Stack<T> {
    private LinkedList<T> linkedList = new LinkedList<>();

    // Push element onto the stack
    public void push(T data) {
        linkedList.addFirst(data);
    }

    // Display stack elements
    public void display() {
        linkedList.display();
    }
}

