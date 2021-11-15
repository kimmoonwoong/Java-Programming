import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MainFrame extends BasicFrame { // GUI틀 Frame
	enum Button{
		expenseIncomeInputButton, categoryManageButton, inquiryButton,
		manageButton, alarmButton
	}
	private JButton[] MainButton = new JButton[5]; // 버튼
	private JLabel tip = new JLabel("오늘의 팁: "); // 오늘의 팁 레이블
	private JLabel antProgram = new JLabel("개미의 알뜰살뜰!"); // 프로그램 이름 레이블
	
	public MainFrame() {
		MainButton[Button.expenseIncomeInputButton.ordinal()] = new JButton("입                     력"); // 0
		MainButton[Button.categoryManageButton.ordinal()] = new JButton("조                     회"); // 1
		MainButton[Button.inquiryButton.ordinal()] = new JButton("지출   한도   설정"); // 2 
		MainButton[Button.manageButton.ordinal()] = new JButton("카테고리      관리"); // 3
		MainButton[Button.alarmButton.ordinal()] = new JButton("알                     림"); // 4
		
		GUISetting(); // 버튼 위치 조정
		InitSetting(); // BasicFrame의 InitSetting이용
	}
	
	/* BasicFrame의 기본적인 틀 이용할거임
	 * 기본적인 테두리, 넣어줘야 할 패널은 BasicPanel에서 준비되어 있음.
	 * 버튼들은 CenterPanel에 넣어줘야 하므로 CenterPanel의 배치관리자 GridLayout으로 설정하고 여기에 버튼을 넣어줌
	 * 
	 * */
	private void GUISetting() {
		tip.setFont(new Font("함초롱바탕", Font.BOLD, 25)); // 팁 설정
		SouthPanel.add(tip);
		antProgram.setFont(new Font("함초롱바탕", Font.BOLD, 30)); // 프로그램 이름 설정
		NorthPanel.add(antProgram); 
		CenterPanel.setLayout(new GridLayout(5,1,1,25)); // 이게 작성되는 부분의 GridLayout(5행 1열 vGap = 25)
		
		for(int i=0; i<5; i++) { // CenterPanel에 설정한 버튼들 추가
			MainButton[i].setBackground(Color.BLACK);
			MainButton[i].setForeground(Color.WHITE);
			MainButton[i].setFont(new Font("함초롱바탕", Font.BOLD, 15));
			CenterPanel.add(MainButton[i]); // 여기에 버튼들 GridLayout으로 추가
		}
	}
}
