package JUnit4_Test;

import org.junit.Test;
import static org.junit.Assert.*;

import static bmk_junit4.BMK_JUnit4.myDiv;

public class JUnit_Test {

    @Test
    public void test1MyDiv() throws Exception {
        assertTrue(myDiv(7, 5, 5, 167, 3) == 1);
    }

    @Test
    public void test2MyDiv() throws Exception {
        try {
            assertTrue("Проверка деления 1031 на 0", myDiv(10, 10, 0, 10, 69) == 0);
            fail("Нет ошибки при делении на 0");
        } catch (Exception thrown) {
            assertNotEquals("", thrown.getMessage());
        }
    }

}
