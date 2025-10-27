package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.Closure;
import org.junit.Test;

public class ForClosureDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link ForClosure#ForClosure(int, Closure)}
   *   <li>{@link ForClosure#getClosure()}
   *   <li>{@link ForClosure#getCount()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    ChainedClosure<? super Object> closure = new ChainedClosure<>(null);

    // Act
    ForClosure<Object> actualForClosure = new ForClosure<>(3, closure);
    Closure<? super Object> actualClosure = actualForClosure.getClosure();

    // Assert
    assertTrue(actualClosure instanceof ChainedClosure);
    assertEquals(3, actualForClosure.getCount());
    assertSame(closure, actualClosure);
  }
}
