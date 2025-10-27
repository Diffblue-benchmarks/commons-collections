package org.apache.commons.collections4.comparators;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReverseComparatorDiffblueTest {
  /**
   * Method under test: {@link ReverseComparator#compare(Object, Object)}
   */
  @Test
  public void testCompare() {
    // Arrange
    ReverseComparator<Object> reverseComparator = new ReverseComparator<>();

    // Act and Assert
    assertEquals(1, reverseComparator.compare("Obj1", "Obj2"));
  }

  /**
   * Method under test: {@link ReverseComparator#ReverseComparator()}
   */
  @Test
  public void testNewReverseComparator() {
    // Arrange and Act
    ReverseComparator<Object> actualReverseComparator = new ReverseComparator<>();

    // Assert
    assertEquals(1, actualReverseComparator.compare("Obj1", "Obj2"));
  }
}
