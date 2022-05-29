package Week2HomeWork;

// Wayland Carter
// U2 PA2 Guess the Number
// 2/11/2021

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GuessNumberGame extends JFrame {

	private static final long serialVersionUID = -2219016099498955460L;
	private int highest = 1000, lowest = 1;
	private JTextField guessInput;
	private JLabel message;
	private JLabel guessLabel;
	private JButton guessButton, newGameButton;
	int number = ThreadLocalRandom.current().nextInt(1, 1001); // number = the randomly generated number

	public GuessNumberGame() {
		super("Guess game");
		setLayout(new FlowLayout()); // Frame is using flow layout

		guessLabel = new JLabel("Guess a number between 1 and 1000.");
		add(guessLabel); // add label to frame

		guessInput = new JTextField(5); // create empty text field with size of 5
		add(guessInput); // add text field to frame

		guessButton = new JButton("Guess"); // create button
		add(guessButton); // add button to frame

		newGameButton = new JButton("New Game"); // create button
		add(newGameButton); // add button to frame

		ButtonHandler buttonHandler = new ButtonHandler();
		guessButton.addActionListener(buttonHandler);
		newGameButton.addActionListener(buttonHandler);

	}

	class ButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {

			int guess;
			guess = Integer.parseInt(guessInput.getText());

			while (guess > highest || guess < lowest) {
				message.setText("Please enter a valid number");
			}

			if (guess > number) {
				message.setText("Too High");

				if (guess < highest) {
					highest = guess;
					setBackground(Color.red); // warmer
				} else
					setBackground(Color.blue); // colder
			} else if (guess < number) {
				message.setText("Too Low");

				if (guess > lowest) {
					lowest = guess;
					setBackground(Color.red); // warmer
				} else
					setBackground(Color.blue); // colder
			} else {
				message.setText("Correct!");
				setBackground(Color.white);
				guessInput.setEditable(false);
			}
			repaint();
		}
	}
}
