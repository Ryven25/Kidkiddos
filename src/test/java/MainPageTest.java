import Pages.*;
import Utilis.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class MainPageTest extends UseCaseBase {

    private static MainPage mainPage;
    public static final Logger Logger = LogManager.getLogger(MainPageTest.class);


    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
    }


    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }


    @Test  // 1 Test
    public void mainPageLoadTest() {
        Logger.info("Main page load test");
        Boolean success = mainPage.isLogoVisible();
        mainPage.takeScreenshot("MainPageTest");
        assertTrue(success);
    }


    @Test     // 2 Test
    public void openContactUsPage() {
        ContactUsPage contactUsPage = mainPage.openContactUsTab();
        boolean isLoaded = contactUsPage.isPageTitleVisible();
        assertTrue(isLoaded);
    }

    @Test     // 3 Test
    public void openHomePageTest() {
    }


    //4 Test
    @Test
    public void openByLanguagePage() {
        ByLanguage byLanguage = mainPage.openByLanguagePage();
        boolean isOpenByLanguage = byLanguage.isPageBooksByLanguageOpen();
        assertTrue(isOpenByLanguage);

    }

    //    //5 Test
    @Test
    public void openEbookByLanguagePage() {
        EbookByLanguage ebookByLanguage = mainPage.openEbookByLanguage();
        boolean isOpenEbookLanguage = ebookByLanguage.isEbooksPageOpen();
        assertTrue(isOpenEbookLanguage);
    }

    //6 Test
    @Test
    public void openSpanishPage() {
        SpanishPage spanishPage = mainPage.openSpanishPage();
        boolean isOpenSpanishPage = spanishPage.isSpanishPageOpen();
        assertTrue(isOpenSpanishPage);
    }

    //7 Test
    @Test
    public void openFrenchPage() {
        FrenchPage frenchPage = mainPage.openFrenchPage();
        boolean isOpenFrenchPage = frenchPage.isFrenchPageOpen();
        assertTrue(isOpenFrenchPage);
    }


    //8 Test
    @Test
    public void openChinesePage() {
        ChinesePage chinesePage = mainPage.openChinesePage();
        boolean isOpenChinesePage = chinesePage.isChinesePageOpen();
        assertTrue(isOpenChinesePage);
    }

//for 9 Test

    @Test
    public void openAllLanguage() {
        AllLanguage allLanguage = mainPage.openAllLanguagesBooksPage();
        boolean isAllLanguagePageOpen = allLanguage.isAllLanguagePage();
        assertTrue(isAllLanguagePageOpen);
    }

    //10 Test

    @Test
    public void openResources() {
        Resources resources = mainPage.openResourcesPage();
        boolean isResourcesPageOpen = resources.isResourcesPage();
        assertTrue(isResourcesPageOpen);
    }

    //11 Test
    @Test
    public void openFaq() {
        FaqsPage faqsPage = mainPage. openFAGsPage();
        boolean isFaqPageOpen = faqsPage.isFaqsOpen();
        assertTrue(isFaqPageOpen);
    }

    //12 Test
    @Test
    public void openBlog() {
        BlogPage blogPage = mainPage.openBlogPage();
        boolean isBlogPageOpen = blogPage.isBlogPage();
        assertTrue(isBlogPageOpen);
    }

    //13 Test
    @Test
    public void booksDropDown() {
        BooksDropdown booksDropdown = mainPage.clickBooksDropdownList();
        BooksPage booksPage = booksDropdown.chooseBookLanguage(BooksDropdown.CZECH_BOOKS);
        assertTrue(booksPage.isLanguageHeaderCorrect(BooksPage.CZECH_BOOKS));
    }

    //14 Test
    @Test
    public void ebooksDropDown() {
        EbooksDropdown ebooksDropdown = mainPage.clickEbooksDropdownList();
        EbooksPage ebooksPage = ebooksDropdown.chooseEbookLanguage(EbooksDropdown.POLISH_BOOKS);
        assertTrue(ebooksPage.isLanguageEbooksHeaderCorrect(EbooksPage.POLISH_BOOKS));
    }

    //15 Test
    @Test
    public void allLanguagesDrop() {
        AllLanguageDropdown allLanguageDropdown = mainPage.clickAllLanguageDropdownList();
        AllBooksLanguagePage allBooksLanguagePage = allLanguageDropdown.chooseLanguage(AllLanguageDropdown.DUTCH_LANGUAGE);
        assertTrue(allBooksLanguagePage.isLanguageHeaderTrue(AllBooksLanguagePage.DUTCH_LANGUAGE));
    }

    //16 Test
    @Test
    public void RussianLanguageBooks() {
        RussianLanguage russianLanguage = mainPage.OpenRussianLanguage();
        BooksRussianLanguagePage booksRussianLanguagePage = russianLanguage.chooseRussianLanguage(RussianLanguage.RUSSIAN_LANGUAGE);
        mainPage.takeScreenshot("Russian Languages Books");
        assertTrue(booksRussianLanguagePage.isRussianPageLanguageCorrect(BooksRussianLanguagePage.RUSSIAN_LANGUAGE));
    }

    //17 Test
    @Test
    public void UkrainianLanguageEbook() {
        UkrainianEbooksLanguage ukrainianEbooksLanguage = mainPage.OpenUkrainianEbooksLanguage();
        UkrainianEbookPage ukrainianEbookPage = ukrainianEbooksLanguage.chooseUkrainianLanguage(UkrainianEbooksLanguage.UKRAINIAN_EBOOKS);
        assertTrue(ukrainianEbookPage.isUkrainianPageCorrect(UkrainianEbookPage.UKRAINIAN_EBOOKS));
    }

    //18 Test
    @Test
    public void ItalianAllLanguage() {
        AllLanguageItalianLanguage allLanguageItalianLanguage = mainPage.OpenAllBooksItalianLanguage();
        AllLanguageItalianLanguagePage allLanguageItalianLanguagePage = allLanguageItalianLanguage.chooseItalianLanguage(AllLanguageItalianLanguage.ITALIAN_BOOKS);
        assertTrue(allLanguageItalianLanguagePage.isItalianPageCorrect(AllLanguageItalianLanguagePage.ITALIAN_BOOKS));
    }

}
