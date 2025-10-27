package org.apache.commons.collections4.splitmap;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class AbstractIterableGetMapDecoratorDiffblueTest {
  /**
   * Method under test:
   * {@link AbstractIterableGetMapDecorator#AbstractIterableGetMapDecorator()}
   */
  @Test
  public void testNewAbstractIterableGetMapDecorator() {
    // Arrange and Act
    AbstractIterableGetMapDecorator<Object, Object> actualAbstractIterableGetMapDecorator = new AbstractIterableGetMapDecorator<>();

    // Assert
    assertNull(actualAbstractIterableGetMapDecorator.map);
  }
}
