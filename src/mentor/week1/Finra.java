package mentor.week1;

public class Finra {
    public static void main(String[] args) {
        FINRA(30);
    }

    private static void FINRA(int num) {
        String result = "";
        for (int i = 1; i <= num; i++) { //iterate from 1 to 30
            if (i % 15 == 0 ) //multiple of both 3 and 5, print "FINRA" instead of the number.
                result += "FINRA ";
            else if (i % 5 == 0) //multiple of 5, print "RA" instead of the number.
                result += "RA ";
            else if (i % 3 == 0)
                result += "FIN ";  //multiple of 3, print "FIN" instead of the number.
            else
                result += i + " ";
        }
        System.out.println(result);
    }

    /*
FINRA :
Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number.
 */
}
