
import java.util.Scanner;

// @author Ahmad Kamil Almasyhur (@145150200111170)
public class SoalB {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        StringBuffer b = new StringBuffer(input.nextLine());
        b.reverse();
        System.out.println(b);
    }
}
