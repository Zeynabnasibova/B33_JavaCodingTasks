package zeynab.week4;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/

    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBCCC DD D F C"));
    }

    public static String removeDuplicates(String str){

        // String str = "AAABBBCCC";

        String eachOneLetter = ""; // first step: in here come first letter --> A --> because in here we dont't have that letter befor --> next step: if have that letter don't put
        // next step: if in here we didn't have new letter put in here next new letter --> AB  --> next step: if have that letter don't put
        //next step:  again chek and put in here letter if we didn't have in here that letter--> ABC -->next step: if have that letter don't put

        for (int i = 0; i < str.length(); i++) {

            if (!eachOneLetter.contains("" + str.charAt(i))) { // we chek if "eachOneLetter" didn't contain each letter ,put that letter inside the "eachOneLetter"

                eachOneLetter += str.charAt(i);

            }

        }
        return eachOneLetter;  // we remove duplicate

    }
}