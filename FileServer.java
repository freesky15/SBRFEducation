import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class FileServer {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private Integer serverPort;
    private InetAddress serverAddress;
    public ArrayList<UtilsClass> socketList = new ArrayList<UtilsClass>();

    public FileServer(String serverAddress, Integer serverPort){
        try {
            this.serverAddress = InetAddress.getByName(serverAddress);
            this.serverPort = serverPort;
            this.serverSocket = new ServerSocket(this.serverPort, 200, this.serverAddress);
            while(true){
                Socket tempSocket = null;
                try {
                     tempSocket = this.serverSocket.accept();
                    socketList.add(new UtilsClass(tempSocket));
                } catch (IOException e) {
                    tempSocket.close();
                }

            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileServer fileServer = new FileServer("localhost", 10000);
    }
}