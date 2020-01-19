package practice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by ronim_000 on 7/24/2019.
 */
public class DynamicArrayTest {
    private DynamicArray array;


    @Before
    public void setUp(){
        array = new DynamicArray<String>(2);
    }

    @Test
    public void testGetAndSet(){
        array.set(0,"ab");
        Assert.assertEquals("ab",array.get(0));
    }

    @Test
    public void testInsert(){
        array.add("a");
        array.add("b");
        array.add("c");

        array.insert(1, "d");

        Assert.assertEquals(4, array.size());
        Assert.assertEquals("a", array.get(0));
        Assert.assertEquals("d", array.get(1));
        Assert.assertEquals("b", array.get(2));
        Assert.assertEquals("c", array.get(3));
    }

    @Test
    public void testDelete(){
        array.add("a");
        array.add("b");
        array.add("c");

        array.delete(1);

        Assert.assertEquals(2, array.size());
        Assert.assertEquals("a", array.get(0));
        Assert.assertEquals("c", array.get(1));
    }

    @Test
    public void testIsEmpty(){
        Assert.assertTrue(array.isEmpty());
        array.add("a");
        Assert.assertFalse(array.isEmpty());

    }
}
