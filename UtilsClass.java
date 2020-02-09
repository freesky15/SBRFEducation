import java.io.*;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

public class UtilsClass extends Thread{
    private Socket socket;
    private InputStream from;
    private  OutputStream to;

    public UtilsClass(Socket socket){
        this.socket = socket;
        try {
            this.from = this.socket.getInputStream();
            this.to = this.socket.getOutputStream();
            System.out.println("Cleint was connected!");
            start();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public UtilsClass(){

    }

    public boolean wrToFile(InputStream from, String to){
        try{
            DataInputStream inputStream = new DataInputStream(from);
            int count = 0;
            if (inputStream.available() > 0) {
                try (OutputStream outputStream = new FileOutputStream(to)) {
                    byte[] buffer = new byte[1024];

                    while ((count = inputStream.read(buffer)) > 0){
                        outputStream.write(buffer, 0, count);
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

    public String generateFileName(){
        return String.valueOf(new Date().getTime());
    }

    @Override
    public void run() {
        boolean result;
        while(true){
            result = this.wrToFile(this.from, this.generateFileName());
        }
    }

}
