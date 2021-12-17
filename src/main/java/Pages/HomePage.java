package Pages;

public class HomePage extends  BasePage{
    public static  final String HOME_PAGE = "//a[test() = 'Home']";

    public boolean isHomePageVisible() {
        return elementExist(HOME_PAGE);
    }
}
