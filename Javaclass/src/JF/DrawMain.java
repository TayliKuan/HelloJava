/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JF;

/**
 *
 * @author 小官
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawMain extends JPanel{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DrawMain Draw=new DrawMain();
        Draw.InitUI();
	}
	
    public void InitUI(){
    	JFrame jf=new JFrame();
    	jf.setSize(1000,780);
    	jf.setTitle("簡單畫板");
    	jf.setDefaultCloseOperation(3);
    	jf.setLocationRelativeTo(null);
    	jf.setLayout(new BorderLayout());
    	
    	//例項化事件監聽類
    	DrawListener dl=new DrawListener(this);
    	
        //實現中間面板
    	this.setBackground(Color.WHITE);
    	jf.add(this,BorderLayout.CENTER);
    	
    	//實現性狀面板
    	JPanel ShapePanel=new JPanel();
    	ShapePanel.setBackground(Color.black);
    	ShapePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
    	ShapePanel.setBackground(Color.gray);;
    	String [] Shape={"直線","曲線","圓","噴槍","橡皮擦","矩形","橢圓","圓角矩形","弧線","多邊形","圖形","三角形","立體圓",};
    	for(int i=0;i<Shape.length;i++){
    		JButton button=new JButton(Shape[i]);
    		button.setBackground(Color.WHITE);
    		button.addActionListener(dl);    //新增事件監聽機制
    		ShapePanel.add(button);
    	}
    	jf.add(ShapePanel,BorderLayout.NORTH);
    	
    	//實現顏色面板
    	JPanel ColorPanel=new JPanel();
    	ColorPanel.setBackground(Color.black);
    	ColorPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
    	ColorPanel.setBackground(Color.gray);;
    	Color [] color={Color.BLACK,Color.blue,Color.white,Color.gray,Color.red,Color.CYAN,Color.green,Color.darkGray,Color.pink};
    	for(int i=0;i<color.length;i++){
    		JButton button=new JButton();
    		button.addActionListener(dl);   //新增事件監聽機制
    		button.setPreferredSize(new Dimension(30,30));
    		button.setBackground(color[i]);
    		ColorPanel.add(button);
    	}
    	jf.add(ColorPanel,BorderLayout.SOUTH);
    	
    	
    	jf.setVisible(true);
    	this.addMouseListener(dl);
		this.addMouseMotionListener(dl);
    }
}
