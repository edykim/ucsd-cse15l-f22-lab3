import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlaceWithArray() {
    int[] arrayOfNumbers = { 1, 2, 3, 4, 5 };
    int[] expected = { 5, 4, 3, 2, 1 };
    ArrayExamples.reverseInPlace(arrayOfNumbers);

    assertArrayEquals(expected, arrayOfNumbers);
  }

  @Test
  public void testReversedWithOddArray() {
    int[] arrayOfNumbers = { 1, 2, 3, 4, 5 };
    int[] expected = { 5, 4, 3, 2, 1 };
    int[] actual = ArrayExamples.reversed(arrayOfNumbers);

    assertArrayEquals(expected, actual);
  }
  @Test
  public void testReversedWithEvenArray() {
    int[] arrayOfNumbers = { 1, 2, 3, 4, 5, 6 };
    int[] expected = { 6, 5, 4, 3, 2, 1 };
    int[] actual = ArrayExamples.reversed(arrayOfNumbers);

    assertArrayEquals(expected, actual);
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] numbers = {-10, 1, 2, 3, 4, 5};
    double expected = 3;
    double actual = ArrayExamples.averageWithoutLowest(numbers);

    assertEquals(expected, actual, 0);
  }

  @Test
  public void testAverageWithoutLowestWithEmpty() {
    double[] numbers = {};
    double expected = 0;
    double actual = ArrayExamples.averageWithoutLowest(numbers);

    assertEquals(expected, actual, 0);
  }
  @Test
  public void testAverageWithoutLowestWithOne() {
    double[] numbers = {10};
    double expected = 0;
    double actual = ArrayExamples.averageWithoutLowest(numbers);

    assertEquals(expected, actual, 0);
  }
  @Test
  public void testAverageWithoutLowestWithDuplication() {
    double[] numbers = {10,10,20};
    double expected = 15;
    double actual = ArrayExamples.averageWithoutLowest(numbers);

    assertEquals(expected, actual, 0);
  }
}
