package Pages;

import Consts.Consts;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.io.IOException;

public class MainPage extends BasePage {

    private static final String
            LOGO_IMG = "//img[@itemprop = 'logo']",  //for 1 Test
            CONTACT_US_OPTIONS = "//a[text() = 'Contact us']",  //for 2 Test
            BY_LANGUAGE_PAGE_OPEN = "//a[text() = 'Books by language']",  //for 4 Test
            EBOOK_PAGE_OPEN = "//*[@class='site-nav__link site-nav__link--main']",//for 5 Test
            SPANISH_BOOK_PAGE_OPEN = "//a[text() = 'Español']", //for 6 Test
            FRENCH_BOOK_PAGE_OPEN = "//a[text() = 'Français']", //for 7 Test
            CHINESE_BOOK_PAGE_OPEN = "//a[text() = '中文']", //for 8 Test
            ALL_LANGUAGE_OPEN = "//a[text() = 'All Languages']", //for 9 Test
            RESOURCES_PAGE_OPEN = "//*[@aria-controls='SiteNavLabel-resources']", //for 10 Test
            FAQ_PAGE_OPEN = "//a[text()='FAQs']", //for 11 Test
            BLOG_PAGE_OPEN = "//*[@class='site-nav__link site-nav__link--main']", //for 12 Test
            BOOKS_DROP_DOWN = "//a[@aria-controls = 'SiteNavLabel-books-by-language']", //for 13 Test
            EBOOKS_DROP_DOWN = "//*[@aria-controls='SiteNavLabel-ebooks-by-language']", //for 14 Test
            ALL_LANGUAGES_DROP_DOWN = "//*[@aria-controls = 'SiteNavLabel-all-languages']", //for 15 Test
            SELECT_RUSSIAN_LANGUAGE = "//a[@aria-controls = 'SiteNavLabel-books-by-language']", //for 16 Test
            SELECT_UKRAINIAN_LANGUAGE = "//*[@aria-controls='SiteNavLabel-ebooks-by-language']", //for 17 Test
            SELECT_ITALIAN_LANGUAGE = "//*[@aria-controls = 'SiteNavLabel-all-languages']", //for 18 Test
            POPUP_ERROR = "//button[@id = '_form_44_submit']",
            CLICK_BUTTON_LOGIN = "//*[@class='site-header__account']",
            CLICK_FORGOT_PASSWORD = "//a[text() = 'Forgot your password?']",
            CLICK_CREATE_ACCOUNT = "//a[text() = 'Create account']",
            YOUR_CART_LOGO = "//*[@class='icon icon-cart']",
            BUTTON_CONTINUE_SHOPPING = "//a[text()='Continue shopping']",
            FLAG_ICON_BUTTON = "//*[@class='cbb-currency-flag']",
            DROPDOWN_ICON_BUTTON = "//*[@class='cbb-currency-updown-icon']";


    public void navigateToMainPage() {
        webDriver.get(Consts.MAIN_URL);
    }

    public boolean isLogoVisible() {
        Boolean isVisible = elementExist(LOGO_IMG);
        return isVisible;
    }




    public ContactUsPage openContactUsTab() {
        clickElementByXpath(CONTACT_US_OPTIONS);
        return new ContactUsPage();
    }

    public ByLanguage openByLanguagePage() {
        clickElementByXpath(BY_LANGUAGE_PAGE_OPEN);
        return new ByLanguage();
    }

    public EbookByLanguage openEbookByLanguage() {
        clickElementByXpath(EBOOK_PAGE_OPEN);
        return new EbookByLanguage();
    }


    public SpanishPage openSpanishPage() {
        clickElementByXpath(SPANISH_BOOK_PAGE_OPEN);
        return new SpanishPage();
    }

    public FrenchPage openFrenchPage() {
        clickElementByXpath(FRENCH_BOOK_PAGE_OPEN);
        return new FrenchPage();
    }

    public ChinesePage openChinesePage() {
        clickElementByXpath(CHINESE_BOOK_PAGE_OPEN);
        return new ChinesePage();
    }

    public AllLanguage openAllLanguagesBooksPage() {
        clickElementByXpath(ALL_LANGUAGE_OPEN);
        return new AllLanguage();
    }

    public Resources openResourcesPage() {
        clickElementByXpath(RESOURCES_PAGE_OPEN);
        return new Resources();
    }

    public FaqsPage openFAGsPage() {
        clickElementByXpath(FAQ_PAGE_OPEN);
        return new FaqsPage();
    }

    public BlogPage openBlogPage() {
        clickElementByXpath(BLOG_PAGE_OPEN);
        return new BlogPage();
    }

    public BooksDropdown clickBooksDropdownList() {
        clickElementByXpath(BOOKS_DROP_DOWN);
        wait.until((ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Czech - Čeština']"))));
        return new BooksDropdown();
    }

    public EbooksDropdown clickEbooksDropdownList() {
        clickElementByXpath(EBOOKS_DROP_DOWN);
        wait.until((ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Polish-Polski']"))));
        return new EbooksDropdown();
    }

    public AllLanguageDropdown clickAllLanguageDropdownList() {
        clickElementByXpath(ALL_LANGUAGES_DROP_DOWN);
        wait.until((ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Dutch - Nederlands']"))));
        return new AllLanguageDropdown();
    }

    public RussianLanguage OpenRussianLanguage() {
        clickElementByXpath(SELECT_RUSSIAN_LANGUAGE);
        wait.until((ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text() = 'Russian - Русский']"))));
        return new RussianLanguage();
    }

    public UkrainianEbooksLanguage OpenUkrainianEbooksLanguage() {
        clickElementByXpath(SELECT_UKRAINIAN_LANGUAGE);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text() = 'Ukrainian- Українська']")));
        return new UkrainianEbooksLanguage();
    }

    public AllLanguageItalianLanguage OpenAllBooksItalianLanguage() {
        clickElementByXpath(SELECT_ITALIAN_LANGUAGE);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text() = 'Italian - Italiano'] ")));
        return new AllLanguageItalianLanguage();
    }

    public ContactUsPage contactUsPage() {
        clickElementByXpath(POPUP_ERROR);
        wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//button[@id = '_form_44_submit']"))));
        return new ContactUsPage();
    }

    public LoginPage loginButtonClick() {
        clickElementByXpath(CLICK_BUTTON_LOGIN);
        return new LoginPage();
    }

    public LoginPage forgotPasswordClick() {
        clickElementByXpath(CLICK_FORGOT_PASSWORD);
        return new LoginPage();
    }

    public LoginPage createAccountClick() {
        clickElementByXpath(CLICK_CREATE_ACCOUNT);
        return new LoginPage();
    }

    public YouCart cartLogoClick() {
        clickElementByXpath(YOUR_CART_LOGO);
        return new YouCart();
    }

    public YouCart continueClick() {
        clickElementByXpath(BUTTON_CONTINUE_SHOPPING);
        return new YouCart();
    }

    public FlagIcon iconClick() {
        clickElementByXpath(FLAG_ICON_BUTTON);
        return new FlagIcon();
    }

    public CurrencyUpDownIcon upDownClick() {
        clickElementByXpath(DROPDOWN_ICON_BUTTON);
        return new CurrencyUpDownIcon();
    }

}
