package stringPrograms;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        System.out.println(str1 == str2);

        String str3 = "Java1";
        String str4 = "java1";
        System.out.println(str3 == str4);

        System.out.println(str1.equals(str2));

        System.out.println(str3.equals(str4));
        String str = "Welcome to Java World";

        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.substring(4));
        System.out.println(str.substring(2, 6));
        System.out.println(str.replace('W', 'M'));
        System.out.println(str.startsWith("Wel"));
        System.out.println(str.endsWith("ld"));
        System.out.println(str.charAt(4));
        System.out.println(str.indexOf('J'));
        System.out.println(str.indexOf('o', 5));
        System.out.println(str.lastIndexOf('e',11));
    }
}
