package models;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import views.View;

public class Model implements ModelInterface {
	private View view;
	private int level = 10;
	private boolean isStart = false;
	private boolean pause = false;
	private boolean winGame = false;
	private int inGame = -1;
	private List<Integer> listValue = new ArrayList<Integer>();

	@Override
	public void setView(View view) {
		// TODO Auto-generated method stub
		this.view = view;
	}

	@Override
	public void newGame() {
		// TODO Auto-generated method stub
		this.isStart = false;
		this.winGame = false;
		this.pause = false;
		this.inGame = -1;
		this.listValue = new ArrayList<Integer>();
		List<Integer> solutionList = new ArrayList<Integer>();
		for (int i = 0; i < this.level * this.level; i++) {
			solutionList.add(i + 1);
		}

		Collections.shuffle(solutionList);
		this.listValue = solutionList;
		this.view.setNewGame(solutionList, this.level);
	}

	@Override
	public void clickButton(String number) {
		// TODO Auto-generated method stub
		if (this.isStart) {
			// vao choi game
			if ((!this.winGame)) {
				if (Integer.parseInt(number) == this.inGame) {
					this.view.setButtonViewTrue(this.listValue
							.indexOf(this.inGame));
					if (this.inGame == (this.level * this.level)) {
						this.view.setYouWin();
						this.winGame = true;
					} else {
						this.inGame++;
					}
				} else {
					Toolkit.getDefaultToolkit().beep();
				}
			} else {
				this.view.setYouWin();
			}
		} else {
			this.isStart = true;
			this.winGame = false;
			this.view.startGame();
			this.inGame = 1;
		}
	}

	@Override
	public void setLevel(int level) {
		// TODO Auto-generated method stub
		this.level = level;
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		if (this.pause) {// pause = true tuc la dang pause, se cho nguoi ta play
			this.pause = false;
			this.view.setPlayContinue();
		} else {
			this.view.setPause();
			this.pause = true;
		}
	}

	@Override
	public void cheatGame() {
		// TODO Auto-generated method stub
		if (this.isStart) {
			if (!this.winGame) {
				this.view
						.setButtonViewTrue(this.listValue.indexOf(this.inGame));
				if (this.inGame == (this.level * this.level)) {
					this.view.setYouWin();
					this.winGame = true;
					this.inGame = -1;
				} else {
					this.inGame++;
				}
			}
		}
	}

	@Override
	public void autoGame() {
		// TODO Auto-generated method stub
		if (this.isStart) {
			if (!this.winGame) {
				for (int i = inGame; i < (this.level * this.level) + 1; i++) {
					this.cheatGame();
				}
				this.winGame = true;
			}
		}
	}
}
