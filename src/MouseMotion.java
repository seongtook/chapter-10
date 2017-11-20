import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseMotion extends JFrame 
{
    JPanel jp = new JPanel();
     //j panel�� ����
    MouseMotion()
    {
        setTitle("�巡�뵿�� YELLOW");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(jp);
        jp.addMouseMotionListener(new motionListener());
        jp.setBackground(Color.green);//����� �ʷϻ�������.
        setSize(250,250);// ������ 250x250
        setVisible(true);}
    
    public class motionListener implements MouseMotionListener
    {                      //mouse motion ���ø���Ʈ 
        public void mouseDragged(MouseEvent e) 
        {         // �巡�׽� ��� �Է� 
            jp = (JPanel)e.getSource();
            jp.setBackground(Color.yellow);
        }
        public void mouseMoved(MouseEvent e) 
        {
            jp = (JPanel)e.getSource();
            jp.setBackground(Color.GREEN); }
    }
    public static void main(String[] args)
    {
        new MouseMotion();// ���콺��� ���� 
    } 
}
 
