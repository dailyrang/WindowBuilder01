import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WinCalc extends JDialog {
	private final JPanel contentPanel = new JPanel();
	private JLabel lblDisp;
//	private String sNum1, sNum2;
	private String sNum1 = new String();
	private String sNum2 = new String();
	private String sOp = new String();
	private boolean bStart = true;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			WinCalc dialog = new WinCalc();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public WinCalc() {
		setTitle("계산기");
		setBounds(100, 100, 359, 337);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblDisp = new JLabel("");
			lblDisp.setOpaque(true);
			lblDisp.setBackground(Color.YELLOW);
			lblDisp.setHorizontalAlignment(SwingConstants.RIGHT);
			lblDisp.setFont(new Font("굴림", Font.BOLD, 25));
			lblDisp.setBounds(12, 10, 318, 74);
			contentPanel.add(lblDisp);
		}
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sNum1 = lblDisp.getText();
				lblDisp.setText("");
				sOp = "+";
			}
		});
		btnAdd.setBounds(12, 94, 70, 23);
		contentPanel.add(btnAdd);
		
		JButton btnSubs = new JButton("-");
		btnSubs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sNum1 = lblDisp.getText();
				lblDisp.setText("");
				sOp = "-";
			}
		});
		btnSubs.setBounds(96, 94, 70, 23);
		contentPanel.add(btnSubs);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sNum1 = lblDisp.getText();
				lblDisp.setText("");
				sOp = "*";
			}
		});
		btnMul.setBounds(178, 94, 70, 23);
		contentPanel.add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sNum1 = lblDisp.getText();
				lblDisp.setText("");
				sOp = "/";
			}
		});
		btnDiv.setBounds(260, 94, 70, 23);
		contentPanel.add(btnDiv);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bStart) {
					lblDisp.setText("");
					bStart = false;
			}
				lblDisp.setText(lblDisp.getText()+"7");
			}
		});
		btn7.setBounds(51, 142, 70, 23);
		contentPanel.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bStart) {
					lblDisp.setText("");
					bStart = false;
			}
				lblDisp.setText(lblDisp.getText()+"8");
			}
		});
		btn8.setBounds(135, 142, 70, 23);
		contentPanel.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bStart) {
					lblDisp.setText("");
					bStart = false;
			}
				lblDisp.setText(lblDisp.getText()+"9");
			}
		});
		btn9.setBounds(217, 142, 70, 23);
		contentPanel.add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bStart) {
					lblDisp.setText("");
					bStart = false;
			}
				lblDisp.setText(lblDisp.getText()+"4");
			}
		});
		btn4.setBounds(51, 182, 70, 23);
		contentPanel.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bStart) {
					lblDisp.setText("");
					bStart = false;
			}
				lblDisp.setText(lblDisp.getText()+"5");
			}
		});
		btn5.setBounds(135, 182, 70, 23);
		contentPanel.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bStart) {
					lblDisp.setText("");
					bStart = false;
			}
				lblDisp.setText(lblDisp.getText()+"6");
			}
		});
		btn6.setBounds(217, 182, 70, 23);
		contentPanel.add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bStart) {
					lblDisp.setText("");
					bStart = false;
			}
					lblDisp.setText(lblDisp.getText()+"1");
			}
		});
		btn1.setBounds(51, 220, 70, 23);
		contentPanel.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bStart) {
					lblDisp.setText("");
					bStart = false;
			}
				lblDisp.setText(lblDisp.getText()+"2");
			}
		});
		btn2.setBounds(135, 220, 70, 23);
		contentPanel.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bStart) {
					lblDisp.setText("");
					bStart = false;
			}
				lblDisp.setText(lblDisp.getText()+"3");
			}
		});
		btn3.setBounds(217, 220, 70, 23);
		contentPanel.add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bStart) {
					lblDisp.setText("");
					bStart = false;
			}
				if(!lblDisp.getText().equals(""))
					lblDisp.setText(lblDisp.getText()+"0");
			}
		});
		btn0.setBounds(135, 253, 70, 23);
		contentPanel.add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisp.setText("");
				
			}
		});
		btnClear.setBounds(51, 253, 70, 23);
		contentPanel.add(btnClear);
		
		JButton btnResult = new JButton("=");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sNum2 = lblDisp.getText();
				double result = 0;
				switch(sOp) {
				case "+" :
					result = Integer.parseInt(sNum1) + Integer.parseInt(sNum2);
					break;
				case "-" :
					result = Integer.parseInt(sNum1) - Integer.parseInt(sNum2);
					break;
				case "*" :
					result = Integer.parseInt(sNum1) * Integer.parseInt(sNum2);
					break;
				case "/" :
					result = (double)Integer.parseInt(sNum1) / Integer.parseInt(sNum2);
					break;
				}
				lblDisp.setText(Double.toString(result));
				bStart = true; 
			}
		});
		btnResult.setBounds(217, 253, 70, 23);
		contentPanel.add(btnResult);
	}
}
