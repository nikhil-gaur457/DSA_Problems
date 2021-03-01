/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 01-03-2021
 *   Time: 10:18
 *   File: Employee.java
 */

package dsaLab;

public class Employee {
    private int employeeID;
    private String employeeName;
    private String employeeDesignation;
    private long employeeSalary;

    public Employee(int employeeID, String employeeName, String employeeDesignation, long employeeSalary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeDesignation = employeeDesignation;
        this.employeeSalary = employeeSalary;
    }

    public Employee() {
        this.employeeID = 0;
        this.employeeName = null;
        this.employeeDesignation = null;
        this.employeeSalary = 0;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public long getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(long employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}