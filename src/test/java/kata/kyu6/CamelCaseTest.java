package kata.kyu6;

import org.junit.Test;

import static org.junit.Assert.*;

public class CamelCaseTest {

    @Test
    public void test1() {
        assertEquals("asdsdcsdcvtbnuytrg", CamelCase.camelCase("asdsdcsdcvtbnuytrg"));
    }

    @Test
    public void test2() {
        assertEquals("dfvgrt Gosfcm Yomdc", CamelCase.camelCase("dfvgrtGosfcmYomdc"));
    }

    @Test
    public void test3() {
        assertEquals("Dfvgrt Gosfcm Yomdc", CamelCase.camelCase("DfvgrtGosfcmYomdc"));
    }

}