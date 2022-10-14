import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ListTests {
  @Test
  public void shouldFilterGivenStringChecker()
  {
    List<String> words = new ArrayList<>(Arrays.asList("Hello","world","Great ocean road"));
    List<String> expected = new ArrayList<>(Arrays.asList("Hello", "Great ocean road"));
    List<String> actual = ListExamples.filter(words, new ContainsStringChecker());

    assertEquals(expected, actual);
  }
  @Test
  public void shouldAbleToDoSortOnMerge()
  {
    List<String> chars = new ArrayList<>(Arrays.asList("a", "b", "c"));
    List<String> expected = new ArrayList<>(Arrays.asList("a", "a", "b", "b", "c", "c"));
    List<String> actual = ListExamples.merge(chars, chars);

    assertEquals(expected, actual);
  }

  @Test(timeout=1500)
  public void shouldAbleToDoSortOnMergeWithOneEmpty()
  {
    List<String> chars = new ArrayList<>(Arrays.asList("a", "b", "c"));
    List<String> empty = new ArrayList<>();
    List<String> expected = new ArrayList<>(Arrays.asList("a", "b", "c"));
    List<String> actual = ListExamples.merge(empty, chars);

    assertEquals(expected, actual);
  }

  class ContainsStringChecker implements StringChecker
  {
    @Override
    public boolean checkString(String s) {
      return s.contains("e");
    }
  }
}
