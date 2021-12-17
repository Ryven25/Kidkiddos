import Pages.CollectionDifferentLanguageBooksPages;
import Pages.DifferentLanguagesBooks;
import Utilis.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DifferentLanguagesBooksInCartTest extends UseCaseBase {
    private static CollectionDifferentLanguageBooksPages collectionDifferentLanguageBooksPages;


    @BeforeAll
    public static void classSetup() {
        collectionDifferentLanguageBooksPages = new CollectionDifferentLanguageBooksPages();
    }

//    @BeforeEach
//    public void beforeTest() {
//        collectionDifferentLanguageBooksPages.navigateToCollectionSerbianLanguageBooksPage();
//    }


    @Test
    public void chooseSerbianBook() {
        collectionDifferentLanguageBooksPages.navigateToSerbianLanguageBooksPage();
        DifferentLanguagesBooks differentLanguagesBooks = collectionDifferentLanguageBooksPages.selectSerbianBook("Boxer-and-Brandon-English-Serbian-Bilingual-bedtime-story-for-children-KidKiddos-Books-cover");
        boolean isSerbianBookSelected = differentLanguagesBooks.isBookSelected();
        assertTrue(isSerbianBookSelected);
    }

    @Test
    public void addSerbianBookToCart() {
        chooseSerbianBook();

        DifferentLanguagesBooks differentLanguagesBooks = collectionDifferentLanguageBooksPages.clickButtonAdd();
        boolean serbianBookAdded = differentLanguagesBooks.isSerbianBookInCart();
        assertTrue(serbianBookAdded);
    }

    @Test
    public void chooseGermanBook() {
        collectionDifferentLanguageBooksPages.navigateToGermanLanguageBooksPage();
        DifferentLanguagesBooks differentLanguagesBooks = collectionDifferentLanguageBooksPages.selectGermanBook("English-German-Bilingual-kids-picture-book-I-Love-to-Share-Shelley-Admont-cover");
        boolean isGermanBookSelected = differentLanguagesBooks.isBookSelected();
        assertTrue(isGermanBookSelected);
    }


    @Test
    public void addGermanBookToCart() {
        chooseGermanBook();

        DifferentLanguagesBooks differentLanguagesBooks = collectionDifferentLanguageBooksPages.clickButtonAdd();
        boolean germanBookAdded = differentLanguagesBooks.isGermanBookInCart();
        assertTrue(germanBookAdded);
    }

    @Test
    public void chooseRussianBook() {
        collectionDifferentLanguageBooksPages.navigateTonRussianLanguageBooksPage();
        DifferentLanguagesBooks differentLanguagesBooks = collectionDifferentLanguageBooksPages.selectRussianBook("English-Russian-Bilingual-kids-book-I-Love-to-Brush-My-Teeth-cover");
        boolean isRussianBookSelected = differentLanguagesBooks.isBookSelected();
        assertTrue(isRussianBookSelected);
    }


    @Test
    public void addRussianBookToCart() {
        chooseRussianBook();

        DifferentLanguagesBooks differentLanguagesBooks = collectionDifferentLanguageBooksPages.clickButtonAdd();
        boolean russianBookAdded = differentLanguagesBooks.isRussianBookInCart();
        assertTrue(russianBookAdded);
    }
}



