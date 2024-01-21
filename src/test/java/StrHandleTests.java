import kata6.StrHandle;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StrHandleTests {

    @Test
    public void testConcat(){
        String str = StrHandle.strConcat("","");
        assertEquals("",str);
    }
    @Test
    public void testToLowerCase(){
        String str = StrHandle.strToLowerCase("");
        assertEquals("",str);
    }
    @Test
    public void testToUpperCase(){
        String str = StrHandle.strToLowerCase("");
        assertEquals("",str);
    }
    @Test
    public void testRemoveChar(){
        String str = StrHandle.strRemoveChar("",'a');
        assertEquals("",str);
    }
    @Test
    public void testRemoveCharWithIndex(){
        String str = StrHandle.strRemoveChar("",0);
        assertEquals("",str);
    }
    @Test
    public void testConcat(){
        String str = StrHandle.strGetChar("");
        assertEquals("",str);
    }
}
