public class Palindromes_09 {


    public static void main(String[] args) {
        boolean palindrome = isPalindrome(123);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        StringBuilder sb = new StringBuilder(s);
        StringBuilder reverse = sb.reverse();
        String s1 = reverse.toString();
        if(s.equals(s1)){
            return true;

        }else {
            return false;
        }

    }
}
