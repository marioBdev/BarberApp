package view;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelCustomerHome extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel label;
	
	public PanelCustomerHome() {
		// TODO Auto-generated constructor stub
				
		initComponents();
		
		this.setVisible(true);
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		
		this.label = new JLabel("Customer Home");
		
		this.add(label);
		
	}

}
