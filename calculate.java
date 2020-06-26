package calculate;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class calculate {

	private JFrame frame;
	private JTextField text;
	double firstNum;
	double secondNum;
	double result;
    String operations;
    String answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculate window = new calculate();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		text = new JTextField();
		text.setFont(new Font("Tahoma", Font.BOLD, 16));
		text.setColumns(10);
		
		JButton bt0 = new JButton("0");
		bt0.setFont(new Font("Tahoma", Font.BOLD, 14));
		bt0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=text.getText()+bt0.getText();
				text.setText(EnterNumber);
			}
		});
		
		JButton bt1 = new JButton("1");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=text.getText()+bt1.getText();
				text.setText(EnterNumber);
			}
		});
		bt1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton bt2 = new JButton("2");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=text.getText()+bt2.getText();
				text.setText(EnterNumber);
			}
		});
		bt2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton bt3 = new JButton("3");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=text.getText()+bt3.getText();
				text.setText(EnterNumber);
			}
		});
		bt3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton bt4 = new JButton("4");
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=text.getText()+bt4.getText();
				text.setText(EnterNumber);
			}
		});
		bt4.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton bt5 = new JButton("5");
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=text.getText()+bt5.getText();
				text.setText(EnterNumber);
			}
		});
		bt5.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton bt6 = new JButton("6");
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=text.getText()+bt6.getText();
				text.setText(EnterNumber);
			}
		});
		bt6.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton bt7 = new JButton("7");
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=text.getText()+bt7.getText();
				text.setText(EnterNumber);
			}
		});
		bt7.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton bt8 = new JButton("8");
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=text.getText()+bt8.getText();
				text.setText(EnterNumber);
			}
		});
		bt8.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton bt9 = new JButton("9");
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=text.getText()+bt9.getText();
				text.setText(EnterNumber);
			}
		});
		bt9.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btp = new JButton("+");
		btp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum =Double.parseDouble(text.getText());
				text.setText("");
				operations="+";
			}
		});
		btp.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btm = new JButton("-");
		btm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum =Double.parseDouble(text.getText());
				text.setText("");
				operations="-";
			}
		});
		btm.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btd = new JButton("/");
		btd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum =Double.parseDouble(text.getText());
				text.setText("");
				operations="/";
			}
		});
		btd.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btmu = new JButton("*");
		btmu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum =Double.parseDouble(text.getText());
				text.setText("");
				operations="*";
			}
		});
		btmu.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btdo = new JButton(".");
		btdo.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btmod = new JButton("%");
		btmod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum =Double.parseDouble(text.getText());
				text.setText("");
				operations="%";
			}
		});
		btmod.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton bteq = new JButton("=");
		bteq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondNum =Double.parseDouble(text.getText());
				if (operations=="+")
				{
					result=firstNum+secondNum;
					answer=String.format("%.2f",result);
					text.setText(answer);
				}
				else if (operations=="-")
				{
					result=firstNum-secondNum;
					answer=String.format("%.2f",result);
					text.setText(answer);
				}
				else if (operations=="*")
				{
					result=firstNum*secondNum;
					answer=String.format("%.2f",result);
					text.setText(answer);
				}
				else if (operations=="/")
				{
					result=firstNum/secondNum;
					answer=String.format("%.2f",result);
					text.setText(answer);
				}
				else if (operations=="%")
				{
					result=firstNum%secondNum;
					answer=String.format("%.2f",result);
					text.setText(answer);
				}
			}
		});
		bteq.setFont(new Font("Tahoma", Font.BOLD, 18));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(bt0, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(text, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
									.addComponent(bt7, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bt8, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bt9, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
									.addComponent(bteq, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(bt1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(bt2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(bt3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(bt4, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(bt5, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(bt6, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(btdo, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
										.addComponent(btmod, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btm, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addComponent(btmu, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btp, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(btd, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(12))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(bt0, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(text, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
								.addGap(10))))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(bt1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
										.addComponent(bt2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
										.addComponent(bt3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(bt4, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
												.addComponent(bt5, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.UNRELATED))
										.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(bt6, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
												.addComponent(btmu, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
												.addComponent(btd, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(btm, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
										.addComponent(btdo, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btmod, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
							.addGap(1)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(bteq, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addComponent(bt9, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(bt7, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
									.addComponent(bt8, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
							.addGap(10))
						.addComponent(btp, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
