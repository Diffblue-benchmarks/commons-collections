package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class IteratorOperationsDiffblueTest {
  /**
   * Test {@link IteratorOperations#addTo(Collection)}.
   * <ul>
   *   <li>Given create {@link ArrayList#ArrayList()} iterator.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorOperations#addTo(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection IteratorOperations.addTo(Collection)"})
  public void testAddTo_givenCreateArrayListIterator_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ExtendedIterator<Object> createResult = ExtendedIterator.create(objectList.iterator());
    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act and Assert
    assertSame(objectList2, createResult.addTo(objectList2));
  }

  /**
   * Test {@link IteratorOperations#removeNext()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorOperations#removeNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object IteratorOperations.removeNext()"})
  public void testRemoveNext_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    UniqueFilterIterator<Object> uniqueFilterIterator = new UniqueFilterIterator<>(objectList.iterator());

    // Act and Assert
    assertEquals("42", uniqueFilterIterator.removeNext());
  }

  /**
   * Test {@link IteratorOperations#toCollection(Supplier)}.
   * <ul>
   *   <li>Then return {@link List}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorOperations#toCollection(Supplier)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection IteratorOperations.toCollection(Supplier)"})
  public void testToCollection_thenReturnList() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    FilterIterator<Object> filterIterator = new FilterIterator<>(objectList.iterator(), mock(Predicate.class));
    Supplier<Collection<Object>> collectionSupplier = mock(Supplier.class);
    ArrayList<Object> objectList2 = new ArrayList<>();
    when(collectionSupplier.get()).thenReturn(objectList2);

    // Act
    Collection<Object> actualToCollectionResult = filterIterator.toCollection(collectionSupplier);

    // Assert
    verify(collectionSupplier).get();
    assertTrue(actualToCollectionResult instanceof List);
    assertTrue(actualToCollectionResult.isEmpty());
    assertSame(objectList2, actualToCollectionResult);
  }

  /**
   * Test {@link IteratorOperations#toList()}.
   * <ul>
   *   <li>Given create {@link ArrayList#ArrayList()} iterator.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorOperations#toList()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List IteratorOperations.toList()"})
  public void testToList_givenCreateArrayListIterator_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ExtendedIterator<Object> createResult = ExtendedIterator.create(objectList.iterator());

    // Act and Assert
    assertTrue(createResult.toList().isEmpty());
  }

  /**
   * Test {@link IteratorOperations#toSet()}.
   * <ul>
   *   <li>Given create {@link ArrayList#ArrayList()} iterator.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IteratorOperations#toSet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set IteratorOperations.toSet()"})
  public void testToSet_givenCreateArrayListIterator_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ExtendedIterator<Object> createResult = ExtendedIterator.create(objectList.iterator());

    // Act and Assert
    assertTrue(createResult.toSet().isEmpty());
  }
}
