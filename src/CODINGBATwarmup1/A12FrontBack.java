package CODINGBATwarmup1;

public class A12FrontBack {
    /*
    Given a string, return a new string where the first and last chars have been exchanged.

    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"*/
    public static void main(String[] args) {
        System.out.println(frontBack("kaya"));

    }
    public static String frontBack(String str){
        if(str.length() <= 1)
            return str;

        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);

        return last + str.substring(1, str.length()-1) + first; //??/
    }
}
