package PossibleInterviewQuestion;

public class T2_RemoveDublicates {
//    2. Write a return method that can remove the duplicated values
//from String
//Ex: removeDup("AAABBBCCC") ==> ABC
    public String removeDub(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }

}
