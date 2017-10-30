import java.net.URLDecoder;
import java.net.URLEncoder;

public class Tests {
    public static void main(String[] args) throws Exception{
        String s = "s's\\'s+ +g+h%'";
        String ss = URLEncoder.encode(s,"UTF-8");
        System.out.println(ss);
        System.out.println(URLDecoder.decode(ss,"UTF-8"));
    }
}
