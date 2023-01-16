package io.design_pattern.mtk.factory_method.factory;

import io.design_pattern.mtk.factory_method.button.Button;
import io.design_pattern.mtk.factory_method.button.WindowsButton;

public class WindowsFactory extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
