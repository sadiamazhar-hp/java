/*
 * Created by JFormDesigner on Sun Apr 17 15:33:42 PKT 2022
 */

package FirstProgram;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author sadia mazhar
 */
public class Calculator extends JFrame {
	public Calculator() {
		initComponents();
	}
	public String Operation;
	public Double FirstNumber, Res;
	

	private void button1(ActionEvent e) {
		 if (textbox1.getText() == "0" && textbox1 != null)
         {
             textbox1.grabFocus();
             textbox1.setText("1");
         }
         else 
         {
             textbox1.setText(textbox1.getText() + "1");
         }
	}

	private void button2(ActionEvent e) {
		 if (textbox1.getText() == "0" && textbox1 != null)
         {
             textbox1.grabFocus();
             textbox1.setText("2");
         }
         else 
         {
             textbox1.setText(textbox1.getText() + "2");
         }
	}

	private void button3(ActionEvent e) {
		 if (textbox1.getText() == "0" && textbox1 != null)
         {
             textbox1.grabFocus();
             textbox1.setText("3");
         }
         else 
         {
             textbox1.setText(textbox1.getText() + "3");
         }
	}

	private void button4(ActionEvent e) {
		 if (textbox1.getText() == "0" && textbox1 != null)
         {
             textbox1.grabFocus();
             textbox1.setText("4");
         }
         else 
         {
             textbox1.setText(textbox1.getText() + "4");
         }
	}

	private void button5(ActionEvent e) {
		 if (textbox1.getText() == "0" && textbox1 != null)
         {
             textbox1.grabFocus();
             textbox1.setText("5");
         }
         else 
         {
             textbox1.setText(textbox1.getText() + "5");
         }
		 
	}

	private void button6(ActionEvent e) {
		 if (textbox1.getText() == "0" && textbox1 != null)
         {
             textbox1.grabFocus();
             textbox1.setText("6");
         }
         else 
         {
             textbox1.setText(textbox1.getText() + "6");
         }
	}

	private void button7(ActionEvent e) {
		 if (textbox1.getText() == "0" && textbox1 != null)
         {
             textbox1.grabFocus();
             textbox1.setText("7");
         }
         else 
         {
             textbox1.setText(textbox1.getText() + "7");
         }
	}

	private void button8(ActionEvent e) {
		 if (textbox1.getText() == "0" && textbox1 != null)
         {
             textbox1.grabFocus();
             textbox1.setText("8");
         }
         else 
         {
             textbox1.setText(textbox1.getText() + "8");
         }
	}

	private void button9(ActionEvent e) {
		 if (textbox1.getText() == "0" && textbox1 != null)
         {
             textbox1.grabFocus();
             textbox1.setText("9");
         }
         else 
         {
             textbox1.setText(textbox1.getText() + "9");
         }
	}

	private void button10(ActionEvent e) {
		 if (textbox1.getText() == "0" && textbox1 != null)
         {
             textbox1.grabFocus();
             textbox1.setText("0");
         }
         else 
         {
             textbox1.setText(textbox1.getText() + "0");
         }
	}

	private void button13(ActionEvent e) {
		FirstNumber = Double.parseDouble(textbox1.getText());
        Operation = "+";
        textbox1.setText("0"); 
	}

	private void button14(ActionEvent e) {
		FirstNumber = Double.parseDouble(textbox1.getText());
        Operation = "-";
        textbox1.setText("0"); 
	}

	private void button15(ActionEvent e) {
		FirstNumber = Double.parseDouble(textbox1.getText());
        Operation = "*";
        textbox1.setText("0"); 
	}

	private void button16(ActionEvent e) {
		FirstNumber = Double.parseDouble(textbox1.getText());
        Operation = "/";
        textbox1.setText("0"); 
	}

	private void button11(ActionEvent e) {
		textbox1.setText(textbox1.getText() + ".");
    }

	private void button17(ActionEvent e) {
		textbox1.setText("0");
	}
	public double fact(double no) {
		
		if (no<=1) {
			return 1;
		}
		else
		{
			return no * fact(no -1);
		}
	}

	private void button18(ActionEvent e) {
		Res = Double.parseDouble(textbox1.getText());
		Res = fact(Res);
		textbox1.setText(Res.toString());
		
	}

	private void button12(ActionEvent e) {
		switch(Operation) {
		case "+":
			textbox1.setText(String.valueOf((FirstNumber + Double.parseDouble(textbox1.getText()))));
            break;
        case "-":
        	textbox1.setText(String.valueOf((FirstNumber - Double.parseDouble(textbox1.getText()))));
            break;
        case "*":
        	textbox1.setText(String.valueOf((FirstNumber * Double.parseDouble(textbox1.getText()))));
            break;
        case "/":
        	textbox1.setText(String.valueOf((FirstNumber / Double.parseDouble(textbox1.getText()))));
            break;
		}
	}

