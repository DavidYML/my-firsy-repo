import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by jonsnow on 20/06/16.
 */
public class ConnnectChat {
    public static void main(String[] args) {
        try (Socket socket = new Socket("172.30.68.25", 1507);
             InputStream inputStream = socket.getInputStream();
             OutputStream outputStream = socket.getOutputStream()) {
            PrintStream sender = new PrintStream(outputStream);
            BufferedReader receiver = new BufferedReader(new InputStreamReader(inputStream));

            sender.println("David Y");

            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();


            while(!sender.equals("exit")) {
                                sender.println(s);
                String answer = receiver.readLine();
                System.out.println("Received answer:" + answer);
                s = sc.nextLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

