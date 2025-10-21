package org.apache.commons.collections4.comparators;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ReverseComparatorDiffblueTest {
  /**
   * Test {@link ReverseComparator#ReverseComparator()}.
   * <ul>
   *   <li>Then return compare {@code Obj1} and {@code Obj2} is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReverseComparator#ReverseComparator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ReverseComparator.<init>()"})
  public void testNewReverseComparator_thenReturnCompareObj1AndObj2IsOne() {
    // Arrange and Act
    ReverseComparator<Object> actualReverseComparator = new ReverseComparator<>();

    // Assert
    assertEquals(1, actualReverseComparator.compare("Obj1", "Obj2"));
  }

  /**
   * Test {@link ReverseComparator#compare(Object, Object)}.
   * <ul>
   *   <li>When {@code Obj1}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReverseComparator#compare(Object, Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ReverseComparator.compare(Object, Object)"})
  public void testCompare_whenObj1_thenReturnOne() {
    // Arrange
    ReverseComparator<Object> reverseComparator = new ReverseComparator<>();

    // Act and Assert
    assertEquals(1, reverseComparator.compare("Obj1", "Obj2"));
  }
}
