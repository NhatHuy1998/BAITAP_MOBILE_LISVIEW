package com.example.listview;

public class AoThun {
    private int resImage;
    private String title;
    private int price;

    public AoThun(int resImage, String title, int price) {
        this.resImage = resImage;
        this.title = title;
        this.price = price;
    }

    public AoThun() {
    }

    public int getResImage() {
        return resImage;
    }

    public void setResImage(int resImage) {
        this.resImage = resImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "resImage=" + resImage +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}


