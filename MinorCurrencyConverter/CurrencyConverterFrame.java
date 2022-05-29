package Week2HomeWork;

// Wayland Carter
// Unit2 PA1 Currency Conversion
// 2/11/2021
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CurrencyConverterFrame extends JFrame {

	private static final long serialVersionUID = 6481219217873684150L;
	private final JTextField dollarField; // holds dollar to convert
	private final JTextField conversionRate; // holds conversion rate
	private JButton convertButton; // button to press and convert
	private JLabel currencylabel; // tells user what to enter into textbox
	private JLabel conversionLabel; // tells user what to enter into textbox
	private JTextField dracField; // holds the dollar converted to drac

	public CurrencyConverterFrame() {
		super("Currency Converter");
		setLayout(new FlowLayout()); // Frame is using flowlayout

		currencylabel = new JLabel("Dollars: ");
		add(currencylabel); // add label to frame

		dollarField = new JTextField(5); // create empty textfield with size of 5
		add(dollarField); // add text field to frame

		conversionLabel = new JLabel("Conversion Rate: ");
		add(conversionLabel); // add label to frame

		conversionRate = new JTextField(5); // create empty textfield with size of 5
		add(conversionRate); // add text field to frame

		convertButton = new JButton("Convert: "); // create button
		add(convertButton); // add button to frame

		dracField = new JTextField(30);
		dracField.setEditable(false);
		add(dracField); // added to frame

		ButtonHandler buttonHandler = new ButtonHandler();
		convertButton.addActionListener(buttonHandler);
		dollarField.addActionListener(buttonHandler);
	}

	// private inner class for button pressing
	private class ButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) { // won't work without this
			// all the magic happens right here
			double dollarValue, dracValue, conversionValue;
			String dollarString, conversionString;

			dollarString = dollarField.getText(); // get information of text box
			conversionString = conversionRate.getText(); // get conversionRate from above text box
			try {
				dollarValue = Double.parseDouble(dollarString); // convert string to double
				conversionValue = Double.parseDouble(conversionString);
				dracValue = (dollarValue * conversionValue);
				String answer = String.format("%s%.2f\n", "Dracs: ", dracValue);
				dracField.setText(answer); // set the dracsField
			} catch (NumberFormatException exception) {
				JOptionPane.showMessageDialog(null, "Missing dollar amount and/or conversion rate, check your input",
						"Error", JOptionPane.ERROR_MESSAGE);
				dollarField.setText(""); // clear out the text fields
				dracField.setText(""); // clear out

			}
		}
	}
}
