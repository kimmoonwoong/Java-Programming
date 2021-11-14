import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MainFrame extends JFrame { // GUI틀 Frame
	enum Button{
		expenseIncomeInputButton, categoryManageButton, inquiryButton,
		manageButton, alarmButton
	}
	private JButton[] MainButton = new JButton[5]; // 버튼
	private Container contentPane = getContentPane(); 
	private JLabel tip = new JLabel("오늘의 팁: "); // 오늘의 팁 레이블
	private JLabel antProgram = new JLabel("개미의 알뜰살뜰!"); // 프로그램 이름 레이블
	
	public MainFrame() {
		this("개미의 알뜰살뜰");
	}
	public MainFrame(String title) {
		super(title);  
		MainButton[Button.expenseIncomeInputButton.ordinal()] = new JButton("입                     력"); // 0
		MainButton[Button.categoryManageButton.ordinal()] = new JButton("조                     회"); // 1
		MainButton[Button.inquiryButton.ordinal()] = new JButton("지출   한도   설정"); // 2 
		MainButton[Button.manageButton.ordinal()] = new JButton("카테고리      관리"); // 3
		MainButton[Button.alarmButton.ordinal()] = new JButton("알                     림"); // 4
		
		InitSetting(); // 초기 설정들
		ButtonSetting(); // 버튼 위치 조정
	}
	
	/* 자.. BorderLayout을 이용한 검은색 가장자리 배경으로 panel추가 >> 이것을 blackground
	 * 이 blackground를 또 BorderLayout으로 나누고 이 부분의 가운데 부분에 GridLayout으로 설정 >> 이것을 WriteGround
	 * writeGround의 가운데 부분에 GridLayout으로 설정하고, 버튼 순서대로 삽입.
	 * writeGround의 NORTH부분에 메인 타이틀 추가, SOUTH부분에 팁 추가
	 * */
	private void ButtonSetting() {
		JPanel[] blackground = new JPanel[5]; // 10개 생성
		JPanel[] WriteGround = new JPanel[5];
		
		for(int i=0; i<5; i++) WriteGround[i] = new JPanel(); 
		for(int i=0; i<5; i++) blackground[i] = new JPanel(); 
		
		for(int i=1; i<5; i++) blackground[i].setBackground(Color.BLACK); // 검은색으로 설정
		contentPane.add(blackground[0],BorderLayout.CENTER); // 이게 주요 panel
		contentPane.add(blackground[1],BorderLayout.NORTH);
		contentPane.add(blackground[2],BorderLayout.SOUTH);
		contentPane.add(blackground[3],BorderLayout.WEST);
		contentPane.add(blackground[4],BorderLayout.EAST);
		blackground[0].setBackground(Color.WHITE); // 주요 panel 하얀색으로(가운데부분 흰색임)
		
		for(int i=0; i<5; i++) WriteGround[i].setBackground(Color.WHITE); // 전부 흰색(가운데부분) blackground[0]에서 다시 BorderLayout, 여기의 중앙부분에 버튼 작성 
		blackground[0].setLayout(new BorderLayout(500,200)); 
		blackground[0].add(WriteGround[0], BorderLayout.CENTER); // 여기에 입력, 조회,,, 버튼들 넣어줄거임
		blackground[0].add(WriteGround[1], BorderLayout.NORTH);
		blackground[0].add(WriteGround[2], BorderLayout.SOUTH);
		blackground[0].add(WriteGround[3], BorderLayout.WEST);
		blackground[0].add(WriteGround[4], BorderLayout.EAST);
		
		tip.setFont(new Font("함초롱바탕", Font.BOLD, 25)); // 팁 설정
		WriteGround[2].add(tip);
		antProgram.setFont(new Font("함초롱바탕", Font.BOLD, 30)); // 프로그램 이름 설정
		WriteGround[1].add(antProgram); 
		WriteGround[0].setLayout(new GridLayout(5,1,1,25)); // 이게 작성되는 부분의 GridLayout(5행 1열 vGap = 25)
		
		for(int i=0; i<5; i++) { // panel[0]에 버튼들 추가
			MainButton[i].setBackground(Color.BLACK);
			MainButton[i].setForeground(Color.WHITE);
			MainButton[i].setFont(new Font("함초롱바탕", Font.BOLD, 15));
			WriteGround[0].add(MainButton[i]); // 여기에 버튼들 GridLayout으로 추가
		}
	}
	
	protected void InitSetting() {									
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료
		setExtendedState(JFrame.MAXIMIZED_BOTH);		// 전체화면으로 시작

		contentPane.setBackground(Color.WHITE);			// 배경
		contentPane.setLayout(new BorderLayout());		// 배치관리자 설정
		setVisible(true);
	}
}
