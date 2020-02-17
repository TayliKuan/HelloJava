/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package High.Exception;

import java.io.File;
import java.io.IOException;

/**如何建檔
 *
 * @author 小官
 */
public class ExTest0201_5 {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\JAVA CLASS/xyz");//兩條反斜線 路徑
        System.out.println(f.exists());//下面找不到XYZ這檔案 會幫我新增一個檔案
        //if(!f.exists())
        //try {
            //f.createNewFile();//產生檔案
            f.mkdir();   //產生檔案夾 不可以同名同時
       // } catch (IOException ex) {//沒錯不會出現
            //ex.printStackTrace();
                //System.out.println("sorry,");
        //}
    }

    public static void test() throws IOException{
        try {
            System.in.read();
        } catch (IOException ex) {
            System.out.println("test IOException");
           throw ex;
        }
    }
}
