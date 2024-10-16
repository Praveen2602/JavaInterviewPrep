import java.util.*;
public class PalindromeCheck {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string");

        String str = sc.nextLine();

        //removing all the spaces 
        str = str.replaceAll("\\s+","").toLowerCase();
        //checking from palindrome
        if(isPalindrome(str)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not a Palindrome");
        }
    }
    public static boolean isPalindrome(String str){
        int left =0;
        int right = str.length()-1;

        while (left <right) {
            if(str.charAt(left)!=str.charAt(right))
            {
                return false;
            }
        }
        return true;
    }
}
