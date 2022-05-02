import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//
//import Panels.EllipsePanel;
//import Panels.RectPanel;

import java.util.ArrayList;
import java.util.Random;

import figures.*;
//import listeners.ClickListener;
//import listeners.ReleaseListener;
//import listeners.ReleaseListenerEllipse;


class GraphicsEditor {
    public static void main (String[] args) {
        ListFrame frame = new ListFrame();
        frame.setVisible(true);
    }
}

class ListFrame extends JFrame {
    private static final long serialVersionUID = 1L;
	ArrayList<Figure> figs = new ArrayList<Figure>();
    Random rand = new Random();
    String figuraSelecionada;
    ListFrame () {
    	RectPanel panel = new RectPanel();
    	this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.addKeyListener (
            new KeyAdapter() {
                public void keyPressed (KeyEvent e) {
                    
                    if (e.getKeyChar() == 'r') {
                        figuraSelecionada = "rect";
                    }

                    if (e.getKeyChar() == 'e') {
                        figuraSelecionada = "ellipse";
                    }

                    if (figuraSelecionada == "rect") {
                        
                        setContentPane(panel);
                        panel.setSize(350, 350);
                        panel.addMouseListener(new ReleaseListener(panel, null));
                    }

                    if (figuraSelecionada == "ellipse") {
                        
                        setContentPane(panel);
                        panel.setSize(350, 350);
//                        panel.addMouseListener(new ReleaseListener(ePanel));
                    }
                }
            }
        );
        
        this.setTitle("Graphics");
        this.setSize(350, 350);

    }

    public void paint (Graphics g) {
        super.paint(g);
        for (Figure fig: this.figs) {
            fig.paint(g);
        }
    }
}