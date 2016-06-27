import java.io.File;
import java.util.Arrays;

/**
 * Created by jonsnow on 15/06/16.
 */
public class FileCheck {
    public static void main(String[] args) {


        File file = new File("/users/jonsnow/Desktop/Eru");
        boolean b = file.exists();
        System.out.println(b);

        File f= file.getAbsoluteFile();
        System.out.println(f);

//        SearchResult s= f.compareTo();
        f.listFiles();
        System.out.println(Arrays.toString(f.listFiles()));





//
// DirectoryManager jpeg =f.equals(jpeg);
//        SearchResult d= file.compareTo(jpeg);


//        c = file.compareTo(c.file);
//        ArrayList o= (ArrayList) jpeg
//        FileOutputStream o= file.compareTo(o.jpeg);

    }
}

