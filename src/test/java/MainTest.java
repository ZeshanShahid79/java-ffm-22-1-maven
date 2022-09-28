import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void addTest(){
        //GIVEN
        int inputValue = 5;
        int inputValue2 = 10;

        //WHEN
        int actual = Main.add(inputValue,inputValue2);

        //THEN
        assertEquals(15,actual);
    }

    @Test
    public void biggerAsTest(){

        //GIVEN
        int inputValue = 90;

        //WHEN
        boolean actual = Main.biggerAs(inputValue);

        //THEN
        assertFalse(actual);
    }
}
