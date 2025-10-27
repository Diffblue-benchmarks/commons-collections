package org.apache.commons.collections4.comparators;

import static org.junit.Assert.assertEquals;
import org.apache.commons.collections4.functors.ChainedTransformer;
import org.junit.Test;

public class TransformingComparatorDiffblueTest {
  /**
   * Method under test: {@link TransformingComparator#compare(Object, Object)}
   */
  @Test
  public void testCompare() {
    // Arrange
    TransformingComparator<Object, Object> transformingComparator = new TransformingComparator<>(
        new ChainedTransformer<>());

    // Act and Assert
    assertEquals(-1, transformingComparator.compare("Obj1", "Obj2"));
  }
}
