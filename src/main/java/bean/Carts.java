package bean;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Map;

public class Carts {
    private LinkedList<Cart> carts;
    private BigDecimal sum=new BigDecimal(Double.toString(0.0));
    private int count;


    public BigDecimal getSum() {
        setSum();
        return sum;
    }

    public void setSum() {
        for (Cart c:carts
        ) {
            this.sum=this.sum.add(c.getSum());
        }
    }

    public int getCount() {
        setCount();
        return count;
    }

    public void setCount() {
        for (Cart c:carts
        ) {
            this.count=this.count+c.getBuyCount();
        }
    }

    public LinkedList<Cart> getCarts() {
        return carts;
    }

    public void setCarts(LinkedList<Cart> carts) {
        this.carts = carts;
    }
}
