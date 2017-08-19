package jenkins;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jo on 2017/8/19.
 */
public class Hello_JenkinsTest {
    private Hello_Jenkins jenkins;

    @Before
    public void setUp() throws Exception {
        jenkins = new Hello_Jenkins();
    }

    @After
    public void tearDown() throws Exception {
        jenkins = null;
    }

    @Test
    public void testSayHello() {
        jenkins.sayHello();
        assertTrue(true);
    }

}
