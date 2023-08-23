import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFromUser {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int a = Integer.parseInt(br.readLine());

        System.out.println("Entered String : " + str);

        System.out.println("Entered Integer : " + a);

    }
}
