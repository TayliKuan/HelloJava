package Net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TS {

    public static void main(String[] args) {

        try (//有實作closeable的就可以關掉
                ServerSocket ss = new ServerSocket(80);
                Socket s = ss.accept();//等待
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(s.getInputStream()));
                PrintWriter pw = new PrintWriter(s.getOutputStream());) {
            System.out.println("Server listening at port 80...");
            
            System.out.println(" 80 incoming...");

            while (true) {//要做就要給迴圈
                String data = in.readLine(); 

                if (data.equalsIgnoreCase("exit"))
                {
                    break;
                }
System.out.println("request >" + data);
                System.out.println(" response > " + new StringBuffer(data).reverse().toString());//5
                pw.println(new StringBuffer(data).reverse().toString());//6

                pw.flush();
            }

        } catch (IOException ex) {
            Logger.getLogger(MyServer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
