import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import figures.Rect;

public class ReleaseListener extends MouseAdapter implements MouseListener {
	
	private RectPanel panel;

    public ReleaseListener(RectPanel panel){
        super();
        this.panel = panel;
        
    }    
    
    public void mouseReleased(MouseEvent e) {
        panel.addRect(new Rect(e.getX(), e.getY(), 24, 24));
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
