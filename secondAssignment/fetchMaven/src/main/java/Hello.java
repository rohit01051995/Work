
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hello {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello");

        HttpClient client = new DefaultHttpClient();
        HttpGet request = new HttpGet("http://www.wikipedia.com");
        HttpResponse response = ((DefaultHttpClient) client).execute(request);

// Get the response
        BufferedReader in = new BufferedReader
                (new InputStreamReader(
                        response.getEntity().getContent()));


        String inputLine;

        System.out.println(in.readLine());

        String extracted = "" ;

        while ((inputLine = in.readLine()) != null)
            extracted+=inputLine ;

//        System.out.println(extracted);
//        in.close();


        Pattern p = Pattern.compile("<title>(.*)</title>//<span>(.*)</span>");
        Matcher m = p.matcher(extracted) ;

        while (m.find())
            System.out.println(extracted.substring(m.start(),(m.end())));


        Pattern p1 = Pattern.compile("<span>(.*)</span>");
        Matcher m2 = p1.matcher(extracted) ;


        while (m2.find()) {
            System.out.println(extracted.substring(m2.start(), (m2.end())));
            System.out.println("");
            System.out.println("");
        }
    }
}
