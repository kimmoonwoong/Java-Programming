import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ClickButton implements MouseListener{
	public void mousePressed(MouseEvent e) {
		
	}
	public void mouseReleased(MouseEvent e) {
		
	}
	public void mouseClicked(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		if(btn.getText().equals("입력하기")) {
			new InputFrame();
		}
	}
	public void mouseEntered(MouseEvent e) {
	
	}
	public void mouseExited(MouseEvent e) {
	
	}
}
