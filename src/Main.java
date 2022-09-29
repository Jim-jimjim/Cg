import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
        mainWindow.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        mainWindow.setSize(1280, 720);
        mainWindow.setVisible(true);
//        mainWindow.addMouseListener(new java.awt.event.MouseAdapter() {
//            @Override
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                System.out.println((int) mainWindow.getMousePosition().getX() + ", " + (int) (mainWindow.getMousePosition().getY() - 30));
//            }
//        });
    }
}