package bbejeck.model;

/***
 * @Author: zjh
 * @Description: 客户购买信息类，包括用户ID、交易日期
 * @Date: 5/17/21
 * @version 1.0
 * @Param:
 **/


import java.util.Date;

public class PurchaseKey {
    private String customerId;
    private Date transactionDate;

    public PurchaseKey(String customerId, Date transactionDate) {
        this.customerId = customerId;
        this.transactionDate = transactionDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
}
