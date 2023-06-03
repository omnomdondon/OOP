package LabActivity2;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class JavaTimer2 extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Timer timer;
    private long startTime = -1;
    private long duration = 300000;

    private JLabel label;
    private JLabel label2;
    
    public JavaTimer2() {
        setLayout(new GridBagLayout());
        timer = new Timer(10, new ActionListener() {
        	
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	
                if (startTime < 0) {
                    startTime = System.currentTimeMillis();
                }
                
                long now = System.currentTimeMillis();
                long clockTime = now - startTime;
                if (clockTime >= duration) {
                    clockTime = duration;
                    timer.stop();
                    label2 = new JLabel(" - You are terminated! System Failure");
                    add(label2);
                }
                
                SimpleDateFormat df = new SimpleDateFormat("mm:ss:SSS");
                label.setText("Timer Countdown : " + df.format(duration - clockTime));

            }

        });
        timer.setInitialDelay(0);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (!timer.isRunning()) {
                    startTime = -1;
                    timer.start();
                }
            }
        });
        label = new JLabel("Click Anywhere to Start!");
        add(label);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 100);
    }

}
