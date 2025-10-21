package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.OrderedMapIterator;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class EmptyOrderedMapIteratorDiffblueTest {
  /**
   * Test {@link EmptyOrderedMapIterator#emptyOrderedMapIterator()}.
   * <p>
   * Method under test: {@link EmptyOrderedMapIterator#emptyOrderedMapIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"OrderedMapIterator EmptyOrderedMapIterator.emptyOrderedMapIterator()"})
  public void testEmptyOrderedMapIterator() {
    // Arrange and Act
    OrderedMapIterator<Object, Object> actualEmptyOrderedMapIteratorResult = EmptyOrderedMapIterator
        .emptyOrderedMapIterator();

    // Assert
    assertTrue(actualEmptyOrderedMapIteratorResult instanceof EmptyOrderedMapIterator);
    assertFalse(actualEmptyOrderedMapIteratorResult.hasNext());
  }

  /**
   * Test {@link EmptyOrderedMapIterator#EmptyOrderedMapIterator()}.
   * <p>
   * Method under test: default or parameterless constructor of {@link EmptyOrderedMapIterator}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EmptyOrderedMapIterator.<init>()"})
  public void testNewEmptyOrderedMapIterator() {
    // Arrange and Act
    EmptyOrderedMapIterator<Object, Object> actualEmptyOrderedMapIterator = new EmptyOrderedMapIterator<>();

    // Assert
    assertFalse(actualEmptyOrderedMapIterator.hasNext());
  }
}
