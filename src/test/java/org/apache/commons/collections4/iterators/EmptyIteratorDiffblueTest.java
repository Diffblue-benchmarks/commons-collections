package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Iterator;
import org.apache.commons.collections4.ResettableIterator;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class EmptyIteratorDiffblueTest {
  /**
   * Test {@link EmptyIterator#emptyIterator()}.
   * <p>
   * Method under test: {@link EmptyIterator#emptyIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator EmptyIterator.emptyIterator()"})
  public void testEmptyIterator() {
    // Arrange and Act
    Iterator<Object> actualEmptyIteratorResult = EmptyIterator.emptyIterator();

    // Assert
    assertTrue(actualEmptyIteratorResult instanceof EmptyIterator);
    assertFalse(actualEmptyIteratorResult.hasNext());
  }

  /**
   * Test {@link EmptyIterator#resettableEmptyIterator()}.
   * <p>
   * Method under test: {@link EmptyIterator#resettableEmptyIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ResettableIterator EmptyIterator.resettableEmptyIterator()"})
  public void testResettableEmptyIterator() {
    // Arrange and Act
    ResettableIterator<Object> actualResettableEmptyIteratorResult = EmptyIterator.resettableEmptyIterator();

    // Assert
    assertTrue(actualResettableEmptyIteratorResult instanceof EmptyIterator);
    assertFalse(actualResettableEmptyIteratorResult.hasNext());
  }

  /**
   * Test {@link EmptyIterator#EmptyIterator()}.
   * <p>
   * Method under test: default or parameterless constructor of {@link EmptyIterator}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EmptyIterator.<init>()"})
  public void testNewEmptyIterator() {
    // Arrange and Act
    EmptyIterator<Object> actualEmptyIterator = new EmptyIterator<>();

    // Assert
    assertFalse(actualEmptyIterator.hasNext());
  }
}
