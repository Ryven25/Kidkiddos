package Pages;


public class LoginPage extends BasePage {
    public static final String
            LOGIN_PAGE = "//*[@id='customer_login']",
            INPUT_CUSTOMER_EMAIL = "//input[@id='CustomerEmail']",
            INPUT_CUSTOMER_PASSWORD = "//input[@id='CustomerPassword']",
            RESET_PASSWORD_PAGE = "//h2[text()='Reset your password']",
            CREATE_ACCOUNT_PAGE = "//h1[text()='Create Account']",
            CREATE_ACCOUNT_FIRST_NAME = "//input[@id='FirstName']",
            CREATE_ACCOUNT_LAST_NAME = "//input[@id='LastName']",
            CREATE_ACCOUNT_PASSWORD = "//input[@id='CreatePassword']",
            CREATE_ACCOUNT_EMAIL = "//input[@id='Email']",
            CLICk_SIGN_IN = "//input[@class = 'btn']",
            MY_ACCOUNT = "//h1[text()='My Account']",
            CREATE_BUTTON = "//input[value='Create']",
            SUBMIT = "//input[@value='Submit']";

    public boolean isLoginPageOpen() {
        return elementExist(LOGIN_PAGE);
    }


    
    public boolean isResetPage() {
        return elementExist(RESET_PASSWORD_PAGE);
    }

    public boolean isCreateAccountPage() {
        return elementExist(CREATE_ACCOUNT_PAGE);
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Create Account


    public boolean createInfoHasSent(String firstName, String lastName, String email, String password) {
        findElementByXpath(CREATE_ACCOUNT_FIRST_NAME).sendKeys(firstName);
        findElementByXpath(CREATE_ACCOUNT_LAST_NAME).sendKeys(lastName);
        findElementByXpath(CREATE_ACCOUNT_EMAIL).sendKeys(email);
        findElementByXpath(CREATE_ACCOUNT_PASSWORD).sendKeys(password);
        return elementExist(SUBMIT);

    }


    public void createFirstName(String firstName) {
        findElementByXpath(CREATE_ACCOUNT_FIRST_NAME).sendKeys(firstName);
    }

    public void createLastName(String lastName) {
        findElementByXpath(CREATE_ACCOUNT_LAST_NAME).sendKeys(lastName);
    }

    public void createEmail(String email) {
        findElementByXpath(CREATE_ACCOUNT_EMAIL).sendKeys(email);
    }

    public void createPassword(String password) {
        findElementByXpath(CREATE_ACCOUNT_PASSWORD).sendKeys(password);
    }


    public String getCreateAccountFirstNameValue() {
        String value = findElementByXpath(CREATE_ACCOUNT_FIRST_NAME).getAttribute("value");
        return value;
    }

    public String getCreateAccountLastNameValue() {
        String value = findElementByXpath(CREATE_ACCOUNT_LAST_NAME).getAttribute("value");
        return value;
    }

    public String getCreateAccountEmailValue() {
        String value = findElementByXpath(CREATE_ACCOUNT_EMAIL).getAttribute("value");
        return value;
    }

    public String getCreateAccountPasswordValue() {
        String value = findElementByXpath(CREATE_ACCOUNT_PASSWORD).getAttribute("value");
        return value;
    }


    public void createButtonClick() {
        findElementByXpath(CREATE_BUTTON).click();
    }

    public void signInClick() {
        findElementByXpath(CLICk_SIGN_IN).click();
    }


    public boolean signInButton(String email, String password) {
        findElementByXpath(INPUT_CUSTOMER_EMAIL).sendKeys(email);
        findElementByXpath(INPUT_CUSTOMER_PASSWORD).sendKeys(password);
        return elementExist(MY_ACCOUNT);
    }

}