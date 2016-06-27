import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by jonsnow on 15/06/16.
 */
public class Filereader {
    public static void main(String args) {


        try {
            File file = new File("hello.txt");
            FileReader r = new FileReader(file);
            int i = r.read();
            while (i != -1) {
                System.out.println("DATA: " + (char) i);
                i = r.read();
            }


        } catch (IOException e) {
            System.out.println("File kan niet gelezen worden");
        }
    }
//
//
//    public static void main(String[] args) {
//        Filereader r=null;
//
//        try {
//            File file = new File("hello.txt");
//            r = new Filereader(file);
//            int i = r.read();
//            while (i != -1) {
//                System.out.println("DATA: " + (char) i);
//                i = r.read();
//            }
//
//
//        } catch (IOException e) {
//            System.out.println("File kan niet gelezen worden");
//        } finally {
//            if (r != null) {
//                try {
//
//                    r.close();
//                } catch (IOException e) {
//                    System.out.println("Kan niet afsluiten");
//
//
//                }
//            }
//        }
//    }
//
//
//
}
