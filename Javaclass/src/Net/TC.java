package Net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


import javax.swing.JOptionPane;

public class TC {

    public static void main(String[] args) {
        try (Socket s = new Socket("localhost", 80);
                
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(s.getInputStream()));
                PrintWriter pw = new PrintWriter(s.getOutputStream());) {

            while (true) {
                int randomNum = new java.util.Random().nextInt(100);
                String userName = JOptionPane.showInputDialog(null,"show your name",randomNum);
                if (userName.equalsIgnoreCase("exit")) {
                    pw.println(userName);
                    pw.flush();
                    break;
                } else {

                    System.out.println("request >" +userName);
                    pw.println(userName);
                    pw.flush();
                }

                String data = in.readLine(); 
                System.out.println("response > " + data);
            }

        } catch (IOException ex) {
            Logger.getLogger(MyClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
