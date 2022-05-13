import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int starN, starM;

        Scanner sc = new Scanner(System.in);
        starN = sc.nextInt();
        starM = sc.nextInt();
        for(int i=0; i<starM; i++) {
            for (int j = 0; j < starN; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
