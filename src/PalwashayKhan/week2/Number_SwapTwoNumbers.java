package PalwashayKhan.week2;

public class Number_SwapTwoNumbers {

    /*
    Swap two variables' values without using a third variable
     */

    //solution 1
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Coding";

        System.out.println("before swapping: ");
        System.out.println("The value of str1 is : " + str1);
        System.out.println("The value of str2 is : " + str2);

        //1.append str1 and str2
        str1 = str1+str2;//JavaCoding

        //store initial string str1 into string str2
        str2 = str1.substring(0,4);
        System.out.println(str2);

        //store initial string str2 in str1
        str1 = str1.substring((str2.length()));//str1 is a substring:to beginning index of str2 (start after str2 length which is 4)

        System.out.println("The value of str1 and str2 after swapping");
        System.out.println("The value of str1 is : " + str1);
        System.out.println("The value of str2 is : " + str2);



    }

}
