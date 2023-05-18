package hilos;

import javax.swing.JLabel;

public class Cronometro implements Runnable {
	private int id;
	private JLabel label;

	public Cronometro(int id, JLabel label) {
		this.id = id;
		this.label = label;
	}

	public void run() {
		for(int i=0; i<100000; i++) {
			try {
				if(id == 2) {
					Thread.sleep(500); 
				} else if(id == 3) {
					Thread.sleep(330); 
				} else {
					Thread.sleep(1000); 
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			label.setText(id + ": " + i);
		}
	}
}


