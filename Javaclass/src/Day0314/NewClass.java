/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day0314;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author 小官
 */
public class NewClass {
    public static void main(String[] args) throws FileNotFoundException {
        
File dir = new File("D:\\Pictures");//對應資料夾
		if (!dir.exists()) {//不存在
			dir.mkdir();//建立資料夾
		}
    }
}
