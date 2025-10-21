package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class CollatingIteratorDiffblueTest {
  /**
   * Test {@link CollatingIterator#CollatingIterator()}.
   * <p>
   * Method under test: {@link CollatingIterator#CollatingIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CollatingIterator.<init>()"})
  public void testNewCollatingIterator() {
    // Arrange and Act
    CollatingIterator<Object> actualCollatingIterator = new CollatingIterator<>();

    // Assert
    assertFalse(actualCollatingIterator.hasNext());
  }

  /**
   * Test {@link CollatingIterator#getComparator()}.
   * <p>
   * Method under test: {@link CollatingIterator#getComparator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Comparator CollatingIterator.getComparator()"})
  public void testGetComparator() {
    // Arrange
    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();

    // Act and Assert
    assertNull(collatingIterator.getComparator());
  }

  /**
   * Test {@link CollatingIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollatingIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollatingIterator.hasNext()"})
  public void testHasNext_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();
    collatingIterator.addIterator(iterator);

    // Act and Assert
    assertTrue(collatingIterator.hasNext());
  }

  /**
   * Test {@link CollatingIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link CollatingIterator#CollatingIterator()} addIterator {@link ArrayList#ArrayList()} iterator.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollatingIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollatingIterator.hasNext()"})
  public void testHasNext_givenCollatingIteratorAddIteratorArrayListIterator_thenReturnFalse() {
    // Arrange
    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();

    ArrayList<Object> objectList = new ArrayList<>();
    collatingIterator.addIterator(objectList.iterator());

    // Act and Assert
    assertFalse(collatingIterator.hasNext());
  }

  /**
   * Test {@link CollatingIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link CollatingIterator#CollatingIterator()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollatingIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CollatingIterator.hasNext()"})
  public void testHasNext_givenCollatingIterator_thenReturnFalse() {
    // Arrange
    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();

    // Act and Assert
    assertFalse(collatingIterator.hasNext());
  }

  /**
   * Test {@link CollatingIterator#next()}.
   * <ul>
   *   <li>Given {@link CollatingIterator#CollatingIterator()}.</li>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollatingIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollatingIterator.next()"})
  public void testNext_givenCollatingIterator_thenThrowNoSuchElementException() throws NoSuchElementException {
    // Arrange
    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> collatingIterator.next());
  }

  /**
   * Test {@link CollatingIterator#next()}.
   * <ul>
   *   <li>Then not {@link CollatingIterator#CollatingIterator()} hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollatingIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollatingIterator.next()"})
  public void testNext_thenNotCollatingIteratorHasNext() throws NoSuchElementException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();
    collatingIterator.addIterator(iterator);

    // Act and Assert
    assertEquals("42", collatingIterator.next());
    assertFalse(collatingIterator.hasNext());
  }

  /**
   * Test {@link CollatingIterator#next()}.
   * <ul>
   *   <li>Then not {@link CollatingIterator#CollatingIterator()} hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollatingIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollatingIterator.next()"})
  public void testNext_thenNotCollatingIteratorHasNext2() throws NoSuchElementException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();

    ArrayList<Object> objectList2 = new ArrayList<>();
    collatingIterator.addIterator(objectList2.iterator());
    collatingIterator.addIterator(iterator);

    // Act and Assert
    assertEquals("42", collatingIterator.next());
    assertFalse(collatingIterator.hasNext());
  }

  /**
   * Test {@link CollatingIterator#next()}.
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollatingIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollatingIterator.next()"})
  public void testNext_thenThrowIllegalStateException() throws NoSuchElementException {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    objectList2.add("42");
    Iterator<Object> iterator2 = objectList2.iterator();
    Comparator<Object> comp = mock(Comparator.class);
    when(comp.compare(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(new IllegalStateException("You must invoke setComparator() to set a comparator first."));

    CollatingIterator<Object> collatingIterator = new CollatingIterator<>(comp, 1);
    collatingIterator.addIterator(iterator2);
    collatingIterator.addIterator(iterator);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> collatingIterator.next());
    verify(comp).compare(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link CollatingIterator#next()}.
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CollatingIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object CollatingIterator.next()"})
  public void testNext_thenThrowNoSuchElementException() throws NoSuchElementException {
    // Arrange
    CollatingIterator<Object> collatingIterator = new CollatingIterator<>();

    ArrayList<Object> objectList = new ArrayList<>();
    collatingIterator.addIterator(objectList.iterator());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> collatingIterator.next());
  }
}
