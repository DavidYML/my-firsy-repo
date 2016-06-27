import java.io.*;

/**
 * Created by jonsnow on 15/06/16.
 */
public class WriteMyFile {
    public static void main(String[] args) {
        writeMyFile();

    }
    private static void writeMyFile(){

        File file= new File("world.txt");

        try (PrintWriter w=new PrintWriter(new BufferedWriter(new FileWriter(file))))
        {

            w.println("Dit is de inhoud van de file");
            w.print("Leeftijd: ");
            w.print(32);

        } catch(IOException e) {

            System.out.println("Foutje");

             }
}
}

