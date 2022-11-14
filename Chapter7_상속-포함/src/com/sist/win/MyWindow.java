package com.sist.win;
import javax.swing.*;
// 상속 => 기존의 클래스에서 중복적으로 사용되는 부분 사용, 변경해서 사용
// 기존의 클래스를 있는 그대로 사용하는 방법도 있다. => 포함 클래스
public class MyWindow extends JFrame {
	public MyWindow() {
		setSize(640, 480);
		setVisible(true); // 생성자가  제일 먼저 호출되기 때문에 제일 먼저 필요한 건 생성자에 작성
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyWindow();
	}

}
