package java401CodeChallenges;




import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTreeTest {

    @Test
    public void findMaxTest(){
        BinarySearchTree<Integer> test = new BinarySearchTree <>();
        test.add(5);
        test.add(17);
        test.add(11);
        test.add(1);
        int expected = 17;
        int actual = test.findMax();
        assertEquals("Should return 17", expected, actual);
        System.out.println("We tested ");


    }

}
