import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnit4.class)
public class AnswerTest {
    @Test
    public void life_the_universe_and_everything() {
        int expected = 42;
        int actual = Answer.answer();
        assertEquals(expected, actual);
    }
}