package org.apache.commons.collections4.set;

import static org.junit.Assert.assertTrue;
import java.util.NavigableSet;
import java.util.TreeSet;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.ChainedTransformer;
import org.apache.commons.collections4.functors.ClosureTransformer;
import org.junit.Test;

public class TransformedNavigableSetDiffblueTest {
  /**
   * Method under test:
   * {@link TransformedNavigableSet#TransformedNavigableSet(NavigableSet, Transformer)}
   */
  @Test
  public void testNewTransformedNavigableSet() {
    // Arrange
    TreeSet<Object> set = new TreeSet<>();

    // Act
    TransformedNavigableSet<Object> actualObjectSet = new TransformedNavigableSet<>(set,
        new ChainedTransformer<>(new ClosureTransformer<>(null)));

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }
}
