package bean;

public class order_detail {
    private int id;
    private Book book;
    private String bookName;
    private double price;
    private int buyCount;
    private int orderBean;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(int buyCount) {
        this.buyCount = buyCount;
    }

    public int getOrderBean() {
        return orderBean;
    }

    public void setOrderBean(int orderBean) {
        this.orderBean = orderBean;
    }
}
