package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.BidiMap;
import org.junit.Test;

public class UnmodifiableBidiMapDiffblueTest {
  /**
   * Method under test: {@link UnmodifiableBidiMap#unmodifiableBidiMap(BidiMap)}
   */
  @Test
  public void testUnmodifiableBidiMap() {
    // Arrange and Act
    BidiMap<Object, Object> actualUnmodifiableBidiMapResult = UnmodifiableBidiMap
        .unmodifiableBidiMap(new DualHashBidiMap<>());

    // Assert
    assertTrue(actualUnmodifiableBidiMapResult.isEmpty());
  }
}
