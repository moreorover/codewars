package kata.kyu6;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExpandedFormTest extends TestCase {

    @Test
    public void test1() {
        assertEquals("10 + 2", ExpandedForm.expandedForm(12));
    }

    @Test
    public void test2() {
        assertEquals("40 + 2", ExpandedForm.expandedForm(42));
    }

    @Test
    public void test3() {
        assertEquals("70000 + 300 + 4", ExpandedForm.expandedForm(70304));
    }

    @Test
    public void test4() {
        assertEquals("9000000", ExpandedForm.expandedForm(9000000));
    }

}