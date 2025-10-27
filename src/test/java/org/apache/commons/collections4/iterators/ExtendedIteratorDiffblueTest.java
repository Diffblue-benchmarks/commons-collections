package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.commons.collections4.functors.AllPredicate;
import org.apache.commons.collections4.functors.AndPredicate;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.junit.Test;

public class ExtendedIteratorDiffblueTest {
  /**
   * Method under test: {@link ExtendedIterator#create(Iterator)}
   */
  @Test
  public void testCreate() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    ExtendedIterator<Object> actualCreateResult = ExtendedIterator.create(objectList.iterator());

    // Assert
    assertFalse(actualCreateResult.hasNext());
  }

  /**
   * Method under test: {@link ExtendedIterator#create(Stream)}
   */
  @Test
  public void testCreate2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Stream<Object> stream = objectList.stream();

    // Act
    ExtendedIterator<Object> actualCreateResult = ExtendedIterator.create(stream);

    // Assert
    assertFalse(actualCreateResult.hasNext());
  }

  /**
   * Method under test: {@link ExtendedIterator#createNoRemove(Iterator)}
   */
  @Test
  public void testCreateNoRemove() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    ExtendedIterator<Object> actualCreateNoRemoveResult = ExtendedIterator.createNoRemove(objectList.iterator());

    // Assert
    assertFalse(actualCreateNoRemoveResult.hasNext());
  }

  /**
   * Method under test: {@link ExtendedIterator#emptyIterator()}
   */
  @Test
  public void testEmptyIterator() {
    // Arrange and Act
    ExtendedIterator<?> actualEmptyIteratorResult = ExtendedIterator.emptyIterator();

    // Assert
    assertFalse(actualEmptyIteratorResult.hasNext());
  }

  /**
   * Method under test: {@link ExtendedIterator#flatten(Iterator)}
   */
  @Test
  public void testFlatten() {
    // Arrange
    ArrayList<Iterator<Object>> iteratorList = new ArrayList<>();

    // Act
    ExtendedIterator<Object> actualFlattenResult = ExtendedIterator.flatten(iteratorList.iterator());

    // Assert
    assertFalse(actualFlattenResult.hasNext());
  }

  /**
   * Method under test: {@link ExtendedIterator#andThen(Iterator)}
   */
  @Test
  public void testAndThen() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ExtendedIterator<Object> createResult = ExtendedIterator.create(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act and Assert
    assertFalse(createResult.andThen(objectList2.iterator()).hasNext());
  }

  /**
   * Method under test: {@link ExtendedIterator#filter(Predicate)}
   */
  @Test
  public void testFilter() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ExtendedIterator<Object> createResult = ExtendedIterator.create(objectList.iterator());
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();

    // Act and Assert
    assertFalse(
        createResult.filter(new AllPredicate<>(new AndPredicate<>(predicate1, new UniquePredicate<>()))).hasNext());
  }

  /**
   * Method under test: {@link ExtendedIterator#hasNext()}
   */
  @Test
  public void testHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ExtendedIterator<Object> createResult = ExtendedIterator.create(objectList.iterator());

    // Act and Assert
    assertFalse(createResult.hasNext());
  }

  /**
   * Method under test: {@link ExtendedIterator#hasNext()}
   */
  @Test
  public void testHasNext2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    ExtendedIterator<Object> createResult = ExtendedIterator.create(objectList.iterator());

    // Act and Assert
    assertTrue(createResult.hasNext());
  }

  /**
   * Method under test: {@link ExtendedIterator#next()}
   */
  @Test
  public void testNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    ExtendedIterator<Object> createResult = ExtendedIterator.create(objectList.iterator());

    // Act and Assert
    assertEquals("42", createResult.next());
  }

  /**
   * Method under test: {@link ExtendedIterator#remove()}
   */
  @Test
  public void testRemove() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Stream<Object> stream = objectList.stream();
    ExtendedIterator<Object> createResult = ExtendedIterator.create(stream);

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> createResult.remove());
  }
}
