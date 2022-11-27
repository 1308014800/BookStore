package bean;

import java.math.BigDecimal;

public class Cart {

  private int id;
  private double price;
  private int buyCount;
  private User  user;
  private Book book;
  private BigDecimal sum;
    public void setPrice(double price) {
        this.price = price;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(int buyCount) {
        this.buyCount = buyCount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getSum() {
        setSum();
        return sum;
    }

    public void setSum(){
        this.sum=new BigDecimal(Double.toString(price));
        this.sum=this.sum.multiply(new BigDecimal(Integer.toString(buyCount)));
    }
}
