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
        int inputValue = 99;

        //WHEN
        boolean actual = Main.biggerAs100(inputValue);

        //THEN
        assertFalse(actual);
    }
    @Test
    public void faculty0Is1(){
        //given
        int number = 0;
        //when
        int actual = Main.faculty(number);
        //then
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    public void faculty1Is1(){
        //given
        int number = 1;
        //when
        int actual = Main.faculty(number);
        //then
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    public void faculty2Is2(){
        //given
        int number = 2;
        //when
        int actual = Main.faculty(number);
        //then
        int expected = 2;
        assertEquals(expected,actual);
    }
    @Test
    public void faculty3Is6(){
        //given
        int number = 3;
        //when
        int actual = Main.faculty(number);
        //then
        int expected = 6;
        assertEquals(expected,actual);
    }

}
