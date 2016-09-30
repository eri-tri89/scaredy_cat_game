package se.erikperez.scaredycat.gui.controller;

import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class StartMenuController {

	@FXML
	private Button playBtn;

	@FXML
	private Button scoreBtn;

	@FXML
	private Button howToBtn;

	@FXML
	private AnchorPane displayPane;

	public AnchorPane instructionsPane, registerPane, ScorePane;
	private FadeTransition ft;

	@FXML
	public void initialize() {
		try {
			ft = new FadeTransition(Duration.millis(1000));
			instructionsPane = FXMLLoader
					.load(getClass().getClassLoader().getResource("gui/start/InstructionsPanel.fxml"));
			registerPane = FXMLLoader.load(getClass().getClassLoader().getResource("gui/start/RegisterPanel.fxml"));
			ScorePane = FXMLLoader.load(getClass().getClassLoader().getResource("gui/start/ScorePanel.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void fadeInAnimation(Node node) {
		ft.setNode(node);
		ft.setFromValue(-1.0);
		ft.setToValue(1.0);
		ft.setCycleCount(1);
		ft.play();
	}

	private void addNodeToDisplayPane(Node node) {
		ObservableList<Node> children = displayPane.getChildren();
		if (!children.isEmpty()) {
			children.clear();
			fadeInAnimation(node);
			children.add(node);
		} else {
			fadeInAnimation(node);
			children.add(node);
		}
	}

	public void setRegisterView() {
		this.addNodeToDisplayPane(registerPane);
	}

	public void setScoreView() {
		this.addNodeToDisplayPane(ScorePane);
	}

	public void setInstructionsView() {
		this.addNodeToDisplayPane(instructionsPane);
	}
}
