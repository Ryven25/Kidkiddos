package Pages;

public class FaqsPage extends BasePage{
    public static final String FAQ = "//h1[text() = 'FAQ/addition info']";
    public boolean isFaqsOpen(){
        return elementExist(FAQ);
    }
}
