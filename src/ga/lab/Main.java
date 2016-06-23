package ga.lab;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String charString;
        double summedDoubles;
        int middleValue;

        //Problem 1:
        stringLengthOrValue("I said");
        stringLengthOrValue("hey");
        stringLengthOrValue("whats up?");
        stringLengthOrValue("hello!");

        //Problem 2:
        reversedOrder();

        //Problem 3:
        maxValue(new int[]{2, 52, 7, 91, 10, 12});
        maxValue(new int[]{12, 1, 11});
        maxValue(new int[]{0, 14});
        maxValue(new int[]{100, 23, 29, 101, 1});

        //Problem 4:

        summedDoubles = sumOfValues(new double[]{12.1, 13.9, 7.0});
        System.out.println(summedDoubles);
        //how do we print a variable to the command line

        summedDoubles = sumOfValues(new double[]{1.23, 2.09, 9.2});
        System.out.println(summedDoubles);
        //how do we print a variable to the command line

        summedDoubles = sumOfValues(new double[]{1.01, 15.1, 22.27, 19.99});
        System.out.println(summedDoubles);
        //how do we print a variable to the command line

        summedDoubles = sumOfValues(new double[]{3.08, 4.1, 7.2, 3.0});
        System.out.println(summedDoubles);
        //how do we print a variable to the command line


         //Problem 5:
      charString = charsToString(new char[]{'h', 'e', 'l', 'l', 'o'});
      System.out.println(charString);
      //how do we print a variable to the command line

      charString = charsToString(new char[]{'t', 'h', 'e', 'r', 'e', '!'});
      System.out.println(charString);
    //how do we print a variable to the command line

      charString = charsToString(new char[]{'I', ' ', 'a', 'm', ' '});
      System.out.println(charString);
    //how do we print a variable to the command line

      charString = charsToString(new char[]{'A', ' ', 'S', 't', 'r', 'i', 'n', 'g', '.'});
       System.out.println(charString);
      //how do we print a variable to the command line

        //    //Problem 6:
        List<String> myStringList = new ArrayList<>();
        myStringList.add("Al");
        myStringList.add("verte");
        myStringList.add("las");
        myStringList.add("flores");
        myStringList.add("lloran");
        //.add would only work in the main method, not outside of it. Why?


//          //Problem 7:
        reversedStringOrder(myStringList);

//          //Problem 8:
        printOrAdd(myStringList);

//          //Problem 9:
            int[] oddSizedArray = new int[9];

//          //Problem 10:
            middleValue = findMiddle(oddSizedArray);
            System.out.println(middleValue);
//          //how do we print a variable to the command line

            middleValue = findMiddle(new int[]{2,7,9,12,15});
            System.out.println(middleValue);
//          //how do we print a variable to the command line

            middleValue = findMiddle(new int[]{13, 91, 27, 99, 14, 36, 10});
            System.out.println(middleValue);
//          //how do we print a variable to the command line

            middleValue = findMiddle(new int[]{100, 1, 45, 1092, 76, 12, 34, 11, 145});
            System.out.println(middleValue);
//          //how do we print a variable to the command line

    }


//1.
      public static void stringLengthOrValue(String aString){

      if(aString.length() > 5){
          System.out.println(aString);
      }
      else if(aString.length() < 5){
          System.out.println(aString.length());
      }
      else{
          System.out.println("Invalid Word");
      }

  }
//2.
   public static void reversedOrder() {

       int[] anArray = new int[10];

       for (int i = 0; i < anArray.length; i++) {

           anArray[i] = i;

       }
       for (int i = 9; i >= 0; i--){

           System.out.println(anArray[i]);

       }
   }
//3.
 public static void maxValue(int[] array){
      int maxValue = 0;

     for (int i = 0; i < array.length; i++){
         if (array[i] > maxValue){
             maxValue = array[i];
         }
     }
     System.out.println(maxValue);

      }
//4.
  public static double sumOfValues(double[] array){
      double sum = 0;

      for (int i= 0; i < array.length; i++){

      sum = sum + array[i];

      }

      return sum;

      }
//5.
    public static String charsToString(char[] array) {
        String chars = " ";

        for (int i = 0; i < array.length; i++) {

            chars = chars + array[i];
        }
        return chars;

        }

//6.
//7.
    public static void reversedStringOrder(List<String> stringsList) {

        int listSize = stringsList.size();

        for (int i = listSize - 1; i >= 0; i--) {

            System.out.println(stringsList.get(i));
        }
       }

    //8.
     public static void printOrAdd(List<String> list){

         int listSize = list.size();

         if (listSize == 10){
             for(int i = 0; i < listSize; i++){

                 System.out.println(i);
             }
         }
         else{
             System.out.println("Java " + listSize);

             }
         }


//9.
//10.
  public static int findMiddle(int[] midArray) {

      int arraySize = (midArray.length / 2);

      return midArray[arraySize];




      }
  }

















