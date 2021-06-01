import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TestMyList {


    @Test
    public void getSizeOfList1() {
        // * Environment setup
        // * Declaring test lists
        List<Integer> l_test_size_1 = new List();

        // * Filling test list
        l_test_size_1.add(0);
        l_test_size_1.add(1);
        l_test_size_1.add(4);
        l_test_size_1.add(2);
        l_test_size_1.add(3);

        // Test 1:
        assertEquals(5, l_test_size_1.getSize());
    }

    @Test
    public void getSizeOfList2() {
        // * Environment setup
        // * Declaring test lists
        List<String> l_test_size_2 = new List();

        l_test_size_2.add("1");
        l_test_size_2.add("2");
        l_test_size_2.add("3");
        l_test_size_2.add("4");

        // Test 2:
        assertEquals(4, l_test_size_2.getSize());
    }

    @Test
    public void getSizeOfList3() {
        // * Environment setup
        // * Declaring test lists
        List<Float> l_test_size_3 = new List();

        // * Filling test list
        l_test_size_3.add((float) 1.2);
        l_test_size_3.add((float) 6.198);
        l_test_size_3.add((float) 3.89);
        l_test_size_3.add((float) 12.7);
        l_test_size_3.add((float) 26.28);
        l_test_size_3.add((float) 15.52);

        // Test 3:
        assertEquals(6, l_test_size_3.getSize());
    }

    @Test
    public void clearList1() {
        // * Environment setup
        // * Declaring test lists
        List<Integer> l_test_size_1 = new List();

        // * Filling test list
        l_test_size_1.add(0);
        l_test_size_1.add(1);
        l_test_size_1.add(4);
        l_test_size_1.add(2);
        l_test_size_1.add(3);

        l_test_size_1.clear();

        // Test 1:
        assertEquals(0, l_test_size_1.getSize());
    }

    @Test
    public void clearList2() {
        // * Environment setup
        // * Declaring test lists
        List<String> l_test_size_2 = new List();

        // * Filling test list
        l_test_size_2.add("1");
        l_test_size_2.add("2");
        l_test_size_2.add("3");
        l_test_size_2.add("4");

        l_test_size_2.clear();

        // Test 2:
        assertEquals(0, l_test_size_2.getSize());
    }

    @Test
    public void clearList3() {
        // * Environment setup
        // * Declaring test lists
        List<Float> l_test_size_3 = new List();

        // * Filling test list
        l_test_size_3.add((float) 1.2);
        l_test_size_3.add((float) 6.198);
        l_test_size_3.add((float) 3.89);
        l_test_size_3.add((float) 12.7);
        l_test_size_3.add((float) 26.28);
        l_test_size_3.add((float) 15.52);

        l_test_size_3.clear();

        // Test 3:
        assertEquals(0, l_test_size_3.getSize());
    }

    @Test
    public void addItemsToList1() {
        // * Environment setup
        // * Declaring test lists
        List<Integer> l_test_size_1_a = new List(0, 1, 4, 2, 3);
        List<Integer> l_test_size_1_b = new List();


        // * Filling test list
        l_test_size_1_a.add(0);

        // Test 1:
        assertEquals(6, l_test_size_1_a.getSize());
    }

    @Test
    public void addItemsToList2() {
        // * Environment setup
        // * Declaring test lists
        List<String> l_test_size_2_a = new List("0", "1", "2", "3", "4");


        // * Filling test list
        l_test_size_2_a.add("0");
        l_test_size_2_a.add("1");


        // Test 2:
        assertEquals(7, l_test_size_2_a.getSize());
    }

    @Test
    public void addItemsToList3() {
        // * Environment setup
        // * Declaring test lists
        List<Float> l_test_size_3_a = new List(1.2, 6.198, 3.89, 12.7, 26.28, 15.52);


        // * Filling test list
        l_test_size_3_a.add((float) 1.2);
        l_test_size_3_a.add((float) 6.198);


        // Test 3:
        assertEquals(8, l_test_size_3_a.getSize());
    }

    @Test
    public void checkItemInList1() {
        // * Environment setup
        // * Declaring test lists
        List<Integer> l_test_size_1 = new List(0, 1, 4, 2, 3);


        // Test 1:
        assertTrue(l_test_size_1.exists(1));
    }

    @Test
    public void checkItemInList2() {
        // * Environment setup
        // * Declaring test lists
        List<String> l_test_size_2 = new List("0", "1", "2", "3", "4");

        // Test 2:
        assertFalse(l_test_size_2.exists("5"));
    }

    @Test
    public void checkItemInList3() {
        // * Environment setup
        // * Declaring test lists
        List<Double> l_test_size_3 = new List(1.2, 6.198, 3.89, 12.7, 26.28, 15.52);

        // Test 3:
        assertTrue(l_test_size_3.exists((Double) 6.198));
    }

    @Test
    public void getItemInList1() {
        // * Environment setup
        // * Declaring test lists
        List<Integer> l_test_size_1 = new List(0, 1, 4, 2, 3);


        // Test 1:
        assertEquals(4, l_test_size_1.get(2));
    }

    @Test
    public void getItemInList2() {
        // * Environment setup
        // * Declaring test lists
        List<String> l_test_size_2 = new List("0", "1", "2", "3", "4");

        // Test 2:
        assertEquals("3", l_test_size_2.get(3));
    }

    @Test
    public void getItemInList3() {
        // * Environment setup
        // * Declaring test lists
        List<Double> l_test_size_3 = new List(1.2, 6.198, 3.89, 12.7, 26.28, 15.52);

        // Test 3:
        assertEquals(12.7, l_test_size_3.get(3));
    }

    @Test
    public void getIndexOfItemList1() {
        // * Environment setup
        // * Declaring test lists
        List<Integer> l_test_size_1 = new List(0, 1, 4, 2, 3);


        // Test 1:
        assertEquals(0, l_test_size_1.indexOf(0));
    }

    @Test
    public void getIndexOfItemList2() {
        // * Environment setup
        // * Declaring test lists
        List<String> l_test_size_2 = new List("0", "1", "2", "3", "4");

        // Test 2:
        assertEquals(-1, l_test_size_2.indexOf("5"));
    }

    @Test
    public void getIndexOfItemList3() {
        // * Environment setup
        // * Declaring test lists
        List<Double> l_test_size_3 = new List(1.2, 6.198, 3.89, 12.7, 26.28, 15.52);

        // Test 3:
        assertEquals(0, l_test_size_3.indexOf((Double) 1.2));
    }

    @Test
    public void removeItemFromList1() {
        // * Environment setup
        // * Declaring test lists
        List<Integer> l_test_size_1_a = new List(0, 4, 2, 3);
        System.out.println(l_test_size_1_a.toString());
        l_test_size_1_a.remove(3);
        l_test_size_1_a.remove(1);

        System.out.println(l_test_size_1_a.toString());
        // Test 1:
        assertEquals(2, l_test_size_1_a.getSize());
    }

    @Test
    public void removeItemFromList2() {
        // * Environment setup
        // * Declaring test lists
        List<String> l_test_size_2_a = new List("0", "1", "2", "3");
        System.out.println(l_test_size_2_a.toString());
        l_test_size_2_a.remove(1);
        System.out.println(l_test_size_2_a.toString());
        // Test 2:
        assertEquals(3, l_test_size_2_a.getSize());
    }

    @Test
    public void removeItemFromList3() {
        // * Environment setup
        // * Declaring test lists
        List<Float> l_test_size_3_a = new List(1.2, 6.198, 12.7, 26.28, 15.52);
        System.out.println(l_test_size_3_a.toString());
        System.out.println(l_test_size_3_a.remove(4));
        System.out.println(l_test_size_3_a.remove(1));
        System.out.println(l_test_size_3_a.toString());
        // Test 3:
        assertEquals(3, l_test_size_3_a.getSize());
    }


}
