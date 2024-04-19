package mentor.week3;

public class reverseNegativeNumber {
    //Write a return method that can reverse negative number and return it as int
    //ex: given int is ==> -53
    //  the output will be ==> -35

    public static int reverse(int number){
        if(number < 10 && number >= 0){
            return number;
        }

        int result = 0;
        while (number !=0) {
            result = result * 10 + number % 10;
            number /= 10;
        }

        return result;
    }

    public static int reverseNum(int  num) {
// first approach
//        String str = new StringBuilder(""+num).reverse().toString();
//
//        if(num < 0) {
//            str = "-"+str.substring(0, str.length()-1);
//        }
//
//        return Integer.parseInt(str);

//second approach

        String numAsStr=String.valueOf(num);
        String[] numInStrArray=numAsStr.split("");
        //System.out.println(Arrays.toString(numInStrArray));
        String result="";
        for (int i = numInStrArray.length-1; i >0 ; i--) {
            result+=numInStrArray[i];
        }
        return -1*Integer.parseInt(result);
    }

}

