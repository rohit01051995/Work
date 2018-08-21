import java.io.File;

public class FileName {

    static void RecursivePrint(File[] arr,int index,int level)
    {
        if(index == arr.length)
            return;

        for (int i = 0; i < level; i++)
            System.out.print("\t");


        if(arr[index].isFile())
            System.out.println(arr[index].getName());

        else if(arr[index].isDirectory())
        {
            System.out.println("[" + arr[index].getName() + "]");

            RecursivePrint(arr[index].listFiles(), 0, level + 1);
        }

        // recursion for main directory
        RecursivePrint(arr,++index, level);
    }
    public static void main(String[] args)
    {

//       String maindir="/home/rohitvishwakarma/Desktop/work";
       String maindir=args[0];
        File file= new File(maindir);

       File files[] =file.listFiles();


      RecursivePrint(files,0,0);

    }
}
