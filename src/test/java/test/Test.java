package test;
import org.junit.*;

public class Test {

    Main test;

    @org.junit.Test
    public void testFloat() {

        test = new Main();

        Assert.assertEquals(2.5 ,test.floatTest(5, 2), 0.0f);
    }

    @org.junit.Test
    public void testInteger() {

        test = new Main();

        Assert.assertEquals(11 ,test.addition(5, 6));
    }


    @org.junit.Test
    public void testEquality() {

        test = new Main();

        Assert.assertEquals(new String("test"), new String("test"));


    }

    @org.junit.Test
    public void testIdentity() {

        test = new Main();

        Assert.assertEquals(String.class, new String("test").getClass());


    }

    @org.junit.Test
    public void testTrue() {

        test = new Main();

        Assert.assertTrue(true);


    }

    @org.junit.Test
    public void testFalse() {

        test = new Main();

        Assert.assertFalse(true);


    }

    @org.junit.Test
    public void testNull() {

        test = new Main();
        String n = null;

        Assert.assertNull(n);


    }

    @org.junit.Test
    public void testNotNull() {

        test = new Main();
        String n = "sdf";

        Assert.assertNotNull(n);


    }

    @org.junit.Test(expected=NullPointerException.class)
    public void testExpectedFailure() {
        Object o = null;
        o.toString();
    }

    @org.junit.Test (expected = IllegalArgumentException.class)
    public void testArguement() {
        try {
            Integer.parseInt("-1");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

        @org.junit.Test(timeout = 10)
        public void testArguementTimeout() {
            try {
                Integer.parseInt("-1");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

            @Ignore("Test is ignored")
            @org.junit.Test
            public void testArguementDisabled() {
                try {
                    Integer.parseInt("-1");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }


    /*@org.junit.Test
    public void testArray()
    {
    Array[] t = new Array[3];

    assertTrue(t);
    }*/

}