package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class IteratorEnumerationDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link IteratorEnumeration#IteratorEnumeration()}
   *   <li>{@link IteratorEnumeration#setIterator(Iterator)}
   *   <li>{@link IteratorEnumeration#getIterator()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void IteratorEnumeration.<init>()", "void IteratorEnumeration.<init>(Iterator)",
      "Iterator IteratorEnumeration.getIterator()", "void IteratorEnumeration.setIterator(Iterator)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    IteratorEnumeration<Object> actualIteratorEnumeration = new IteratorEnumeration<>();
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();
    actualIteratorEnumeration.setIterator(iterator);
    Iterator<?> actualIterator = actualIteratorEnumeration.getIterator();

    // Assert
    assertFalse(actualIterator.hasNext());
    assertSame(iterator, actualIterator);
  }

  /**
   * Test getters and setters.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link IteratorEnumeration#IteratorEnumeration(Iterator)}
   *   <li>{@link IteratorEnumeration#setIterator(Iterator)}
   *   <li>{@link IteratorEnumeration#getIterator()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void IteratorEnumeration.<init>()", "void IteratorEnumeration.<init>(Iterator)",
      "Iterator IteratorEnumeration.getIterator()", "void IteratorEnumeration.setIterator(Iterator)"})
  public void testGettersAndSetters_whenArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    IteratorEnumeration<Object> actualIteratorEnumeration = new IteratorEnumeration<>(objectList.iterator());
    ArrayList<Object> objectList2 = new ArrayList<>();
    Iterator<Object> iterator = objectList2.iterator();
    actualIteratorEnumeration.setIterator(iterator);
    Iterator<?> actualIterator = actualIteratorEnumeration.getIterator();

    // Assert
    assertFalse(actualIterator.hasNext());
    assertSame(iterator, actualIterator);
  }

  /**
   * Test {@link IteratorEnumeration#hasMoreElements()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorEnumeration#hasMoreElements()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorEnumeration.hasMoreElements()"})
  public void testHasMoreElements_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    IteratorEnumeration<Object> iteratorEnumeration = new IteratorEnumeration<>();
    iteratorEnumeration.setIterator(iterator);

    // Act and Assert
    assertTrue(iteratorEnumeration.hasMoreElements());
  }

  /**
   * Test {@link IteratorEnumeration#hasMoreElements()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorEnumeration#hasMoreElements()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean IteratorEnumeration.hasMoreElements()"})
  public void testHasMoreElements_thenReturnFalse() {
    // Arrange
    IteratorEnumeration<Object> iteratorEnumeration = new IteratorEnumeration<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iteratorEnumeration.setIterator(objectList.iterator());

    // Act and Assert
    assertFalse(iteratorEnumeration.hasMoreElements());
  }

  /**
   * Test {@link IteratorEnumeration#nextElement()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorEnumeration#nextElement()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IteratorEnumeration.nextElement()"})
  public void testNextElement_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    IteratorEnumeration<Object> iteratorEnumeration = new IteratorEnumeration<>();
    iteratorEnumeration.setIterator(iterator);

    // Act and Assert
    assertEquals("42", iteratorEnumeration.nextElement());
    assertFalse(iteratorEnumeration.getIterator().hasNext());
    assertFalse(iteratorEnumeration.hasMoreElements());
  }
}
