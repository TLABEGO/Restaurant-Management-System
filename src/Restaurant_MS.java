import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;

public class Restaurant_MS {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant_MS window = new Restaurant_MS();
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
	public Restaurant_MS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1598, 860);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(56, 736, 1445, 74);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnExit.setBounds(835, 11, 117, 39);
		panel.add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnReset.setBounds(674, 11, 117, 39);
		panel.add(btnReset);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnReceipt.setBounds(519, 9, 117, 39);
		panel.add(btnReceipt);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
//				double ChickBurger = Double.parseDouble(jtxtChickBurger.getText());
				
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnTotal.setBounds(375, 11, 117, 39);
		panel.add(btnTotal);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(1036, 92, 465, 633);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(26, 65, 414, 543);
		panel_1.add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_2, null);
		panel_2.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 23, 373, 481);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_3, null);
		panel_3.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(30, 45, 341, 72);
		panel_3.add(textField_3);
		
		JButton btnBackSpace = new JButton("B");
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBackSpace.setBounds(31, 128, 78, 53);
		panel_3.add(btnBackSpace);
		
		JButton btnCancel = new JButton("C");
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCancel.setBounds(119, 128, 77, 53);
		panel_3.add(btnCancel);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPercent.setBounds(206, 128, 79, 53);
		panel_3.add(btnPercent);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(295, 128, 76, 53);
		panel_3.add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMinus.setBounds(295, 192, 76, 59);
		panel_3.add(btnMinus);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(206, 192, 79, 59);
		panel_3.add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(119, 192, 77, 59);
		panel_3.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(31, 195, 78, 53);
		panel_3.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(34, 272, 75, 53);
		panel_3.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(119, 272, 77, 53);
		panel_3.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(206, 266, 79, 59);
		panel_3.add(btn6);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMultiply.setBounds(295, 266, 76, 59);
		panel_3.add(btnMultiply);
		
		JButton btnDevision = new JButton("/");
		btnDevision.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDevision.setBounds(295, 336, 76, 70);
		panel_3.add(btnDevision);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(206, 336, 79, 70);
		panel_3.add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(119, 336, 77, 70);
		panel_3.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(34, 336, 75, 70);
		panel_3.add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(34, 417, 75, 67);
		panel_3.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(119, 417, 77, 67);
		panel_3.add(btnDot);
		
		JButton btnPlusMinus = new JButton("+-");
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlusMinus.setBounds(206, 417, 79, 67);
		panel_3.add(btnPlusMinus);
		
		JButton btnEquals = new JButton("=");
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEquals.setBounds(295, 417, 76, 67);
		panel_3.add(btnEquals);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1_1.setBounds(619, 530, 407, 195);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Tax");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_3_1.setBounds(22, 27, 60, 39);
		panel_1_1.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Sub Total");
		lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_3_1_1.setBounds(22, 72, 109, 39);
		panel_1_1.add(lblNewLabel_1_3_1_1);
		
		JLabel lblNewLabel_1_3_1_2 = new JLabel("Total");
		lblNewLabel_1_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_3_1_2.setBounds(22, 122, 79, 39);
		panel_1_1.add(lblNewLabel_1_3_1_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel_2_3.setBounds(177, 27, 204, 39);
		panel_1_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("");
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel_2_4.setBounds(177, 72, 204, 39);
		panel_1_1.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("");
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel_2_5.setBounds(177, 122, 204, 39);
		panel_1_1.add(lblNewLabel_2_5);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1_1_1.setBounds(619, 98, 407, 421);
		frame.getContentPane().add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Choose One", "RSA", "USA", "India", "Europe", "China"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox_1.setBounds(73, 62, 256, 39);
		panel_1_1_1.add(comboBox_1);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_6.setColumns(10);
		textField_6.setBounds(73, 135, 256, 61);
		panel_1_1_1.add(textField_6);
		
		JLabel lblNewLabel_2_6 = new JLabel("");
		lblNewLabel_2_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel_2_6.setBounds(73, 248, 256, 46);
		panel_1_1_1.add(lblNewLabel_2_6);
		
		JButton btnNewButton_1 = new JButton("Convert");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_1.setBounds(73, 333, 130, 46);
		panel_1_1_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_5 = new JButton("Close");
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_1_5.setBounds(227, 333, 117, 46);
		panel_1_1_1.add(btnNewButton_1_5);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1_1_1_1.setBounds(56, 529, 553, 196);
		frame.getContentPane().add(panel_1_1_1_1);
		panel_1_1_1_1.setLayout(null);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Cost of Delivery");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_2_1.setBounds(25, 128, 204, 39);
		panel_1_1_1_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Cost of Meal");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1_1.setBounds(25, 78, 218, 39);
		panel_1_1_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Cost of Drinks");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_3.setBounds(25, 28, 166, 39);
		panel_1_1_1_1.add(lblNewLabel_1_3);
		
		JLabel lblCostOfDrinks = new JLabel("");
		lblCostOfDrinks.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCostOfDrinks.setBounds(310, 28, 204, 39);
		panel_1_1_1_1.add(lblCostOfDrinks);
		lblCostOfDrinks.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		JLabel lblCostOfMeal = new JLabel("");
		lblCostOfMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCostOfMeal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblCostOfMeal.setBounds(310, 78, 204, 39);
		panel_1_1_1_1.add(lblCostOfMeal);
		
		JLabel lblCostOFDelivery = new JLabel("");
		lblCostOFDelivery.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCostOFDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblCostOFDelivery.setBounds(310, 128, 204, 39);
		panel_1_1_1_1.add(lblCostOFDelivery);
		
		JPanel panel_1_1_1_2 = new JPanel();
		panel_1_1_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1_1_1_2.setBounds(56, 98, 553, 421);
		frame.getContentPane().add(panel_1_1_1_2);
		panel_1_1_1_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Chicken Buger");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(31, 36, 166, 39);
		panel_1_1_1_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Chicken Buger Meal");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(31, 86, 218, 39);
		panel_1_1_1_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cheese Buger");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_2.setBounds(31, 136, 166, 39);
		panel_1_1_1_2.add(lblNewLabel_1_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(293, 36, 218, 39);
		panel_1_1_1_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(293, 86, 218, 39);
		panel_1_1_1_2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(293, 136, 218, 39);
		panel_1_1_1_2.add(textField_2);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Drink");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_2_2.setBounds(31, 240, 166, 39);
		panel_1_1_1_2.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Qty");
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_2_3.setBounds(293, 240, 166, 39);
		panel_1_1_1_2.add(lblNewLabel_1_2_3);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_5.setColumns(10);
		textField_5.setBounds(293, 290, 218, 39);
		panel_1_1_1_2.add(textField_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Tax");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rdbtnNewRadioButton.setBounds(293, 347, 109, 46);
		panel_1_1_1_2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnHomeDelivery = new JRadioButton("Home Delivery");
		rdbtnHomeDelivery.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rdbtnHomeDelivery.setBounds(31, 347, 218, 46);
		panel_1_1_1_2.add(rdbtnHomeDelivery);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Select a drink", "Apple Juice", "Coke", "Tea", "Cola", "Coffee", "Ice Tea", "Orange"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(215, 290, -180, 39);
		panel_1_1_1_2.add(list);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select a drink", "Apple Juice", "Coke", "Tea", "Cola", "Coffee", "Ice Tea", "Orange"}));
		comboBox.setBounds(31, 290, 218, 39);
		panel_1_1_1_2.add(comboBox);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 210, 500, 8);
		panel_1_1_1_2.add(separator);
		
		JLabel lblNewLabel = new JLabel("Restaurant Management System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 70));
		lblNewLabel.setBounds(193, 11, 1353, 70);
		frame.getContentPane().add(lblNewLabel);
	}
}
