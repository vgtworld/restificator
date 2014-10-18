package pl.vgtworld.restificator.gui.tabs.requests;

import pl.vgtworld.restificator.gui.MainWindow;
import pl.vgtworld.restificator.gui.tabs.requests.form.RequestsFormDialog;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;

@Singleton
class NewRequestAction extends AbstractAction {

	@Inject
	private Provider<MainWindow> mainWindow;

	NewRequestAction() {
		putValue(NAME, "New");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		RequestsFormDialog dialog = new RequestsFormDialog(mainWindow.get());
		dialog.setLocationRelativeTo(mainWindow.get());
		dialog.setVisible(true);
	}

}
