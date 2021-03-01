/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 02-03-2021
 *   Time: 00:07
 *   File: NodeEmployee.java
 */

package dsaLab.employee;

public class NodeEmployee {
    public NodeEmployee next;
    public Employee data;

    public NodeEmployee(Employee data) {
        this.data = data;
        this.next = null;
    }
}