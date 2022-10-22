package sssss;

import javax.swing.JPanel;

import components.ButtonDemo;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

public class ss extends JPanel {
	
	protected JButton b,b1,b2;



	public ss() {
		setLayout(null);
		setLayout(null);
		
		ImageIcon LeftIcon = new ImageIcon("C:\\Users\\PC23\\eclipse-workspace\\sssss\\src\\image\\right.gif");
		b1 = new JButton ("1 button" ,LeftIcon);
		b1.setBounds(94, 14, 97, 31);
		b1.setVerticalTextPosition(AbstractButton.CENTER);
		b1.setHorizontalTextPosition(AbstractButton.LEADING);
		add (b1);
		
		
		
		ImageIcon MiddleIcon = new ImageIcon("C:\\Users\\PC23\\eclipse-workspace\\sssss\\src\\image\\middle.gif");
		b2= new JButton ("2 button" ,MiddleIcon);
		b2.setBounds(196, 5, 73, 49);
		setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		b2.setVerticalTextPosition(AbstractButton.BOTTOM);
		b2.setHorizontalTextPosition(AbstractButton.CENTER);
		add (b2);

		
		
		ImageIcon RightIcon = new ImageIcon("C:\\Users\\PC23\\eclipse-workspace\\sssss\\src\\image\\left.gif");
		setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		b = new JButton ("3 button" ,RightIcon);
		b.setBounds(274, 14, 97, 31);
		b.setVerticalTextPosition(AbstractButton.CENTER);
		b.setHorizontalTextPosition(AbstractButton.RIGHT);
		add (b);
		

	}
	 private static void createAndShowGUI() {

	        //Create and set up the window.
	        JFrame frame = new JFrame("ButtonDemo");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        //Create and set up the content pane.
	        ss newContentPane = new ss();
	        newContentPane.setOpaque(true); //content panes must be opaque
	        frame.setContentPane(newContentPane);

	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	    }

	    public static void main(String[] args) {
	        //Schedule a job for the event-dispatching thread:
	        //creating and showing this application's GUI.
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI(); 
	            }
	        });
	    }
}
