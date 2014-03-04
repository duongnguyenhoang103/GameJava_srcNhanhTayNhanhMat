package views;

/*
 * Created by JFormDesigner on Sat Jul 20 21:19:03 ICT 2013
 */

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import controllers.Controller;
import controllers.ControllerInterface;

/**
 * @author Thanh Nguyen
 */
public class View extends JFrame {
	private ControllerInterface controller;
	private java.util.List<JButton> buttons = new ArrayList<JButton>();

	public View(Controller controller) {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.controller = controller;
		initComponents();
	}

	private void menuItemNewGameActionPerformed(ActionEvent e) {
		// TODO add your code here
		System.out.println("new game");
		this.buttons = new ArrayList<JButton>();
		this.panelBoardGame.removeAll();
		this.controller.newGame();
	}

	private void menuItemCheatActionPerformed(ActionEvent e) {
		// TODO add your code here
		if (this.synch) {
			this.synch = false;
			this.controller.cheatGame();
		}
	}

	boolean synch = true;

	private void menuItemAutoplayActionPerformed(ActionEvent e) {
		// TODO add your code here

		this.controller.autoGame();
	}

	private void menuItemExitActionPerformed(ActionEvent e) {
		// TODO add your code here
		System.exit(-1);
	}

	private void menuItemAboutActionPerformed(ActionEvent e) {
		// TODO add your code here
		JOptionPane.showMessageDialog(null,
				"Author: thanhnguyenhoang271188@gmail.com\nWebsite:JavaIz.com");
	}

	private void menuItemEasyActionPerformed(ActionEvent e) {
		// TODO add your code here
		this.panelBoardGame.removeAll();
		this.panelBoardGame.validate();
		this.panelBoardGame.repaint();
		this.controller.setLevel(5);
	}

	private void menuItemMediumActionPerformed(ActionEvent e) {
		// TODO add your code here
		this.panelBoardGame.removeAll();
		this.panelBoardGame.validate();
		this.panelBoardGame.repaint();
		this.controller.setLevel(7);
	}

	private void menuItemHardActionPerformed(ActionEvent e) {
		// TODO add your code here
		this.panelBoardGame.removeAll();
		this.panelBoardGame.validate();
		this.panelBoardGame.repaint();
		this.controller.setLevel(10);
	}

	private void menuItemPauseActionPerformed(ActionEvent e) {
		// TODO add your code here
		this.controller.pause();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY
		// //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Thanh Nguyen
		menuBar1 = new JMenuBar();
		menu1 = new JMenu();
		menuItemNewGame = new JMenuItem();
		menu3 = new JMenu();
		menuItemEasy = new JMenuItem();
		menuItemMedium = new JMenuItem();
		menuItemHard = new JMenuItem();
		menuItemPause = new JMenuItem();
		menuItemCheat = new JMenuItem();
		menuItemAutoplay = new JMenuItem();
		menuItemExit = new JMenuItem();
		menu2 = new JMenu();
		menuItemAbout = new JMenuItem();
		panelBoardGame = new JPanel();
		status = new JLabel();

		//======== this ========
		setTitle("Nhanh tay l\u1eb9 m\u1eaft");
		setIconImage(new ImageIcon(getClass().getResource("/views/images/Eye.png")).getImage());
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//======== menuBar1 ========
		{

			//======== menu1 ========
			{
				menu1.setText("Game");

				//---- menuItemNewGame ----
				menuItemNewGame.setText("New Game");
				menuItemNewGame.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
				menuItemNewGame.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						menuItemNewGameActionPerformed(e);
					}
				});
				menu1.add(menuItemNewGame);

