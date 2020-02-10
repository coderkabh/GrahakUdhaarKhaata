/*
 * Created by IntelliJ IDEA.
 * User: kanishk
 * Date: 10/02/20
 * Time: 11:26 PM
 */
package data;

public class Customer {
    private String customerID;
    private String customerName;
    private String customerAdd;
    private String customerPhoneNumber;

    public Customer(String customerID, String customerName, String customerAdd, String customerPhoneNumber) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAdd = customerAdd;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAdd() {
        return customerAdd;
    }

    public void setCustomerAdd(String customerAdd) {
        this.customerAdd = customerAdd;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
