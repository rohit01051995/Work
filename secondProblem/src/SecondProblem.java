import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class SecondProblem {

    public static void main(String[] args)
    {


     for(int i=0 ;i<args.length;i++) {
         try {
             String maindir = args[i];
//          String maindir = "/home/rohitvishwakarma/Desktop/samplefolder/first.txt";

             File file = new File(maindir);

             if (file.exists()) {
                 FileReader fr = new FileReader(file);
                 LineNumberReader lnr = new LineNumberReader(fr);

                 int totalLine = 0;

                 while (lnr.readLine() != null) {
                     totalLine++;
                 }

                 System.out.println(file.getName());
                 System.out.println(totalLine);
             } else {
                 System.out.println("file not found");
             }

         } catch (IOException e) {
             e.printStackTrace();
         }


     }
    }


}