	private void button19(ActionEvent e) {
		Res = Double.parseDouble(textbox1.getText());
		Res = Res /100;
		textbox1.setText(Res.toString());
	}

	private void button20(ActionEvent e) {
		Res = Double.parseDouble(textbox1.getText());
		Res = Res * -1;
		textbox1.setText(Res.toString());
	}

	private void button25(ActionEvent e) {
		Res = Double.parseDouble(textbox1.getText());
		Res = 1/  Res;
		textbox1.setText(Res.toString());
	}

	private void button30(ActionEvent e) {
		Res = Double.parseDouble(textbox1.getText());
		Res = Math.pow(Res, 3);
		textbox1.setText(Res.toString());
	}

	private void button24(ActionEvent e) {
		Res = Double.parseDouble(textbox1.getText());
		Res = Math.pow(Res, 2);
		textbox1.setText(Res.toString());
	}

	private void button23(ActionEvent e) {
		Res = Double.parseDouble(textbox1.getText());
		Res = Math.tan(Res);
		textbox1.setText(Res.toString());
	}

	private void button22(ActionEvent e) {
		Res = Double.parseDouble(textbox1.getText());
		Res = Math.cos(Res);
		textbox1.setText(Res.toString());
	}

	private void button21(ActionEvent e) {
		Res = Double.parseDouble(textbox1.getText());
		Res = Math.sin(Res);
		textbox1.setText(Res.toString());
	}

	private void button26(ActionEvent e) {
		Res = Double.parseDouble(textbox1.getText());
		Res = Math.exp(Res);
		textbox1.setText(Res.toString());
	}

	private void button27(ActionEvent e) {
		Res = Double.parseDouble(textbox1.getText());
		Res = Math.log(Res);
		textbox1.setText(Res.toString());
	}

	private void button28(ActionEvent e) {
		Res = Math.PI;
		textbox1.setText(Res.toString());
	}

	private void button29(ActionEvent e) {
		Res = Double.parseDouble(textbox1.getText());
		Res = Math.sqrt(Res);
		textbox1.setText(Res.toString());
	}
	
	
	        
	        private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - sadia mazhar
		dialogPane = new JPanel();
		contentPanel = new JPanel();
		textbox1 = new JTextPane();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button13 = new JButton();
		button17 = new JButton();
		button4 = new JButton();
		button5 = new JButton();
		button6 = new JButton();
		button14 = new JButton();
		button18 = new JButton();
		button7 = new JButton();
		button8 = new JButton();
		button9 = new JButton();
		button15 = new JButton();
		button19 = new JButton();
		button10 = new JButton();
		button11 = new JButton();
		button12 = new JButton();
		button16 = new JButton();
		button20 = new JButton();
		button21 = new JButton();
		button22 = new JButton();
		button23 = new JButton();
		button24 = new JButton();
		button30 = new JButton();
		button26 = new JButton();
		button27 = new JButton();
		button28 = new JButton();
		button29 = new JButton();
		button25 = new JButton();

