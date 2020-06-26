package apache.common.library;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;

public class ArrayUtilsTest {
    @Test
    public void addTest() {
        int[] oldArray = {2, 3, 4, 5};
        int[] newArray = ArrayUtils.add(oldArray, 0, 1);
        int[] expectedArray = {1,2,3,4,5};

        Assert.assertArrayEquals(expectedArray, newArray);
    }
}
