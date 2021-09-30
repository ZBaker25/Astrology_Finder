package astrology_finder;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Month;
import java.util.*;

public class Astrology_finder implements ActionListener {
	    static // create a frame, label and textfield
	    JFrame frame = new JFrame("Astrology Finder: What's your sign?");
	    private static JLabel month = new JLabel("Enter Month");
 	    private static JTextField userText;
	    private static JLabel day = new JLabel("Enter day");
	    private static JTextField userText2;
	    private static JButton button;
	    private static JLabel sign;

	  public static void main(String[] args)
	{
		  
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(550,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		frame.setTitle("Astrology Finder: What's your sign?");
		
		panel.setLayout(null);
		//create label and text boxes for the user to type into
		month = new JLabel("Enter Month:");
		month.setBounds(10,20,80,25);
		panel.add(month);
		
		userText = new JTextField(50);
		userText.setBounds(100,20,165,25);
		panel.add(userText);
		
		day = new JLabel("Enter Day:");
		day.setBounds(10,50,80,25);
		panel.add(day);
		
		userText2 = new JTextField(50);
		userText2.setBounds(100,50,165,25);
		panel.add(userText2);
		
		button = new JButton("Enter");
		button.setBounds(10,80,80,25);
		panel.add(button);
		button.addActionListener(new Astrology_finder());
		
		sign = new JLabel("");
		sign.setBounds(100,80,500,25);
		panel.add(sign);
		
		panel.setBackground(Color.MAGENTA);
		
		frame.setVisible(true);
	}

		public void actionPerformed(ActionEvent e)
	    {
			String month = userText.getText();
			String day = userText2.getText();
			
			int Month = Integer.parseInt(month);
			int Day = Integer.parseInt(day);
			
			//compare days and months to figure out what sign you are
			
			if(((Day > 21 && Month == 3)|| (Day <= 19 && Month == 4)))
			{
				sign.setText("You are an Aeries! Your Element is Fire! Your Symbol: Ram");
			}
			else if(((Day > 20 && Month == 4)|| (Day <= 20 && Month == 5)))
			{
				sign.setText("You are a Taurus! Your Element is Earth! Your Symbol: Bull");
			}
			else if(((Day > 21 && Month == 5)|| (Day <= 20 && Month == 6)))
			{
				sign.setText("You are a Gemini! Your Element is Air! Your Symbol: Twins");
			}
			else if(((Day > 21 && Month == 6)|| (Day <= 22 && Month == 7)))
			{
				sign.setText("You are a Cancer! Your Element is Water! Your Symbol: Crab");
			}
			else if(((Day > 23 && Month == 7)|| (Day <= 22 && Month == 8)))
			{
				sign.setText("You are a Leo! Your Element is Fire! Your Symbol: Lion");
			}
			else if(((Day > 23 && Month == 8)|| (Day <= 22 && Month == 9)))
			{
				sign.setText("You are a Virgo! Your Element is Earth! Your Symbol: Maiden");
			}
			else if(((Day > 23 && Month == 9)|| (Day <= 22 && Month == 10)))
			{
				sign.setText("You are a Libra! Your Element is Air! Your Symbol: Scale");
			}
			else if(((Day > 23 && Month == 10)|| (Day <= 21 && Month == 11)))
			{
				sign.setText("You are a Scorpio! Your Element is Water! Your Symbol: Scorpion");
			}
			else if(((Day > 22 && Month == 11)|| (Day <= 21 && Month == 12)))
			{
				sign.setText("You are a Sagittarius! Your Element is Fire! Your Symbol: Archer");
			}
			else if(((Day > 22 && Month == 12)|| (Day <= 20 && Month == 1)))
			{
				sign.setText("You are a Capricorn! Your Element is Earth! Your Symbol: Sea-Goat");
			}
			else if(((Day > 21 && Month == 1)|| (Day <= 18 && Month == 2)))
			{
				sign.setText("You are an Aquarius! Your Element is Air! Your Symbol: Water-Bearer");
			}
			else if(((Day > 19 && Month == 2)|| (Day <= 20 && Month == 3)))
			{
				sign.setText("You are a Pisces!Your Element is Water! Your Symbol: Fish");
			}
			else
			{
				sign.setText("Try again!");
			}
	
		
			}
}
	
