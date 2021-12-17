package Pages;

public class FrenchPage extends BasePage{
    public static final String FRENCH = "//h1[text()='French - Français']";

public boolean isFrenchPageOpen(){
    return elementExist(FRENCH);
}
}
