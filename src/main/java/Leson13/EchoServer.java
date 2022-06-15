package Leson13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class EchoServer {
    private DataInputStream in;
    private DataOutputStream out;
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        try (ServerSocket serverSocket = new ServerSocket(2276)) {
            System.out.println("Ждем подключения клиента - ");
            Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился !");
            final DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            final DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            while (true){
                 String message = inputStream.readUTF();
                 outputStream.writeUTF(scanner.nextLine());

                if ("/stop".equalsIgnoreCase(message)){
                    outputStream.writeUTF("/stop");
                    break;
                }
                System.out.println("Сообщение от клиента - " + message);
            }
        }
         catch (IOException e){
                e.printStackTrace();
            }
        }



}
