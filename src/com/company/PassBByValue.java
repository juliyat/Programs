package com.company;

public class PassBByValue {
    public static void main(String... args){
        PassBByValue obj = new PassBByValue();
        int x = 4;
        obj.checkValue(x);
        System.out.println(x);
    }
    private void checkValue(int x){
        System.out.println("Fist time value "+ x);
       while (x <= 10) {
           x++;
           System.out.println("x second" + x);
       }

        System.out.println("Last" + x);
    }
}
