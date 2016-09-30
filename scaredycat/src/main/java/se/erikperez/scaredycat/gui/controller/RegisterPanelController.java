package se.erikperez.scaredycat.gui.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RegisterPanelController {

	@FXML
	private Button startGameBtn;

	@FXML
	private TextField registerField;

	@FXML
	public void initialize() {

	}

	private Stage showNewStage(String fxmlUrl, int width, int height) {
		Stage stage = new Stage();
		try {
			AnchorPane gameRoot = FXMLLoader.load(getClass().getClassLoader().getResource(fxmlUrl));
			Scene gameScene = new Scene(gameRoot, width, height);
			stage.setScene(gameScene);
			stage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return stage;
	}

	public void startGame() {
		startGameBtn.getScene().getWindow().hide();

		Stage gameStage = showNewStage("gui/game/GameBoard.fxml", 1000, 600);
		gameStage.setOnCloseRequest(ev -> {
			showNewStage("gui/Main.fxml", 600, 400);

		});
	}
}
