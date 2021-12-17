import Pages.*;
import Utilis.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class OnlyEnglishBooksAddedToCartTest extends UseCaseBase {

    private static CollectionOnlyEnglishBooksPage collectionBooksPage;

    @BeforeAll
    public static void classSetup() {
        collectionBooksPage = new CollectionOnlyEnglishBooksPage();
    }

    @BeforeEach
    public void beforeTest() {
        collectionBooksPage.navigateToCollectionBooksPage();
    }


    @Test
    public void onlyEnglishBooksPageTest() {
        Boolean success = collectionBooksPage.isEnglishLanguagePageLoaded();
        assertTrue(success);

    }


    @Test
    public void chooseFirstBookToCart() {
        EnglishBooks englishBooks = collectionBooksPage.clickOnBook("Lets-play-mom-childrens-childrens-bedtime-story-cover");
        boolean isBookSelected = englishBooks.isBookSelectedCorrect();
        assertTrue(isBookSelected);

    }


    @Test
    public void addFirstBookToCart() {
        chooseFirstBookToCart();

        EnglishBooks englishBooks = collectionBooksPage.clickButtonAdd();
        boolean firstBookInCart = englishBooks.isFirstBookInCart();
        assertTrue(firstBookInCart);
    }


    @Test
    public void chooseSecondBookToCart() {
        EnglishBooks englishBooks = collectionBooksPage.clickOnBook("I-love-autumn-childrens-picture-book-by-Shelley-Admont-KidKiddos-english-language-cover");
        boolean isBookSelected = englishBooks.isBookSelectedCorrect();
        assertTrue(isBookSelected);
    }

    @Test
    public void addSecondBookToCart() {
        chooseSecondBookToCart();

        EnglishBooks englishBooks = collectionBooksPage.clickButtonAdd();
        boolean secondBookInCart = englishBooks.isSecondBookInCart();
        assertTrue(secondBookInCart);
    }


    @Test
    public void chooseThirdBookToCart() {
        EnglishBooks englishBooks = collectionBooksPage.clickOnBook("I-Love-to-Eat-Fruits-and-Vegetables-kids-bunnies-bedtime-story-Shelley-Admont-English-cover");
        boolean isBookSelected = englishBooks.isBookSelectedCorrect();
        assertTrue(isBookSelected);
    }

    @Test
    public void addThirdBookToCart() {
        chooseThirdBookToCart();
        EnglishBooks englishBooks = collectionBooksPage.clickButtonAdd();
        boolean secondBookInCart = englishBooks.isThirdBookInCart();
        assertTrue(secondBookInCart);
    }


}
