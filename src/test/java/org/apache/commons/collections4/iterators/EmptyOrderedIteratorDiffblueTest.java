package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.OrderedIterator;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class EmptyOrderedIteratorDiffblueTest {
  /**
   * Test {@link EmptyOrderedIterator#emptyOrderedIterator()}.
   * <p>
   * Method under test: {@link EmptyOrderedIterator#emptyOrderedIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"OrderedIterator EmptyOrderedIterator.emptyOrderedIterator()"})
  public void testEmptyOrderedIterator() {
    // Arrange and Act
    OrderedIterator<Object> actualEmptyOrderedIteratorResult = EmptyOrderedIterator.emptyOrderedIterator();

    // Assert
    assertTrue(actualEmptyOrderedIteratorResult instanceof EmptyOrderedIterator);
    assertFalse(actualEmptyOrderedIteratorResult.hasNext());
  }

  /**
   * Test {@link EmptyOrderedIterator#EmptyOrderedIterator()}.
   * <p>
   * Method under test: default or parameterless constructor of {@link EmptyOrderedIterator}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EmptyOrderedIterator.<init>()"})
  public void testNewEmptyOrderedIterator() {
    // Arrange and Act
    EmptyOrderedIterator<Object> actualEmptyOrderedIterator = new EmptyOrderedIterator<>();

    // Assert
    assertFalse(actualEmptyOrderedIterator.hasNext());
  }
}
