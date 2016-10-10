package se.erikperez.scaredycat.gui.animation;

import javafx.animation.FadeTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class AnimationGenerator {

	public static void doFadeAnimation(Node node) {
		FadeTransition ft = new FadeTransition(Duration.millis(1000));
		ft.setNode(node);
		ft.setFromValue(-1.0);
		ft.setToValue(1.0);
		ft.setCycleCount(1);
		ft.play();
	}
}
