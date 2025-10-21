package org.apache.commons.collections4.set;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.SortedSet;
import java.util.TreeSet;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class UnmodifiableSortedSetDiffblueTest {
  /**
   * Test {@link UnmodifiableSortedSet#unmodifiableSortedSet(SortedSet)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link TreeSet#TreeSet()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableSortedSet#unmodifiableSortedSet(SortedSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedSet UnmodifiableSortedSet.unmodifiableSortedSet(SortedSet)"})
  public void testUnmodifiableSortedSet_given42_whenTreeSetAdd42() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");

    // Act
    SortedSet<Object> actualUnmodifiableSortedSetResult = UnmodifiableSortedSet.unmodifiableSortedSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableSortedSetResult);
  }

  /**
   * Test {@link UnmodifiableSortedSet#unmodifiableSortedSet(SortedSet)}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link TreeSet#TreeSet()} add {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableSortedSet#unmodifiableSortedSet(SortedSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedSet UnmodifiableSortedSet.unmodifiableSortedSet(SortedSet)"})
  public void testUnmodifiableSortedSet_givenFoo_whenTreeSetAddFoo() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("foo");
    set.add("42");

    // Act
    SortedSet<Object> actualUnmodifiableSortedSetResult = UnmodifiableSortedSet.unmodifiableSortedSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableSortedSetResult);
  }

  /**
   * Test {@link UnmodifiableSortedSet#unmodifiableSortedSet(SortedSet)}.
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableSortedSet#unmodifiableSortedSet(SortedSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedSet UnmodifiableSortedSet.unmodifiableSortedSet(SortedSet)"})
  public void testUnmodifiableSortedSet_whenTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    SortedSet<Object> actualUnmodifiableSortedSetResult = UnmodifiableSortedSet.unmodifiableSortedSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableSortedSetResult);
  }
}
