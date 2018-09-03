import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FetchWiki {

    public static void main(String[] args) throws  Exception{
        URL oracle = new URL("https://en.wikipedia.org/");
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));



        String inputLine;

        System.out.println(in.readLine());

        String extracted = "" ;

        while ((inputLine = in.readLine()) != null)
            extracted+=inputLine ;

//        System.out.println(extracted);
        in.close();
        Pattern p = Pattern.compile("<title>(.*)</title>");
        Matcher m = p.matcher(extracted) ;

        while (m.find())
            System.out.println(extracted.substring(m.start(),(m.end())));



    }

}
