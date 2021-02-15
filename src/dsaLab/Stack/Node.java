/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 15-02-2021
 *   Time: 10:22
 *   File: Node.java
 */

package dsaLab.Stack;

class StackNode {
    int data;
    StackNode next;

    public StackNode() {
        data = 0;
        next = null;
    }

    public StackNode(int data) {
        this.data = data;
        next = null;
    }
}

class StackByLinkedList {
    StackNode top;

    public StackByLinkedList() {
        top = null;
    }

    public void push(StackNode newNode) {
        if (top == null) {
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("empty");
            return;
        }
        top = top.next;
    }

    public void peak() {
        if (isEmpty()) {
            System.out.println("no element");
            return;
        } else {
            System.out.println(top.data);
        }
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public boolean isFull() {
        return false;
    }

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