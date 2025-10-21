package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ListIterator;
import org.apache.commons.collections4.ResettableListIterator;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class EmptyListIteratorDiffblueTest {
  /**
   * Test {@link EmptyListIterator#emptyListIterator()}.
   * <p>
   * Method under test: {@link EmptyListIterator#emptyListIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ListIterator EmptyListIterator.emptyListIterator()"})
  public void testEmptyListIterator() {
    // Arrange and Act
    ListIterator<Object> actualEmptyListIteratorResult = EmptyListIterator.emptyListIterator();

    // Assert
    assertTrue(actualEmptyListIteratorResult instanceof EmptyListIterator);
    assertFalse(actualEmptyListIteratorResult.hasNext());
  }

  /**
   * Test {@link EmptyListIterator#resettableEmptyListIterator()}.
   * <p>
   * Method under test: {@link EmptyListIterator#resettableEmptyListIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ResettableListIterator EmptyListIterator.resettableEmptyListIterator()"})
  public void testResettableEmptyListIterator() {
    // Arrange and Act
    ResettableListIterator<Object> actualResettableEmptyListIteratorResult = EmptyListIterator
        .resettableEmptyListIterator();

    // Assert
    assertTrue(actualResettableEmptyListIteratorResult instanceof EmptyListIterator);
    assertFalse(actualResettableEmptyListIteratorResult.hasNext());
  }

  /**
   * Test {@link EmptyListIterator#EmptyListIterator()}.
   * <p>
   * Method under test: default or parameterless constructor of {@link EmptyListIterator}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EmptyListIterator.<init>()"})
  public void testNewEmptyListIterator() {
    // Arrange and Act
    EmptyListIterator<Object> actualEmptyListIterator = new EmptyListIterator<>();

    // Assert
    assertFalse(actualEmptyListIterator.hasNext());
  }
}
