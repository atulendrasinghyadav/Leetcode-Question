public class Reverse_vowel {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Original string: " + str);
        String reversedVowelStr = reverseVowels(str);
        System.out.println("String after reversing vowels: " + reversedVowelStr);
    }
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        String vowels = "aeiouAEIOU";

        while (left < right) {
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}
