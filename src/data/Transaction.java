/*
 * Created by IntelliJ IDEA.
 * User: kanishk
 * Date: 10/02/20
 * Time: 11:29 PM
 */
package data;

public class Transaction {
    private String customerID;
    private int remAmt;

    public Transaction(String customerID, int remAmt) {
        this.customerID = customerID;
        this.remAmt = remAmt;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public int getRemAmt() {
        return remAmt;
    }

    public void setRemAmt(int remAmt) {
        this.remAmt = remAmt;
    }
}
