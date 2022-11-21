package com.sist.lang;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class 라이브러리_3 extends JFrame implements ItemListener {

	JComboBox box=new JComboBox();
	JLabel la=new JLabel();
	public 라이브러리_3() {
		//객체 생성 / 배치
		box.addItem("m1.jpg");
		box.addItem("m2.jfif");
		box.addItem("m3.jfif");
		box.addItem("m4.jfif");
		box.addItem("m5.jfif");
		box.addItem("m6.jfif");
		box.addItem("m7.jfif");
		
		add("North", box);
		add("Center", la);
		setSize(350, 450);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 라이브러리_3();
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==box) {
			String image=box.getSelectedItem().toString();
			la.setIcon(new ImageIcon("c:\\javaDev\\"+image));
		}
	}

}
