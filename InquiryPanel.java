import java.awt.*;
import javax.swing.*;



public class InquiryPanel extends BasicPanel {
		// 맨 위에 입력 이미지 넣어야 하는데 어떻게 하나..?
		private ImageIcon inquiry = new ImageIcon("images/inquiry.png"); // 이미지 로딩
		private JLabel inquiryimg=new JLabel("",inquiry,SwingConstants.CENTER); // 레이블 생성
		
		
		
		private String[] NumberArr = {"(선택 안함)          ", "다음달 예상 수입/지출 금액 조회", "이번달 예상 수입/지출 금액 조회 "};
		private String[] ChartArr = {"(선택 안함)          ", "다음달 예상 수입/지출 금액 조회", "이번달 예상 수입/지출 금액 조회 "};
		
		private JComboBox<String> Number = new JComboBox<String>(NumberArr); // 수치 저장할 콤보박스
		private JComboBox<String> Chart = new JComboBox<String>(ChartArr); // 차트 저장할 콤보박스
		
		private JLabel chNum = new JLabel("  수치  "); // 라벨
		private JLabel chChart = new JLabel("\n  차트  ");
		
		// ========================================================================================
		
		private JCheckBox income=new JCheckBox(" 수입                    ",true); // 선택 상태의 체크박스 생성
		private JCheckBox expenses=new JCheckBox(" 지출 ");
		
		
		public InquiryPanel(JFrame frame) { // 생성자
			buttonclick = new ButtonClick(frame);
			InitObject();
			CenterPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 30)); // 왼쪽정렬, 수직거리 30
			CenterPanel.add(chNum); // 순서대로 저장
			CenterPanel.add(Number);
			CenterPanel.add(chChart);
			CenterPanel.add(Chart);
			CenterPanel.add(income);
			CenterPanel.add(expenses);
		}
		
		
		
		private void InitObject() { // 초기화 작업 및 초기세팅
			
			Number = new JComboBox<String>(NumberArr);
			Number.setBackground(Color.WHITE);
			Number.setForeground(Color.BLACK);
			Number.setFont(new Font("함초롱바탕", Font.BOLD, 18)); 
			
			
			Chart = new JComboBox<String>(ChartArr);
			Chart.setBackground(Color.WHITE);
			Chart.setForeground(Color.BLACK);
			Chart.setFont(new Font("함초롱바탕", Font.BOLD, 18));
			
			// ========================================================================
			
			
			income.setBackground(Color.WHITE);
			income.setForeground(Color.BLACK);
			income.setFont(new Font("함초롱바탕", Font.BOLD, 18)); 
			
			expenses.setBackground(Color.WHITE);
			expenses.setForeground(Color.BLACK);
			expenses.setFont(new Font("함초롱바탕", Font.BOLD, 18)); 
			
			// ========================================================================
			
			chNum.setFont(new Font("함초롱바탕", Font.BOLD, 18)); 
			chChart.setFont(new Font("함초롱바탕", Font.BOLD, 18)); 
			
		}
		

}
