package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertFalse;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class IteratorIterableDiffblueTest {
  /**
   * Test {@link IteratorIterable#IteratorIterable(Iterator)}.
   * <p>
   * Method under test: {@link IteratorIterable#IteratorIterable(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void IteratorIterable.<init>(Iterator)"})
  public void testNewIteratorIterable() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    IteratorIterable<Object> actualIteratorIterable = new IteratorIterable<>(objectList.iterator());

    // Assert
    assertFalse(actualIteratorIterable.iterator().hasNext());
  }

  /**
   * Test {@link IteratorIterable#IteratorIterable(Iterator, boolean)}.
   * <ul>
   *   <li>When {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorIterable#IteratorIterable(Iterator, boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void IteratorIterable.<init>(Iterator, boolean)"})
  public void testNewIteratorIterable_whenFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    IteratorIterable<Object> actualIteratorIterable = new IteratorIterable<>(objectList.iterator(), false);

    // Assert
    assertFalse(actualIteratorIterable.iterator().hasNext());
  }

  /**
   * Test {@link IteratorIterable#IteratorIterable(Iterator, boolean)}.
   * <ul>
   *   <li>When {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorIterable#IteratorIterable(Iterator, boolean)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void IteratorIterable.<init>(Iterator, boolean)"})
  public void testNewIteratorIterable_whenTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    IteratorIterable<Object> actualIteratorIterable = new IteratorIterable<>(objectList.iterator(), true);

    // Assert
    assertFalse(actualIteratorIterable.iterator().hasNext());
  }

  /**
   * Test {@link IteratorIterable#iterator()}.
   * <p>
   * Method under test: {@link IteratorIterable#iterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorIterable.iterator()"})
  public void testIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    IteratorIterable<Object> iteratorIterable = new IteratorIterable<>(objectList.iterator(), true);

    // Act and Assert
    assertFalse(iteratorIterable.iterator().hasNext());
  }

  /**
   * Test {@link IteratorIterable#iterator()}.
   * <ul>
   *   <li>Given {@link IteratorIterable#IteratorIterable(Iterator)} with iterator is {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorIterable#iterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator IteratorIterable.iterator()"})
  public void testIterator_givenIteratorIterableWithIteratorIsArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    IteratorIterable<Object> iteratorIterable = new IteratorIterable<>(objectList.iterator());

    // Act and Assert
    assertFalse(iteratorIterable.iterator().hasNext());
  }
}
