import java.io.*;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.lang.Thread.sleep;

public class FileClient {
    private InputStream from;
    private  OutputStream to;
    private Socket clientSocket;


    private FileClient(String serverAddress, Integer port){
        try {
            try {
                this.clientSocket = new Socket(serverAddress, port);
                this.from = clientSocket.getInputStream();
                this.to = clientSocket.getOutputStream();

                //while (true){
                    //try {

                //        to.write(new byte[]{1,2,3,4,5,6,7,8,9,0});
                //        to.flush();
                //        break;
                        //Thread.sleep(1000);
                    //} catch (InterruptedException e) {
                      //  e.printStackTrace();
                    //}
                //}


            } catch (Exception e){
                this.clientSocket.close();
                this.from.close();
                this.to.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public void transferFile(String fileName){
        boolean result;
        try {
            result = wrToFile(this.to, new FileInputStream(new File(fileName)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean wrToFile(OutputStream to, InputStream from){
        try{

            int count = 0;
            if (from.available() > 0) {
                try (DataOutputStream outputStream = new DataOutputStream(to);DataInputStream inputStream = new DataInputStream(from)) {
                    byte[] buffer = new byte[4096];
                    //(count = inputStream.read(buffer)) != -1
                    while ((count = inputStream.read(buffer)) > 0) {
                        outputStream.write (buffer, 0, count);
                        outputStream.flush();
                    }
                }
            } else
                return false;

        } catch (IOException e){
            e.printStackTrace();
            return false;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        FileClient fileClient = new FileClient("127.0.0.1", 10000);
        fileClient.transferFile(".\\src\\File.JPG");
    }
}
