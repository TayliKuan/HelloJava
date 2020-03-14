/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day0314;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



public class Try{

    public static void main(String args[]) {
        String Final = null;
        try  {
                    URL url = new URL("https://www.mobile01.com/");;//http決定了你是誰 再轉回來
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    StringBuilder sb = new StringBuilder();
                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                            con.getInputStream()));) {
                        String nextLine = "";
                        while ((nextLine = reader.readLine()) != null) {
                            sb.append(nextLine + "\n");
                        }
                        
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println(sb.toString());
                    Final = sb.toString();
                } catch (Exception e) {
                    e.printStackTrace();
                }
        int a = Final.indexOf("<title>");
       int b = Final.indexOf("</title>");
        System.out.println(Final.substring(a+7, b));
}
}