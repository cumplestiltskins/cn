import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6789);
        System.out.println("TCP Server is running...");

        Socket connectionSocket = serverSocket.accept();
        BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));

        String clientSentence = inFromClient.readLine();
        System.out.println("Received: " + clientSentence);

        serverSocket.close();
    }
}
