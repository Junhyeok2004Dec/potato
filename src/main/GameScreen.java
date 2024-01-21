package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameScreen extends Application {


	private JPanel mainTextPanel, choiceListPanel, playerpanel;
	private JTextArea textArea;

	private JButton choice1, choice2, choice3, choice4, choice5;

	private JLabel hpLabel;





	public void createScreen() {

		super.titlePanel.setVisible(false);
		super.startBtnPanel.setVisible(false);

		mainTextPanel = new JPanel();




		mainTextPanel.setBounds(100, 100, 1080, 270);
		mainTextPanel.setBackground(Information.backGroundColor);


		super.container.add(mainTextPanel);


		textArea = new JTextArea();
		textArea.setBounds(100, 100, 1080, 270);
		textArea.setBackground(Information.backGroundColor);
		textArea.setForeground(Information.normalTextColor);
		textArea.setEditable(false);



		textArea.setFont(mediumFont);
		textArea.setLineWrap(true);
		mainTextPanel.add(textArea);


		textArea.setText("대한민국  해군  군사경찰대");

		choiceListPanel = new JPanel();
		choiceListPanel.setBounds(300, 400, 590, 200);
		choiceListPanel.setBackground(Information.listColor);
		choiceListPanel.setLayout(new GridLayout(5,1));

		choiceListPanel.setFont(super.mediumFont);

		super.container.add(choiceListPanel);

		choice1 = new JButton("제 1연대");
		choice2 = new JButton("제 2연대");
		choice3 = new JButton("제 3연대");
		choice4 = new JButton("제 4연대");
		choice5 = new JButton("제 5연대");

		choice1.setBackground(Information.backGroundColor);
		choice2.setBackground(Information.backGroundColor);
		choice3.setBackground(Information.backGroundColor);
		choice4.setBackground(Information.backGroundColor);
		choice5.setBackground(Information.backGroundColor);

		choice1.setForeground(Information.normalTextColor);
		choice2.setForeground(Information.normalTextColor);
		choice3.setForeground(Information.normalTextColor);
		choice4.setForeground(Information.normalTextColor);
		choice5.setForeground(Information.normalTextColor);

		choiceListPanel.add(choice1);
		choiceListPanel.add(choice2);
		choiceListPanel.add(choice3);
		choiceListPanel.add(choice4);
		choiceListPanel.add(choice5);
		super.setFontForAllButtons(choiceListPanel, super.mediumFont);



		playerpanel = new JPanel();
		playerpanel.setBounds(100, 20, 1000, 60);
		playerpanel.setBackground(Information.normalTextColor);
		playerpanel.setLayout(new GridLayout(1,5));
		super.container.add(playerpanel);

		hpLabel = new JLabel("체력 : ");
		hpLabel.setFont(super.smallFont);
		hpLabel.setForeground(Color.black);
		playerpanel.add(hpLabel);


	}


}


