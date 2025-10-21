package org.apache.commons.collections4.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import org.apache.commons.collections4.collection.CompositeCollection.CollectionMutator;
import org.apache.commons.collections4.iterators.IteratorChain;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class CompositeCollectionDiffblueTest {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeCollection.<init>()", "CollectionMutator CompositeCollection.getMutator()",
      "void CompositeCollection.setMutator(CollectionMutator)"})
  public void testGettersAndSetters() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection)"})
  public void testNewCompositeCollection_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection, Collection)"})
  public void testNewCompositeCollection_given42_whenArrayListAdd42_thenReturnSizeIsOne2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection, Collection)"})
  public void testNewCompositeCollection_given42_whenArrayListAdd42_thenReturnSizeIsOne3() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection)"})
  public void testNewCompositeCollection_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection, Collection)"})
  public void testNewCompositeCollection_given42_whenArrayListAdd42_thenReturnSizeIsTwo2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection, Collection)"})
  public void testNewCompositeCollection_given42_whenArrayListAdd42_thenReturnSizeIsTwo3() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection)"})
  public void testNewCompositeCollection_whenArrayList_thenReturnEmpty() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection, Collection)"})
  public void testNewCompositeCollection_whenArrayList_thenReturnEmpty2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection[])"})
  public void testNewCompositeCollection_whenArrayList_thenReturnEmpty3() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection)"})
  public void testNewCompositeCollection_whenNull_thenReturnEmpty() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeCollection.<init>(Collection, Collection)"})
  public void testNewCompositeCollection_whenNull_thenReturnEmpty2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.add(Object)"})
  public void testAdd_givenCollectionMutatorAddReturnFalse_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.add(Object)"})
  public void testAdd_givenCollectionMutatorAddReturnTrue_thenReturnTrue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.add(Object)"})
  public void testAdd_givenCollectionMutatorAddThrowUnsupportedOperationExceptionWithFoo() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.add(Object)"})
  public void testAdd_givenCompositeCollection_thenThrowUnsupportedOperationException() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.addAll(Collection)"})
  public void testAddAll_given42_whenArrayListAdd42_thenThrowUnsupportedOperationException() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.addAll(Collection)"})
  public void testAddAll_given42_whenArrayListAdd42_thenThrowUnsupportedOperationException2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.addAll(Collection)"})
  public void testAddAll_givenCollectionMutatorAddAllReturnFalse_whenArrayList_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.addAll(Collection)"})
  public void testAddAll_givenCollectionMutatorAddAllReturnTrue_whenArrayList_thenReturnTrue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.addAll(Collection)"})
  public void testAddAll_givenCollectionMutatorAddAllThrowUnsupportedOperationExceptionWithFoo() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.addAll(Collection)"})
  public void testAddAll_givenCompositeCollection_thenThrowUnsupportedOperationException() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection, Collection)"})
  public void testAddCompositedWithCompositeCollection1CompositeCollection2() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    ArrayList<Object> compositeCollection1 = new ArrayList<>();

    // Act
    compositeCollection.addComposited(compositeCollection1, new ArrayList<>());

    // Assert that nothing has changed
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#addComposited(Collection, Collection)} with {@code compositeCollection1}, {@code compositeCollection2}.
   * <ul>
   *   <li>When {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#addComposited(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection, Collection)"})
  public void testAddCompositedWithCompositeCollection1CompositeCollection2_whenNull() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act
    compositeCollection.addComposited(null, null);

    // Assert that nothing has changed
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#addComposited(Collection, Collection)} with {@code compositeCollection1}, {@code compositeCollection2}.
   * <p>
   * Method under test: {@link CompositeCollection#addComposited(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection, Collection)"})
  public void testAddCompositedWithCompositeCollection1CompositeCollection22() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> compositeCollection1 = new ArrayList<>();
    compositeCollection1.add("42");

    // Act
    compositeCollection.addComposited(compositeCollection1, new ArrayList<>());

    // Assert
    assertEquals(1, compositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#addComposited(Collection, Collection)} with {@code compositeCollection1}, {@code compositeCollection2}.
   * <p>
   * Method under test: {@link CompositeCollection#addComposited(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection, Collection)"})
  public void testAddCompositedWithCompositeCollection1CompositeCollection23() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> compositeCollection1 = new ArrayList<>();
    compositeCollection1.add("42");
    compositeCollection1.add("42");

    // Act
    compositeCollection.addComposited(compositeCollection1, new ArrayList<>());

    // Assert
    assertEquals(2, compositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#addComposited(Collection, Collection)} with {@code compositeCollection1}, {@code compositeCollection2}.
   * <p>
   * Method under test: {@link CompositeCollection#addComposited(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection, Collection)"})
  public void testAddCompositedWithCompositeCollection1CompositeCollection24() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    ArrayList<Object> compositeCollection1 = new ArrayList<>();

    ArrayList<Object> compositeCollection2 = new ArrayList<>();
    compositeCollection2.add("42");

    // Act
    compositeCollection.addComposited(compositeCollection1, compositeCollection2);

    // Assert
    assertEquals(1, compositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#addComposited(Collection, Collection)} with {@code compositeCollection1}, {@code compositeCollection2}.
   * <p>
   * Method under test: {@link CompositeCollection#addComposited(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection, Collection)"})
  public void testAddCompositedWithCompositeCollection1CompositeCollection25() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    ArrayList<Object> compositeCollection1 = new ArrayList<>();

    ArrayList<Object> compositeCollection2 = new ArrayList<>();
    compositeCollection2.add("42");
    compositeCollection2.add("42");

    // Act
    compositeCollection.addComposited(compositeCollection1, compositeCollection2);

    // Assert
    assertEquals(2, compositeCollection.size());
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection)"})
  public void testAddCompositedWithCompositeCollection_thenCompositeCollectionSizeIsOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection)"})
  public void testAddCompositedWithCompositeCollection_thenCompositeCollectionSizeIsTwo() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection)"})
  public void testAddCompositedWithCompositeCollection_whenArrayList() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void CompositeCollection.addComposited(Collection)"})
  public void testAddCompositedWithCompositeCollection_whenNull_thenCompositeCollectionEmpty() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act
    compositeCollection.addComposited((Collection<Object>) null);

    // Assert that nothing has changed
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#contains(Object)}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>When {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#contains(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.contains(Object)"})
  public void testContains_givenArrayListAdd42_when42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add("42");

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>();
    compositeCollection2.addComposited(compositeCollection);

    // Act and Assert
    assertTrue(compositeCollection2.contains("42"));
  }

  /**
   * Test {@link CompositeCollection#contains(Object)}.
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()} addComposited {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#contains(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.contains(Object)"})
  public void testContains_givenCompositeCollectionAddCompositedArrayList_thenReturnFalse() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    compositeCollection.addComposited(new ArrayList<>());

    // Act and Assert
    assertFalse(compositeCollection.contains("Obj"));
  }

  /**
   * Test {@link CompositeCollection#contains(Object)}.
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.</li>
   *   <li>When {@code Obj}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#contains(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.contains(Object)"})
  public void testContains_givenCompositeCollection_whenObj_thenReturnFalse() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertFalse(compositeCollection.contains("Obj"));
  }

  /**
   * Test {@link CompositeCollection#containsAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#containsAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.containsAll(Collection)"})
  public void testContainsAll_given42_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(compositeCollection.containsAll(coll));
  }

  /**
   * Test {@link CompositeCollection#containsAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#containsAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.containsAll(Collection)"})
  public void testContainsAll_given42_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(compositeCollection.containsAll(coll));
  }

  /**
   * Test {@link CompositeCollection#containsAll(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#containsAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.containsAll(Collection)"})
  public void testContainsAll_whenArrayList_thenReturnTrue() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertTrue(compositeCollection.containsAll(new ArrayList<>()));
  }

  /**
   * Test {@link CompositeCollection#getCollections()}.
   * <p>
   * Method under test: {@link CompositeCollection#getCollections()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List CompositeCollection.getCollections()"})
  public void testGetCollections() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertTrue(compositeCollection.getCollections().isEmpty());
  }

  /**
   * Test {@link CompositeCollection#isEmpty()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.isEmpty()"})
  public void testIsEmpty_givenArrayListAdd42_thenReturnFalse() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add("42");

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>();
    compositeCollection2.addComposited(compositeCollection);

    // Act and Assert
    assertFalse(compositeCollection2.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#isEmpty()}.
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()} addComposited {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.isEmpty()"})
  public void testIsEmpty_givenCompositeCollectionAddCompositedArrayList_thenReturnTrue() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    compositeCollection.addComposited(new ArrayList<>());

    // Act and Assert
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#isEmpty()}.
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.isEmpty()"})
  public void testIsEmpty_givenCompositeCollection_thenReturnTrue() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#iterator()}.
   * <ul>
   *   <li>Then return {@link IteratorChain}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#iterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator CompositeCollection.iterator()"})
  public void testIterator_thenReturnIteratorChain() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    compositeCollection.addComposited(new ArrayList<>());

    // Act
    Iterator<Object> actualIteratorResult = compositeCollection.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof IteratorChain);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link CompositeCollection#iterator()}.
   * <ul>
   *   <li>Then return {@link IteratorChain}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#iterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator CompositeCollection.iterator()"})
  public void testIterator_thenReturnIteratorChain2() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    compositeCollection.addComposited(new ArrayList<>());
    compositeCollection.addComposited(new ArrayList<>());

    // Act
    Iterator<Object> actualIteratorResult = compositeCollection.iterator();

    // Assert
    assertTrue(actualIteratorResult instanceof IteratorChain);
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link CompositeCollection#remove(Object)}.
   * <ul>
   *   <li>Given {@link CollectionMutator} {@link CollectionMutator#remove(CompositeCollection, List, Object)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.remove(Object)"})
  public void testRemove_givenCollectionMutatorRemoveReturnFalse_thenReturnFalse() {
    // Arrange
    CollectionMutator<Object> mutator = mock(CollectionMutator.class);
    when(mutator.remove(Mockito.<CompositeCollection<Object>>any(), Mockito.<List<Collection<Object>>>any(),
        Mockito.<Object>any())).thenReturn(false);

    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    compositeCollection.setMutator(mutator);

    // Act
    boolean actualRemoveResult = compositeCollection.remove("Obj");

    // Assert
    verify(mutator).remove(isA(CompositeCollection.class), isA(List.class), isA(Object.class));
    assertFalse(actualRemoveResult);
  }

  /**
   * Test {@link CompositeCollection#remove(Object)}.
   * <ul>
   *   <li>Given {@link CollectionMutator} {@link CollectionMutator#remove(CompositeCollection, List, Object)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.remove(Object)"})
  public void testRemove_givenCollectionMutatorRemoveReturnTrue_thenReturnTrue() {
    // Arrange
    CollectionMutator<Object> mutator = mock(CollectionMutator.class);
    when(mutator.remove(Mockito.<CompositeCollection<Object>>any(), Mockito.<List<Collection<Object>>>any(),
        Mockito.<Object>any())).thenReturn(true);

    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    compositeCollection.setMutator(mutator);

    // Act
    boolean actualRemoveResult = compositeCollection.remove("Obj");

    // Assert
    verify(mutator).remove(isA(CompositeCollection.class), isA(List.class), isA(Object.class));
    assertTrue(actualRemoveResult);
  }

  /**
   * Test {@link CompositeCollection#remove(Object)}.
   * <ul>
   *   <li>Given {@link CollectionMutator} {@link CollectionMutator#remove(CompositeCollection, List, Object)} throw {@link UnsupportedOperationException#UnsupportedOperationException(String)} with {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.remove(Object)"})
  public void testRemove_givenCollectionMutatorRemoveThrowUnsupportedOperationExceptionWithFoo() {
    // Arrange
    CollectionMutator<Object> mutator = mock(CollectionMutator.class);
    when(mutator.remove(Mockito.<CompositeCollection<Object>>any(), Mockito.<List<Collection<Object>>>any(),
        Mockito.<Object>any())).thenThrow(new UnsupportedOperationException("foo"));

    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    compositeCollection.setMutator(mutator);

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> compositeCollection.remove("Obj"));
    verify(mutator).remove(isA(CompositeCollection.class), isA(List.class), isA(Object.class));
  }

  /**
   * Test {@link CompositeCollection#remove(Object)}.
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.</li>
   *   <li>Then throw {@link UnsupportedOperationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.remove(Object)"})
  public void testRemove_givenCompositeCollection_thenThrowUnsupportedOperationException() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> compositeCollection.remove("Obj"));
  }

  /**
   * Test {@link CompositeCollection#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#removeAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.removeAll(Collection)"})
  public void testRemoveAll_given42_whenArrayListAdd42() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(compositeCollection.removeAll(coll));
  }

  /**
   * Test {@link CompositeCollection#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#removeAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.removeAll(Collection)"})
  public void testRemoveAll_given42_whenArrayListAdd422() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(compositeCollection.removeAll(coll));
  }

  /**
   * Test {@link CompositeCollection#removeAll(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#removeAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.removeAll(Collection)"})
  public void testRemoveAll_whenArrayList() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertFalse(compositeCollection.removeAll(new ArrayList<>()));
  }

  /**
   * Test {@link CompositeCollection#removeIf(Predicate)}.
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#removeIf(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.removeIf(Predicate)"})
  public void testRemoveIf_givenCompositeCollection_whenNull_thenReturnFalse() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertFalse(compositeCollection.removeIf(null));
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#removeIf(Predicate)}.
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.</li>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#removeIf(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.removeIf(Predicate)"})
  public void testRemoveIf_givenCompositeCollection_whenPredicate_thenReturnFalse() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertFalse(compositeCollection.removeIf(mock(Predicate.class)));
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#removeIf(Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#removeIf(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.removeIf(Predicate)"})
  public void testRemoveIf_givenTrue_whenPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add("42");

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>();
    compositeCollection2.addComposited(compositeCollection);
    Predicate<Object> filter = mock(Predicate.class);
    when(filter.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualRemoveIfResult = compositeCollection2.removeIf(filter);

    // Assert
    verify(filter).test(isA(Object.class));
    assertTrue(compositeCollection2.isEmpty());
    assertTrue(actualRemoveIfResult);
  }

  /**
   * Test {@link CompositeCollection#removeIf(Predicate)}.
   * <ul>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#removeIf(Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.removeIf(Predicate)"})
  public void testRemoveIf_whenPredicate_thenReturnFalse() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    compositeCollection.addComposited(new ArrayList<>());

    // Act and Assert
    assertFalse(compositeCollection.removeIf(mock(Predicate.class)));
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#retainAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#retainAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.retainAll(Collection)"})
  public void testRetainAll_given42_whenArrayListAdd42() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(compositeCollection.retainAll(coll));
  }

  /**
   * Test {@link CompositeCollection#retainAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#retainAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.retainAll(Collection)"})
  public void testRetainAll_given42_whenArrayListAdd422() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(compositeCollection.retainAll(coll));
  }

  /**
   * Test {@link CompositeCollection#retainAll(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#retainAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean CompositeCollection.retainAll(Collection)"})
  public void testRetainAll_whenArrayList() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertFalse(compositeCollection.retainAll(new ArrayList<>()));
  }

  /**
   * Test {@link CompositeCollection#size()}.
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#size()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CompositeCollection.size()"})
  public void testSize_givenCompositeCollection() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertEquals(0, compositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#size()}.
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()} addComposited {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#size()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int CompositeCollection.size()"})
  public void testSize_givenCompositeCollectionAddCompositedArrayList() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    compositeCollection.addComposited(new ArrayList<>());

    // Act and Assert
    assertEquals(0, compositeCollection.size());
  }

  /**
   * Test {@link CompositeCollection#toArray(Object[])} with {@code Object[]}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return first element is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#toArray(Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object[] CompositeCollection.toArray(Object[])"})
  public void testToArrayWithObject_givenArrayListAdd42_thenReturnFirstElementIs42() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add("42");
    compositeCollection.add("42");

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>();
    compositeCollection2.addComposited(compositeCollection);

    // Act
    Object[] actualToArrayResult = compositeCollection2.toArray(new Object[]{"Array"});

    // Assert
    assertEquals("42", actualToArrayResult[0]);
    assertEquals("42", actualToArrayResult[1]);
    assertEquals(2, actualToArrayResult.length);
  }

  /**
   * Test {@link CompositeCollection#toArray(Object[])} with {@code Object[]}.
   * <ul>
   *   <li>When empty array of {@link Object}.</li>
   *   <li>Then return array length is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#toArray(Object[])}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object[] CompositeCollection.toArray(Object[])"})
  public void testToArrayWithObject_whenEmptyArrayOfObject_thenReturnArrayLengthIsZero() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertEquals(0, compositeCollection.toArray(new Object[]{}).length);
  }

  /**
   * Test {@link CompositeCollection#toCollection()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#toCollection()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CompositeCollection.toCollection()"})
  public void testToCollection_givenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add("42");

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>();
    compositeCollection2.addComposited(compositeCollection);

    // Act
    Collection<Object> actualToCollectionResult = compositeCollection2.toCollection();

    // Assert
    assertTrue(actualToCollectionResult instanceof List);
    assertEquals(1, actualToCollectionResult.size());
    assertEquals("42", ((List<Object>) actualToCollectionResult).get(0));
  }

  /**
   * Test {@link CompositeCollection#toCollection()}.
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()} addComposited {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#toCollection()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CompositeCollection.toCollection()"})
  public void testToCollection_givenCompositeCollectionAddCompositedArrayList_thenReturnEmpty() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    compositeCollection.addComposited(new ArrayList<>());

    // Act
    Collection<Object> actualToCollectionResult = compositeCollection.toCollection();

    // Assert
    assertTrue(actualToCollectionResult instanceof List);
    assertTrue(actualToCollectionResult.isEmpty());
  }

  /**
   * Test {@link CompositeCollection#toCollection()}.
   * <ul>
   *   <li>Given {@link CompositeCollection#CompositeCollection()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeCollection#toCollection()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Collection CompositeCollection.toCollection()"})
  public void testToCollection_givenCompositeCollection_thenReturnEmpty() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act
    Collection<Object> actualToCollectionResult = compositeCollection.toCollection();

    // Assert
    assertTrue(actualToCollectionResult instanceof List);
    assertTrue(actualToCollectionResult.isEmpty());
  }
}
