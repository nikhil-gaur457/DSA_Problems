/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 01-03-2021
 *   Time: 10:39
 *   File: NodeForEmployee.java
 */

package dsaLab;

class NodeEmployee {
    public NodeEmployee next;
    public Employee data;

    public NodeEmployee(Employee data) {
        this.data = data;
        this.next = null;
    }
}