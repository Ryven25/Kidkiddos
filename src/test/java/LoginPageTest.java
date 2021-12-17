import Pages.*;
import Pages.LoginPage;
import Pages.MainPage;
import Utilis.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class LoginPageTest extends UseCaseBase {
    private static MainPage mainPage;

    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }

    @ParameterizedTest
    @ValueSource(strings = {"JKDFLUI", "$(%$&%#)", " ", ""})

    public void firstNameCreateTest(String firstName) {
        LoginPage loginPage = mainPage.loginButtonClick();
        mainPage.createAccountClick();
        loginPage.createFirstName(firstName);
        assertEquals(firstName, loginPage.getCreateAccountFirstNameValue());
    }


    @ParameterizedTest
    @ValueSource(strings = {"kl6+5f6+hhfd+", "Hello", "25235343"})

    public void lastNameCreateTest(String lastName) {
        LoginPage loginPage = mainPage.loginButtonClick();
        mainPage.createAccountClick();
        loginPage.createLastName(lastName);
        assertEquals(lastName, loginPage.getCreateAccountLastNameValue());
    }

    @ParameterizedTest
    @ValueSource(strings = {"@gmail.com", "$(%$&%#)", "fish@yandex.ru", ""})

    public void emailCreateTest(String email) {
        LoginPage loginPage = mainPage.loginButtonClick();
        mainPage.createAccountClick();
        loginPage.createEmail(email);
        assertEquals(email, loginPage.getCreateAccountEmailValue());
    }

    @ParameterizedTest
    @ValueSource(strings = {"155641232", "$(%$&%#)", "SG74#$@hgf7&#)_*$%"})

    public void passwordCreateTest(String password) {
        LoginPage loginPage = mainPage.loginButtonClick();
        mainPage.createAccountClick();
        loginPage.createPassword(password);
        assertEquals(password, loginPage.getCreateAccountPasswordValue());
    }

  ///////////////////////////////////////////////////////////////////////////////////////////////


    @Test
    public void loginButtonTest() {
        LoginPage loginPage = mainPage.loginButtonClick();
        boolean isLoginPageLoaded = loginPage.isLoginPageOpen();
        assertTrue(isLoginPageLoaded);
    }

    @Test
    public void openForgotPassword() {
        loginButtonTest();
        LoginPage loginPage = mainPage.forgotPasswordClick();
        boolean isResetPasswordOpen = loginPage.isResetPage();
        assertTrue(isResetPasswordOpen);
    }


    @Test
    public void openCreateAccount() {
        loginButtonTest();
        LoginPage loginPage = mainPage.createAccountClick();
        boolean isCreateAccountOpen = loginPage.isCreateAccountPage();
        assertTrue(isCreateAccountOpen);
        boolean createAccountSentToSite = loginPage.createInfoHasSent("Roman", "Fish", "fish@gmail.com", "4554228");
        clickCreateBtn();
        assertTrue(createAccountSentToSite);
    }


    @Test
    public void clickCreateBtn(){
        LoginPage loginPage = mainPage.loginButtonClick();
        loginPage.createButtonClick();
    }

    @Test
    public void clickOnSignIn(){
        LoginPage loginPage = mainPage.loginButtonClick();
        loginPage.signInClick();
    }


    @Test
    public void OpenCustomerPage() {
        LoginPage loginPage = mainPage.loginButtonClick();
        boolean myAccountPageOpen = loginPage.signInButton("ryven25@gmail.com","4554228");
        clickOnSignIn();
        assertTrue(myAccountPageOpen);
    }



}
