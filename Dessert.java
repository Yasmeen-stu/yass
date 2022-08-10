package com.example.thedessert;

public class Dessert {
    private int image;
    private String textd;

    public Dessert(int image, String textd) {
        this.image= image;
        this.textd = textd;
    }

    public int getImg() {
        return image;
    }

    public void setImg(int iamge) {
        this.image = image;
    }

    public String getText() {
        return textd;
    }

    public void setText(String text) {
        this.textd= textd;
    }
}
