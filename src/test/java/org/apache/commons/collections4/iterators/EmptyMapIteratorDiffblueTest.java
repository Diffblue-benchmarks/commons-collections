package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.MapIterator;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class EmptyMapIteratorDiffblueTest {
  /**
   * Test {@link EmptyMapIterator#emptyMapIterator()}.
   * <p>
   * Method under test: {@link EmptyMapIterator#emptyMapIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MapIterator EmptyMapIterator.emptyMapIterator()"})
  public void testEmptyMapIterator() {
    // Arrange and Act
    MapIterator<Object, Object> actualEmptyMapIteratorResult = EmptyMapIterator.emptyMapIterator();

    // Assert
    assertTrue(actualEmptyMapIteratorResult instanceof EmptyMapIterator);
    assertFalse(actualEmptyMapIteratorResult.hasNext());
  }

  /**
   * Test {@link EmptyMapIterator#EmptyMapIterator()}.
   * <p>
   * Method under test: default or parameterless constructor of {@link EmptyMapIterator}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EmptyMapIterator.<init>()"})
  public void testNewEmptyMapIterator() {
    // Arrange and Act
    EmptyMapIterator<Object, Object> actualEmptyMapIterator = new EmptyMapIterator<>();

    // Assert
    assertFalse(actualEmptyMapIterator.hasNext());
  }
}