				//======== menu3 ========
				{
					menu3.setText("Level");

					//---- menuItemEasy ----
					menuItemEasy.setText("Easy");
					menuItemEasy.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							menuItemEasyActionPerformed(e);
						}
					});
					menu3.add(menuItemEasy);

					//---- menuItemMedium ----
					menuItemMedium.setText("Medium");
					menuItemMedium.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							menuItemMediumActionPerformed(e);
						}
					});
					menu3.add(menuItemMedium);

					//---- menuItemHard ----
					menuItemHard.setText("Hard");
					menuItemHard.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							menuItemHardActionPerformed(e);
						}
					});
					menu3.add(menuItemHard);
				}
				menu1.add(menu3);

				//---- menuItemPause ----
				menuItemPause.setText("Pause");
				menuItemPause.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_MASK));
				menuItemPause.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						menuItemPauseActionPerformed(e);
					}
				});
				menu1.add(menuItemPause);

				//---- menuItemCheat ----
				menuItemCheat.setText("Cheat");
				menuItemCheat.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, 0));
				menuItemCheat.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						menuItemCheatActionPerformed(e);
					}
				});
				menu1.add(menuItemCheat);

				//---- menuItemAutoplay ----
				menuItemAutoplay.setText("Autoplay");
				menuItemAutoplay.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, 0));
				menuItemAutoplay.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						menuItemAutoplayActionPerformed(e);
					}
				});
				menu1.add(menuItemAutoplay);
				menu1.addSeparator();
				menu1.addSeparator();

				//---- menuItemExit ----
				menuItemExit.setText("Exit");
				menuItemExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_MASK));
				menuItemExit.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						menuItemExitActionPerformed(e);
					}
				});
				menu1.add(menuItemExit);
			}
			menuBar1.add(menu1);

			//======== menu2 ========
			{
				menu2.setText("Help");

				//---- menuItemAbout ----
				menuItemAbout.setText("About");
				menuItemAbout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, KeyEvent.CTRL_MASK));
				menuItemAbout.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						menuItemAboutActionPerformed(e);
						menuItemAboutActionPerformed(e);
					}
				});
				menu2.add(menuItemAbout);
			}
			menuBar1.add(menu2);
		}
		setJMenuBar(menuBar1);

		//======== panelBoardGame ========
		{
			panelBoardGame.setBackground(Color.white);

			// JFormDesigner evaluation mark
			panelBoardGame.setBorder(new javax.swing.border.CompoundBorder(
				new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
					"JavaIz.com tutorial game", javax.swing.border.TitledBorder.CENTER,
					javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
					java.awt.Color.red), panelBoardGame.getBorder())); panelBoardGame.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

			panelBoardGame.setLayout(new GridLayout(10, 10));
		}
		contentPane.add(panelBoardGame, BorderLayout.CENTER);

		//---- status ----
		status.setText("Time: 00:00:00");
		contentPane.add(status, BorderLayout.SOUTH);
		pack();
		setLocationRelativeTo(getOwner());
		// //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY
	// //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Thanh Nguyen
	private JMenuBar menuBar1;
	private JMenu menu1;
	private JMenuItem menuItemNewGame;
	private JMenu menu3;
	private JMenuItem menuItemEasy;
	private JMenuItem menuItemMedium;
	private JMenuItem menuItemHard;
	private JMenuItem menuItemPause;
	private JMenuItem menuItemCheat;
	private JMenuItem menuItemAutoplay;
	private JMenuItem menuItemExit;
	private JMenu menu2;
	private JMenuItem menuItemAbout;
	private JPanel panelBoardGame;
	private JLabel status;
	// JFormDesigner - End of variables declaration //GEN-END:variables

	public void setNewGame(List<Integer> solutionList, int level) {
		// TODO Auto-generated method stub
		panelBoardGame.setLayout(new GridLayout(level, level));
		if (this.time != null) {
			this.time.stop();
		}
		for (int i : solutionList) {
			JButton button = new JButton(i + "");
			button.setForeground(Color.BLUE);
			button.setBackground(Color.BLUE);
			this.buttons.add(button);
			button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					controller.clickButton(((JButton) arg0.getSource())
							.getText());
				}
			});
			this.panelBoardGame.add(button);
		}
		this.panelBoardGame.validate();
	}

	public void startGame() {
		// TODO Auto-generated method stub
		this.menuItemEasy.setEnabled(false);
		this.menuItemMedium.setEnabled(false);
		this.menuItemHard.setEnabled(false);
		for (JButton button : this.buttons) {
			button.setBackground(null);
			button.setForeground(Color.BLACK);
		}
		this.second = 0;
		this.minute = 0;
		this.hours = 0;
		startTimer(this.second, this.minute, this.hours);

		// De chay dk can
		time.start();
	}

	private void startTimer(int second2, int minute2, int hours2) {
		// TODO Auto-generated method stub
		time = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String hour = "";
				String min = "";
				String sec = "";

				if (second < 10) {
					sec = "0" + second;
				} else {
					sec = "" + second;
				}

				if (minute < 10) {
					min = "0" + minute;
				} else {
					min = "" + minute;
				}
				if (hours < 10) {
					hour = "0" + hours;
				} else {
					hour = "" + hours;
				}

				if (second == 59) {
					second = 0;
					minute++;
				} else {
					second++;
				}

				if (minute == 59) {
					minute = 0;
					second = 0;
					hours++;
				}

				status.setText("Time: " + hour + ":" + min + ":" + sec);
			}
		});
	}

	int second = 0;
	int minute = 0;
	int hours = 0;
	Timer time = null;

	public void setButtonViewTrue(int indexOf) {
		// TODO Auto-generated method stub
		System.out.println("set index");

		this.buttons.get(indexOf).setBackground(Color.GREEN);
		this.synch = true;
	}

	public void setYouWin() {
		// TODO Auto-generated method stub
		this.time.stop();
		JOptionPane.showMessageDialog(null, "Configuration!\nYou win game in "
				+ this.status.getText());
		this.menuItemEasy.setEnabled(true);
		this.menuItemMedium.setEnabled(true);
		this.menuItemHard.setEnabled(true);
		this.synch = true;
	}

	public void setPlayContinue() {
		// TODO Auto-generated method stub
		for (JButton button : this.buttons) {
			if (button.getBackground() == Color.BLUE) {
				button.setBackground(null);
				button.setForeground(Color.BLACK);
			}
		}
		startTimer(this.second, this.minute, this.hours);
		time.start();
	}

	public void setPause() {
		this.time.stop();
		// TODO Auto-generated method stub
		for (JButton button : this.buttons) {
			if (button.getBackground() != Color.GREEN) {
				button.setBackground(Color.BLUE);
				button.setForeground(Color.BLUE);
			}
		}
	}
}
