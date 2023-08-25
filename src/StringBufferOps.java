

public class StringBufferOps{

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();  // stringbuffer is a mutable and thread-safe class
        sb.append("hello");

        sb.reverse();
        System.out.println(sb);

    }
}