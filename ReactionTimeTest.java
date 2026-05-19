import javax.swing.*;
import java.awt.*;
import java.util.Random;

// JFrame UI (Window) banane ke liye hai. Runnable interface Threads chalane ke liye hai.
public class ReactionTimeTest extends JFrame implements Runnable {

    // 9 buttons ka array banaya (3x3 grid ke liye)
    JButton[] btn = new JButton[9];

    // Game ke main variables (score kitna hai, time kitna bacha hai)
    int score = 0;
    int time = 30;
    boolean running = true; //Game chal raha hai ya nahi, ye check karne ke liye flag

    // Score aur time dikhane wale text labels
    JLabel scoreText, timeText;

    public ReactionTimeTest() {

        setTitle("Reaction Game"); // Window ka title set kiya

        // Window ko screen par full size (maximize) me kholne ke liye
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        setLayout(new BorderLayout()); // Layout manager jo chijon ko upar, niche, left, right set karta hai

        // TOP PANEL (Score + Time)
        // Ek naya panel jisme 1 row aur 2 column hai (Score left me, Time right me)
        JPanel top = new JPanel(new GridLayout(1, 2));

        scoreText = new JLabel("Score: 0", SwingConstants.CENTER);
        timeText = new JLabel("Time: 30", SwingConstants.CENTER);

        // Text ka font style, bold aur size 20 set kar rahe hain
        scoreText.setFont(new Font("Arial", Font.BOLD, 20));
        timeText.setFont(new Font("Arial", Font.BOLD, 20));

        top.add(scoreText);
        top.add(timeText);

        // Top panel window ke bilkul upar (NORTH) laga diya
        add(top, BorderLayout.NORTH);

        // ----- GRID BUTTONS -----
        // 3 rows aur 3 columns ka ek grid panel banaya buttons rakhne ke liye
        JPanel grid = new JPanel(new GridLayout(3, 3));

        // Loop chalakar 9 buttons bana rahe hain
        for (int i = 0; i < 9; i++) {

            btn[i] = new JButton("O"); // Start me sabhi buttons par "O" likha hoga

            btn[i].setFont(new Font("Arial", Font.BOLD, 30));

            //Jab user kisi button par click karega toh kya hoga
            btn[i].addActionListener(e -> {

                if (!running) return; // Agar game over ho gaya hai toh click par kuch nai hoga

                JButton b = (JButton) e.getSource(); // Jis specific button par click hua hai, usko pakdo

                // Agar us button par us time "X" tha (matlab correct target par click kiya)
                if (b.getText().equals("X")) {
                    score++; // Score 1 point badha do
                    scoreText.setText("Score: " + score); // Naya score screen par update kar do

                    b.setText("O"); // Wapas se usko "O" me badal do
                    b.setBackground(null); // Red color hata kar normal background kar do
                }
                
            });

            grid.add(btn[i]); // Button ko grid panel me daal diya
        }

        // Grid panel ko window ke beech (CENTER) me laga diya
        add(grid, BorderLayout.CENTER);

        
        // Threads start kar rahe hai (Taaki game timer aur target sath me chale)
        new Thread(this).start();   // Thread 1: Niche wala run() method chalayega jo "X" move karega
        startTimer();              // Thread 2: Countdown (30..29..28) wala method chalayega

        
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Window close(X) karne par program completely band ho jaye
        setVisible(true); // Program ki screen dikhane ke liye
    }

    // THREAD 1: MOVE X
    // Ye method lagatar chalta rahega jab tak running = true hai
    public void run() {

        Random r = new Random(); // Random position nikalne ke liye

        try {
            while (running) {

                int i = r.nextInt(9); // 0 se 8 ke beech me random button

                // Us random button par "X" dikha aur usko Red color ka kar do
                btn[i].setText("X");
                btn[i].setBackground(Color.RED);

                Thread.sleep(600); // 0.6 seconds tak target wahi rahega (Time change kar sakte ho speed ke liye)

                // 0.6 second baad agar game abhi bhi chal raha hai toh usko wapas "O" kar do
                if (running) {
                    btn[i].setText("O");
                    btn[i].setBackground(null);
                }
            }
        } catch (Exception e) {}
    }

    // THREAD 2: TIMER
    public void startTimer() {

        new Thread(() -> {
            try {

                // Jab tak time 0 nahi hota aur game chalu hai ye loop chalega
                while (time > 0 && running) {

                    Thread.sleep(1000); // 1 second (1000 milliseconds) ke liye pause lo
                    time--; // Time 1 second se kam kar do

                    timeText.setText("Time: " + time); // Naya time label par dikhao

                    // Aakhiri ke 10 seconds reh jayein toh timer ko Red color me dikhao warning ke liye
                    if (time <= 10) {
                        timeText.setForeground(Color.RED);
                    }
                }

                // Loop khatam hua matlab TIME OVER!
                running = false; // Game ko stop karne ke liye running flag false kar diya

                // Game over hone par sabhi buttons ka text "-" kar do aur background grey kar do
                for (JButton b : btn) {
                    b.setText("-");
                    b.setBackground(Color.LIGHT_GRAY);
                }

                // Screen par popup box (Message Dialog) dikhao final score ke sath
                JOptionPane.showMessageDialog(this,
                        "Game Over Try Again \nScore: " + score);

                System.exit(0); // App ko puri tarah se background se band kar do

            } catch (Exception e) {}
        }).start();
    }

    // Program ki starting point
    public static void main(String[] args) {
        new ReactionTimeTest(); // Game ka frame start kiya
    }
}