import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RubyTaskTest {

    @Test
    void printNumbers() {
        RubyTask rt = new RubyTask();
        String str;
        str = rt.printNumbers(2);
        Assert.assertEquals(str, "111");
    }
    @Test
    void printNumbers2() {
        RubyTask rt = new RubyTask();
        String str;
        str = rt.printNumbers(1);
        Assert.assertEquals(str, "1");
    }
    @Test
    void printNumbers3() {
        RubyTask rt = new RubyTask();
        String str;
        str = rt.printNumbers(3);
        Assert.assertEquals(str, "11121");
    }
    @Test
    void printNumbers4() {
        RubyTask rt = new RubyTask();
        String str;
        str = rt.printNumbers(8);
        Assert.assertEquals(str, "111211211111221312211131122211113213211");
    }


}