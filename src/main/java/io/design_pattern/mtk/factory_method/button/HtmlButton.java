package io.design_pattern.mtk.factory_method.button;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button> Click </button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
