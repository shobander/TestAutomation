package org.example;

public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 20; i++) {   //generate i from 2 to 20
            //reset flag
            boolean flag = true;
            for (int j = 2; j <= i - 1; j++) {     //generate j from 2 to i-1
                if (i % j == 0) {              //check if remainder of (i/j) is zero
                    flag = false;            //set flag as false if remainder is zero
                }
            }
            if (flag == true) {                  //if remainder of (i/j) is not zero
                System.out.println(i);          //print i
            }
        }
    }
}
