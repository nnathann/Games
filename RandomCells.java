import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;


public class RandomCells {

    public static void main(String[] args) {
        new RandomCells();
    }

    public RandomCells() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                JFrame frame = new JFrame("Battleships!");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new TestPane());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public class TestPane extends JPanel {
        private boolean selected;
        public TestPane() {
            setLayout(new GridLayout(5, 5, 0, 0));
            Color[] colors = new Color[]{Color.WHITE, Color.BLACK, Color.RED};
            for (int col = 0; col < 5; col++) {
                for (int row = 0; row < 5; row++) {
                    JPanel cell = new JPanel() {
                        @Override
                        public Dimension getPreferredSize() {
                            return new Dimension(100, 100);
                        }
                    };
                    cell.addMouseListener(new MouseAdapter(){
                        // @Override
                        // public void mouseClicked(MouseEvent e) {
                        // toggleSelection();
                        // }
                        @Override
                        public void mousePressed(MouseEvent e){
                            System.out.println(e.getX() + "," + e.getY());
                            cell.setBackground(colors[2]);
                        }
                    });
                    cell.setBackground(colors[(row + col) % 2]);
                    add(cell);
                }
            }
        }


        // public void setSelected(boolean selected){
        //     this.selected = selected;
        //     if (selected) {
        //         setBackground(Color.BLUE);
        //         setBorder(new LineBorder(Color.black));
        //     } else {
        //         setBackground(null);
        //         setBorder(new LineBorder(Color.DARK_GRAY));
        //     }
        //     repaint();
        // }

        // public void toggleSelection() {
        //     setSelected(!isSelected());
        // }

        // public boolean isSelected(){
        //     return selected;
        // }

    }

    public void mousePressed(MouseEvent e) {
    }

    // @Override
    // public void mouseClicked(MouseEvent e){
    //     int x=e.getX();
    //     int y=e.getY();
    //     System.out.println(x + ","+y);
    // }

}
