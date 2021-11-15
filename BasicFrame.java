import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class BasicFrame extends JFrame{
	private Container contentPane = getContentPane(); // 컨텐트팬
	
	private JPanel BorderPanel = new JPanel(); // 가운데 부분의 패널
	private JPanel[] BlackBorder = new JPanel[4]; // 가장자리 검은색 테두리
	
	protected JPanel CenterPanel = new JPanel(); // 가운데 패널에 넣어주는 부분들
	protected JPanel NorthPanel = new JPanel();
	protected JPanel SouthPanel = new JPanel();
	protected JPanel WestPanel = new JPanel();
	protected JPanel EastPanel = new JPanel();
	
	
	public BasicFrame() {
		setTitle("개미의 알뜰살뜰");
	}
	
	protected void InitSetting() {									
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료
		setExtendedState(JFrame.MAXIMIZED_BOTH);		// 전체화면으로 시작

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
		
		CenterPanel.setBackground(Color.WHITE); SouthPanel.setBackground(Color.WHITE); // 색 설정
		NorthPanel.setBackground(Color.WHITE); WestPanel.setBackground(Color.WHITE);
		EastPanel.setBackground(Color.WHITE);
		
		BorderPanel.setLayout(new BorderLayout(500,200)); // BorderPanel의 배치 관리자 BorderLayout으로 설정
		BorderPanel.add(CenterPanel, BorderLayout.CENTER); // 각 위치에 맞게 패널 위치 지정
		BorderPanel.add(NorthPanel, BorderLayout.NORTH);
		BorderPanel.add(SouthPanel, BorderLayout.SOUTH);
		BorderPanel.add(WestPanel, BorderLayout.WEST);
		BorderPanel.add(EastPanel, BorderLayout.EAST);
		
		setVisible(true);
	}
}
