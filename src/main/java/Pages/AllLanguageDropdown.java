package Pages;

public class AllLanguageDropdown extends  BasePage{
    public static final String  DUTCH_LANGUAGE = "//*[@aria-controls = 'SiteNavLabel-all-languages']" +
            "//following-sibling::*//a[text() = 'Dutch - Nederlands'] ";

    public boolean IsAllLanguagesDropped(){
        return elementExist(DUTCH_LANGUAGE);
    }

    public AllBooksLanguagePage chooseLanguage(String langPath){
        findElementByXpath(langPath).click();
        return new AllBooksLanguagePage();
    }
}
