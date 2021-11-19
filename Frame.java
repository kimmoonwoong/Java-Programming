import java.awt.*;
import javax.swing.*;

public class Frame{
	private JFrame frame = new JFrame("°³¹ÌÀÇ ¾Ë¶ã»ì¶ã");
	
	public Frame() {
		frame.setTitle("°³¹ÌÀÇ ¾Ë¶ã»ì¶ã");
		frame.setSize(400, 700);
		frame.setContentPane(new MainPanel(frame));
		frame.setVisible(true);
	}
}
