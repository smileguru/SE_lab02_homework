import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        System.out.println("������ ������� � ����� � ������...");
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
                    System.out.println("� ��� ������ "+msg+" ("+socket.getLocalPort()+""+socket.getLocalAddress()+")");

                    int i = 1;
                    while (!msg.equals("bye")){
                        msg = input.readUTF();
                        if (msg.equals("bye")==true){
                            System.out.println("����,"+name);
                        }else {
                            output.writeUTF("����� �������:" + i + " - " + msg);
                            System.out.println("�������� ��������� No" + i + " - " + msg);
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
