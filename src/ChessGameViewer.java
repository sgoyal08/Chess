import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
public class ChessGameViewer extends JFrame {
    private static final int WINDOW_WIDTH = 800, WINDOW_HEIGHT = 800;
    private Image BBishop;
    private Image BPawn;
    private Image BKnight;
    private Image BKing;
    private Image BQueen;
    private Image BRook;
    private Image WBishop;
    private Image WPawn;
    private Image WKnight;
    private Image WKing;
    private Image WQueen;
    private Image WRook;

    public ChessGameViewer()
    {

        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);


        BBishop = new ImageIcon("Resources/BBishop.png").getImage();
        BPawn = new ImageIcon("Resources/BPawn.png").getImage();
        BKnight = new ImageIcon("Resources/BKnight").getImage();
        BKing = new ImageIcon("Resources/BKing.png").getImage();
        BQueen = new ImageIcon("Resources/BQueen.png").getImage();
        BRook = new ImageIcon("Resources/BRook.png").getImage();
        WBishop = new ImageIcon("Resources/WBishop.png").getImage();
        WPawn = new ImageIcon("Resources/WPawn.png").getImage();
        WKnight = new ImageIcon("Resources/WKnight.png").getImage();
        WKing = new ImageIcon("Resources/WKing.png").getImage();
        WQueen = new ImageIcon("Resources/WQueen.png").getImage();
        WRook = new ImageIcon("Resources/WRook.png").getImage();
    }
    public void paint (Graphics g)
    {
        g.setColor(Color.white);
        g.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
        drawBoard(g);
        drawPieces(g);

    }
    public void updateBoard()
    {

    }
    public void displayMessage(String message)
    {

    }
    public void drawBoard(Graphics g)
    {
        int iCount = 0;
        int jCount = 0;
        boolean white = true;
        g.setColor(Color.black);
        for (int i = 50; i < WINDOW_WIDTH ; i+=88)
        {
            jCount = 0;
            for (int j = 50; j < WINDOW_HEIGHT ; j+=88)
            {
                g.setColor(Color.black);
                if (white == true)
                {
                    g.setColor(Color.white);
                }
                g.fillRect(i, j, 88, 88);
                white = !white;
                if (jCount >= 7) {
                    break;
                }
                jCount++;
            }
            white = !white;
            if (iCount >= 7) {
                break;
            }
            iCount++;
        }
        // Draws red border around board.
        g.setColor(Color.RED);
        g.drawLine(50, 50, 754, 50);
        g.drawLine(754,50, 754, 754);
        g.drawLine(754, 754, 50, 754);
        g.drawLine(50, 754, 50, 50);


    }
    public void drawPieces(Graphics g)
    {
        for (int r = 50; r < WINDOW_HEIGHT; r+= 88)
        {
            for (int c = 50; c < WINDOW_WIDTH; c+=88)
            {
                if (c == 138)
                {
                    g.drawImage(BPawn, r, c, this);
                }
                if (c == 578)
                {
                    g.drawImage(WPawn, r, c, this);
                }
                // whatever the specific coordinate is, honestly u should figure out how to make these numbers nicer// )

            }
        }
    }
}


