import java.util.Scanner;

public class InputUsingScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String line = sc.nextLine();

        int a = sc.nextInt();

        float b = sc.nextFloat();

        System.out.println("Entered Word : " + str);

        System.out.println("Entered Line : " + line);

        System.out.println("Entered Integer : " + a);

        System.out.println("Entered Float : " + b);
    }

}
