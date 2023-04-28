////package GUI;
////
////import java.awt.event.ActionEvent;
////import java.awt.event.ActionListener;
////
////import javax.swing.JButton;
////import javax.swing.JComboBox;
////import javax.swing.JFrame;
////import javax.swing.JLabel;
////import javax.swing.JOptionPane;
////import javax.swing.JTable;
////import javax.swing.JTextField;
////
////import com.toedter.calendar.JDateChooser;
////import GUI.MyBooking;
////public class Edit extends JFrame implements ActionListener {
////	
////	JButton edit;
////	JLabel noOfGuest,checkIndate,checkOutDate,roomType,prize;
////	
////	JComboBox type ,No;
////	JTextField prise;
////	JDateChooser in ,out ;
////	
////	public Edit() {
////		setTitle("Update Booking");
////		setResizable(false);
////		setSize(400,500);
////		setLayout(null);
////		setLocationRelativeTo(null);
////		
////		checkIndate = new JLabel("Check in date:");
////		checkIndate.setBounds(70,50,100,50);
////		add(checkIndate);
////		
////		in = new JDateChooser();
////		in.setBounds(170,60,150,30);
////		add(in);
////		
////		
////		
////		checkOutDate = new JLabel("Check out date:");
////		checkOutDate.setBounds(70,100,100,50);
////		add(checkOutDate);	
////		
////		out = new JDateChooser();
////		out.setBounds(170,110,150,30);
////		add(out);
////		
////		
////		roomType = new JLabel("Room Type:");
////		roomType.setBounds(70,150,100,50);
////		add(roomType);	
////		
////		String typ[] = {"Single","Double","Twin"}; 
////		type = new JComboBox(typ);
////		type.setBounds(170,160,120,30);
////		type.addActionListener(this);
////		add(type);
////		
////	
////		
////		
////		noOfGuest = new JLabel("No of guest:");
////		noOfGuest.setBounds(70,200,100,50);
////		add(noOfGuest);	
////		
////		String types[] = {"1","2","3","4","5"}; 
////		No = new JComboBox(types);
////		No.setBounds(170,215,120,30);
////		add(No);
////		
////		prize = new JLabel("Prize:");
////		prize.setBounds(120,260,100,50);
////		add(prize);	
////		
////		prise = new JTextField();
////		prise.setBounds(170,270,150,30);
////		prise.setEditable(false);
////		add(prise);
////		
////		edit = new JButton("Update");
////		edit.setBounds(120,330,100,30);
////		edit.addActionListener( new ActionListener() {
////			
////			@Override
////			public void actionPerformed(ActionEvent e) {
////				if(e.getSource()==edit) {
////					MyBooking book = new MyBooking();
////					String checkindate = ((JTextField)in.getDateEditor().getUiComponent()).getText();
////
////					String checkoutdate = ((JTextField)out.getDateEditor().getUiComponent()).getText();
////					String ty = (String) type.getSelectedItem();
////					String no = No.getSelectedItem().toString();
////				
////					
////					int row = book.datas.getSelectedRow();
////					if(row==-1) {
////						JOptionPane.showMessageDialog(null, "update table");
////					}
////					book.model.setValueAt(checkindate,row,0);
////					book.model.setValueAt(checkoutdate,row,1);
////					book.model.setValueAt(ty,row,2);
////					book.model.setValueAt(no,row,3);
////					
////					JOptionPane.showMessageDialog(null, "update table");
////				}
////					else
////					{
////						JOptionPane.showMessageDialog(null, "No update table");
////					}
////				}
//	v.add();
//					v.add();
//					v.add();
//					v.add();
//					v.add();
////			
////		});
////		add(edit);	
////		
////		setVisible(true);
////	}
////
////	@Override
////	public void actionPerformed(ActionEvent e) {
////		String comboBox = (String) type.getSelectedItem();
////		if (comboBox.equals("Double")) {
////			prise.setText("4000");
////			}
////			if (comboBox.equals("Single")) {
////				prise.setText("2000");
////			}
////			if (comboBox.equals("Twin")) {
////				prise.setText("6000");
////			}
////			
////			
////			
////	}
////	public static void main(String[]args) {
////		new Edit();
////	}
////}
