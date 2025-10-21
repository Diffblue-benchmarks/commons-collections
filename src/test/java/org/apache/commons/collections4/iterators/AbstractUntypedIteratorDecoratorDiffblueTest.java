package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AbstractUntypedIteratorDecoratorDiffblueTest {
  /**
   * Test {@link AbstractUntypedIteratorDecorator#getIterator()}.
   * <p>
   * Method under test: {@link AbstractUntypedIteratorDecorator#getIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Iterator AbstractUntypedIteratorDecorator.getIterator()"})
  public void testGetIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    SkippingIterator<Object> skippingIterator = new SkippingIterator<>(objectList.iterator(), 1L);

    // Act and Assert
    assertFalse(skippingIterator.getIterator().hasNext());
  }

  /**
   * Test {@link AbstractUntypedIteratorDecorator#hasNext()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractUntypedIteratorDecorator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractUntypedIteratorDecorator.hasNext()"})
  public void testHasNext_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    SkippingIterator<Object> skippingIterator = new SkippingIterator<>(objectList.iterator(), 1L);

    // Act and Assert
    assertTrue(skippingIterator.hasNext());
  }

  /**
   * Test {@link AbstractUntypedIteratorDecorator#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractUntypedIteratorDecorator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractUntypedIteratorDecorator.hasNext()"})
  public void testHasNext_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    SkippingIterator<Object> skippingIterator = new SkippingIterator<>(objectList.iterator(), 1L);

    // Act and Assert
    assertFalse(skippingIterator.hasNext());
  }
}
