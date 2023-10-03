package com.example.demo.animations;

import javafx.animation.TranslateTransition;
import javafx.util.Duration;
import org.w3c.dom.Node;

public class Shake {
    private TranslateTransition tt;

    public Shake(Node node) {
        tt = new TranslateTransition(Duration.millis(70), (javafx.scene.Node) node);
        tt.setFromX(0f);
        tt.setByX(10f);
        tt.setCycleCount(3);
        tt.setAutoReverse(true);
    }

    public void playAnim() {
        tt.playFromStart();
    }
}
