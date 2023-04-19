package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class MyBooking extends JFrame implements ActionListener {
	JButton edit , cancel, back;
	JTable datas ;
	public MyBooking() {
		setSize(800,600);
		setLocationRelativeTo(null);
		setLayout(null);
//		setResizable(false);
		
		
		edit = new JButton("Edit");
		edit.setBounds(80,40,150,30);
		edit.setFocusable(false);
		edit.addActionListener(this);
		add(edit);
		
		cancel = new JButton("Cancel");
		cancel.setBounds(320,40,150,30);
		cancel.setFocusable(false);
		cancel.addActionListener(this);
		add(cancel);
		
		back = new JButton("Back");
		back.setBounds(560,40,150,30);
		back.setFocusable(false);
		back.addActionListener(this);
		add(back);
		
		//Object[][] data= {{"ravi","2006","2007","single","5","98123","5"},{"ravi","2006","2007","single","5","98123","5"}};
		String column[]= {"Name","Check in Date","Check out date","Room type","Number of guest","contact","Roonm No"};
		
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(column);
		datas = new JTable(model);
//		datas.setBounds(80,300,100,100);
		JScrollPane sp =  new JScrollPane(datas);
		sp.setBounds(80,100,635,400);
		add(sp);
		
		setVisible(true);
		validate();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyBooking();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==back) {
			Booking book = new Booking();
		}
		
		if(e.getSource()==cancel) {
			
		}
	}

}
