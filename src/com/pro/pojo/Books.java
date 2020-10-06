package com.pro.pojo;

public class Books {
    int bookId;/*图书编号 主键自增*/
    String bookName;    /*图书名称*/
    String bookAuthor;    /*图书作者*/
    String bookPublish;  /*图书出版社*/
    double bookPage;    /*图书页数*/
    double bookPrice;     /*价格*/
    String createDate;    /*添加时间*/


    @Override
    public String toString() {
        return "Books{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPublish='" + bookPublish + '\'' +
                ", bookPage=" + bookPage +
                ", bookPrice=" + bookPrice +
                ", createDate='" + createDate + '\'' +
                '}';
    }


    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPublish() {
        return bookPublish;
    }

    public void setBookPublish(String bookPublish) {
        this.bookPublish = bookPublish;
    }

    public double getBookPage() {
        return bookPage;
    }

    public void setBookPage(double bookPage) {
        this.bookPage = bookPage;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }


}
