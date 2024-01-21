import kata6.StrHandle;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StrHandleTests {

    @Test
    public void testConcat(){
        String str = StrHandle.strConcat("Hola ","mundo");
        assertEquals("Hola mundo",str);
    }
    @Test
    public void testToLowerCase(){
        String str = StrHandle.strToLowerCase("HOLA MUNDO");
        assertEquals("hola mundo",str);
    }
    @Test
    public void testToUpperCase(){
        String str = StrHandle.strToUpperCase("hola mundo");
        assertEquals("HOLA MUNDO",str);
    }
    @Test
    public void testRemoveChar(){
        String str = StrHandle.strRemoveChar("Hola mundo",'a');
        assertEquals("Hol mundo", str);
    }
    @Test
    public void testRemoveCharWithIndex(){
        String str = StrHandle.strRemoveChar("Hola mundo",1);
        assertEquals("ola mundo",str);
    }
    @Test
    public void testGetChar(){
        String str = StrHandle.strGetChar("Hola mundo", 1);
        assertEquals("H",str);
    }
}
