package com.example.demo.etc;

public class EnumDemo {
    int menu = 0;
    public static final int americano = 0;
    public static final int latte = 1;
    public static final int strawberryAde = 2;
    public static final int espresso = 3;

    public static void main(String[] args) {
        CoffeeMenu coffeeMenu = CoffeeMenu.americano;
        System.out.println("coffeeMenu = " + coffeeMenu);
    }
    public void selectMenu(){
        switch (menu){
            case 0:
                System.out.println("ame");
                break;
            case 1:
                System.out.println("late");
                break;
            case 2:
                System.out.println("ade");
                break;
            case 3:
                System.out.println("espr");
        }
    }

    public enum CoffeeMenu {
        americano,
        latte,
        strawberryAde,
        espresso,
    }
}
