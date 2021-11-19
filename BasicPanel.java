import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/*
 * 사용 방법. BasicFrame 상속, 생성자 맨 위에 InitSetting()함수 호출
 *  - 가운데 부분에 버튼같은거 넣는 방법
 *  1. BorderPanel 배치관리자 설정해줘야함 null이나 gridLayout이나 ex) BorderPanel.setLayout(null);
 *  2. BorderPanel에 add해줘야함 ex) BorderPanel.add(new JButton("메롱"));
 *  끝!
 */
public class BasicPanel extends JPanel{
	private JPanel BorderPanel = new JPanel(); // 가운데 부분의 패널
	private JPanel[] BlackBorder = new JPanel[4]; // 가장자리 검은색 테두리
	protected JPanel CenterPanel = new JPanel();
	protected JPanel NorthPanel = new JPanel();
	protected JPanel SouthPanel = new JPanel();
	protected JPanel WestPanel = new JPanel();
	protected JPanel EastPanel = new JPanel();
	
	protected ButtonClick buttonclick;

	public BasicPanel() {
		InitSetting();
	}
	
	protected void InitSetting() {									

		setBackground(Color.WHITE);			// 배경
		setLayout(new BorderLayout());		// 배치관리자 설정
		
		BorderPanel.setBackground(Color.WHITE);			// 패널 배경색 설정
		for(int i=0; i<4; i++) {
			BlackBorder[i] = new JPanel();
			BlackBorder[i].setBackground(Color.BLACK);
		}
		
		add(BorderPanel, BorderLayout.CENTER); // BorderLayout으로 넣어줌 이 inputPanel에 넣어줘야 할거임
		add(BlackBorder[0], BorderLayout.NORTH);
		add(BlackBorder[1], BorderLayout.SOUTH);
		add(BlackBorder[2], BorderLayout.WEST);
		add(BlackBorder[3], BorderLayout.EAST);
		
		BorderPanel.setLayout(new BorderLayout());
		BorderPanel.add(CenterPanel, BorderLayout.CENTER);
		BorderPanel.add(NorthPanel, BorderLayout.NORTH);
		BorderPanel.add(SouthPanel, BorderLayout.SOUTH);
		BorderPanel.add(WestPanel, BorderLayout.WEST);
		BorderPanel.add(EastPanel, BorderLayout.EAST);
		
	}
}
