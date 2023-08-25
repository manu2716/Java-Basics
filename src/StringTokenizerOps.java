import java.util.StringTokenizer;

public class StringTokenizerOps {
    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer("Hello Geeks How are you?"," ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
