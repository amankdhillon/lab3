import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = { };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ }, input2);

    int[] input3 = {2,3,4,5 };
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{ 5,4,3,2 }, input3);
	}


  @Test
  public void testReversed() {
    int[] input1 = {3};
    assertArrayEquals(new int[]{ 3}, ArrayExamples.reversed(input1));

    int[] input2 = {1,2,3, 4,5};
    assertArrayEquals(new int[]{5,4,3,2,1}, ArrayExamples.reversed(input2));

    int[] input3 = {};
    assertArrayEquals(new int[]{}, ArrayExamples.reversed(input3));

    int[] input4 = {1, 2};
    assertArrayEquals(new int[]{2,1}, ArrayExamples.reversed(input4));
  }
}
