package Pages;

public class ChinesePage extends BasePage {
    public static final String CHINESE = "//h1[text()='Mandarin Chinese - 中文']";

    public boolean isChinesePageOpen() {
        return elementExist(CHINESE);
    }
}
