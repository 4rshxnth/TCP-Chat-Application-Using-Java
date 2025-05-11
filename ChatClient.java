import java.io.*;
import java.net.*;

public class ChatClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        System.out.println("Connected to chat server. Type messages:");

        // Thread to read messages from server
        new Thread(() -> {
            String serverMsg;
            try {
                while ((serverMsg = in.readLine()) != null) {
                    System.out.println("Server: " + serverMsg);
                }
            } catch (IOException e) {
                System.out.println("Connection closed.");
            }
        }).start();

        // Sending messages to server
        String msg;
        while ((msg = input.readLine()) != null) {
            out.println(msg);
        }

        socket.close();
    }
}
