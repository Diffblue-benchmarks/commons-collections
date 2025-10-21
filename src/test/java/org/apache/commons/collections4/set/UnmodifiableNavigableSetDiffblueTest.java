package org.apache.commons.collections4.set;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.NavigableSet;
import java.util.TreeSet;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class UnmodifiableNavigableSetDiffblueTest {
  /**
   * Test {@link UnmodifiableNavigableSet#unmodifiableNavigableSet(NavigableSet)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link TreeSet#TreeSet()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableNavigableSet#unmodifiableNavigableSet(NavigableSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"NavigableSet UnmodifiableNavigableSet.unmodifiableNavigableSet(NavigableSet)"})
  public void testUnmodifiableNavigableSet_given42_whenTreeSetAdd42() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("42");

    // Act
    NavigableSet<Object> actualUnmodifiableNavigableSetResult = UnmodifiableNavigableSet.unmodifiableNavigableSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableNavigableSetResult);
  }

  /**
   * Test {@link UnmodifiableNavigableSet#unmodifiableNavigableSet(NavigableSet)}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link TreeSet#TreeSet()} add {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableNavigableSet#unmodifiableNavigableSet(NavigableSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"NavigableSet UnmodifiableNavigableSet.unmodifiableNavigableSet(NavigableSet)"})
  public void testUnmodifiableNavigableSet_givenFoo_whenTreeSetAddFoo() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();
    set.add("foo");
    set.add("42");

    // Act
    NavigableSet<Object> actualUnmodifiableNavigableSetResult = UnmodifiableNavigableSet.unmodifiableNavigableSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableNavigableSetResult);
  }

  /**
   * Test {@link UnmodifiableNavigableSet#unmodifiableNavigableSet(NavigableSet)}.
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableNavigableSet#unmodifiableNavigableSet(NavigableSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"NavigableSet UnmodifiableNavigableSet.unmodifiableNavigableSet(NavigableSet)"})
  public void testUnmodifiableNavigableSet_whenTreeSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    NavigableSet<Object> actualUnmodifiableNavigableSetResult = UnmodifiableNavigableSet.unmodifiableNavigableSet(set);

    // Assert
    assertEquals(set, actualUnmodifiableNavigableSetResult);
  }
}
