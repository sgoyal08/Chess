import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
public class ChessGameViewer extends JFrame {
    private static final int WINDOW_WIDTH = 800, WINDOW_HEIGHT = 800;

    public ChessGameViewer()
    {

        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }
    public void paint (Graphics g)
    {
        g.setColor(Color.white);
        g.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
        drawBoard(g);

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
                    g.setColor(Color.WHITE);
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
        g.setColor(Color.RED);
        g.drawLine(50, 50, 754, 50);
        g.drawLine(754,50, 754, 754);
        g.drawLine(754, 754, 50, 754);
        g.drawLine(50, 754, 50, 50);
    }

}
