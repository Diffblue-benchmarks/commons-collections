package org.apache.commons.collections4.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SynchronizedCollectionDiffblueTest {
  /**
   * Test {@link SynchronizedCollection#synchronizedCollection(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedCollection#synchronizedCollection(Collection)}
   */
  @Test
  @DisplayName("Test synchronizedCollection(Collection); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SynchronizedCollection SynchronizedCollection.synchronizedCollection(Collection)"})
  void testSynchronizedCollection_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    SynchronizedCollection<Object> actualSynchronizedCollectionResult = SynchronizedCollection
        .synchronizedCollection(coll);

    // Assert
    assertEquals(1, actualSynchronizedCollectionResult.size());
  }

  /**
   * Test {@link SynchronizedCollection#synchronizedCollection(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedCollection#synchronizedCollection(Collection)}
   */
  @Test
  @DisplayName("Test synchronizedCollection(Collection); when ArrayList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SynchronizedCollection SynchronizedCollection.synchronizedCollection(Collection)"})
  void testSynchronizedCollection_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    SynchronizedCollection<Object> actualSynchronizedCollectionResult = SynchronizedCollection
        .synchronizedCollection(new ArrayList<>());

    // Assert
    assertTrue(actualSynchronizedCollectionResult.isEmpty());
  }

  /**
   * Test {@link SynchronizedCollection#SynchronizedCollection(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedCollection#SynchronizedCollection(Collection)}
   */
  @Test
  @DisplayName("Test new SynchronizedCollection(Collection); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedCollection.<init>(Collection)"})
  void testNewSynchronizedCollection_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    SynchronizedCollection<Object> actualSynchronizedCollection = new SynchronizedCollection<>(collection);

    // Assert
    assertEquals(1, actualSynchronizedCollection.size());
  }

  /**
   * Test {@link SynchronizedCollection#SynchronizedCollection(Collection, Object)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedCollection#SynchronizedCollection(Collection, Object)}
   */
  @Test
  @DisplayName("Test new SynchronizedCollection(Collection, Object); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedCollection.<init>(Collection, Object)"})
  void testNewSynchronizedCollection_given42_whenArrayListAdd42_thenReturnSizeIsOne2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    SynchronizedCollection<Object> actualSynchronizedCollection = new SynchronizedCollection<>(collection, "Lock");

    // Assert
    assertEquals(1, actualSynchronizedCollection.size());
  }

  /**
   * Test {@link SynchronizedCollection#SynchronizedCollection(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedCollection#SynchronizedCollection(Collection)}
   */
  @Test
  @DisplayName("Test new SynchronizedCollection(Collection); when ArrayList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedCollection.<init>(Collection)"})
  void testNewSynchronizedCollection_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    SynchronizedCollection<Object> actualSynchronizedCollection = new SynchronizedCollection<>(new ArrayList<>());

    // Assert
    assertTrue(actualSynchronizedCollection.isEmpty());
  }

  /**
   * Test {@link SynchronizedCollection#SynchronizedCollection(Collection, Object)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link SynchronizedCollection#SynchronizedCollection(Collection, Object)}
   */
  @Test
  @DisplayName("Test new SynchronizedCollection(Collection, Object); when ArrayList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SynchronizedCollection.<init>(Collection, Object)"})
  void testNewSynchronizedCollection_whenArrayList_thenReturnEmpty2() {
    // Arrange and Act
    SynchronizedCollection<Object> actualSynchronizedCollection = new SynchronizedCollection<>(new ArrayList<>(),
        "Lock");

    // Assert
    assertTrue(actualSynchronizedCollection.isEmpty());
  }

  /**
   * Test {@link SynchronizedCollection#toString()}.
   * <p>
   * Method under test: {@link SynchronizedCollection#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.String SynchronizedCollection.toString()"})
  void testToString() {
    // Arrange
    SynchronizedCollection<Object> synchronizedCollectionResult = SynchronizedCollection
        .synchronizedCollection(new ArrayList<>());

    // Act and Assert
    assertEquals("[]", synchronizedCollectionResult.toString());
  }
}
