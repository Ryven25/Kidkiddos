package Pages;

public class BlogPage extends BasePage {
    public static final String BLOG_PAGE = "//div[@id='PageContainer']";

    public boolean isBlogPage() {
        return elementExist(BLOG_PAGE);
    }
}
