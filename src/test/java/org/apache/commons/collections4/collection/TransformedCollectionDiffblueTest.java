package org.apache.commons.collections4.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TransformedCollectionDiffblueTest {
  /**
   * Test {@link TransformedCollection#transformedCollection(Collection, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then {@link ArrayList#ArrayList()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link TransformedCollection#transformedCollection(Collection,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedCollection(Collection, Transformer); given '42'; when ArrayList() add '42'; then ArrayList() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedCollection TransformedCollection.transformedCollection(Collection, Transformer)"
  })
  void testTransformedCollection_given42_whenArrayListAdd42_thenArrayListSizeIsOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    TransformedCollection<Object> actualTransformedCollectionResult =
        TransformedCollection.transformedCollection(collection, transformer);

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals(1, collection.size());
    assertEquals("Apply", collection.get(0));
    assertEquals(1, actualTransformedCollectionResult.size());
  }

  /**
   * Test {@link TransformedCollection#transformedCollection(Collection, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then {@link ArrayList#ArrayList()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link TransformedCollection#transformedCollection(Collection,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedCollection(Collection, Transformer); given '42'; when ArrayList() add '42'; then ArrayList() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedCollection TransformedCollection.transformedCollection(Collection, Transformer)"
  })
  void testTransformedCollection_given42_whenArrayListAdd42_thenArrayListSizeIsTwo() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    TransformedCollection<Object> actualTransformedCollectionResult =
        TransformedCollection.transformedCollection(collection, transformer);

    // Assert
    verify(transformer, atLeast(1)).apply(isA(Object.class));
    assertEquals(2, collection.size());
    assertEquals("Apply", collection.get(0));
    assertEquals("Apply", collection.get(1));
    assertEquals(2, actualTransformedCollectionResult.size());
  }

  /**
   * Test {@link TransformedCollection#transformedCollection(Collection, Transformer)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link TransformedCollection#transformedCollection(Collection,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedCollection(Collection, Transformer); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedCollection TransformedCollection.transformedCollection(Collection, Transformer)"
  })
  void testTransformedCollection_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    TransformedCollection<Object> actualTransformedCollectionResult =
        TransformedCollection.transformedCollection(new ArrayList<>(), mock(Transformer.class));

    // Assert
    assertTrue(actualTransformedCollectionResult.isEmpty());
  }

  /**
   * Test {@link TransformedCollection#transformingCollection(Collection, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link TransformedCollection#transformingCollection(Collection,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingCollection(Collection, Transformer); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedCollection TransformedCollection.transformingCollection(Collection, Transformer)"
  })
  void testTransformingCollection_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    TransformedCollection<Object> actualTransformingCollectionResult =
        TransformedCollection.transformingCollection(coll, mock(Transformer.class));

    // Assert
    assertEquals(1, actualTransformingCollectionResult.size());
  }

  /**
   * Test {@link TransformedCollection#transformingCollection(Collection, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link TransformedCollection#transformingCollection(Collection,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingCollection(Collection, Transformer); given '42'; when ArrayList() add '42'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedCollection TransformedCollection.transformingCollection(Collection, Transformer)"
  })
  void testTransformingCollection_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    TransformedCollection<Object> actualTransformingCollectionResult =
        TransformedCollection.transformingCollection(coll, mock(Transformer.class));

    // Assert
    assertEquals(2, actualTransformingCollectionResult.size());
  }

  /**
   * Test {@link TransformedCollection#transformingCollection(Collection, Transformer)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link TransformedCollection#transformingCollection(Collection,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingCollection(Collection, Transformer); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TransformedCollection TransformedCollection.transformingCollection(Collection, Transformer)"
  })
  void testTransformingCollection_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    TransformedCollection<Object> actualTransformingCollectionResult =
        TransformedCollection.transformingCollection(new ArrayList<>(), mock(Transformer.class));

    // Assert
    assertTrue(actualTransformingCollectionResult.isEmpty());
  }

  /**
   * Test {@link TransformedCollection#TransformedCollection(Collection, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link TransformedCollection#TransformedCollection(Collection,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test new TransformedCollection(Collection, Transformer); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransformedCollection.<init>(Collection, Transformer)"})
  void testNewTransformedCollection_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    TransformedCollection<Object> actualTransformedCollection =
        new TransformedCollection<>(collection, mock(Transformer.class));

    // Assert
    assertEquals(1, actualTransformedCollection.size());
  }

  /**
   * Test {@link TransformedCollection#TransformedCollection(Collection, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link TransformedCollection#TransformedCollection(Collection,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test new TransformedCollection(Collection, Transformer); given '42'; when ArrayList() add '42'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransformedCollection.<init>(Collection, Transformer)"})
  void testNewTransformedCollection_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    TransformedCollection<Object> actualTransformedCollection =
        new TransformedCollection<>(collection, mock(Transformer.class));

    // Assert
    assertEquals(2, actualTransformedCollection.size());
  }

  /**
   * Test {@link TransformedCollection#TransformedCollection(Collection, Transformer)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link TransformedCollection#TransformedCollection(Collection,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test new TransformedCollection(Collection, Transformer); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransformedCollection.<init>(Collection, Transformer)"})
  void testNewTransformedCollection_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    TransformedCollection<Object> actualTransformedCollection =
        new TransformedCollection<>(new ArrayList<>(), mock(Transformer.class));

    // Assert
    assertTrue(actualTransformedCollection.isEmpty());
  }
}
