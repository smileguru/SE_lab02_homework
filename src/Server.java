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
                    String name = msg;
                    output.writeUTF("Hello, "+msg+"!");
                    System.out.println("К нам пришел "+msg+" ("+socket.getLocalPort()+""+socket.getLocalAddress()+")");

                    int i = 1;
                    while (!msg.equals("bye")){
                        msg = input.readUTF();
                        if (msg.equals("bye")==true){
                            System.out.println("Пока,"+name);
                        }else {
                            output.writeUTF("Ответ сервера:" + i + " - " + msg);
                            System.out.println("Получено сообщение No" + i + " - " + msg);
                            i++;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
