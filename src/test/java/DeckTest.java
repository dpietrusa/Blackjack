import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static org.hamcrest.core.IsEqual.equalTo;

import static org.junit.Assert.*;

public class DeckTest {

    private Deck newDeckTest;

    @Before
    public void create(){
        newDeckTest = new Deck();
    }


    @Test
    public void shouldGenerateSixDecks() {
        newDeckTest.generateDeck();
        Integer result = newDeckTest.returnDeckSize();
        assertThat(result, equalTo(312));
    }
}