package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameScreen extends Application {


	private JPanel mainTextPanel;
	private JTextArea textArea;

	public void createScreen() {
		mainTextPanel = new JPanel();



		mainTextPanel.setBounds(100, 100, 1080, 270);
		mainTextPanel.setBackground(Information.backGroundColor);

		super.container.add(mainTextPanel);


		textArea = new JTextArea();
		textArea.setBounds(100, 100, 1080, 270);
		textArea.setBackground(Information.backGroundColor);
		textArea.setForeground(Information.normalTextColor);

		textArea.setFont(mediumFont);
		textArea.setLineWrap(true);
		mainTextPanel.add(textArea);



	}


}

class TitleScreenHandler implements ActionListener {

	GameScreen gs;

	/**
	 * Invoked when an action occurs.
	 *
	 * @param e the event to be processed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		gs = new GameScreen();
		gs.createScreen();
	}

}
