import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("localhost", 6789);
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter message to send: ");
        String sentence = sc.nextLine();
        outToServer.writeBytes(sentence + "\n");

        clientSocket.close();
    }
}
