import java.awt.*;
import java.awt.event.*;
public class EventDrivenDemo extends Frame implements ActionListener, TextListener {
    // Declare AWT components
    private TextField textField;
    private Label label;
    private Button button;

    // Constructor to set up the GUI
    public EventDrivenDemo() {
        // Set the layout
        setLayout(new FlowLayout());

        // Create components
        label = new Label("Enter text:");
        textField = new TextField(20);
        button = new Button("Click Me!");

        // Add components to the frame
        add(label);
        add(textField);
        add(button);

        // Add event listeners
        textField.addTextListener(this);
        button.addActionListener(this);

        // Set up the frame
        setTitle("AWT Event-Driven Demo");
        setSize(300, 200);
        setVisible(true);

        // Close the window when the user clicks the close button
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    // Handle button click events
    @Override
    public void actionPerformed(ActionEvent e) {
        String inputText = textField.getText();
        label.setText("Button clicked! Text: " + inputText);
    }

    // Handle text input events
    @Override
    public void textValueChanged(TextEvent e) {
        label.setText("Typing: " + textField.getText());
    }

    // Main method to run the program
    public static void main(String[] args) {
        new EventDrivenDemo();
    }
}
