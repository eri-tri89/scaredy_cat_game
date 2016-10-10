package se.erikperez.scaredycat.gui.controller;

import java.io.IOException;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import se.erikperez.scaredycat.gui.animation.AnimationGenerator;

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

	@FXML
	public void initialize() {
		try {
			instructionsPane = FXMLLoader
					.load(getClass().getClassLoader().getResource("gui/start/InstructionsPanel.fxml"));
			registerPane = FXMLLoader.load(getClass().getClassLoader().getResource("gui/start/RegisterPanel.fxml"));
			ScorePane = FXMLLoader.load(getClass().getClassLoader().getResource("gui/start/ScorePanel.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void addNodeToDisplayPane(Node node) {
		ObservableList<Node> children = displayPane.getChildren();
		if (!children.isEmpty()) {
			children.clear();
			AnimationGenerator.doFadeAnimation(node);
			children.add(node);
		} else {
			AnimationGenerator.doFadeAnimation(node);
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
