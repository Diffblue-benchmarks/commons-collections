package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.functors.AllPredicate;
import org.apache.commons.collections4.functors.DefaultEquator;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.TruePredicate;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.junit.Test;

public class FilterIteratorDiffblueTest {
  /**
   * Method under test: {@link FilterIterator#hasNext()}
   */
  @Test
  public void testHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();
    FilterIterator<Object> filterIterator = new FilterIterator<>(iterator, new AllPredicate<>(new UniquePredicate<>()));

    // Act and Assert
    assertFalse(filterIterator.hasNext());
  }

  /**
   * Method under test: {@link FilterIterator#hasNext()}
   */
  @Test
  public void testHasNext2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    FilterIterator<Object> filterIterator = new FilterIterator<>(iterator, new AllPredicate<>(new UniquePredicate<>()));

    // Act and Assert
    assertTrue(filterIterator.hasNext());
  }

  /**
   * Method under test: {@link FilterIterator#hasNext()}
   */
  @Test
  public void testHasNext3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();
    FilterIterator<Object> filterIterator = new FilterIterator<>(iterator,
        new AllPredicate<>(new EqualPredicate<>("Test", equator)));

    // Act and Assert
    assertFalse(filterIterator.hasNext());
  }

  /**
   * Method under test: {@link FilterIterator#hasNext()}
   */
  @Test
  public void testHasNext4() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    FilterIterator<Object> filterIterator = new FilterIterator<>(objectList.iterator(), null);

    // Act and Assert
    assertTrue(filterIterator.hasNext());
  }

  /**
   * Method under test: {@link FilterIterator#next()}
   */
  @Test
  public void testNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();
    FilterIterator<Object> filterIterator = new FilterIterator<>(iterator, new AllPredicate<>(new UniquePredicate<>()));

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> filterIterator.next());
  }

  /**
   * Method under test: {@link FilterIterator#next()}
   */
  @Test
  public void testNext2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    FilterIterator<Object> filterIterator = new FilterIterator<>(iterator, new AllPredicate<>(new UniquePredicate<>()));

    // Act and Assert
    assertEquals("42", filterIterator.next());
  }

  /**
   * Method under test: {@link FilterIterator#next()}
   */
  @Test
  public void testNext3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();
    FilterIterator<Object> filterIterator = new FilterIterator<>(iterator,
        new AllPredicate<>(new EqualPredicate<>("Test", equator)));

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> filterIterator.next());
  }

  /**
   * Method under test: {@link FilterIterator#next()}
   */
  @Test
  public void testNext4() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    FilterIterator<Object> filterIterator = new FilterIterator<>(objectList.iterator(), null);

    // Act and Assert
    assertEquals("42", filterIterator.next());
  }

  /**
   * Method under test: {@link FilterIterator#setIterator(Iterator)}
   */
  @Test
  public void testSetIterator() {
    // Arrange
    FilterIterator<Object> filterIterator = new FilterIterator<>();

    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    filterIterator.setIterator(objectList.iterator());

    // Assert
    assertFalse(filterIterator.hasNext());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link FilterIterator#getIterator()}
   *   <li>{@link FilterIterator#getPredicate()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    FilterIterator<Object> filterIterator = new FilterIterator<>();

    // Act
    Iterator<?> actualIterator = filterIterator.getIterator();

    // Assert
    assertTrue(filterIterator.getPredicate() instanceof TruePredicate);
    assertNull(actualIterator);
  }

  /**
   * Method under test: {@link FilterIterator#FilterIterator(Iterator)}
   */
  @Test
  public void testNewFilterIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    FilterIterator<Object> actualFilterIterator = new FilterIterator<>(objectList.iterator());

    // Assert
    assertFalse(actualFilterIterator.hasNext());
  }
}
