package controllers;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.UIManager;

import views.View;
import models.Model;
import models.ModelInterface;

public class Controller implements ControllerInterface {
	private ModelInterface models;
	private View view;

	public Controller(ModelInterface models) {
		this.models = models;
		String plaf = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
		try {
			UIManager.setLookAndFeel(plaf);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		if (this.view == null) {
			this.view = new View(this);
		}
		this.view.setSize(1000, 700);
		this.view.repaint();
		this.models.setView(view);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		view.setLocation(dim.width/2-view.getSize().width/2, dim.height/2-view.getSize().height/2);
		this.view.setVisible(true);
	}

	public static void main(String[] args) {
		ModelInterface models = new Model();
		ControllerInterface controller = new Controller(models);
	}

	@Override
	public void newGame() {
		// TODO Auto-generated method stub
		this.models.newGame();
	}

	@Override
	public void clickButton(String number) {
		// TODO Auto-generated method stub
		this.models.clickButton(number);
	}

	@Override
	public void setLevel(int level) {
		// TODO Auto-generated method stub
		this.models.setLevel(level);
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		this.models.pause();
	}

	@Override
	public void cheatGame() {
		// TODO Auto-generated method stub
		this.models.cheatGame();
	}

	@Override
	public void autoGame() {
		// TODO Auto-generated method stub
		this.models.autoGame();
	}
}
