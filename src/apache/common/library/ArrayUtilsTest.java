package apache.common.library;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArrayUtilsTest {
    @Test
    public void addTest() {
        int[] oldArray = {2, 3, 4, 5};
        int[] newArray = ArrayUtils.add(oldArray, 0, 1);
        int[] expectedArray = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(newArray));
        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    public void addTest2() {
        int[] oldArray = {2, 3, 4, 5};
        int[] newArray = ArrayUtils.add(oldArray, 1);

        System.out.println(Arrays.toString(new int[]{2, 3, 4, 5, 1}));
        assertArrayEquals(new int[]{2, 3, 4, 5, 1}, newArray);
    }

    @Test
    public void insertTest() {
        int[] oldArray = {2, 3, 4, 5};
        int[] newArray = ArrayUtils.insert(0, oldArray, 1, 6);

        assertArrayEquals(new int[]{1, 6, 2, 3, 4, 5}, newArray);
    }

    @Test
    public void addAllTest() {
        int[] oldArray = {0, 1, 2};
        int[] newArray = ArrayUtils.addAll(oldArray, 3, 4, 5);
        int[] expectedArray = {0, 1, 2, 3, 4, 5};

        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    public void removeTest() {
        int[] oldArray = {1, 2, 3, 4, 5};
        int[] newArray = ArrayUtils.remove(oldArray, 1);
        int[] expectedArray = {1, 3, 4, 5};

        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    public void removeAllTest() {
        int[] oldArray = {1, 2, 3, 4, 5};
        int[] newArray = ArrayUtils.removeAll(oldArray, 1, 3);
        int[] expectedArray = {1, 3, 5};

        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    public void removeElementTest() {
        int[] oldArray = {1, 2, 3, 3, 4};
        int[] newArray = ArrayUtils.removeElement(oldArray, 5);
        int[] expectedArray = {1, 2, 3, 3, 4};

        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    public void removeElementsTest() {
        int[] oldArray = {1, 2, 3, 3, 4};
        int[] newArray = ArrayUtils.removeElements(oldArray, 2, 3, 5);
        int[] expectedArray = {1, 3, 4};

        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    public void removeAllOccurencesTest() {
        int[] oldArray = {1, 2, 2, 2, 3};
        int[] newArray = ArrayUtils.removeAllOccurrences(oldArray, 2);
        int[] expectedArray = {1, 3};

        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    public void containsTest() {
        int[] array = {1, 3, 5, 7, 9};
        boolean evenContained = ArrayUtils.contains(array, 2);
        boolean oddContained = ArrayUtils.contains(array, 7);

        assertEquals(false, evenContained);
        assertEquals(true, oddContained);
    }

    @Test
    public void reverseTest() {
        int[] originalArray = {1, 2, 3, 4, 5};
        ArrayUtils.reverse(originalArray, 1, 4);
        int[] expectedArray = {1, 4, 3, 2, 5};

        assertArrayEquals(expectedArray, originalArray);
    }

    @Test
    public void reverseTest2() {
        int[] originalArray = {1, 2, 3, 4, 5};
        ArrayUtils.reverse(originalArray);
        int[] expectedArray = {5, 4, 3, 2, 1};

        assertArrayEquals(expectedArray, originalArray);
    }

    @Test
    public void shiftTest() {
        int[] originalArray = {1, 2, 3, 4, 5};
        ArrayUtils.shift(originalArray, 1, 4, 1);
        int[] expectedArray = {1, 4, 2, 3, 5};

        assertArrayEquals(expectedArray, originalArray);
    }

    @Test
    public void shiftTest2() {
        int[] originalArray = {1, 2, 3, 4, 5};
        ArrayUtils.shift(originalArray, 1);
        int[] expectedArray = {5, 1, 2, 3, 4};

        assertArrayEquals(expectedArray, originalArray);
    }

    @Test
    public void subarrayTest() {
        int[] oldArray = {1, 2, 3, 4, 5};
        int[] newArray = ArrayUtils.subarray(oldArray, 2, 7);
        int[] expectedArray = {3, 4, 5};

//        System.out.println(Arrays.toString(ArrayUtils.subarray(oldArray, 1, 0)));
        assertArrayEquals(expectedArray, newArray);
    }

    @Test
    public void swapTest() {
        int[] originalArray = {1, 2, 3, 4, 5};
        ArrayUtils.swap(originalArray, 0, 3, 4);
        int[] expectedArray = {4, 5, 3, 1, 2};

        System.out.println(Arrays.toString(originalArray));
        assertArrayEquals(expectedArray, originalArray);
    }

    @Test
    public void swapTest2() {
        int[] originalArray = {1, 2, 3, 4, 5};
        ArrayUtils.swap(originalArray, 0, 3);
        int[] expectedArray = {4, 2, 3, 1, 5};

        assertArrayEquals(expectedArray, originalArray);
    }
}
