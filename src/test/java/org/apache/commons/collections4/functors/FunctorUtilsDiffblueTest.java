package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.google.common.collect.Range;
import java.util.function.Function;
import java.util.function.Predicate;
import org.junit.Test;
import org.junit.vintage.engine.support.UniqueIdReader;

public class FunctorUtilsDiffblueTest {
  /**
   * Method under test: {@link FunctorUtils#copy(Function[])}
   */
  @Test
  public void testCopy() {
    // Arrange
    UniqueIdReader uniqueIdReader = new UniqueIdReader();

    // Act
    Function<?, ?>[] actualCopyResult = FunctorUtils.copy(uniqueIdReader);

    // Assert
    Function<?, ?> function = actualCopyResult[0];
    assertTrue(function instanceof UniqueIdReader);
    assertEquals(1, actualCopyResult.length);
    assertSame(uniqueIdReader, function);
  }

  /**
   * Method under test: {@link FunctorUtils#copy(Predicate[])}
   */
  @Test
  public void testCopy2() {
    // Arrange
    Range<Comparable<?>> allResult = Range.all();

    // Act
    Predicate<?>[] actualCopyResult = FunctorUtils.copy(allResult);

    // Assert
    Predicate<?> predicate = actualCopyResult[0];
    assertTrue(predicate instanceof Range);
    assertEquals(1, actualCopyResult.length);
    assertFalse(((Range<Comparable>) predicate).isEmpty());
    assertSame(allResult, predicate);
  }
}
