import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SomethingTest {

    @Test
    public void doSomething() {
        assertThat(true, is(true));
    }

}
