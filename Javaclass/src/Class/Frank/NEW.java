package Class.Frank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



public class NEW{

    public static void main(String args[]) {
       
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
                } catch (Exception e) {
                    e.printStackTrace();
                }

}
}