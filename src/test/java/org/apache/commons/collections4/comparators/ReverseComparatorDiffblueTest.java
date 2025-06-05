package org.apache.commons.collections4.comparators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ReverseComparatorDiffblueTest {
  /**
   * Test {@link ReverseComparator#ReverseComparator()}.
   * <ul>
   *   <li>Then return compare {@code Obj1} and {@code Obj2} is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ReverseComparator#ReverseComparator()}
   */
  @Test
  @DisplayName("Test new ReverseComparator(); then return compare 'Obj1' and 'Obj2' is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void ReverseComparator.<init>()"})
  void testNewReverseComparator_thenReturnCompareObj1AndObj2IsOne() {
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
  @DisplayName("Test compare(Object, Object); when 'Obj1'; then return one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int ReverseComparator.compare(Object, Object)"})
  void testCompare_whenObj1_thenReturnOne() {
    // Arrange
    ReverseComparator<Object> reverseComparator = new ReverseComparator<>();

    // Act and Assert
    assertEquals(1, reverseComparator.compare("Obj1", "Obj2"));
  }
}
