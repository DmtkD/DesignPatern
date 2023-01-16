package io.design_pattern.mtk.factory_method.factory;

import io.design_pattern.mtk.factory_method.button.Button;
import io.design_pattern.mtk.factory_method.button.HtmlButton;

public class HtmlFactory extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
