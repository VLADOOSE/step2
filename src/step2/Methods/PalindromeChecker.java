package step2.Methods;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println(isPalindrome("a  ga g aga"));
    }
    public static boolean isPalindrome(String text){
        text = text.replaceAll("\\s+", "").toLowerCase();
        String[] arr = new String[text.length()];
        for(int i = 0; i < text.length(); i++){
            arr[i] = String.valueOf(text.charAt(i));
        }
        int left = 0;
        int right = text.length() - 1;
        while(left < right){
            if(arr[left].equals(arr[right])){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}
