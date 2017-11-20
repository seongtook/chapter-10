import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventFrame extends JFrame {
	public MouseEventFrame() {
		super("마우스 올리기 내리기 연습");//이벤트이름이고 슈퍼클래스 사용
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		c.add(label); // 초기화면 love java
		
		label.addMouseListener(new MouseAdapter() {
			@Override  //"love java"위에 마우스를 가져다대면 
			public void mouseEntered(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("Love Java");
 			}          //사랑해로 바뀌고 떼면 다시 원래대로 바뀐다.
			@Override  
			public void mouseExited(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("사랑해");
			}			
		});
		setSize(250,150);
		setVisible(true);}
	static public void main(String [] args) {
		new MouseEventFrame();
	}    //마우스 이벤트 프래임 실행 
}