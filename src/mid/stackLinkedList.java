
package mid;


public class stackLinkedList {
    
    
      private class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node top;
    
    public stackLinkedList() {
        top = null;
    }
    public void push(int value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + "pushed into the stacked");
    }
    public int peek() {
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    } 
    public boolean isEmpty() {
        return top == null;
    }
    public int pop() {
        if (isEmpty()){
            System.out.println("Stack Underflow! Stack is empty.");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    public void display() {
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        Node current = top;
        System.out.println("Stack Elements: ");
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
            
    public static void main(String[] args) {
        stackLinkedList stack = new stackLinkedList();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println();
        
        stack.display();
        System.out.println("Top element: " + stack.peek());
        System.out.println("Remove: " + stack.pop());
        System.out.println("Top element: " + stack.peek());
        stack.display();
        
    }

}
