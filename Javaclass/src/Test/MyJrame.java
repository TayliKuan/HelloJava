/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author 小官
 */
public class MyJrame {
    JFrame j=new JFrame();
    JButton jb = new JButton("JAVA");
    
    public MyJrame(){

    j.setSize(300,300);
    j.setVisible(true);
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //j.add(new JButton("Hello"));//add.java.awt.Component 下面可以直接NEW
    j.setLayout(new FlowLayout());//沒有就滿版
    j.add(new JLabel("test"));
    j.add(jb).setSize(50,20);
    j.add(new JButton("World")).setSize(10,10);
    j.add(new JTextField()).setSize(50, 50);//打字的地方
    j.add(new JComboBox(new String[]{"1","2"}));//下拉選單
    j.add(new JList());
    j.add(new JCheckBox("222"));
    j.add(new JTextArea("YAYAYA", 20, 20));
    
}
}
