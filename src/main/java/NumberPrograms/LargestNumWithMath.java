package NumberPrograms;

public class LargestNumWithMath {
    public static void main(String[] args) {
        int a = 10, b = 81, c = 75;

        int largest = Math.max(a, Math.max(b, c));
        System.out.println("Largest Number: "+largest);
    }
}
