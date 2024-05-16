package Ayjamal.week5;

public class reverse {

    public static void main(String[] args) {
        
        String input = "ABCD";
        String reverse = "";

        for (int i = input.length()-1; i >=0; i--) {
            
            reverse += input.charAt(i);
            
        }

        System.out.println("reverse = " + reverse);
    }

     /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/
}
