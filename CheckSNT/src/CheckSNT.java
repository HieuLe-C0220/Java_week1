import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class CheckSNT {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num<2) {
            System.out.println(num+ " is not a prime");
        } else if (num == 2) {
            System.out.println(num+" is a prime");
        } else {
            boolean check = false;
            int i=2;
            while (i<=Math.sqrt(num)) {
                if (num%i!=0) {
                    check = true;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(num+" is a prime");
            } else {
                System.out.println(num+" is not a prime");
            }
        }
    }
}
