import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void duplicateTest() {
        //GIVEN
        int inputValue = 2;

        //WHEN
        int actual = Main.duplicate(inputValue);

        //THEN
        assertEquals(4, actual);

    }
}
