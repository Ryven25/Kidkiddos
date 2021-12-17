package Pages;

public class SpanishPage extends BasePage {
    public static final String SPANISH = "//h1[text()='Spanish - Español']";


    public boolean isSpanishPageOpen() {
        return elementExist(SPANISH);
    }
}
