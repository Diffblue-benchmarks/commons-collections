package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertSame;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class SwitchClosureDiffblueTest {
  /**
   * Method under test: {@link SwitchClosure#getDefaultClosure()}
   */
  @Test
  public void testGetDefaultClosure() {
    // Arrange
    ChainedClosure<? super Object> defaultClosure = new ChainedClosure<>(new ForClosure<>(3, null));
    SwitchClosure<Object> switchClosure = new SwitchClosure<>(
        new Predicate[]{new AllPredicate<>(new UniquePredicate<>())}, new Closure[]{new ChainedClosure<>(null)},
        defaultClosure);

    // Act and Assert
    assertSame(defaultClosure, switchClosure.getDefaultClosure());
  }
}
