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
public class BasicFrame extends JFrame{
	private Container contentPane = getContentPane(); // 컨텐트팬
	
	protected JPanel BorderPanel = new JPanel(); // 가운데 부분의 패널
	private JPanel[] BlackBorder = new JPanel[4]; // 가장자리 검은색 테두리

	public BasicFrame() {
		setTitle("개미의 알뜰살뜰");
		setSize(400, 700);
	}
	
	protected void InitSetting() {									
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료

		contentPane.setBackground(Color.WHITE);			// 배경
		contentPane.setLayout(new BorderLayout());		// 배치관리자 설정
		
		BorderPanel.setBackground(Color.WHITE);			// 패널 배경색 설정
		for(int i=0; i<4; i++) {
			BlackBorder[i] = new JPanel();
			BlackBorder[i].setBackground(Color.BLACK);
		}
		
		contentPane.add(BorderPanel, BorderLayout.CENTER); // BorderLayout으로 넣어줌 이 inputPanel에 넣어줘야 할거임
		contentPane.add(BlackBorder[0], BorderLayout.NORTH);
		contentPane.add(BlackBorder[1], BorderLayout.SOUTH);
		contentPane.add(BlackBorder[2], BorderLayout.WEST);
		contentPane.add(BlackBorder[3], BorderLayout.EAST);
		
		setVisible(true);
	}
}