		//======== this ========
		setMinimumSize(new Dimension(14, 32));
		var contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//======== dialogPane ========
		{
			dialogPane.setMinimumSize(new Dimension(190, 150));
			dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
			border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER
			, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font
			.BOLD ,12 ), java. awt. Color. red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (
			new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r"
			.equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
			dialogPane.setLayout(new BorderLayout());

			//======== contentPanel ========
			{
				contentPanel.setLayout(new MigLayout(
					"insets dialog,hidemode 3",
					// columns
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]",
					// rows
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]"));
				contentPanel.add(textbox1, "cell 1 4 7 5,align right center,grow 0 0,width :340:340");

				//---- button1 ----
				button1.setText("1");
				button1.addActionListener(e -> button1(e));
				contentPanel.add(button1, "cell 2 9");

				//---- button2 ----
				button2.setText("2");
				button2.addActionListener(e -> button2(e));
				contentPanel.add(button2, "cell 3 9");

				//---- button3 ----
				button3.setText("3");
				button3.addActionListener(e -> button3(e));
				contentPanel.add(button3, "cell 4 9");

				//---- button13 ----
				button13.setText("+");
				button13.addActionListener(e -> button13(e));
				contentPanel.add(button13, "cell 5 9");

				//---- button17 ----
				button17.setText("c");
				button17.addActionListener(e -> button17(e));
				contentPanel.add(button17, "cell 6 9");

				//---- button4 ----
				button4.setText("4");
				button4.addActionListener(e -> button4(e));
				contentPanel.add(button4, "cell 2 10");

				//---- button5 ----
				button5.setText("5");
				button5.addActionListener(e -> button5(e));
				contentPanel.add(button5, "cell 3 10");

				//---- button6 ----
				button6.setText("6");
				button6.addActionListener(e -> button6(e));
				contentPanel.add(button6, "cell 4 10");

				//---- button14 ----
				button14.setText("-");
				button14.addActionListener(e -> button14(e));
				contentPanel.add(button14, "cell 5 10");

				//---- button18 ----
				button18.setText("x!");
				button18.addActionListener(e -> button18(e));
				contentPanel.add(button18, "cell 6 10");

				//---- button7 ----
				button7.setText("7");
				button7.addActionListener(e -> button7(e));
				contentPanel.add(button7, "cell 2 11");

				//---- button8 ----
				button8.setText("8");
				button8.addActionListener(e -> button8(e));
				contentPanel.add(button8, "cell 3 11");

				//---- button9 ----
				button9.setText("9");
				button9.addActionListener(e -> button9(e));
				contentPanel.add(button9, "cell 4 11");

				//---- button15 ----
				button15.setText("*");
				button15.addActionListener(e -> button15(e));
				contentPanel.add(button15, "cell 5 11");

				//---- button19 ----
				button19.setText("%");
				button19.addActionListener(e -> button19(e));
				contentPanel.add(button19, "cell 6 11");

				//---- button10 ----
				button10.setText("0");
				button10.addActionListener(e -> button10(e));
				contentPanel.add(button10, "cell 2 12");

				//---- button11 ----
				button11.setText(".");
				button11.addActionListener(e -> button11(e));
				contentPanel.add(button11, "cell 3 12");

				//---- button12 ----
				button12.setText("=");
				button12.addActionListener(e -> button12(e));
				contentPanel.add(button12, "cell 4 12");

				//---- button16 ----
				button16.setText("/");
				button16.addActionListener(e -> button16(e));
				contentPanel.add(button16, "cell 5 12");

				//---- button20 ----
				button20.setText("+-");
				button20.addActionListener(e -> button20(e));
				contentPanel.add(button20, "cell 6 12");

				//---- button21 ----
				button21.setText("sin");
				button21.addActionListener(e -> button21(e));
				contentPanel.add(button21, "cell 2 13");

				//---- button22 ----
				button22.setText("cos");
				button22.addActionListener(e -> button22(e));
				contentPanel.add(button22, "cell 3 13");

				//---- button23 ----
				button23.setText("tan");
				button23.addActionListener(e -> button23(e));
				contentPanel.add(button23, "cell 4 13");

				//---- button24 ----
				button24.setText("sq");
				button24.addActionListener(e -> button24(e));
				contentPanel.add(button24, "cell 5 13");

				//---- button30 ----
				button30.setText("cube");
				button30.addActionListener(e -> button30(e));
				contentPanel.add(button30, "cell 6 13");

				//---- button26 ----
				button26.setText("e^x");
				button26.addActionListener(e -> button26(e));
				contentPanel.add(button26, "cell 2 14");

				//---- button27 ----
				button27.setText("log");
				button27.addActionListener(e -> button27(e));
				contentPanel.add(button27, "cell 3 14");

				//---- button28 ----
				button28.setText("pi");
				button28.addActionListener(e -> button28(e));
				contentPanel.add(button28, "cell 4 14");

				//---- button29 ----
				button29.setIcon(new ImageIcon("D:\\sadia\\prog\\j\\sq root.png"));
				button29.addActionListener(e -> button29(e));
				contentPanel.add(button29, "cell 5 14,hmin 12");

				//---- button25 ----
				button25.setText("1/x");
				button25.addActionListener(e -> button25(e));
				contentPanel.add(button25, "cell 6 14");
			}
			dialogPane.add(contentPanel, BorderLayout.CENTER);
		}
		contentPane.add(dialogPane, BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}
	
	

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - sadia mazhar
	private JPanel dialogPane;
	private JPanel contentPanel;
	private JTextPane textbox1;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button13;
	private JButton button17;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button14;
	private JButton button18;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button15;
	private JButton button19;
	private JButton button10;
	private JButton button11;
	private JButton button12;
	private JButton button16;
	private JButton button20;
	private JButton button21;
	private JButton button22;
	private JButton button23;
	private JButton button24;
	private JButton button30;
	private JButton button26;
	private JButton button27;
	private JButton button28;
	private JButton button29;
	private JButton button25;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.setVisible(true);
		
	}
}

