package org.apache.commons.collections4.bag;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.SortedBag;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class UnmodifiableSortedBagDiffblueTest {
  /**
   * Test {@link UnmodifiableSortedBag#unmodifiableSortedBag(SortedBag)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableSortedBag#unmodifiableSortedBag(SortedBag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedBag UnmodifiableSortedBag.unmodifiableSortedBag(SortedBag)"})
  public void testUnmodifiableSortedBag_givenObject_whenTreeBagAddObject() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");

    // Act
    SortedBag<Object> actualUnmodifiableSortedBagResult = UnmodifiableSortedBag.unmodifiableSortedBag(bag);

    // Assert
    assertEquals(bag, actualUnmodifiableSortedBagResult);
  }

  /**
   * Test {@link UnmodifiableSortedBag#unmodifiableSortedBag(SortedBag)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link TreeBag#TreeBag()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableSortedBag#unmodifiableSortedBag(SortedBag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedBag UnmodifiableSortedBag.unmodifiableSortedBag(SortedBag)"})
  public void testUnmodifiableSortedBag_givenObject_whenTreeBagAddObject2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");

    // Act
    SortedBag<Object> actualUnmodifiableSortedBagResult = UnmodifiableSortedBag.unmodifiableSortedBag(bag);

    // Assert
    assertEquals(bag, actualUnmodifiableSortedBagResult);
  }

  /**
   * Test {@link UnmodifiableSortedBag#unmodifiableSortedBag(SortedBag)}.
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableSortedBag#unmodifiableSortedBag(SortedBag)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"SortedBag UnmodifiableSortedBag.unmodifiableSortedBag(SortedBag)"})
  public void testUnmodifiableSortedBag_whenTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act
    SortedBag<Object> actualUnmodifiableSortedBagResult = UnmodifiableSortedBag.unmodifiableSortedBag(bag);

    // Assert
    assertEquals(bag, actualUnmodifiableSortedBagResult);
  }
}
