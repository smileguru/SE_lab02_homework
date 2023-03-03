import java.io.*;
import java.net.*;

public class Server {
    private static final int PORT = 34522;

    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(PORT)) {
            while (true) {
                try (
                        Socket socket = server.accept(); // accept a new client
                        DataInputStream input = new DataInputStream(socket.getInputStream());
                        DataOutputStream output = new DataOutputStream(socket.getOutputStream())
                ) {
                    System.out.println("Сервер запущен...");
                    double [] mas = new double[2];
                    for (int i = 0; i<2;i++) {
                        mas [i] = Double.parseDouble(input.readUTF());
                    }
                    Double fc = 3*Math.pow(Math.cos(mas[0]-Math.PI/6),2);
                    Double fs = 0.5+Math.sin(Math.pow(mas[1],2));
                    output.writeUTF(String.valueOf(fc/fs));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}