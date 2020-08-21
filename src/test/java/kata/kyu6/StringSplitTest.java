package kata.kyu6;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringSplitTest {

    @Test
    public void test1() {
        assertEquals(new String[]{"ca", "ts"}, StringSplit.solution("cats"));
    }

    @Test
    public void test2() {
        assertEquals(new String[]{"ca", "ts", "a_"}, StringSplit.solution("catsa"));
    }

    @Test
    public void test3() {
        assertEquals(new String[]{}, StringSplit.solution(""));
    }
}