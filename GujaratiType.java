GujaratiTypeInJTextArea
=======================


import javax.swing.*;
import java.io.*;
import java.awt.*;
import javax.swing.text.*;
import java.awt.event.*;
import java.awt.font.*;

class GujaratiType extends JFrame
{
	public Font font,fontUsed;
	public GujaratiType()
	{
		try
		{
			InputStream myStream = new BufferedInputStream(new FileInputStream("LMG_LAX1.ttf"));
			font = Font.createFont(Font.TRUETYPE_FONT, myStream);
			fontUsed = font.deriveFont(Font.PLAIN,20);
		}
		catch(FontFormatException ex)
		{
			JOptionPane.showMessageDialog(GujaratiType.this,ex,"Error",JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		catch(IOException ex)
		{
			JOptionPane.showMessageDialog(GujaratiType.this,"System can not find the file : LMG_LAX1.TTF","Error",JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		JTextArea txt = new JTextArea();
		txt.setFont(fontUsed);
		JScrollPane jsp = new JScrollPane(txt);
		add(jsp);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,300,300);
		//setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] a)
	{
		new GujaratiType();
	}
}
