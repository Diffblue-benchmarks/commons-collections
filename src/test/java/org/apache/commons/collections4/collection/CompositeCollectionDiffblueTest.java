package org.apache.commons.collections4.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.collections4.collection.CompositeCollection.CollectionMutator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CompositeCollectionDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompositeCollection#CompositeCollection()}
   *   <li>{@link CompositeCollection#setMutator(CollectionMutator)}
   *   <li>{@link CompositeCollection#getMutator()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeCollection.<init>()", "CollectionMutator CompositeCollection.getMutator()",
      "void CompositeCollection.setMutator(CollectionMutator)"})
  void testGettersAndSetters() {
    // Arrange and Act
    CompositeCollection<Object> actualCompositeCollection = new CompositeCollection<>();
    CollectionMutator<Object> mutator = mock(CollectionMutator.class);
    actualCompositeCollection.setMutator(mutator);

    // Assert
    assertSame(mutator, actualCompositeCollection.getMutator());
  }

  /**
   * Test {@link CompositeCollection#CompositeCollection(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#CompositeCollection(Collection)}
   */
  @Test
  @DisplayName("Test new CompositeCollection(Collection); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection)"})
  void testNewCompositeCollection_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add("42");

    // Act
    CompositeCollection<Object> actualCompositeCollection = new CompositeCollection<>(compositeCollection);

    // Assert
    assertEquals(1, actualCompositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#CompositeCollection(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#CompositeCollection(Collection, Collection)}
   */
  @Test
  @DisplayName("Test new CompositeCollection(Collection, Collection); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection, Collection)"})
  void testNewCompositeCollection_given42_whenArrayListAdd42_thenReturnSizeIsOne2() {
    // Arrange
    ArrayList<Object> compositeCollection1 = new ArrayList<>();
    compositeCollection1.add("42");

    // Act
    CompositeCollection<Object> actualCompositeCollection = new CompositeCollection<>(compositeCollection1,
        new ArrayList<>());

    // Assert
    assertEquals(1, actualCompositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#CompositeCollection(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#CompositeCollection(Collection, Collection)}
   */
  @Test
  @DisplayName("Test new CompositeCollection(Collection, Collection); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection, Collection)"})
  void testNewCompositeCollection_given42_whenArrayListAdd42_thenReturnSizeIsOne3() {
    // Arrange
    ArrayList<Object> compositeCollection1 = new ArrayList<>();

    ArrayList<Object> compositeCollection2 = new ArrayList<>();
    compositeCollection2.add("42");

    // Act
    CompositeCollection<Object> actualCompositeCollection = new CompositeCollection<>(compositeCollection1,
        compositeCollection2);

    // Assert
    assertEquals(1, actualCompositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#CompositeCollection(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#CompositeCollection(Collection)}
   */
  @Test
  @DisplayName("Test new CompositeCollection(Collection); given '42'; when ArrayList() add '42'; then return size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection)"})
  void testNewCompositeCollection_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add("42");
    compositeCollection.add("42");

    // Act
    CompositeCollection<Object> actualCompositeCollection = new CompositeCollection<>(compositeCollection);

    // Assert
    assertEquals(2, actualCompositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#CompositeCollection(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#CompositeCollection(Collection, Collection)}
   */
  @Test
  @DisplayName("Test new CompositeCollection(Collection, Collection); given '42'; when ArrayList() add '42'; then return size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection, Collection)"})
  void testNewCompositeCollection_given42_whenArrayListAdd42_thenReturnSizeIsTwo2() {
    // Arrange
    ArrayList<Object> compositeCollection1 = new ArrayList<>();
    compositeCollection1.add("42");
    compositeCollection1.add("42");

    // Act
    CompositeCollection<Object> actualCompositeCollection = new CompositeCollection<>(compositeCollection1,
        new ArrayList<>());

    // Assert
    assertEquals(2, actualCompositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#CompositeCollection(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#CompositeCollection(Collection, Collection)}
   */
  @Test
  @DisplayName("Test new CompositeCollection(Collection, Collection); given '42'; when ArrayList() add '42'; then return size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection, Collection)"})
  void testNewCompositeCollection_given42_whenArrayListAdd42_thenReturnSizeIsTwo3() {
    // Arrange
    ArrayList<Object> compositeCollection1 = new ArrayList<>();

    ArrayList<Object> compositeCollection2 = new ArrayList<>();
    compositeCollection2.add("42");
    compositeCollection2.add("42");

    // Act
    CompositeCollection<Object> actualCompositeCollection = new CompositeCollection<>(compositeCollection1,
        compositeCollection2);

    // Assert
    assertEquals(2, actualCompositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#CompositeCollection(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#CompositeCollection(Collection)}
   */
  @Test
  @DisplayName("Test new CompositeCollection(Collection); when ArrayList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection)"})
  void testNewCompositeCollection_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    CompositeCollection<Object> actualCompositeCollection = new CompositeCollection<>(new ArrayList<>());

    // Assert
    assertTrue(actualCompositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#CompositeCollection(Collection, Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#CompositeCollection(Collection, Collection)}
   */
  @Test
  @DisplayName("Test new CompositeCollection(Collection, Collection); when ArrayList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection, Collection)"})
  void testNewCompositeCollection_whenArrayList_thenReturnEmpty2() {
    // Arrange
    ArrayList<Object> compositeCollection1 = new ArrayList<>();

    // Act
    CompositeCollection<Object> actualCompositeCollection = new CompositeCollection<>(compositeCollection1,
        new ArrayList<>());

    // Assert
    assertTrue(actualCompositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#CompositeCollection(Collection[])}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#CompositeCollection(Collection[])}
   */
  @Test
  @DisplayName("Test new CompositeCollection(Collection[]); when ArrayList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection[])"})
  void testNewCompositeCollection_whenArrayList_thenReturnEmpty3() {
    // Arrange and Act
    CompositeCollection<Object> actualCompositeCollection = new CompositeCollection<>(new ArrayList<>());

    // Assert
    assertTrue(actualCompositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#CompositeCollection(Collection)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#CompositeCollection(Collection)}
   */
  @Test
  @DisplayName("Test new CompositeCollection(Collection); when 'null'; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection)"})
  void testNewCompositeCollection_whenNull_thenReturnEmpty() {
    // Arrange and Act
    CompositeCollection<Object> actualCompositeCollection = new CompositeCollection<>((Collection<Object>) null);

    // Assert
    assertTrue(actualCompositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#CompositeCollection(Collection, Collection)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#CompositeCollection(Collection, Collection)}
   */
  @Test
  @DisplayName("Test new CompositeCollection(Collection, Collection); when 'null'; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection, Collection)"})
  void testNewCompositeCollection_whenNull_thenReturnEmpty2() {
    // Arrange and Act
    CompositeCollection<Object> actualCompositeCollection = new CompositeCollection<>(null, null);

    // Assert
    assertTrue(actualCompositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#add(Object)}.
   * <ul>
   *   <li>Given {@link CollectionMutator} {@link CollectionMutator#add(CompositeCollection, List, Object)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object); given CollectionMutator add(CompositeCollection, List, Object) return 'false'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompositeCollection.add(Object)"})
  void testAdd_givenCollectionMutatorAddReturnFalse_thenReturnFalse() {
    // Arrange
    CollectionMutator<Object> mutator = mock(CollectionMutator.class);
    when(mutator.add(Mockito.<CompositeCollection<Object>>any(), Mockito.<List<Collection<Object>>>any(),
        Mockito.<Object>any())).thenReturn(false);

    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    compositeCollection.setMutator(mutator);

    // Act
    boolean actualAddResult = compositeCollection.add("Obj");

    // Assert
    verify(mutator).add(isA(CompositeCollection.class), isA(List.class), isA(Object.class));
    assertFalse(actualAddResult);
  }

  /**
   * Test {@link CompositeCollection#add(Object)}.
   * <ul>
   *   <li>Given {@link CollectionMutator} {@link CollectionMutator#add(CompositeCollection, List, Object)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object); given CollectionMutator add(CompositeCollection, List, Object) return 'true'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompositeCollection.add(Object)"})
  void testAdd_givenCollectionMutatorAddReturnTrue_thenReturnTrue() {
    // Arrange
    CollectionMutator<Object> mutator = mock(CollectionMutator.class);
    when(mutator.add(Mockito.<CompositeCollection<Object>>any(), Mockito.<List<Collection<Object>>>any(),
        Mockito.<Object>any())).thenReturn(true);

    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    compositeCollection.setMutator(mutator);

    // Act
    boolean actualAddResult = compositeCollection.add("Obj");

    // Assert
    verify(mutator).add(isA(CompositeCollection.class), isA(List.class), isA(Object.class));
    assertTrue(actualAddResult);
  }

  /**
   * Test {@link CompositeCollection#add(Object)}.
   * <ul>
   *   <li>Given {@link CollectionMutator} {@link CollectionMutator#add(CompositeCollection, List, Object)} throw {@link UnsupportedOperationException#UnsupportedOperationException(String)} with {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object); given CollectionMutator add(CompositeCollection, List, Object) throw UnsupportedOperationException(String) with 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompositeCollection.add(Object)"})
  void testAdd_givenCollectionMutatorAddThrowUnsupportedOperationExceptionWithFoo() {
    // Arrange
    CollectionMutator<Object> mutator = mock(CollectionMutator.class);
    when(mutator.add(Mockito.<CompositeCollection<Object>>any(), Mockito.<List<Collection<Object>>>any(),
        Mockito.<Object>any())).thenThrow(new UnsupportedOperationException("foo"));

    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    compositeCollection.setMutator(mutator);

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> compositeCollection.add("Obj"));
    verify(mutator).add(isA(CompositeCollection.class), isA(List.class), isA(Object.class));
  }

  /**
   * Test {@link CompositeCollection#add(Object)}.
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.</li>
   *   <li>Then throw {@link UnsupportedOperationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object); given CompositeCollection(); then throw UnsupportedOperationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompositeCollection.add(Object)"})
  void testAdd_givenCompositeCollection_thenThrowUnsupportedOperationException() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> compositeCollection.add("Obj"));
  }

  /**
   * Test {@link CompositeCollection#addAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then throw {@link UnsupportedOperationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#addAll(Collection)}
   */
  @Test
  @DisplayName("Test addAll(Collection); given '42'; when ArrayList() add '42'; then throw UnsupportedOperationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompositeCollection.addAll(Collection)"})
  void testAddAll_given42_whenArrayListAdd42_thenThrowUnsupportedOperationException() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> compositeCollection.addAll(coll));
  }

  /**
   * Test {@link CompositeCollection#addAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then throw {@link UnsupportedOperationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#addAll(Collection)}
   */
  @Test
  @DisplayName("Test addAll(Collection); given '42'; when ArrayList() add '42'; then throw UnsupportedOperationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompositeCollection.addAll(Collection)"})
  void testAddAll_given42_whenArrayListAdd42_thenThrowUnsupportedOperationException2() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> compositeCollection.addAll(coll));
  }

  /**
   * Test {@link CompositeCollection#addAll(Collection)}.
   * <ul>
   *   <li>Given {@link CollectionMutator} {@link CollectionMutator#addAll(CompositeCollection, List, Collection)} return {@code false}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#addAll(Collection)}
   */
  @Test
  @DisplayName("Test addAll(Collection); given CollectionMutator addAll(CompositeCollection, List, Collection) return 'false'; when ArrayList(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompositeCollection.addAll(Collection)"})
  void testAddAll_givenCollectionMutatorAddAllReturnFalse_whenArrayList_thenReturnFalse() {
    // Arrange
    CollectionMutator<Object> mutator = mock(CollectionMutator.class);
    when(mutator.addAll(Mockito.<CompositeCollection<Object>>any(), Mockito.<List<Collection<Object>>>any(),
        Mockito.<Collection<Object>>any())).thenReturn(false);

    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    compositeCollection.setMutator(mutator);

    // Act
    boolean actualAddAllResult = compositeCollection.addAll(new ArrayList<>());

    // Assert
    verify(mutator).addAll(isA(CompositeCollection.class), isA(List.class), isA(Collection.class));
    assertFalse(actualAddAllResult);
  }

  /**
   * Test {@link CompositeCollection#addAll(Collection)}.
   * <ul>
   *   <li>Given {@link CollectionMutator} {@link CollectionMutator#addAll(CompositeCollection, List, Collection)} return {@code true}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#addAll(Collection)}
   */
  @Test
  @DisplayName("Test addAll(Collection); given CollectionMutator addAll(CompositeCollection, List, Collection) return 'true'; when ArrayList(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompositeCollection.addAll(Collection)"})
  void testAddAll_givenCollectionMutatorAddAllReturnTrue_whenArrayList_thenReturnTrue() {
    // Arrange
    CollectionMutator<Object> mutator = mock(CollectionMutator.class);
    when(mutator.addAll(Mockito.<CompositeCollection<Object>>any(), Mockito.<List<Collection<Object>>>any(),
        Mockito.<Collection<Object>>any())).thenReturn(true);

    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    compositeCollection.setMutator(mutator);

    // Act
    boolean actualAddAllResult = compositeCollection.addAll(new ArrayList<>());

    // Assert
    verify(mutator).addAll(isA(CompositeCollection.class), isA(List.class), isA(Collection.class));
    assertTrue(actualAddAllResult);
  }

  /**
   * Test {@link CompositeCollection#addAll(Collection)}.
   * <ul>
   *   <li>Given {@link CollectionMutator} {@link CollectionMutator#addAll(CompositeCollection, List, Collection)} throw {@link UnsupportedOperationException#UnsupportedOperationException(String)} with {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#addAll(Collection)}
   */
  @Test
  @DisplayName("Test addAll(Collection); given CollectionMutator addAll(CompositeCollection, List, Collection) throw UnsupportedOperationException(String) with 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompositeCollection.addAll(Collection)"})
  void testAddAll_givenCollectionMutatorAddAllThrowUnsupportedOperationExceptionWithFoo() {
    // Arrange
    CollectionMutator<Object> mutator = mock(CollectionMutator.class);
    when(mutator.addAll(Mockito.<CompositeCollection<Object>>any(), Mockito.<List<Collection<Object>>>any(),
        Mockito.<Collection<Object>>any())).thenThrow(new UnsupportedOperationException("foo"));

    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    compositeCollection.setMutator(mutator);

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> compositeCollection.addAll(new ArrayList<>()));
    verify(mutator).addAll(isA(CompositeCollection.class), isA(List.class), isA(Collection.class));
  }

  /**
   * Test {@link CompositeCollection#addAll(Collection)}.
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.</li>
   *   <li>Then throw {@link UnsupportedOperationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#addAll(Collection)}
   */
  @Test
  @DisplayName("Test addAll(Collection); given CompositeCollection(); then throw UnsupportedOperationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompositeCollection.addAll(Collection)"})
  void testAddAll_givenCompositeCollection_thenThrowUnsupportedOperationException() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> compositeCollection.addAll(new ArrayList<>()));
  }

  /**
   * Test {@link CompositeCollection#addComposited(Collection, Collection)} with {@code compositeCollection1}, {@code compositeCollection2}.
   * <p>
   * Method under test: {@link CompositeCollection#addComposited(Collection, Collection)}
   */
  @Test
  @DisplayName("Test addComposited(Collection, Collection) with 'compositeCollection1', 'compositeCollection2'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection, Collection)"})
  void testAddCompositedWithCompositeCollection1CompositeCollection2() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    ArrayList<Object> compositeCollection1 = new ArrayList<>();

    // Act
    compositeCollection.addComposited(compositeCollection1, new ArrayList<>());

    // Assert that nothing has changed
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#addComposited(Collection)} with {@code compositeCollection}.
   * <ul>
   *   <li>Then {@link CompositeCollection#CompositeCollection()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#addComposited(Collection)}
   */
  @Test
  @DisplayName("Test addComposited(Collection) with 'compositeCollection'; then CompositeCollection() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection)"})
  void testAddCompositedWithCompositeCollection_thenCompositeCollectionSizeIsOne() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> compositeCollection2 = new ArrayList<>();
    compositeCollection2.add("42");

    // Act
    compositeCollection.addComposited(compositeCollection2);

    // Assert
    assertEquals(1, compositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#addComposited(Collection)} with {@code compositeCollection}.
   * <ul>
   *   <li>Then {@link CompositeCollection#CompositeCollection()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#addComposited(Collection)}
   */
  @Test
  @DisplayName("Test addComposited(Collection) with 'compositeCollection'; then CompositeCollection() size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection)"})
  void testAddCompositedWithCompositeCollection_thenCompositeCollectionSizeIsTwo() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> compositeCollection2 = new ArrayList<>();
    compositeCollection2.add("42");
    compositeCollection2.add("42");

    // Act
    compositeCollection.addComposited(compositeCollection2);

    // Assert
    assertEquals(2, compositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#addComposited(Collection)} with {@code compositeCollection}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#addComposited(Collection)}
   */
  @Test
  @DisplayName("Test addComposited(Collection) with 'compositeCollection'; when ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection)"})
  void testAddCompositedWithCompositeCollection_whenArrayList() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act
    compositeCollection.addComposited(new ArrayList<>());

    // Assert that nothing has changed
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#addComposited(Collection)} with {@code compositeCollection}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then {@link CompositeCollection#CompositeCollection()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#addComposited(Collection)}
   */
  @Test
  @DisplayName("Test addComposited(Collection) with 'compositeCollection'; when 'null'; then CompositeCollection() Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection)"})
  void testAddCompositedWithCompositeCollection_whenNull_thenCompositeCollectionEmpty() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act
    compositeCollection.addComposited((Collection<Object>) null);

    // Assert that nothing has changed
    assertTrue(compositeCollection.isEmpty());
  }
}
