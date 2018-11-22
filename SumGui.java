import javax.swing.*;
import java.awt.*;
public class SumGui {
		private JTextField txtFirst, txtSecond;
		private JLabel lblFirst, lblSecond;
		private JButton btnSum, btnSub,btnMul, btnDivide,btnExit;
		private JFrame myFrame;
		public static void main (String[] args) {
				new SumGui();
		}
		public SumGui(){
				myFrame = new JFrame("Sum");
				myFrame.setSize(500,500);
				myFrame.setLayout(null);

				lblFirst = new JLabel("Enter First Number");
				lblFirst.setBounds(20,30,200,30);
				myFrame.add(lblFirst);

				lblSecond = new JLabel("Enter second number");
				lblSecond.setBounds(20,90,200,30);
				myFrame.add(lblSecond);

				txtFirst = new JTextField();
				txtFirst.setBounds(260,30,200,20);
				myFrame.add(txtFirst);

				myFrame.setVisible(true);
				myFrame.setLocationRelativeTo(null);
		}
}
