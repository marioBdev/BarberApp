package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.FramePrincipal;

public class ItemLoginAdminListener implements ActionListener {
	
	private FramePrincipal framePrincipal;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		framePrincipal = new FramePrincipal();
		framePrincipal.getJMenuBar().setVisible(false);
		framePrincipal.setTitle("Login Admin");
		framePrincipal.getCardLayout().show(framePrincipal.getCardPanel(), framePrincipal.getPanelLoginAdminView().getName());
		
	}

}
