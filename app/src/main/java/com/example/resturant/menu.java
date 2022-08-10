package com.example.resturant;

public class menu {
    private int img;
    private String text1;
    private String text2;

    public menu(int img, String text1, String text2) {
        this.img = img;
        this.text1 = text1;
        this.text2 = text2;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }
}
public class dessertmenu {
   private String dessert_name,dessert_price;
   private int image_id;

    public dessertmenu(String dessert_name, String dessert_price, int image_id) {
        this.dessert_name = dessert_name;
        this.dessert_price = dessert_price;
        this.image_id = image_id;
    }

    public dessertmenu(int donuts, String string) {

    }


    public int getImage() {
        return image_id;
    }

    public void setIamge(int image_id) {
        this.image_id = image_id;
    }

    public String getText1() {
        return dessert_name;
    }

    public void setText1(String dessert_name) {
        this.dessert_name = dessert_name;
    }

    public String getText2() {
        return dessert_price;
    }

    public void setText2(String dessert_price) {
        this.dessert_price = dessert_price;
    }
}
