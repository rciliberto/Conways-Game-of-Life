package frame;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import elements.Cell;
import elements.CellGrid;

@SuppressWarnings("serial")
public class GameFrame extends JFrame {
	final int GRID_WIDTH;
	final int GRID_HEIGHT;
	CellGrid grid;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				GameFrame frame=new GameFrame();
				frame.setVisible(true);
			}
		});
	}
	
	public GameFrame() {
		GRID_WIDTH=100;
		GRID_HEIGHT=100;
		
		createAndShowGUI();
	}
	
	private void createAndShowGUI() {
		/* Create and set up the window */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Conway's Game of Life");
		setLayout(new GridLayout(GRID_WIDTH, GRID_HEIGHT));
		setResizable(true);
		
		//Create MenuBar
		JMenuBar menuBar=new JMenuBar();
			//"File" menu
			JMenu fileMenu=new JMenu("Run");
				JMenuItem runButton=new JMenuItem();
				fileMenu.add(runButton);
			menuBar.add(fileMenu);
		setJMenuBar(menuBar);
		
		//Create Grid
		grid=new CellGrid(this, GRID_WIDTH, GRID_HEIGHT);
		
		
		//Display the window
		pack();
		setVisible(true);
	}
}
