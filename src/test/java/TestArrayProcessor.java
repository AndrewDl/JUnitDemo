import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Andrew on 18.02.2017.
 */

public class TestArrayProcessor {

    @Test
    public void TestArrayProcessor_as_a_string_array(){
        String[] array = {null,"null","Hello", "5", "2", null, "Andrew", "Test this shit", "kuuurwa", "kuuurwa", "hello", "hi", "hi"};
        ArrayProcessor<String> tester = new ArrayProcessor<String>(array);
        assertEquals("Max element must be: \"Test this shit\"","Test this shit",tester.getMax());

        array = new String[]{"Hello", "5", "2", "Andrew", "Test this shit", "kuuurwa", "kuuurwa", "hello", "hi", "hi"};
        tester = new ArrayProcessor<String>(array);
        assertEquals("Max element must be: \"Test this shit\"","Test this shit",tester.getMax());

        array = new String[]{"Hello", "5", "2", null, "Andrew", "Test this shit", "kuuurwa", "kuuurwa", "hello", "hi", "hi"};
        tester = new ArrayProcessor<String>(array);
        assertEquals("Max element must be: \"Test this shit\"","Test this shit",tester.getMax());

        array = new String[]{};
        tester = new ArrayProcessor<String>(array);
        assertEquals("Max element must be: \"null\"",null,tester.getMax());

        array = null;
        tester = new ArrayProcessor<String>(array);
        assertEquals("Max element must be: \"null\"",null,tester.getMax());
    }

    @Test
    public void TestArrayProcessor_as_an_integer_array(){
        Integer[] array = {5,8,17,17,-254,1,15,0,0,23,23,23,12};
        ArrayProcessor<Integer> tester = new ArrayProcessor<Integer>(array);
        assertEquals("Max element must be: 23" , Integer.valueOf(23) ,tester.getMax());

        array = new Integer[]{-5, -23, -5, -17, -286, 0, -0};
        tester = new ArrayProcessor<Integer>(array);
        assertEquals("Max element must be: 0" , Integer.valueOf(0) ,tester.getMax());

        array = new Integer[]{};
        tester = new ArrayProcessor<Integer>(array);
        assertEquals("Max element must be: null" , null ,tester.getMax());
    }

}
