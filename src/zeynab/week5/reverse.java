package zeynab.week5;


public class reverse {
   /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/
   public static void main(String[] args) {

       System.out.println(reverse("Hello world"));
   }

    public static String reverse(String word){

        String reverse =""; //empty String variable like container,


//initialization shows us we started at the end of the String and go to the beginning of the String
        for (int i=word.length()-1; i>=0;i--){
            // when termination expression evaluated to true then start to increment

            //when the conditions is true our code take one letter from the String  and again looping while false.Then evaluated code.
            reverse += word.charAt(i);
        }

        return reverse;
    }
}