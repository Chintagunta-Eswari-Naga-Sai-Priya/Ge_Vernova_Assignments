package Day9;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.display();

        System.out.println("Top element: " + stack.peak());
        System.out.println("Popped element: " + stack.pop());
        stack.display();
    }
}
