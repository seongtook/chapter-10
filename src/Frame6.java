import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Frame6 extends JFrame
{		JPanel P;
        JLabel La;
        Frame6()
        {
         this.setTitle("���콺 �ø���"); //title ��
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         P = new JPanel();
         P.setLayout(null); //����Ʈ���� ��ġ�����ڸ� null������
         La = new JLabel("C"); //Ű �Է¿� ���� �����̴� ���̺� ������Ʈ
         La.setSize(20, 20);
         La.setLocation(100, 100); //La�� �ʱ� ��ġ�� (100,100)�� ��ġ��Ŵ
         Mouse Mo = new Mouse();
         La.addMouseListener(Mo);
         P.add(La);
         this.add(P);
         this.setVisible(true);
         this.setSize(350, 350);}
        class Mouse implements MouseListener
        {
        	public void mouseClicked(MouseEvent e)
                {
        		JLabel La = (JLabel)e.getSource();
        		int X = (int)(Math.random()*300);
        		int Y = (int)(Math.random()*300);
        		La.setLocation(X, Y);
                } //���콺�� 'c'�� Ŭ���ϸ� ������ ��ǥ�� 'c'���

                public void mouseEntered(MouseEvent e)
                {}
                public void mouseExited(MouseEvent e)
            	{}

                public void mousePressed(MouseEvent e)
                {}
                public void mouseReleased(MouseEvent e)
                {}  }
        public static void main(String[] args)
        { new Frame6(); }
}
