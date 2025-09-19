package org.apache.commons.collections4.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
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
import java.util.List;
import java.util.function.Predicate;
import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.map.MultiValueMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class IndexedCollectionDiffblueTest {
  /**
   * Test {@link IndexedCollection#nonUniqueIndexedCollection(Collection, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#nonUniqueIndexedCollection(Collection,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test nonUniqueIndexedCollection(Collection, Transformer); given 'Apply'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IndexedCollection IndexedCollection.nonUniqueIndexedCollection(Collection, Transformer)"
  })
  void testNonUniqueIndexedCollection_givenApply_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    IndexedCollection<Object, Object> actualNonUniqueIndexedCollectionResult =
        IndexedCollection.nonUniqueIndexedCollection(coll, keyTransformer);

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    assertEquals(1, actualNonUniqueIndexedCollectionResult.size());
  }

  /**
   * Test {@link IndexedCollection#nonUniqueIndexedCollection(Collection, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#nonUniqueIndexedCollection(Collection,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test nonUniqueIndexedCollection(Collection, Transformer); given 'Apply'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IndexedCollection IndexedCollection.nonUniqueIndexedCollection(Collection, Transformer)"
  })
  void testNonUniqueIndexedCollection_givenApply_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    IndexedCollection<Object, Object> actualNonUniqueIndexedCollectionResult =
        IndexedCollection.nonUniqueIndexedCollection(coll, keyTransformer);

    // Assert
    verify(keyTransformer, atLeast(1)).apply(isA(Object.class));
    assertEquals(2, actualNonUniqueIndexedCollectionResult.size());
  }

  /**
   * Test {@link IndexedCollection#nonUniqueIndexedCollection(Collection, Transformer)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#nonUniqueIndexedCollection(Collection,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test nonUniqueIndexedCollection(Collection, Transformer); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IndexedCollection IndexedCollection.nonUniqueIndexedCollection(Collection, Transformer)"
  })
  void testNonUniqueIndexedCollection_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> IndexedCollection.nonUniqueIndexedCollection(coll, keyTransformer));
    verify(keyTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link IndexedCollection#nonUniqueIndexedCollection(Collection, Transformer)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#nonUniqueIndexedCollection(Collection,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test nonUniqueIndexedCollection(Collection, Transformer); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IndexedCollection IndexedCollection.nonUniqueIndexedCollection(Collection, Transformer)"
  })
  void testNonUniqueIndexedCollection_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    IndexedCollection<Object, Object> actualNonUniqueIndexedCollectionResult =
        IndexedCollection.nonUniqueIndexedCollection(new ArrayList<>(), mock(Transformer.class));

    // Assert
    assertTrue(actualNonUniqueIndexedCollectionResult.isEmpty());
  }

  /**
   * Test {@link IndexedCollection#uniqueIndexedCollection(Collection, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#uniqueIndexedCollection(Collection,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test uniqueIndexedCollection(Collection, Transformer); given 'Apply'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IndexedCollection IndexedCollection.uniqueIndexedCollection(Collection, Transformer)"
  })
  void testUniqueIndexedCollection_givenApply_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    IndexedCollection<Object, Object> actualUniqueIndexedCollectionResult =
        IndexedCollection.uniqueIndexedCollection(coll, keyTransformer);

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    assertEquals(1, actualUniqueIndexedCollectionResult.size());
  }

  /**
   * Test {@link IndexedCollection#uniqueIndexedCollection(Collection, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#uniqueIndexedCollection(Collection,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test uniqueIndexedCollection(Collection, Transformer); given 'Apply'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IndexedCollection IndexedCollection.uniqueIndexedCollection(Collection, Transformer)"
  })
  void testUniqueIndexedCollection_givenApply_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> IndexedCollection.uniqueIndexedCollection(coll, keyTransformer));
    verify(keyTransformer, atLeast(1)).apply(isA(Object.class));
  }

  /**
   * Test {@link IndexedCollection#uniqueIndexedCollection(Collection, Transformer)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#uniqueIndexedCollection(Collection,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test uniqueIndexedCollection(Collection, Transformer); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IndexedCollection IndexedCollection.uniqueIndexedCollection(Collection, Transformer)"
  })
  void testUniqueIndexedCollection_givenIllegalArgumentException() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> IndexedCollection.uniqueIndexedCollection(coll, keyTransformer));
    verify(keyTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link IndexedCollection#uniqueIndexedCollection(Collection, Transformer)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#uniqueIndexedCollection(Collection,
   * Transformer)}
   */
  @Test
  @DisplayName(
      "Test uniqueIndexedCollection(Collection, Transformer); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IndexedCollection IndexedCollection.uniqueIndexedCollection(Collection, Transformer)"
  })
  void testUniqueIndexedCollection_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    IndexedCollection<Object, Object> actualUniqueIndexedCollectionResult =
        IndexedCollection.uniqueIndexedCollection(new ArrayList<>(), mock(Transformer.class));

    // Assert
    assertTrue(actualUniqueIndexedCollectionResult.isEmpty());
  }

  /**
   * Test {@link IndexedCollection#IndexedCollection(Collection, Transformer, MultiMap, boolean)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>Then {@link MultiValueMap#MultiValueMap()} {@code Apply} {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#IndexedCollection(Collection, Transformer,
   * MultiMap, boolean)}
   */
  @Test
  @DisplayName(
      "Test new IndexedCollection(Collection, Transformer, MultiMap, boolean); given 'Apply'; then MultiValueMap() 'Apply' List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IndexedCollection.<init>(Collection, Transformer, MultiMap, boolean)"})
  void testNewIndexedCollection_givenApply_thenMultiValueMapApplyList() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    MultiValueMap<Object, Object> map = new MultiValueMap<>();

    // Act
    IndexedCollection<Object, Object> actualIndexedCollection =
        new IndexedCollection<>(coll, keyTransformer, map, true);

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    assertEquals(1, map.size());
    Object getResult = map.get("Apply");
    assertTrue(getResult instanceof List);
    assertEquals(1, ((List<String>) getResult).size());
    assertEquals("42", ((List<String>) getResult).get(0));
    assertEquals(1, actualIndexedCollection.size());
  }

  /**
   * Test {@link IndexedCollection#IndexedCollection(Collection, Transformer, MultiMap, boolean)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#IndexedCollection(Collection, Transformer,
   * MultiMap, boolean)}
   */
  @Test
  @DisplayName(
      "Test new IndexedCollection(Collection, Transformer, MultiMap, boolean); given 'Apply'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IndexedCollection.<init>(Collection, Transformer, MultiMap, boolean)"})
  void testNewIndexedCollection_givenApply_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), true));
    verify(keyTransformer, atLeast(1)).apply(isA(Object.class));
  }

  /**
   * Test {@link IndexedCollection#IndexedCollection(Collection, Transformer, MultiMap, boolean)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>When {@code false}.
   *   <li>Then {@link MultiValueMap#MultiValueMap()} {@code Apply} {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#IndexedCollection(Collection, Transformer,
   * MultiMap, boolean)}
   */
  @Test
  @DisplayName(
      "Test new IndexedCollection(Collection, Transformer, MultiMap, boolean); given 'Apply'; when 'false'; then MultiValueMap() 'Apply' List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IndexedCollection.<init>(Collection, Transformer, MultiMap, boolean)"})
  void testNewIndexedCollection_givenApply_whenFalse_thenMultiValueMapApplyList() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    MultiValueMap<Object, Object> map = new MultiValueMap<>();

    // Act
    IndexedCollection<Object, Object> actualIndexedCollection =
        new IndexedCollection<>(coll, keyTransformer, map, false);

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    assertEquals(1, map.size());
    Object getResult = map.get("Apply");
    assertTrue(getResult instanceof List);
    assertEquals(1, ((List<String>) getResult).size());
    assertEquals("42", ((List<String>) getResult).get(0));
    assertEquals(1, actualIndexedCollection.size());
  }

  /**
   * Test {@link IndexedCollection#IndexedCollection(Collection, Transformer, MultiMap, boolean)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>When {@code false}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#IndexedCollection(Collection, Transformer,
   * MultiMap, boolean)}
   */
  @Test
  @DisplayName(
      "Test new IndexedCollection(Collection, Transformer, MultiMap, boolean); given 'Apply'; when 'false'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IndexedCollection.<init>(Collection, Transformer, MultiMap, boolean)"})
  void testNewIndexedCollection_givenApply_whenFalse_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    MultiValueMap<Object, Object> map = new MultiValueMap<>();

    // Act
    IndexedCollection<Object, Object> actualIndexedCollection =
        new IndexedCollection<>(coll, keyTransformer, map, false);

    // Assert
    verify(keyTransformer, atLeast(1)).apply(isA(Object.class));
    assertEquals(1, map.size());
    assertEquals(2, actualIndexedCollection.size());
    assertEquals(coll, map.get("Apply"));
  }

  /**
   * Test {@link IndexedCollection#IndexedCollection(Collection, Transformer, MultiMap, boolean)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#IndexedCollection(Collection, Transformer,
   * MultiMap, boolean)}
   */
  @Test
  @DisplayName(
      "Test new IndexedCollection(Collection, Transformer, MultiMap, boolean); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IndexedCollection.<init>(Collection, Transformer, MultiMap, boolean)"})
  void testNewIndexedCollection_givenIllegalArgumentException() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), true));
    verify(keyTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link IndexedCollection#IndexedCollection(Collection, Transformer, MultiMap, boolean)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#IndexedCollection(Collection, Transformer,
   * MultiMap, boolean)}
   */
  @Test
  @DisplayName(
      "Test new IndexedCollection(Collection, Transformer, MultiMap, boolean); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IndexedCollection.<init>(Collection, Transformer, MultiMap, boolean)"})
  void testNewIndexedCollection_whenArrayList_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    MultiValueMap<Object, Object> map = new MultiValueMap<>();

    // Act
    IndexedCollection<Object, Object> actualIndexedCollection =
        new IndexedCollection<>(coll, keyTransformer, map, true);

    // Assert
    assertTrue(actualIndexedCollection.isEmpty());
    assertTrue(map.isEmpty());
  }

  /**
   * Test {@link IndexedCollection#add(Object)}.
   *
   * <p>Method under test: {@link IndexedCollection#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IndexedCollection.add(Object)"})
  void testAdd() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    ArrayList<Object> coll = new ArrayList<>();

    IndexedCollection<Object, Object> indexedCollection =
        new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), false);

    // Act
    boolean actualAddResult = indexedCollection.add("Object");

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    assertEquals(1, indexedCollection.size());
    assertTrue(actualAddResult);
  }

  /**
   * Test {@link IndexedCollection#add(Object)}.
   *
   * <p>Method under test: {@link IndexedCollection#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IndexedCollection.add(Object)"})
  void testAdd2() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    ArrayList<Object> coll = new ArrayList<>();

    IndexedCollection<Object, Object> indexedCollection =
        new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), true);

    // Act
    boolean actualAddResult = indexedCollection.add("Object");

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    assertEquals(1, indexedCollection.size());
    assertTrue(actualAddResult);
  }

  /**
   * Test {@link IndexedCollection#add(Object)}.
   *
   * <p>Method under test: {@link IndexedCollection#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IndexedCollection.add(Object)"})
  void testAdd3() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    ArrayList<Object> coll = new ArrayList<>();

    IndexedCollection<Object, Object> indexedCollection =
        new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), false);
    indexedCollection.add("Object");

    // Act
    boolean actualAddResult = indexedCollection.add("Object");

    // Assert
    verify(keyTransformer, atLeast(1)).apply(isA(Object.class));
    assertEquals(2, indexedCollection.size());
    assertTrue(actualAddResult);
  }

  /**
   * Test {@link IndexedCollection#add(Object)}.
   *
   * <p>Method under test: {@link IndexedCollection#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IndexedCollection.add(Object)"})
  void testAdd4() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    ArrayList<Object> coll = new ArrayList<>();

    IndexedCollection<Object, Object> indexedCollection =
        new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), true);
    indexedCollection.add("Object");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> indexedCollection.add("Object"));
    verify(keyTransformer, atLeast(1)).apply(isA(Object.class));
  }

  /**
   * Test {@link IndexedCollection#add(Object)}.
   *
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object); given Transformer apply(Object) throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IndexedCollection.add(Object)"})
  void testAdd_givenTransformerApplyThrowIllegalArgumentException() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    ArrayList<Object> coll = new ArrayList<>();

    IndexedCollection<Object, Object> indexedCollection =
        new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), false);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> indexedCollection.add("Object"));
    verify(keyTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link IndexedCollection#addAll(Collection)}.
   *
   * <p>Method under test: {@link IndexedCollection#addAll(Collection)}
   */
  @Test
  @DisplayName("Test addAll(Collection)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IndexedCollection.addAll(Collection)"})
  void testAddAll() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);

    IndexedCollection<Object, Object> indexedCollection =
        new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), false);

    // Act and Assert
    assertFalse(indexedCollection.addAll(new ArrayList<>()));
  }

  /**
   * Test {@link IndexedCollection#contains(Object)}.
   *
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@code Apply}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#contains(Object)}
   */
  @Test
  @DisplayName(
      "Test contains(Object); given Transformer apply(Object) return 'Apply'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IndexedCollection.contains(Object)"})
  void testContains_givenTransformerApplyReturnApply_thenReturnFalse() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    ArrayList<Object> coll = new ArrayList<>();

    IndexedCollection<Object, Object> indexedCollection =
        new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), true);

    // Act
    boolean actualContainsResult = indexedCollection.contains("Object");

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link IndexedCollection#contains(Object)}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#contains(Object)}
   */
  @Test
  @DisplayName("Test contains(Object); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IndexedCollection.contains(Object)"})
  void testContains_thenReturnTrue() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    ArrayList<Object> coll = new ArrayList<>();

    IndexedCollection<Object, Object> indexedCollection =
        new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), true);
    indexedCollection.add("Object");

    // Act
    boolean actualContainsResult = indexedCollection.contains("Object");

    // Assert
    verify(keyTransformer, atLeast(1)).apply(isA(Object.class));
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link IndexedCollection#contains(Object)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#contains(Object)}
   */
  @Test
  @DisplayName("Test contains(Object); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IndexedCollection.contains(Object)"})
  void testContains_thenThrowIllegalArgumentException() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());
    ArrayList<Object> coll = new ArrayList<>();

    IndexedCollection<Object, Object> indexedCollection =
        new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), true);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> indexedCollection.contains("Object"));
    verify(keyTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link IndexedCollection#containsAll(Collection)}.
   *
   * <p>Method under test: {@link IndexedCollection#containsAll(Collection)}
   */
  @Test
  @DisplayName("Test containsAll(Collection)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IndexedCollection.containsAll(Collection)"})
  void testContainsAll() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);

    IndexedCollection<Object, Object> indexedCollection =
        new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), true);

    // Act and Assert
    assertTrue(indexedCollection.containsAll(new ArrayList<>()));
  }

  /**
   * Test {@link IndexedCollection#get(Object)}.
   *
   * <p>Method under test: {@link IndexedCollection#get(Object)}
   */
  @Test
  @DisplayName("Test get(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IndexedCollection.get(Object)"})
  void testGet() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);

    IndexedCollection<Object, Object> indexedCollection =
        new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), true);

    // Act and Assert
    assertNull(indexedCollection.get("Key"));
  }

  /**
   * Test {@link IndexedCollection#reindex()}.
   *
   * <p>Method under test: {@link IndexedCollection#reindex()}
   */
  @Test
  @DisplayName("Test reindex()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IndexedCollection.reindex()"})
  void testReindex() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    IndexedCollection<Object, Object> indexedCollection =
        new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), true);

    // Act
    indexedCollection.reindex();

    // Assert
    verify(keyTransformer, atLeast(1)).apply(isA(Object.class));
  }

  /**
   * Test {@link IndexedCollection#reindex()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then calls {@link Transformer#apply(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#reindex()}
   */
  @Test
  @DisplayName("Test reindex(); given ArrayList() add '42'; then calls apply(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IndexedCollection.reindex()"})
  void testReindex_givenArrayListAdd42_thenCallsApply() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    IndexedCollection<Object, Object> indexedCollection =
        new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), false);

    // Act
    indexedCollection.reindex();

    // Assert
    verify(keyTransformer, atLeast(1)).apply(isA(Object.class));
  }

  /**
   * Test {@link IndexedCollection#reindex()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then calls {@link Transformer#apply(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#reindex()}
   */
  @Test
  @DisplayName("Test reindex(); given ArrayList() add '42'; then calls apply(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IndexedCollection.reindex()"})
  void testReindex_givenArrayListAdd42_thenCallsApply2() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    IndexedCollection<Object, Object> indexedCollection =
        new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), false);

    // Act
    indexedCollection.reindex();

    // Assert
    verify(keyTransformer, atLeast(1)).apply(isA(Object.class));
  }

  /**
   * Test {@link IndexedCollection#remove(Object)}.
   *
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@code Apply}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#remove(Object)}
   */
  @Test
  @DisplayName(
      "Test remove(Object); given Transformer apply(Object) return 'Apply'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IndexedCollection.remove(Object)"})
  void testRemove_givenTransformerApplyReturnApply_thenReturnTrue() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    ArrayList<Object> coll = new ArrayList<>();

    IndexedCollection<Object, Object> indexedCollection =
        new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), true);
    indexedCollection.add("Object");

    // Act
    boolean actualRemoveResult = indexedCollection.remove("Object");

    // Assert
    verify(keyTransformer, atLeast(1)).apply(isA(Object.class));
    assertTrue(indexedCollection.isEmpty());
    assertTrue(actualRemoveResult);
  }

  /**
   * Test {@link IndexedCollection#remove(Object)}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#remove(Object)}
   */
  @Test
  @DisplayName("Test remove(Object); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IndexedCollection.remove(Object)"})
  void testRemove_thenReturnFalse() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);

    IndexedCollection<Object, Object> indexedCollection =
        new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), true);

    // Act and Assert
    assertFalse(indexedCollection.remove("Object"));
    assertTrue(indexedCollection.isEmpty());
  }

  /**
   * Test {@link IndexedCollection#removeAll(Collection)}.
   *
   * <p>Method under test: {@link IndexedCollection#removeAll(Collection)}
   */
  @Test
  @DisplayName("Test removeAll(Collection)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IndexedCollection.removeAll(Collection)"})
  void testRemoveAll() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);

    IndexedCollection<Object, Object> indexedCollection =
        new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), true);

    // Act and Assert
    assertFalse(indexedCollection.removeAll(new ArrayList<>()));
  }

  /**
   * Test {@link IndexedCollection#removeIf(Predicate)}.
   *
   * <p>Method under test: {@link IndexedCollection#removeIf(Predicate)}
   */
  @Test
  @DisplayName("Test removeIf(Predicate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IndexedCollection.removeIf(Predicate)"})
  void testRemoveIf() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    IndexedCollection<Object, Object> indexedCollection =
        new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), false);

    Predicate<Object> filter = mock(Predicate.class);
    when(filter.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualRemoveIfResult = indexedCollection.removeIf(filter);

    // Assert
    verify(filter).test(isA(Object.class));
    verify(keyTransformer).apply(isA(Object.class));
    assertEquals(1, indexedCollection.size());
    assertFalse(actualRemoveIfResult);
  }

  /**
   * Test {@link IndexedCollection#removeIf(Predicate)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#removeIf(Predicate)}
   */
  @Test
  @DisplayName(
      "Test removeIf(Predicate); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IndexedCollection.removeIf(Predicate)"})
  void testRemoveIf_givenIllegalArgumentException_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    IndexedCollection<Object, Object> indexedCollection =
        new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), false);

    Predicate<Object> filter = mock(Predicate.class);
    when(filter.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> indexedCollection.removeIf(filter));
    verify(filter).test(isA(Object.class));
    verify(keyTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link IndexedCollection#removeIf(Predicate)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#removeIf(Predicate)}
   */
  @Test
  @DisplayName(
      "Test removeIf(Predicate); given 'true'; when Predicate test(Object) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IndexedCollection.removeIf(Predicate)"})
  void testRemoveIf_givenTrue_whenPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    IndexedCollection<Object, Object> indexedCollection =
        new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), false);

    Predicate<Object> filter = mock(Predicate.class);
    when(filter.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualRemoveIfResult = indexedCollection.removeIf(filter);

    // Assert
    verify(filter).test(isA(Object.class));
    verify(keyTransformer).apply(isA(Object.class));
    assertTrue(indexedCollection.isEmpty());
    assertTrue(actualRemoveIfResult);
  }

  /**
   * Test {@link IndexedCollection#removeIf(Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#removeIf(Predicate)}
   */
  @Test
  @DisplayName("Test removeIf(Predicate); when Predicate; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IndexedCollection.removeIf(Predicate)"})
  void testRemoveIf_whenPredicate_thenReturnFalse() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);

    IndexedCollection<Object, Object> indexedCollection =
        new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), false);

    // Act and Assert
    assertFalse(indexedCollection.removeIf(mock(Predicate.class)));
    assertTrue(indexedCollection.isEmpty());
  }

  /**
   * Test {@link IndexedCollection#retainAll(Collection)}.
   *
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@code Apply}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#retainAll(Collection)}
   */
  @Test
  @DisplayName(
      "Test retainAll(Collection); given Transformer apply(Object) return 'Apply'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IndexedCollection.retainAll(Collection)"})
  void testRetainAll_givenTransformerApplyReturnApply_thenReturnTrue() {
    // Arrange
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    ArrayList<Object> coll = new ArrayList<>();

    IndexedCollection<Object, Object> indexedCollection =
        new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), false);
    indexedCollection.add("Object");
    ArrayList<Object> coll2 = new ArrayList<>();

    // Act
    boolean actualRetainAllResult = indexedCollection.retainAll(coll2);

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    assertTrue(indexedCollection.isEmpty());
    assertTrue(actualRetainAllResult);
    assertEquals(coll, coll2);
  }

  /**
   * Test {@link IndexedCollection#retainAll(Collection)}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IndexedCollection#retainAll(Collection)}
   */
  @Test
  @DisplayName("Test retainAll(Collection); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IndexedCollection.retainAll(Collection)"})
  void testRetainAll_thenReturnFalse() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);

    IndexedCollection<Object, Object> indexedCollection =
        new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), false);
    ArrayList<Object> coll2 = new ArrayList<>();

    // Act and Assert
    assertFalse(indexedCollection.retainAll(coll2));
    assertTrue(indexedCollection.isEmpty());
    assertEquals(coll, coll2);
  }

  /**
   * Test {@link IndexedCollection#values(Object)}.
   *
   * <p>Method under test: {@link IndexedCollection#values(Object)}
   */
  @Test
  @DisplayName("Test values(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection IndexedCollection.values(Object)"})
  void testValues() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);

    IndexedCollection<Object, Object> indexedCollection =
        new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), true);

    // Act and Assert
    assertNull(indexedCollection.values("Key"));
  }
}
