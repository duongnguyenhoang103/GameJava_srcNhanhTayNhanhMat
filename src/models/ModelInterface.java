package models;

import views.View;

public interface ModelInterface {

	void setView(View view);

	void newGame();

	void clickButton(String number);

	void setLevel(int level);

	void pause();

	void cheatGame();

	void autoGame();
	
}
