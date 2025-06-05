package org.apache.commons.collections4.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexedCollection#nonUniqueIndexedCollection(Collection, Transformer)}
   */
  @Test
  @DisplayName("Test nonUniqueIndexedCollection(Collection, Transformer); given 'Apply'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"IndexedCollection IndexedCollection.nonUniqueIndexedCollection(Collection, Transformer)"})
  void testNonUniqueIndexedCollection_givenApply_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    IndexedCollection<Object, Object> actualNonUniqueIndexedCollectionResult = IndexedCollection
        .nonUniqueIndexedCollection(coll, keyTransformer);

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    assertEquals(1, actualNonUniqueIndexedCollectionResult.size());
  }

  /**
   * Test {@link IndexedCollection#nonUniqueIndexedCollection(Collection, Transformer)}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexedCollection#nonUniqueIndexedCollection(Collection, Transformer)}
   */
  @Test
  @DisplayName("Test nonUniqueIndexedCollection(Collection, Transformer); given 'Apply'; then return size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"IndexedCollection IndexedCollection.nonUniqueIndexedCollection(Collection, Transformer)"})
  void testNonUniqueIndexedCollection_givenApply_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    IndexedCollection<Object, Object> actualNonUniqueIndexedCollectionResult = IndexedCollection
        .nonUniqueIndexedCollection(coll, keyTransformer);

    // Assert
    verify(keyTransformer, atLeast(1)).apply(isA(Object.class));
    assertEquals(2, actualNonUniqueIndexedCollectionResult.size());
  }

  /**
   * Test {@link IndexedCollection#nonUniqueIndexedCollection(Collection, Transformer)}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexedCollection#nonUniqueIndexedCollection(Collection, Transformer)}
   */
  @Test
  @DisplayName("Test nonUniqueIndexedCollection(Collection, Transformer); then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"IndexedCollection IndexedCollection.nonUniqueIndexedCollection(Collection, Transformer)"})
  void testNonUniqueIndexedCollection_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("map"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> IndexedCollection.nonUniqueIndexedCollection(coll, keyTransformer));
    verify(keyTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link IndexedCollection#nonUniqueIndexedCollection(Collection, Transformer)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexedCollection#nonUniqueIndexedCollection(Collection, Transformer)}
   */
  @Test
  @DisplayName("Test nonUniqueIndexedCollection(Collection, Transformer); when ArrayList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"IndexedCollection IndexedCollection.nonUniqueIndexedCollection(Collection, Transformer)"})
  void testNonUniqueIndexedCollection_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    IndexedCollection<Object, Object> actualNonUniqueIndexedCollectionResult = IndexedCollection
        .<Object, Object>nonUniqueIndexedCollection(new ArrayList<>(), mock(Transformer.class));

    // Assert
    assertTrue(actualNonUniqueIndexedCollectionResult.isEmpty());
  }

  /**
   * Test {@link IndexedCollection#uniqueIndexedCollection(Collection, Transformer)}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexedCollection#uniqueIndexedCollection(Collection, Transformer)}
   */
  @Test
  @DisplayName("Test uniqueIndexedCollection(Collection, Transformer); given 'Apply'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"IndexedCollection IndexedCollection.uniqueIndexedCollection(Collection, Transformer)"})
  void testUniqueIndexedCollection_givenApply_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    IndexedCollection<Object, Object> actualUniqueIndexedCollectionResult = IndexedCollection
        .uniqueIndexedCollection(coll, keyTransformer);

    // Assert
    verify(keyTransformer).apply(isA(Object.class));
    assertEquals(1, actualUniqueIndexedCollectionResult.size());
  }

  /**
   * Test {@link IndexedCollection#uniqueIndexedCollection(Collection, Transformer)}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexedCollection#uniqueIndexedCollection(Collection, Transformer)}
   */
  @Test
  @DisplayName("Test uniqueIndexedCollection(Collection, Transformer); given 'Apply'; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"IndexedCollection IndexedCollection.uniqueIndexedCollection(Collection, Transformer)"})
  void testUniqueIndexedCollection_givenApply_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> IndexedCollection.uniqueIndexedCollection(coll, keyTransformer));
    verify(keyTransformer, atLeast(1)).apply(isA(Object.class));
  }

  /**
   * Test {@link IndexedCollection#uniqueIndexedCollection(Collection, Transformer)}.
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException(String)} with {@code map}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexedCollection#uniqueIndexedCollection(Collection, Transformer)}
   */
  @Test
  @DisplayName("Test uniqueIndexedCollection(Collection, Transformer); given IllegalArgumentException(String) with 'map'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"IndexedCollection IndexedCollection.uniqueIndexedCollection(Collection, Transformer)"})
  void testUniqueIndexedCollection_givenIllegalArgumentExceptionWithMap() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("map"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> IndexedCollection.uniqueIndexedCollection(coll, keyTransformer));
    verify(keyTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link IndexedCollection#uniqueIndexedCollection(Collection, Transformer)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexedCollection#uniqueIndexedCollection(Collection, Transformer)}
   */
  @Test
  @DisplayName("Test uniqueIndexedCollection(Collection, Transformer); when ArrayList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"IndexedCollection IndexedCollection.uniqueIndexedCollection(Collection, Transformer)"})
  void testUniqueIndexedCollection_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    IndexedCollection<Object, Object> actualUniqueIndexedCollectionResult = IndexedCollection
        .<Object, Object>uniqueIndexedCollection(new ArrayList<>(), mock(Transformer.class));

    // Assert
    assertTrue(actualUniqueIndexedCollectionResult.isEmpty());
  }

  /**
   * Test {@link IndexedCollection#IndexedCollection(Collection, Transformer, MultiMap, boolean)}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>Then {@link MultiValueMap#MultiValueMap()} {@code Apply} {@link List}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexedCollection#IndexedCollection(Collection, Transformer, MultiMap, boolean)}
   */
  @Test
  @DisplayName("Test new IndexedCollection(Collection, Transformer, MultiMap, boolean); given 'Apply'; then MultiValueMap() 'Apply' List")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void IndexedCollection.<init>(Collection, Transformer, MultiMap, boolean)"})
  void testNewIndexedCollection_givenApply_thenMultiValueMapApplyList() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    MultiValueMap<Object, Object> map = new MultiValueMap<>();

    // Act
    IndexedCollection<Object, Object> actualIndexedCollection = new IndexedCollection<>(coll, keyTransformer, map,
        true);

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
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexedCollection#IndexedCollection(Collection, Transformer, MultiMap, boolean)}
   */
  @Test
  @DisplayName("Test new IndexedCollection(Collection, Transformer, MultiMap, boolean); given 'Apply'; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void IndexedCollection.<init>(Collection, Transformer, MultiMap, boolean)"})
  void testNewIndexedCollection_givenApply_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), true));

    verify(keyTransformer, atLeast(1)).apply(isA(Object.class));
  }

  /**
   * Test {@link IndexedCollection#IndexedCollection(Collection, Transformer, MultiMap, boolean)}.
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>When {@code false}.</li>
   *   <li>Then {@link MultiValueMap#MultiValueMap()} {@code Apply} {@link List}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexedCollection#IndexedCollection(Collection, Transformer, MultiMap, boolean)}
   */
  @Test
  @DisplayName("Test new IndexedCollection(Collection, Transformer, MultiMap, boolean); given 'Apply'; when 'false'; then MultiValueMap() 'Apply' List")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void IndexedCollection.<init>(Collection, Transformer, MultiMap, boolean)"})
  void testNewIndexedCollection_givenApply_whenFalse_thenMultiValueMapApplyList() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    MultiValueMap<Object, Object> map = new MultiValueMap<>();

    // Act
    IndexedCollection<Object, Object> actualIndexedCollection = new IndexedCollection<>(coll, keyTransformer, map,
        false);

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
   * <ul>
   *   <li>Given {@code Apply}.</li>
   *   <li>When {@code false}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexedCollection#IndexedCollection(Collection, Transformer, MultiMap, boolean)}
   */
  @Test
  @DisplayName("Test new IndexedCollection(Collection, Transformer, MultiMap, boolean); given 'Apply'; when 'false'; then return size is two")
  @Tag("MaintainedByDiffblue")
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
    IndexedCollection<Object, Object> actualIndexedCollection = new IndexedCollection<>(coll, keyTransformer, map,
        false);

    // Assert
    verify(keyTransformer, atLeast(1)).apply(isA(Object.class));
    assertEquals(1, map.size());
    assertEquals(2, actualIndexedCollection.size());
    assertEquals(coll, map.get("Apply"));
  }

  /**
   * Test {@link IndexedCollection#IndexedCollection(Collection, Transformer, MultiMap, boolean)}.
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException(String)} with {@code collection}.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexedCollection#IndexedCollection(Collection, Transformer, MultiMap, boolean)}
   */
  @Test
  @DisplayName("Test new IndexedCollection(Collection, Transformer, MultiMap, boolean); given IllegalArgumentException(String) with 'collection'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void IndexedCollection.<init>(Collection, Transformer, MultiMap, boolean)"})
  void testNewIndexedCollection_givenIllegalArgumentExceptionWithCollection() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    when(keyTransformer.apply(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("collection"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> new IndexedCollection<>(coll, keyTransformer, new MultiValueMap<>(), true));

    verify(keyTransformer).apply(isA(Object.class));
  }

  /**
   * Test {@link IndexedCollection#IndexedCollection(Collection, Transformer, MultiMap, boolean)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link IndexedCollection#IndexedCollection(Collection, Transformer, MultiMap, boolean)}
   */
  @Test
  @DisplayName("Test new IndexedCollection(Collection, Transformer, MultiMap, boolean); when ArrayList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void IndexedCollection.<init>(Collection, Transformer, MultiMap, boolean)"})
  void testNewIndexedCollection_whenArrayList_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    Transformer<Object, Object> keyTransformer = mock(Transformer.class);
    MultiValueMap<Object, Object> map = new MultiValueMap<>();

    // Act
    IndexedCollection<Object, Object> actualIndexedCollection = new IndexedCollection<>(coll, keyTransformer, map,
        true);

    // Assert
    assertTrue(actualIndexedCollection.isEmpty());
    assertTrue(map.isEmpty());
  }
}
