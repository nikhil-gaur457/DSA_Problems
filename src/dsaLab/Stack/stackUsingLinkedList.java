/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 15-02-2021
 *   Time: 10:22
 *   File: stackUsingLinkedList.java
 */

package dsaLab.Stack;

// StackNode class for data of nodes
class StackNode {
    int data;
    StackNode next;

    // No-argument constructor
    public StackNode() {
        data = 0;
        next = null;
    }

    // parameterized constructor
    public StackNode(int data) {
        this.data = data;
        next = null;
    }
}

// StackByLinkedList class for creating the methods for stack
class StackByLinkedList {
    StackNode top;

    // No-argument constructor
    public StackByLinkedList() {
        top = null;
    }

    // push method for insertion of element in stack
    public void push(StackNode newNode) {
        if (top == null) {
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }

    // pop method for removal of element in stack
    public void pop() {
        if (isEmpty()) {
            System.out.println("empty");
            return;
        }
        top = top.next;
    }

    // peak method for top most element of stack
    public void peak() {
        if (isEmpty()) {
            System.out.println("no element");
            return;
        } else {
            System.out.println(top.data);
        }
    }

    // isEmpty method for checking is stack empty or not
    public boolean isEmpty() {
        return (top == null);
    }

    // isFull method for checking stack is full or not
    public boolean isFull() {
        return false;
    }

    // display method for printing the values
    public void display() {
        if (isEmpty()) {
            System.out.println("empty");
            return;
        }
        StackNode temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

// execution class for stack by linkedList
class StackMain {
    public static void main(String[] args) {
        StackByLinkedList stack = new StackByLinkedList();
        System.out.println("is stack empty? : " + stack.isEmpty());
        stack.push(new StackNode(5));
        System.out.println("is stack empty? : " + stack.isEmpty());
        stack.peak();
        stack.push(new StackNode(6));
        stack.peak();
        stack.pop();
        stack.peak();
        stack.display();
    }
}