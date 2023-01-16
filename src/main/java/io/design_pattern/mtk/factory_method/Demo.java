package io.design_pattern.mtk.factory_method;

import io.design_pattern.mtk.factory_method.factory.Dialog;
import io.design_pattern.mtk.factory_method.factory.HtmlFactory;
import io.design_pattern.mtk.factory_method.factory.WindowsFactory;

public class Demo {
    private static Dialog dialog;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsFactory();
        } else {
            dialog = new HtmlFactory();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
