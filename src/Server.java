import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        System.out.println("Сервер запущен и готов к работе...");
        try (ServerSocket server = new ServerSocket(34522)) {
            while (true) {
                try (
                        Socket socket = server.accept();
                        DataInputStream input = new DataInputStream(socket.getInputStream());
                        DataOutputStream output = new DataOutputStream(socket.getOutputStream())
                ) {
                    String msg = input.readUTF();
                    output.writeUTF("Hello, "+msg+"!");
                    System.out.println("К нам пришел "+msg+" ("+socket.getLocalPort()+""+socket.getLocalAddress()+")");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
