package io.design_pattern.mtk.factory_method.factory;

import io.design_pattern.mtk.factory_method.button.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}
