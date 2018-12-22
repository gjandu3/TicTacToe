/*
 * Tic Tac Toe Project
 * Author: Gurkirat Jandu
 */

import java.awt.FlowLayout; 
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Tic {

	private JFrame myFrame; 
	private JFrame Reset; 
	private JButton topLeft;
	private JButton top;
	private JButton topRight;
	private JButton middleLeft;
	private JButton middle;
	private JButton middleRight;
	private JButton bottomLeft;
	private JButton bottom;
	private JButton bottomRight;
	private JButton myReset; 
	private ImageIcon XIcon;
	private ImageIcon OIcon;
	private String X = "src/Images/letter_x.jpg";  
	private String O = "src/Images/letter_o.jpg"; 
	private static boolean isX = true;

	public Tic () {
	 myFrame = new JFrame(); 
	 myFrame.setLayout(new GridLayout(3,3));
	 Reset = new JFrame();
	 Reset.setLayout(new FlowLayout());
	 createandshowGui(); 
	}
	
	private void createandshowGui() {
		JOptionPane.showMessageDialog(null, "Remember, X goes first!");
		XIcon = new ImageIcon(X); 
	    final Image smallImage = XIcon.getImage().getScaledInstance(
	                                                  36, -1, java.awt.Image.SCALE_SMOOTH);
	    XIcon = new ImageIcon(smallImage);
	    
	    OIcon = new ImageIcon(O); 
	    final Image smallImage1 = OIcon.getImage().getScaledInstance(
	                                                  48, -1, java.awt.Image.SCALE_SMOOTH);
	    OIcon = new ImageIcon(smallImage1);
	    Reset.setTitle("Reset");
	    Reset.setLocation(100, 200 );
	    Reset.setSize(300, 200);
	    Reset.setVisible(true); 
	    myReset = new JButton("Reset");
	    Reset.add(myReset); 
		myFrame.setTitle("Tic Tac Toe");
		myFrame.setLocation(400, 200); 
		myFrame.setVisible(true);
		myFrame.setResizable(false);
		myFrame.setSize(400, 400);
		topLeft = new JButton();
		myFrame.add(topLeft); 
		top = new JButton();
		myFrame.add(top);
		topRight = new JButton();
		myFrame.add(topRight);
		middleLeft = new JButton();
		myFrame.add(middleLeft);
		middle = new JButton();
		myFrame.add(middle);
		middleRight = new JButton();
		myFrame.add(middleRight);
		bottomLeft = new JButton();
		myFrame.add(bottomLeft);
		bottom = new JButton();
		myFrame.add(bottom);
		bottomRight = new JButton();
		myFrame.add(bottomRight);
		myReset.addActionListener(new ResetListener());
		topLeft.addActionListener(new ButtonListener());
		top.addActionListener(new ButtonListener());
		topRight.addActionListener(new ButtonListener());
		middleLeft.addActionListener(new ButtonListener());
		middle.addActionListener(new ButtonListener());
		middleRight.addActionListener(new ButtonListener());
		bottomLeft.addActionListener(new ButtonListener());
		bottom.addActionListener(new ButtonListener());
		bottomRight.addActionListener(new ButtonListener());
		Reset.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	
	private class ResetListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent theEvent) {
			topLeft.setEnabled(true);
			topLeft.setIcon(null);
			top.setEnabled(true);
			top.setIcon(null);
			topRight.setEnabled(true);
			topRight.setIcon(null);
			middleLeft.setEnabled(true);
			middleLeft.setIcon(null);
			middle.setEnabled(true);
			middle.setIcon(null);
			middleRight.setEnabled(true);
			middleRight.setIcon(null); 
			bottomLeft.setEnabled(true);
			bottomLeft.setIcon(null);
			bottom.setEnabled(true);
			bottom.setIcon(null);
			bottomRight.setEnabled(true);
			bottomRight.setIcon(null);
			isX = true; 
		}
		
	}
	
	private class ButtonListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent E) {
		if (E.getSource() == topLeft) {
			if (isX) {
				topLeft.setIcon(XIcon);
				topLeft.setEnabled(false);
				isX = false; 
			} else {
				topLeft.setIcon(OIcon);
				topLeft.setEnabled(false);
				isX = true; 
			}
		}
		if (E.getSource() == top) {
			if (isX) {
				top.setIcon(XIcon);
				top.setEnabled(false);
				isX = false; 
			} else {
				top.setIcon(OIcon);
				top.setEnabled(false);
				isX = true; 
			}
		}
		if (E.getSource() == topRight) {
			if (isX) {
				topRight.setIcon(XIcon);
				topRight.setEnabled(false);
				isX = false; 
			} else {
				topRight.setIcon(OIcon);
				topRight.setEnabled(false);
				isX = true; 
			}
		}
		if (E.getSource() == middleLeft) {
			if (isX) {
				middleLeft.setIcon(XIcon);
				middleLeft.setEnabled(false);
				isX = false; 
			} else {
				middleLeft.setIcon(OIcon);
				middleLeft.setEnabled(false);
				isX = true; 
			}
		}
		if (E.getSource() == middle) {
			if (isX) {
				middle.setIcon(XIcon);
				middle.setEnabled(false);
				isX = false; 
			} else {
				middle.setIcon(OIcon);
				middle.setEnabled(false);
				isX = true; 
			}
		}
		if (E.getSource() == middleRight) {
			if (isX) {
				middleRight.setIcon(XIcon);
				middleRight.setEnabled(false);
				isX = false; 
			} else {
				middleRight.setIcon(OIcon);
				middleRight.setEnabled(false);
				isX = true; 
			}
		}
		if (E.getSource() == bottomLeft) {
			if (isX) {
				bottomLeft.setIcon(XIcon);
				bottomLeft.setEnabled(false);
				isX = false; 
			} else {
				bottomLeft.setIcon(OIcon);
				bottomLeft.setEnabled(false);
				isX = true; 
			}
		}
		if (E.getSource() == bottom) {
			if (isX) {
				bottom.setIcon(XIcon);
				bottom.setEnabled(false);
				isX = false; 
			} else {
				bottom.setIcon(OIcon);
				bottom.setEnabled(false);
				isX = true; 
			}
		}
		if (E.getSource() == bottomRight) {
			if (isX) {
				bottomRight.setIcon(XIcon);
				bottomRight.setEnabled(false);
				isX = false; 
			} else {
				bottomRight.setIcon(OIcon);
				bottomRight.setEnabled(false);
				isX = true; 
			}
		}
		
		}
	}

}
