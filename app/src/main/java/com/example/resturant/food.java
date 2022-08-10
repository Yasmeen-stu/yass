package com.example.resturant;

public class food {

    private int img;
    private String text;

    public food(int img, String text) {
        this.img = img;
        this.text = text;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}


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

