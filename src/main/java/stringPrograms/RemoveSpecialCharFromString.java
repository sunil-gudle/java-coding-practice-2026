package stringPrograms;

// Remove all special characters from given string

public class RemoveSpecialCharFromString {
    public static void main(String[] args) {
        String str = "a!b@c#d$e%f^g&jhsdk";
        String str1 = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str1);
    }
}
