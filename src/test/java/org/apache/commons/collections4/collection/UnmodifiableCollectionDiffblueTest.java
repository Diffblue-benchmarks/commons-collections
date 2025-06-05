package org.apache.commons.collections4.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnmodifiableCollectionDiffblueTest {
  /**
   * Test {@link UnmodifiableCollection#unmodifiableCollection(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableCollection#unmodifiableCollection(Collection)}
   */
  @Test
  @DisplayName("Test unmodifiableCollection(Collection); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Collection UnmodifiableCollection.unmodifiableCollection(Collection)"})
  void testUnmodifiableCollection_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    Collection<Object> actualUnmodifiableCollectionResult = UnmodifiableCollection.unmodifiableCollection(coll);

    // Assert
    assertEquals(1, actualUnmodifiableCollectionResult.size());
  }

  /**
   * Test {@link UnmodifiableCollection#unmodifiableCollection(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableCollection#unmodifiableCollection(Collection)}
   */
  @Test
  @DisplayName("Test unmodifiableCollection(Collection); given '42'; when ArrayList() add '42'; then return size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Collection UnmodifiableCollection.unmodifiableCollection(Collection)"})
  void testUnmodifiableCollection_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    Collection<Object> actualUnmodifiableCollectionResult = UnmodifiableCollection.unmodifiableCollection(coll);

    // Assert
    assertEquals(2, actualUnmodifiableCollectionResult.size());
  }

  /**
   * Test {@link UnmodifiableCollection#unmodifiableCollection(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link UnmodifiableCollection#unmodifiableCollection(Collection)}
   */
  @Test
  @DisplayName("Test unmodifiableCollection(Collection); when ArrayList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Collection UnmodifiableCollection.unmodifiableCollection(Collection)"})
  void testUnmodifiableCollection_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    Collection<Object> actualUnmodifiableCollectionResult = UnmodifiableCollection
        .unmodifiableCollection(new ArrayList<>());

    // Assert
    assertTrue(actualUnmodifiableCollectionResult.isEmpty());
  }
}
