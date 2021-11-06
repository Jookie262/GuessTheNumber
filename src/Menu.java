import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Menu extends JPanel {

    // Declaring the Game class for changing the scene
    final private Game game;

    // Constructor of the Class
    public Menu(Game game){
        this.game = game;

        // Layout to be used in this panel
        BoxLayout boxlayout = new BoxLayout(this, BoxLayout.Y_AXIS);
        this.setLayout(boxlayout);

        // Called the method for adding the components in JPanel
        createGUI();
    }

    // All the components are found here
    public void createGUI(){

        // Declare the variables needed
        JLabel logoImage, scoreLabel, scoreText, playButton, playText;

        // Setting up and Display the Guess the Number Logo Image
        logoImage = new JLabel(new ImageIcon("res/guess_the_number_logo.png"));
        logoImage.setBorder(new EmptyBorder(100, 0, 0, 0));
        logoImage.setAlignmentX(CENTER_ALIGNMENT);
        add(logoImage);

        // Setting up and Display the High Score Label Image
        scoreLabel = new JLabel(new ImageIcon("res/high_score_label.png"));
        scoreLabel.setBorder(new EmptyBorder(35, 0, 0, 0));
        scoreLabel.setAlignmentX(CENTER_ALIGNMENT);
        add(scoreLabel);

        // Setting up and Display the High Score
        scoreText = new JLabel("0");
        scoreText.setFont(new Font("Arial", Font.BOLD, 30));
        scoreText.setForeground(Color.WHITE);
        scoreText.setBorder(new EmptyBorder(10,0,0,0));
        scoreText.setAlignmentX(CENTER_ALIGNMENT);
        add(scoreText);

        // Setting up and Display the Play Button
        playButton = new JLabel(new ImageIcon("res/play_button.png"));
        playButton.setBorder(new EmptyBorder(30, 0, 0, 0));
        playButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        playButton.setAlignmentX(CENTER_ALIGNMENT);
        add(playButton);

        // Setting up and Display the "Click to Play" Text Image
        playText = new JLabel(new ImageIcon("res/click_play.png"));
        playText.setBorder(new EmptyBorder(20,0,0,0));
        playText.setAlignmentX(CENTER_ALIGNMENT);
        add(playText);
    }

    // For changing the background of JPanel
    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(new ImageIcon("res/background.jpg").getImage(), 0, 0, null);
    }
}