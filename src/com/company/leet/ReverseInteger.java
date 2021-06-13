package com.company.leet;

public class ReverseInteger {
    public int reverse(int num) {
     int re;
     int val = 0;
      while(num != 0) {
          re = num % 10;
          val = val * 10 + re;
          num = num / 10;
      }

        return val ;
    }
    public static void main(String args[]){
        int num = -15;
        ReverseInteger obj = new ReverseInteger();
        System.out.println(obj.reverse(num));
    }

}
