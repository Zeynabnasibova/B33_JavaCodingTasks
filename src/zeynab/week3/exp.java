package zeynab.week3;

public class exp {

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }


    public static int reverse (int number){
        String numberString = String.valueOf(number);//-123
        System.out.println("Straight Str:  " + numberString);

        int reverseInt = 0 ;
         String rev = "";//321


        for(int i = numberString.length()-1; i >0 ; i--){//123

            rev +=  numberString.charAt(i);

        }

        reverseInt = Integer.parseInt(rev);

        return -reverseInt;
    }

}
