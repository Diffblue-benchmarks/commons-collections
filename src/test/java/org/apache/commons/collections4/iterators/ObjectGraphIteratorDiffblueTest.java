package org.apache.commons.collections4.iterators;

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
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ObjectGraphIteratorDiffblueTest {
  /**
   * Test {@link ObjectGraphIterator#ObjectGraphIterator(Iterator)}.
   *
   * <p>Method under test: {@link ObjectGraphIterator#ObjectGraphIterator(Iterator)}
   */
  @Test
  @DisplayName("Test new ObjectGraphIterator(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectGraphIterator.<init>(Iterator)"})
  void testNewObjectGraphIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    ObjectGraphIterator<Object> actualObjectGraphIterator =
        new ObjectGraphIterator<>(objectList.iterator());

    // Assert
    assertFalse(actualObjectGraphIterator.hasNext());
  }

  /**
   * Test {@link ObjectGraphIterator#ObjectGraphIterator(Object, Transformer)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#ObjectGraphIterator(Object, Transformer)}
   */
  @Test
  @DisplayName("Test new ObjectGraphIterator(Object, Transformer); when ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectGraphIterator.<init>(Object, Transformer)"})
  void testNewObjectGraphIterator_whenArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    ObjectGraphIterator<Object> actualObjectGraphIterator =
        new ObjectGraphIterator<>(objectList.iterator(), mock(Transformer.class));

    // Assert
    assertFalse(actualObjectGraphIterator.hasNext());
  }

  /**
   * Test {@link ObjectGraphIterator#ObjectGraphIterator(Object, Transformer)}.
   *
   * <ul>
   *   <li>When {@code Root}.
   *   <li>Then return next is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#ObjectGraphIterator(Object, Transformer)}
   */
  @Test
  @DisplayName(
      "Test new ObjectGraphIterator(Object, Transformer); when 'Root'; then return next is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectGraphIterator.<init>(Object, Transformer)"})
  void testNewObjectGraphIterator_whenRoot_thenReturnNextIsNull() {
    // Arrange and Act
    ObjectGraphIterator<Object> actualObjectGraphIterator =
        new ObjectGraphIterator<>("Root", mock(Transformer.class));

    // Assert
    assertNull(actualObjectGraphIterator.next());
    assertFalse(actualObjectGraphIterator.hasNext());
  }

  /**
   * Test {@link ObjectGraphIterator#findNext(Object)}.
   *
   * <ul>
   *   <li>Then not {@link ObjectGraphIterator#ObjectGraphIterator(Object, Transformer)} with {@code
   *       Root} and {@link Transformer} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#findNext(Object)}
   */
  @Test
  @DisplayName(
      "Test findNext(Object); then not ObjectGraphIterator(Object, Transformer) with 'Root' and Transformer hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectGraphIterator.findNext(Object)"})
  void testFindNext_thenNotObjectGraphIteratorWithRootAndTransformerHasNext() {
    // Arrange
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>("Root", mock(Transformer.class));

    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iteratorResult = objectList.iterator();

    // Act
    objectGraphIterator.findNext(iteratorResult);

    // Assert
    assertFalse(iteratorResult.hasNext());
    assertFalse(objectGraphIterator.hasNext());
  }

  /**
   * Test {@link ObjectGraphIterator#findNext(Object)}.
   *
   * <ul>
   *   <li>Then {@link ObjectGraphIterator#ObjectGraphIterator(Object, Transformer)} with root is
   *       {@link Scanner#Scanner(String)} and {@link Transformer} next is {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#findNext(Object)}
   */
  @Test
  @DisplayName(
      "Test findNext(Object); then ObjectGraphIterator(Object, Transformer) with root is Scanner(String) and Transformer next is 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectGraphIterator.findNext(Object)"})
  void testFindNext_thenObjectGraphIteratorWithRootIsScannerAndTransformerNextIsApply() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>(new Scanner("foo"), transformer);

    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iteratorResult = objectList.iterator();

    // Act
    objectGraphIterator.findNext(iteratorResult);

    // Assert that nothing has changed
    verify(transformer).apply(isA(Object.class));
    assertEquals("Apply", objectGraphIterator.next());
    assertFalse(iteratorResult.hasNext());
    assertFalse(objectGraphIterator.hasNext());
  }

  /**
   * Test {@link ObjectGraphIterator#findNext(Object)}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#findNext(Object)}
   */
  @Test
  @DisplayName("Test findNext(Object); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectGraphIterator.findNext(Object)"})
  void testFindNext_thenThrowNoSuchElementException() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new NoSuchElementException());
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>(new Scanner("foo"), transformer);

    ArrayList<Object> objectList = new ArrayList<>();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> objectGraphIterator.findNext(objectList.iterator()));
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link ObjectGraphIterator#findNext(Object)}.
   *
   * <ul>
   *   <li>When {@code Value}.
   *   <li>Then {@link ObjectGraphIterator#ObjectGraphIterator(Object, Transformer)} with {@code
   *       Root} and {@link Transformer} next is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#findNext(Object)}
   */
  @Test
  @DisplayName(
      "Test findNext(Object); when 'Value'; then ObjectGraphIterator(Object, Transformer) with 'Root' and Transformer next is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectGraphIterator.findNext(Object)"})
  void testFindNext_whenValue_thenObjectGraphIteratorWithRootAndTransformerNextIsValue() {
    // Arrange
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>("Root", mock(Transformer.class));

    // Act
    objectGraphIterator.findNext("Value");

    // Assert
    assertEquals("Value", objectGraphIterator.next());
    assertNull(objectGraphIterator.next());
    assertFalse(objectGraphIterator.hasNext());
  }

  /**
   * Test {@link ObjectGraphIterator#findNextByIterator(Iterator)}.
   *
   * <p>Method under test: {@link ObjectGraphIterator#findNextByIterator(Iterator)}
   */
  @Test
  @DisplayName("Test findNextByIterator(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectGraphIterator.findNextByIterator(Iterator)"})
  void testFindNextByIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();
    Iterator<Object> iterator = objectList2.iterator();

    // Act
    objectGraphIterator.findNextByIterator(iterator);

    // Assert that nothing has changed
    assertFalse(iterator.hasNext());
    assertFalse(objectGraphIterator.hasNext());
  }

  /**
   * Test {@link ObjectGraphIterator#findNextByIterator(Iterator)}.
   *
   * <p>Method under test: {@link ObjectGraphIterator#findNextByIterator(Iterator)}
   */
  @Test
  @DisplayName("Test findNextByIterator(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectGraphIterator.findNextByIterator(Iterator)"})
  void testFindNextByIterator2() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    ObjectGraphIterator<Object> objectGraphIterator = new ObjectGraphIterator<>(null, transformer);
    objectGraphIterator.updateCurrentIterator();

    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    // Act
    objectGraphIterator.findNextByIterator(iterator);

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals("Apply", objectGraphIterator.next());
    assertFalse(iterator.hasNext());
    assertFalse(objectGraphIterator.hasNext());
  }

  /**
   * Test {@link ObjectGraphIterator#findNextByIterator(Iterator)}.
   *
   * <p>Method under test: {@link ObjectGraphIterator#findNextByIterator(Iterator)}
   */
  @Test
  @DisplayName("Test findNextByIterator(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectGraphIterator.findNextByIterator(Iterator)"})
  void testFindNextByIterator3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>(objectList.iterator());
    objectGraphIterator.updateCurrentIterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    objectList2.add("42");
    Iterator<Object> iterator = objectList2.iterator();

    // Act
    objectGraphIterator.findNextByIterator(iterator);

    // Assert
    assertEquals("42", objectGraphIterator.next());
    assertFalse(iterator.hasNext());
    assertFalse(objectGraphIterator.hasNext());
  }

  /**
   * Test {@link ObjectGraphIterator#findNextByIterator(Iterator)}.
   *
   * <ul>
   *   <li>Given {@link ObjectGraphIterator#ObjectGraphIterator(Object, Transformer)} with {@code
   *       Root} and {@link Transformer}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#findNextByIterator(Iterator)}
   */
  @Test
  @DisplayName(
      "Test findNextByIterator(Iterator); given ObjectGraphIterator(Object, Transformer) with 'Root' and Transformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectGraphIterator.findNextByIterator(Iterator)"})
  void testFindNextByIterator_givenObjectGraphIteratorWithRootAndTransformer() {
    // Arrange
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>("Root", mock(Transformer.class));

    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    objectGraphIterator.findNextByIterator(iterator);

    // Assert
    assertFalse(iterator.hasNext());
    assertFalse(objectGraphIterator.hasNext());
  }

  /**
   * Test {@link ObjectGraphIterator#findNextByIterator(Iterator)}.
   *
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@link
   *       ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#findNextByIterator(Iterator)}
   */
  @Test
  @DisplayName(
      "Test findNextByIterator(Iterator); given Transformer apply(Object) return ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectGraphIterator.findNextByIterator(Iterator)"})
  void testFindNextByIterator_givenTransformerApplyReturnArrayListIterator() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);

    ArrayList<Object> objectList = new ArrayList<>();
    when(transformer.apply(Mockito.<Object>any())).thenReturn(objectList.iterator());

    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>("Root", transformer);
    objectGraphIterator.updateCurrentIterator();

    ArrayList<Object> objectList2 = new ArrayList<>();
    objectList2.add("42");
    Iterator<Object> iterator = objectList2.iterator();

    // Act
    objectGraphIterator.findNextByIterator(iterator);

    // Assert
    verify(transformer, atLeast(1)).apply(Mockito.<Object>any());
    assertFalse(iterator.hasNext());
    assertFalse(objectGraphIterator.hasNext());
  }

  /**
   * Test {@link ObjectGraphIterator#findNextByIterator(Iterator)}.
   *
   * <ul>
   *   <li>Then {@link ObjectGraphIterator#ObjectGraphIterator(Object, Transformer)} with {@code
   *       Root} and {@link Transformer} next is {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#findNextByIterator(Iterator)}
   */
  @Test
  @DisplayName(
      "Test findNextByIterator(Iterator); then ObjectGraphIterator(Object, Transformer) with 'Root' and Transformer next is 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectGraphIterator.findNextByIterator(Iterator)"})
  void testFindNextByIterator_thenObjectGraphIteratorWithRootAndTransformerNextIsApply() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>("Root", transformer);
    objectGraphIterator.updateCurrentIterator();

    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    objectGraphIterator.findNextByIterator(iterator);

    // Assert that nothing has changed
    verify(transformer).apply(isA(Object.class));
    assertEquals("Apply", objectGraphIterator.next());
    assertFalse(iterator.hasNext());
    assertFalse(objectGraphIterator.hasNext());
  }

  /**
   * Test {@link ObjectGraphIterator#hasNext()}.
   *
   * <p>Method under test: {@link ObjectGraphIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjectGraphIterator.hasNext()"})
  void testHasNext() {
    // Arrange
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator =
        new AbstractMapIteratorDecorator<>(
            new AbstractOrderedMapIteratorDecorator<>(new EmptyOrderedMapIterator<>()));
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>(abstractMapIteratorDecorator, mock(Transformer.class));

    // Act and Assert
    assertFalse(objectGraphIterator.hasNext());
  }

  /**
   * Test {@link ObjectGraphIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link ObjectGraphIterator#ObjectGraphIterator(Object, Transformer)} with {@code
   *       Root} and {@link Transformer} updateCurrentIterator.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#hasNext()}
   */
  @Test
  @DisplayName(
      "Test hasNext(); given ObjectGraphIterator(Object, Transformer) with 'Root' and Transformer updateCurrentIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjectGraphIterator.hasNext()"})
  void testHasNext_givenObjectGraphIteratorWithRootAndTransformerUpdateCurrentIterator() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>("Root", transformer);
    objectGraphIterator.updateCurrentIterator();

    // Act
    boolean actualHasNextResult = objectGraphIterator.hasNext();

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualHasNextResult);
  }

  /**
   * Test {@link ObjectGraphIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link ObjectGraphIterator#ObjectGraphIterator(Object, Transformer)} with root is
   *       {@code null} and {@link Transformer}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#hasNext()}
   */
  @Test
  @DisplayName(
      "Test hasNext(); given ObjectGraphIterator(Object, Transformer) with root is 'null' and Transformer; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjectGraphIterator.hasNext()"})
  void testHasNext_givenObjectGraphIteratorWithRootIsNullAndTransformer_thenReturnFalse() {
    // Arrange
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>(null, mock(Transformer.class));

    // Act and Assert
    assertFalse(objectGraphIterator.hasNext());
  }

  /**
   * Test {@link ObjectGraphIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link Scanner#Scanner(String)} with {@code foo}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given Scanner(String) with 'foo'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjectGraphIterator.hasNext()"})
  void testHasNext_givenScannerWithFoo_thenReturnTrue() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>(new Scanner("foo"), transformer);

    // Act
    boolean actualHasNextResult = objectGraphIterator.hasNext();

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualHasNextResult);
  }

  /**
   * Test {@link ObjectGraphIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@code Apply}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given Transformer apply(Object) return 'Apply'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjectGraphIterator.hasNext()"})
  void testHasNext_givenTransformerApplyReturnApply_thenReturnTrue() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>("Root", transformer);

    // Act
    boolean actualHasNextResult = objectGraphIterator.hasNext();

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertTrue(actualHasNextResult);
  }

  /**
   * Test {@link ObjectGraphIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@link
   *       Scanner#Scanner(String)} with {@code foo}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#hasNext()}
   */
  @Test
  @DisplayName(
      "Test hasNext(); given Transformer apply(Object) return Scanner(String) with 'foo'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjectGraphIterator.hasNext()"})
  void testHasNext_givenTransformerApplyReturnScannerWithFoo_thenReturnFalse() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(new Scanner("foo"));
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>("Root", transformer);

    // Act
    boolean actualHasNextResult = objectGraphIterator.hasNext();

    // Assert
    verify(transformer, atLeast(1)).apply(Mockito.<Object>any());
    assertFalse(actualHasNextResult);
  }

  /**
   * Test {@link ObjectGraphIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@link
   *       Scanner#Scanner(String)} with {@code foo}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#hasNext()}
   */
  @Test
  @DisplayName(
      "Test hasNext(); given Transformer apply(Object) return Scanner(String) with 'foo'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjectGraphIterator.hasNext()"})
  void testHasNext_givenTransformerApplyReturnScannerWithFoo_thenReturnFalse2() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(new Scanner("foo"));
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>(new Scanner("foo"), transformer);

    // Act
    boolean actualHasNextResult = objectGraphIterator.hasNext();

    // Assert
    verify(transformer, atLeast(1)).apply(isA(Object.class));
    assertFalse(actualHasNextResult);
  }

  /**
   * Test {@link ObjectGraphIterator#hasNext()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ObjectGraphIterator.hasNext()"})
  void testHasNext_thenThrowNoSuchElementException() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new NoSuchElementException());
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>("Root", transformer);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectGraphIterator.hasNext());
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link ObjectGraphIterator#next()}.
   *
   * <p>Method under test: {@link ObjectGraphIterator#next()}
   */
  @Test
  @DisplayName("Test next()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ObjectGraphIterator.next()"})
  void testNext() {
    // Arrange
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator =
        new AbstractMapIteratorDecorator<>(
            new AbstractOrderedMapIteratorDecorator<>(new EmptyOrderedMapIterator<>()));
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>(abstractMapIteratorDecorator, mock(Transformer.class));

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectGraphIterator.next());
  }

  /**
   * Test {@link ObjectGraphIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link ObjectGraphIterator#ObjectGraphIterator(Object, Transformer)} with {@code
   *       Root} and {@link Transformer} updateCurrentIterator.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#next()}
   */
  @Test
  @DisplayName(
      "Test next(); given ObjectGraphIterator(Object, Transformer) with 'Root' and Transformer updateCurrentIterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ObjectGraphIterator.next()"})
  void testNext_givenObjectGraphIteratorWithRootAndTransformerUpdateCurrentIterator() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>("Root", transformer);
    objectGraphIterator.updateCurrentIterator();

    // Act
    Object actualNextResult = objectGraphIterator.next();

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals("Apply", actualNextResult);
    assertFalse(objectGraphIterator.hasNext());
  }

  /**
   * Test {@link ObjectGraphIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link ObjectGraphIterator#ObjectGraphIterator(Object, Transformer)} with root is
   *       {@code null} and {@link Transformer}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#next()}
   */
  @Test
  @DisplayName(
      "Test next(); given ObjectGraphIterator(Object, Transformer) with root is 'null' and Transformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ObjectGraphIterator.next()"})
  void testNext_givenObjectGraphIteratorWithRootIsNullAndTransformer() {
    // Arrange
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>(null, mock(Transformer.class));

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectGraphIterator.next());
  }

  /**
   * Test {@link ObjectGraphIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@link
   *       Scanner#Scanner(String)} with {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given Transformer apply(Object) return Scanner(String) with 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ObjectGraphIterator.next()"})
  void testNext_givenTransformerApplyReturnScannerWithFoo() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(new Scanner("foo"));
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>("Root", transformer);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectGraphIterator.next());
    verify(transformer, atLeast(1)).apply(Mockito.<Object>any());
  }

  /**
   * Test {@link ObjectGraphIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@link
   *       Scanner#Scanner(String)} with {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given Transformer apply(Object) return Scanner(String) with 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ObjectGraphIterator.next()"})
  void testNext_givenTransformerApplyReturnScannerWithFoo2() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(new Scanner("foo"));
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>(new Scanner("foo"), transformer);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectGraphIterator.next());
    verify(transformer, atLeast(1)).apply(isA(Object.class));
  }

  /**
   * Test {@link ObjectGraphIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} throw {@link
   *       NoSuchElementException#NoSuchElementException()}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given Transformer apply(Object) throw NoSuchElementException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ObjectGraphIterator.next()"})
  void testNext_givenTransformerApplyThrowNoSuchElementException() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new NoSuchElementException());
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>("Root", transformer);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectGraphIterator.next());
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link ObjectGraphIterator#next()}.
   *
   * <ul>
   *   <li>Then not {@link ObjectGraphIterator#ObjectGraphIterator(Object, Transformer)} with {@code
   *       Root} and {@link Transformer} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#next()}
   */
  @Test
  @DisplayName(
      "Test next(); then not ObjectGraphIterator(Object, Transformer) with 'Root' and Transformer hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ObjectGraphIterator.next()"})
  void testNext_thenNotObjectGraphIteratorWithRootAndTransformerHasNext() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>("Root", transformer);

    // Act
    Object actualNextResult = objectGraphIterator.next();

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals("Apply", actualNextResult);
    assertFalse(objectGraphIterator.hasNext());
  }

  /**
   * Test {@link ObjectGraphIterator#next()}.
   *
   * <ul>
   *   <li>Then not {@link ObjectGraphIterator#ObjectGraphIterator(Object, Transformer)} with root
   *       is {@link Scanner#Scanner(String)} and {@link Transformer} hasNext.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#next()}
   */
  @Test
  @DisplayName(
      "Test next(); then not ObjectGraphIterator(Object, Transformer) with root is Scanner(String) and Transformer hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ObjectGraphIterator.next()"})
  void testNext_thenNotObjectGraphIteratorWithRootIsScannerAndTransformerHasNext() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>(new Scanner("foo"), transformer);

    // Act
    Object actualNextResult = objectGraphIterator.next();

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals("Apply", actualNextResult);
    assertFalse(objectGraphIterator.hasNext());
  }

  /**
   * Test {@link ObjectGraphIterator#remove()}.
   *
   * <p>Method under test: {@link ObjectGraphIterator#remove()}
   */
  @Test
  @DisplayName("Test remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectGraphIterator.remove()"})
  void testRemove() {
    // Arrange
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>("Root", mock(Transformer.class));

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> objectGraphIterator.remove());
  }

  /**
   * Test {@link ObjectGraphIterator#updateCurrentIterator()}.
   *
   * <ul>
   *   <li>Given {@link ObjectGraphIterator#ObjectGraphIterator(Object, Transformer)} with {@code
   *       Root} and {@link Transformer}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#updateCurrentIterator()}
   */
  @Test
  @DisplayName(
      "Test updateCurrentIterator(); given ObjectGraphIterator(Object, Transformer) with 'Root' and Transformer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectGraphIterator.updateCurrentIterator()"})
  void testUpdateCurrentIterator_givenObjectGraphIteratorWithRootAndTransformer() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>("Root", transformer);

    // Act
    objectGraphIterator.updateCurrentIterator();

    // Assert
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link ObjectGraphIterator#updateCurrentIterator()}.
   *
   * <ul>
   *   <li>Given {@link Scanner#Scanner(String)} with {@code foo}.
   *   <li>Then calls {@link Transformer#apply(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#updateCurrentIterator()}
   */
  @Test
  @DisplayName(
      "Test updateCurrentIterator(); given Scanner(String) with 'foo'; then calls apply(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectGraphIterator.updateCurrentIterator()"})
  void testUpdateCurrentIterator_givenScannerWithFoo_thenCallsApply() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>(new Scanner("foo"), transformer);

    // Act
    objectGraphIterator.updateCurrentIterator();

    // Assert
    verify(transformer).apply(isA(Object.class));
  }

  /**
   * Test {@link ObjectGraphIterator#updateCurrentIterator()}.
   *
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@link
   *       Scanner#Scanner(String)} with {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#updateCurrentIterator()}
   */
  @Test
  @DisplayName(
      "Test updateCurrentIterator(); given Transformer apply(Object) return Scanner(String) with 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectGraphIterator.updateCurrentIterator()"})
  void testUpdateCurrentIterator_givenTransformerApplyReturnScannerWithFoo() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(new Scanner("foo"));
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>("Root", transformer);

    // Act
    objectGraphIterator.updateCurrentIterator();

    // Assert
    verify(transformer, atLeast(1)).apply(Mockito.<Object>any());
  }

  /**
   * Test {@link ObjectGraphIterator#updateCurrentIterator()}.
   *
   * <ul>
   *   <li>Given {@link Transformer} {@link Transformer#apply(Object)} return {@link
   *       Scanner#Scanner(String)} with {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#updateCurrentIterator()}
   */
  @Test
  @DisplayName(
      "Test updateCurrentIterator(); given Transformer apply(Object) return Scanner(String) with 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectGraphIterator.updateCurrentIterator()"})
  void testUpdateCurrentIterator_givenTransformerApplyReturnScannerWithFoo2() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn(new Scanner("foo"));
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>(new Scanner("foo"), transformer);

    // Act
    objectGraphIterator.updateCurrentIterator();

    // Assert
    verify(transformer, atLeast(1)).apply(isA(Object.class));
  }

  /**
   * Test {@link ObjectGraphIterator#updateCurrentIterator()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link ObjectGraphIterator#updateCurrentIterator()}
   */
  @Test
  @DisplayName("Test updateCurrentIterator(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ObjectGraphIterator.updateCurrentIterator()"})
  void testUpdateCurrentIterator_thenThrowNoSuchElementException() {
    // Arrange
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenThrow(new NoSuchElementException());
    ObjectGraphIterator<Object> objectGraphIterator =
        new ObjectGraphIterator<>("Root", transformer);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> objectGraphIterator.updateCurrentIterator());
    verify(transformer).apply(isA(Object.class));
  }
}
