package soundSystem;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.Comparator;
import java.util.TreeMap;

import static junit.framework.TestCase.assertNotNull;

@ContextConfiguration(classes = CDPlayerConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class CDPlayerTest {

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotNull() {
        assertNotNull(cd);

    }
}
