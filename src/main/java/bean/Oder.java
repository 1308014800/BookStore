package bean;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

public class Oder {
    private int id;
    private String orderNo;
    private Date orderDate;

    private BigDecimal orderMoney;
    private  int orderCount;
    private int orderStatus;
    private User user;
    public Oder(Carts carts){
        orderNo= UUID.randomUUID().toString();
        orderDate=new Date();
        orderMoney= carts.getSum();
        orderStatus=1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



}
