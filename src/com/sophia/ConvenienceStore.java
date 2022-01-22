package com.sophia;
import java.util.stream.IntStream;
public class ConvenienceStore {

            public static boolean changeEnough(int[] change, double amountDue) {
                double result = (change[0] * 0.25) + (change[1] * 0.10) + (change[2] * 0.05) + (change[3] * 0.01);
                return (result >= amountDue ? true:false);

            }
        }
//    double quarter, dime, nickle, pennie, total;
//		          quarter = change[0] * 0.25;//totalChange += change[0]*.25;
//                dime = change[1] * 0.10;//totalChange += change[1]*.10;
//                nickle = change[2] *0.05;//totalChange += change[2]*.05;
//                pennie = change[3] *0.01;//totalChange += change[3]*.01;
//                total = quarter + dime + nickle + pennie;//
//                if (total >= amountDue)//if(totalChange >= amoutDue)return true
//                return true;
//                else
//                return false;
//                }
//                }


//    Given a total due and an array representing the amount of change in your pocket, determine whether or not you are able to pay for the item. Change will always be represented in the following order: quarters, dimes, nickels, pennies.
//
//        To illustrate: changeEnough([25, 20, 5, 0], 4.25) should yield true, since having 25 quarters, 20 dimes, 5 nickels and 0 pennies gives you 6.25 + 2 + .25 + 0 = 8.50.
//
//        Examples
//        changeEnough([2, 100, 0, 0], 14.11) ➞ false
//
//        changeEnough([0, 0, 20, 5], 0.75) ➞ true
//
//        changeEnough([30, 40, 20, 5], 12.55) ➞ true
//
//        changeEnough([10, 0, 0, 50], 3.85) ➞ false
//
//        changeEnough([1, 0, 5, 219], 19.99) ➞ false