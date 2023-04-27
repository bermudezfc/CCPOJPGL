package GUI;

import java.awt.EventQueue;

import java.util.*;


import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibraryFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        Book book1 = new Book();
        book1.setName("After Dark");
        book1.setAuthor("Murakami");
        book1.setCopy(2);

        Book book2 = new Book();
        book2.setName("Meditations");
        book2.setAuthor("Aurelius");
        book2.setCopy(3);

        Book book3 = new Book();
        book3.setName("Tuesdays with Morrie");
        book3.setAuthor("Mitch Albom");
        book3.setCopy(4);
        



        books.add(book1);
        books.add(book2);
        books.add(book3);
        
		
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibraryFrame frame = new LibraryFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public class Book{
	    String name;
	    String author;
	    int copy;
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public String getAuthor() {
	        return author;
	    }
	    public void setAuthor(String author) {
	        this.author = author;
	    }
	    public int getCopy() {
	        return copy;
	    }
	    public void setCopy(int copy) {
	        this.copy = copy;
	    }
	    
	}
	
	public class LibraryMainClass{
		
	}

	/**
	 * Create the frame.
	 */
	public LibraryFrame() {
		setTitle("Library");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		comboBox.setBounds(191, 77, 125, 41);
		contentPane.add(comboBox);
		
		
	}
}
