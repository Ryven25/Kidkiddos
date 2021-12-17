package Pages;

public class ContactUsPage extends BasePage {

    public static final String
            CONTACT_US_HEADER = "//h1[text() = 'Contact us']",    //for 2 Test
            CONTACT_US_INPUT_NAME = "//input[@data-name='first_name']",
            CONTACT_US_INPUT_EMAIL = "//input[@data-name='email']",
            CONTACT_US_INPUT_MESSAGE = "//*[@data-name='your_message']",
            CONTACT_US_BUTTON_SEND = "//button[@id = '_form_44_submit']",
            THANK_YOU_FORM = "//div[contains(text() ='We will get back to you shortly.']",

            CONTACT_US_INPUT_ERROR_NAME = "//input[@name='field[3]']//following::*[text() = 'This field is required.']",
            CONTACT_US_INPUT_ERROR_EMAIL = "//input[@name='email']//following::*[text() = 'This field is required.']",
            CONTACT_US_INPUT_ERROR_MESSAGE = "//*[@name = 'field[7]']//following::*[text() = 'This field is required.']";


    public boolean isNameErrorDisplayed() {
        return elementExist(CONTACT_US_INPUT_ERROR_NAME);
    }

    public boolean isEmailErrorDisplayed() {
        return elementExist(CONTACT_US_INPUT_ERROR_EMAIL);
    }

    public boolean isMessageErrorDisplayed() {
        return elementExist(CONTACT_US_INPUT_ERROR_MESSAGE);
    }

    public boolean isPageTitleVisible() {
        return elementExist(CONTACT_US_HEADER);
    }


    public void enterName(String name) {
        findElementByXpath(CONTACT_US_INPUT_NAME).sendKeys(name);
    }

    public void enterEmail(String email) {
        findElementByXpath(CONTACT_US_INPUT_EMAIL).sendKeys(email);
    }

    public void enterMessage(String message) {
        findElementByXpath(CONTACT_US_INPUT_MESSAGE).sendKeys(message);
    }


    public String getNameInputValue() {
        //get value of CONTACT_US_INPUT_NAME
        String value = findElementByXpath(CONTACT_US_INPUT_NAME).getAttribute("value");
        return value;
    }

    public String getEmailInputValue() {
        String value = findElementByXpath(CONTACT_US_INPUT_EMAIL).getAttribute("value");
        return value;
    }

    public String getMessageInputValue() {
        String value = findElementByXpath(CONTACT_US_INPUT_MESSAGE).getAttribute("value");
        return value;
    }

    public void buttonSendMessage() {
        findElementByXpath(CONTACT_US_BUTTON_SEND).click();
    }

    public boolean messageHasSent(String name, String email, String message) {
        findElementByXpath(CONTACT_US_INPUT_NAME).sendKeys(name);
        findElementByXpath(CONTACT_US_INPUT_EMAIL).sendKeys(email);
        findElementByXpath(CONTACT_US_INPUT_MESSAGE).sendKeys(message);
        return elementExist(THANK_YOU_FORM);
    }
}
