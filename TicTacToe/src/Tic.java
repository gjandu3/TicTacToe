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

/**
 * The tick class
 * @author Gurkirat Jandu
 *
 */
public class Tic {

	/**
	 * The main JFrame for the game.
	 */
	private JFrame myFrame; 
	/**
	 * The Jframe that holds the reset button.
	 */
	private JFrame Reset; 
	/**
	 * The topleft slot in the game.
	 */
	private JButton topLeft;
	/**
	 * The top middle slot in the game.
	 */
	private JButton top;
	/**
	 * The top right slot.
	 */
	private JButton topRight;
	/**
	 * The middle left slot.
	 */
	private JButton middleLeft;
	/**
	 * The center slot.
	 */
	private JButton middle;
	/**
	 * The middle right slight.
	 */
	private JButton middleRight;
	/**
	 * The bottom left slot.
	 */
	private JButton bottomLeft;
	/**
	 * The middle-bottom slot.
	 */
	private JButton bottom;
	/**
	 * The bottom right slot.
	 */
	private JButton bottomRight;
	/**
	 * The reset button that resets the entire game.
	 */
	private JButton myReset; 
	/**
	 * ImageIcon representing the X's.
	 */
	private ImageIcon XIcon;
	/**
	 * ImageIcon representing the O's.
	 */
	private ImageIcon OIcon;
	/**
	 * String for the X image file.
	 */
	private String X = "src/Images/letter_x.jpg";
	/**
	 * String for the O image file.
	 */
	private String O = "src/Images/letter_o.jpg";
	/**
	 * boolean value that helps determine who's turn it is.
	 */
	private static boolean isX = true;

	/**
	 * Class constructor that initializes the frames and application.
	 */
	public Tic () {
	 myFrame = new JFrame(); 
	 myFrame.setLayout(new GridLayout(3,3));
	 Reset = new JFrame();
	 Reset.setLayout(new FlowLayout());
	 createandshowGui(); 
	}
	
	/**
	 * Adds the buttons and all functionality to the JFrames. 
	 */
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
	
	/**
	 * Actionlistener class for the reset button.
	 * @author Gurkirat Jandu
	 *
	 */
	private class ResetListener implements ActionListener {
		
		/**
		 * When reset is clicked, all slots become enabled and the images get removed.
		 */
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
	
	/**
	 * Actionlistener for each of the slots on the main JFrame.
	 * @author Gurkirat Jandu
	 *
	 */
	private class ButtonListener implements ActionListener {
		
	/**
	 * When a slot gets clicked, an X or O image gets added to it and
	 * that slot becomes disabled so it cannot be clicked again. 
	 */
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
