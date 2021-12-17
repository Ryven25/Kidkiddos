package Pages;

public class Resources extends BasePage {
    public static final String RESOURCES_PAGE = "//div[@class='site-nav__dropdown']";

    public boolean isResourcesPage() {
        return elementExist(RESOURCES_PAGE);
    }
}
