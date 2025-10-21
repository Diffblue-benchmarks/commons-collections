package org.apache.commons.collections4.multiset;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.MultiSet;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class UnmodifiableMultiSetDiffblueTest {
  /**
   * Test {@link UnmodifiableMultiSet#unmodifiableMultiSet(MultiSet)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashMultiSet#HashMultiSet()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableMultiSet#unmodifiableMultiSet(MultiSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MultiSet UnmodifiableMultiSet.unmodifiableMultiSet(MultiSet)"})
  public void testUnmodifiableMultiSet_givenObject_whenHashMultiSetAddObject() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");

    // Act
    MultiSet<Object> actualUnmodifiableMultiSetResult = UnmodifiableMultiSet.unmodifiableMultiSet(multiset);

    // Assert
    assertEquals(multiset, actualUnmodifiableMultiSetResult);
  }

  /**
   * Test {@link UnmodifiableMultiSet#unmodifiableMultiSet(MultiSet)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashMultiSet#HashMultiSet()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableMultiSet#unmodifiableMultiSet(MultiSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MultiSet UnmodifiableMultiSet.unmodifiableMultiSet(MultiSet)"})
  public void testUnmodifiableMultiSet_givenObject_whenHashMultiSetAddObject2() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");
    multiset.add("Object");

    // Act
    MultiSet<Object> actualUnmodifiableMultiSetResult = UnmodifiableMultiSet.unmodifiableMultiSet(multiset);

    // Assert
    assertEquals(multiset, actualUnmodifiableMultiSetResult);
  }

  /**
   * Test {@link UnmodifiableMultiSet#unmodifiableMultiSet(MultiSet)}.
   * <ul>
   *   <li>When {@link HashMultiSet#HashMultiSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableMultiSet#unmodifiableMultiSet(MultiSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MultiSet UnmodifiableMultiSet.unmodifiableMultiSet(MultiSet)"})
  public void testUnmodifiableMultiSet_whenHashMultiSet() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();

    // Act
    MultiSet<Object> actualUnmodifiableMultiSetResult = UnmodifiableMultiSet.unmodifiableMultiSet(multiset);

    // Assert
    assertEquals(multiset, actualUnmodifiableMultiSetResult);
  }
}
