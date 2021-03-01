/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 01-03-2021
 *   Time: 10:27
 *   File: DetailsOfEmployee.java
 */

package dsaLab.employee;

public class DetailsOfEmployee {
    public NodeEmployee head;

    public DetailsOfEmployee() {
        this.head = null;
    }


    public void enqueue(NodeEmployee newNode) {
        if (isEmpty() || newNode.data.getEmployeeSalary() > head.data.getEmployeeSalary()) {
            newNode.next = head;
            head = newNode;
            return;
        }
        NodeEmployee temp = head;
        while (temp.next != null && temp.next.data.getEmployeeSalary() >= newNode.data.getEmployeeSalary()) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    private boolean isEmpty() {
        return head == null;
    }

    public void display() {
        if (!isEmpty()) {
            NodeEmployee temp = head;
            while (temp != null) {
                System.out.println("Employee name is '" + temp.data.getEmployeeName() + "' with id '" +
                        temp.data.getEmployeeID() + "' having salary '" + temp.data.getEmployeeSalary() +
                        "' on post of '" + temp.data.getEmployeeDesignation() + "'.");
                temp = temp.next;
            }
            System.out.println();
            return;
        }
        System.out.println("Empty");
    }
}
