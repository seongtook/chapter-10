import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventFrame extends JFrame {
	public MouseEventFrame() {
		super("���콺 �ø��� ������ ����");//�̺�Ʈ�̸��̰� ����Ŭ���� ���
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		c.add(label); // �ʱ�ȭ�� love java
		
		label.addMouseListener(new MouseAdapter() {
			@Override  //"love java"���� ���콺�� �����ٴ�� 
			public void mouseEntered(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("Love Java");
 			}          //����ط� �ٲ�� ���� �ٽ� ������� �ٲ��.
			@Override  
			public void mouseExited(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("�����");
			}			
		});
		setSize(250,150);
		setVisible(true);}
	static public void main(String [] args) {
		new MouseEventFrame();
	}    //���콺 �̺�Ʈ ������ ���� 
}