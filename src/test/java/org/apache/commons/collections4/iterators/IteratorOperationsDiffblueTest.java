package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.collections4.functors.AllPredicate;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.junit.Test;

public class IteratorOperationsDiffblueTest {
  /**
   * Method under test: {@link IteratorOperations#addTo(Collection)}
   */
  @Test
  public void testAddTo() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ExtendedIterator<Object> createResult = ExtendedIterator.create(objectList.iterator());
    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act
    Collection<Object> actualAddToResult = createResult.addTo(objectList2);

    // Assert
    assertTrue(actualAddToResult instanceof List);
    assertTrue(actualAddToResult.isEmpty());
    assertSame(objectList2, actualAddToResult);
  }

  /**
   * Method under test: {@link IteratorOperations#removeNext()}
   */
  @Test
  public void testRemoveNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    FilterIterator<Object> filterIterator = new FilterIterator<>(iterator, new AllPredicate<>(new UniquePredicate<>()));

    // Act and Assert
    assertEquals("42", filterIterator.removeNext());
  }

  /**
   * Method under test: {@link IteratorOperations#toList()}
   */
  @Test
  public void testToList() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ExtendedIterator<Object> createResult = ExtendedIterator.create(objectList.iterator());

    // Act and Assert
    assertTrue(createResult.toList().isEmpty());
  }

  /**
   * Method under test: {@link IteratorOperations#toSet()}
   */
  @Test
  public void testToSet() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ExtendedIterator<Object> createResult = ExtendedIterator.create(objectList.iterator());

    // Act and Assert
    assertTrue(createResult.toSet().isEmpty());
  }
}
