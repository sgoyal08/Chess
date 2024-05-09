public class ChessMain {
   private ChessGameViewer window;
    public ChessMain()
    {
        window = new ChessGameViewer();
    }
    public static void main(String[] args) {
        ChessGameViewer c = new ChessGameViewer();
        c.repaint();
    }
}
