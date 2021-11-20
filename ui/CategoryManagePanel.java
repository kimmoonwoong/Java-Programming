package ui;

import javax.swing.*;
import java.awt.*;


public class CategoryManagePanel extends BasicPanel {
	
	// 맨 위에 입력 이미지 넣어야 하는데 어떻게 하나..?
	private ImageIcon catema = new ImageIcon("images/catema.png"); // 이미지 로딩
	private JLabel catemaimg=new JLabel("",catema,SwingConstants.CENTER); // 레이블 생성
	
	//private ButtonGroup adc = new ButtonGroup(); // 라디오 버튼 그룹 객체 생성
	private JRadioButton add = new JRadioButton(" 추가      ", true); // 라디오 버튼
	private JRadioButton delete = new JRadioButton(" 삭제      ");
	private JRadioButton change = new JRadioButton(" 변경      ");
	
	
	// ==========================================================================
	
	
	private JTextField delecataname = new JTextField(12);
	private JLabel delecn = new JLabel("  삭제할 카테고리 이름  "); // 라벨
	
	private JTextField changecatename = new JTextField(12);
	private JLabel changecn = new JLabel("  변경할 카테고리 이름  "); // 라벨
	
	
	// ==========================================================================
	
	
	private String[] delCateArr = {"식비                            ", "도서     ", "교통비    "};
	private JComboBox<String> delCate = new JComboBox<String>(delCateArr); // 수치 저장할 콤보박스
	private JLabel delcate = new JLabel(" 삭제할 카테고리 선택   "); // 라벨
	
	
	private String[] chaCateArr = {"식비                            ", "도서     ", "교통비    "};
	private JComboBox<String> chaCate = new JComboBox<String>(chaCateArr); // 수치 저장할 콤보박스
	private JLabel chacate = new JLabel(" 변경할 카테고리 선택   "); // 라벨
	
	
	// ==========================================================================
		
	public CategoryManagePanel(JFrame frame) { // 생성자
		buttonclick = new ButtonClick(frame);
		InitObject();
		CenterPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 30)); // 왼쪽정렬, 수직거리 30
		CenterPanel.add(add); // 순서대로 저장
		CenterPanel.add(delete);
		CenterPanel.add(change);
		CenterPanel.add(delecn);
		CenterPanel.add(delecataname);
		CenterPanel.add(delcate);
		CenterPanel.add(delCate);
		CenterPanel.add(changecn);
		CenterPanel.add(changecatename);
		CenterPanel.add(chacate);
		CenterPanel.add(chaCate);
	}
	
	
	
	private void InitObject() { // 초기화 작업 및 초기세팅
		
		add.setBackground(Color.WHITE);
		add.setForeground(Color.BLACK);
		add.setFont(new Font("함초롱바탕", Font.BOLD, 18)); 
		
		
		delete.setBackground(Color.WHITE);
		delete.setForeground(Color.BLACK);
		delete.setFont(new Font("함초롱바탕", Font.BOLD, 18));
		
		
		change.setBackground(Color.WHITE);
		change.setForeground(Color.BLACK);
		change.setFont(new Font("함초롱바탕", Font.BOLD, 18)); 
		
		// ========================================================================
		
		delecataname.setBackground(Color.WHITE);
		delecataname.setForeground(Color.BLACK);
		delecataname.setFont(new Font("함초롱바탕", Font.BOLD, 18)); 
		
		
		changecatename.setBackground(Color.WHITE);
		changecatename.setForeground(Color.BLACK);
		changecatename.setFont(new Font("함초롱바탕", Font.BOLD, 18));
		
		// ========================================================================
		
		
		delCate.setBackground(Color.WHITE);
		delCate.setForeground(Color.BLACK);
		delCate.setFont(new Font("함초롱바탕", Font.BOLD, 18)); 
		
		
		chaCate.setBackground(Color.WHITE);
		chaCate.setForeground(Color.BLACK);
		chaCate.setFont(new Font("함초롱바탕", Font.BOLD, 18)); 
		
		// ========================================================================
		
		
		delecn.setFont(new Font("함초롱바탕", Font.BOLD, 18)); 
		changecn.setFont(new Font("함초롱바탕", Font.BOLD, 18)); 
		delcate.setFont(new Font("함초롱바탕", Font.BOLD, 18)); 
		chacate.setFont(new Font("함초롱바탕", Font.BOLD, 18)); 
		
		
		
	}
	
	
	
	
	
	
}