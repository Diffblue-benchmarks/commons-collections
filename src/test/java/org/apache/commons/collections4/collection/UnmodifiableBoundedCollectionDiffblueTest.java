package org.apache.commons.collections4.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.collections4.BoundedCollection;
import org.apache.commons.collections4.queue.CircularFifoQueue;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class UnmodifiableBoundedCollectionDiffblueTest {
  /**
   * Test {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(BoundedCollection)} with {@code coll}.
   * <ul>
   *   <li>Given {@code Element}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(BoundedCollection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({
      "BoundedCollection UnmodifiableBoundedCollection.unmodifiableBoundedCollection(BoundedCollection)"})
  public void testUnmodifiableBoundedCollectionWithColl_givenElement_thenReturnSizeIsOne() {
    // Arrange
    CircularFifoQueue<Object> coll = new CircularFifoQueue<>();
    coll.add("Element");

    // Act
    BoundedCollection<Object> actualUnmodifiableBoundedCollectionResult = UnmodifiableBoundedCollection
        .unmodifiableBoundedCollection((BoundedCollection<?>) coll);

    // Assert
    assertEquals(1, actualUnmodifiableBoundedCollectionResult.size());
  }

  /**
   * Test {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(BoundedCollection)} with {@code coll}.
   * <ul>
   *   <li>Given {@code Element}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(BoundedCollection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({
      "BoundedCollection UnmodifiableBoundedCollection.unmodifiableBoundedCollection(BoundedCollection)"})
  public void testUnmodifiableBoundedCollectionWithColl_givenElement_thenReturnSizeIsTwo() {
    // Arrange
    CircularFifoQueue<Object> coll = new CircularFifoQueue<>();
    coll.add("Element");
    coll.add("Element");

    // Act
    BoundedCollection<Object> actualUnmodifiableBoundedCollectionResult = UnmodifiableBoundedCollection
        .unmodifiableBoundedCollection((BoundedCollection<?>) coll);

    // Assert
    assertEquals(2, actualUnmodifiableBoundedCollectionResult.size());
  }

  /**
   * Test {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(BoundedCollection)} with {@code coll}.
   * <ul>
   *   <li>When {@link CircularFifoQueue#CircularFifoQueue()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(BoundedCollection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({
      "BoundedCollection UnmodifiableBoundedCollection.unmodifiableBoundedCollection(BoundedCollection)"})
  public void testUnmodifiableBoundedCollectionWithColl_whenCircularFifoQueue_thenReturnEmpty() {
    // Arrange and Act
    BoundedCollection<Object> actualUnmodifiableBoundedCollectionResult = UnmodifiableBoundedCollection
        .unmodifiableBoundedCollection((BoundedCollection<?>) new CircularFifoQueue<>());

    // Assert
    assertTrue(actualUnmodifiableBoundedCollectionResult.isEmpty());
  }

  /**
   * Test {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(Collection)} with {@code collection}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"BoundedCollection UnmodifiableBoundedCollection.unmodifiableBoundedCollection(Collection)"})
  public void testUnmodifiableBoundedCollectionWithCollection_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> UnmodifiableBoundedCollection.unmodifiableBoundedCollection(collection));
  }

  /**
   * Test {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(Collection)} with {@code collection}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"BoundedCollection UnmodifiableBoundedCollection.unmodifiableBoundedCollection(Collection)"})
  public void testUnmodifiableBoundedCollectionWithCollection_given42_whenArrayListAdd422() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> UnmodifiableBoundedCollection.unmodifiableBoundedCollection(collection));
  }

  /**
   * Test {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(Collection)} with {@code collection}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableBoundedCollection#unmodifiableBoundedCollection(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"BoundedCollection UnmodifiableBoundedCollection.unmodifiableBoundedCollection(Collection)"})
  public void testUnmodifiableBoundedCollectionWithCollection_whenArrayList() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> UnmodifiableBoundedCollection.unmodifiableBoundedCollection(new ArrayList<>()));
  }
}
