/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 01-03-2021
 *   Time: 10:35
 *   File: MainEmployee.java
 */

package dsaLab.employee;

import java.util.ArrayList;

public class MainEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee(12, "Nik", "SDE", 90000));
        arrayList.add(new Employee(13, "alok", "SDE3", 150000));
        arrayList.add(new Employee(14, "kelly", "SDE2", 120000));
        arrayList.add(new Employee(15, "eve", "ASDE", 45000));
        arrayList.add(new Employee(16, "adam", "SDE", 90000));

        DetailsOfEmployee details = new DetailsOfEmployee();
        for (Employee employee : arrayList) {
            details.enqueue(new NodeEmployee(employee));
        }
        details.display();
    }
}