package stringPrograms;

// find email id is on gmail and
// find username and domain name from given email

public class FindUsernameFromGmail {
    public static void main(String[] args) {
        String str = "programmer@gmail.com";

        System.out.println(str.contains("gmail.com"));
        int index = str.indexOf('@');
        System.out.println("Username: "+ str.substring(0, index));
        String domain = str.substring(index+1, str.length());
        System.out.println("Domain name: "+ domain);
        System.out.println(domain.equals("gmail.com"));
    }
}
