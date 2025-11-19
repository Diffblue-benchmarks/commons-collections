package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.ChainedClosure;
import org.apache.commons.collections4.functors.IfClosure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ExtendedIteratorDiffblueTest {
  /**
   * Test {@link ExtendedIterator#create(Iterator)} with {@code it}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedIterator#create(Iterator)}
   */
  @Test
  @DisplayName("Test create(Iterator) with 'it'; when ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedIterator ExtendedIterator.create(Iterator)"})
  void testCreateWithIt_whenArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    ExtendedIterator<Object> actualCreateResult = ExtendedIterator.create(objectList.iterator());

    // Assert
    assertFalse(actualCreateResult.hasNext());
  }

  /**
   * Test {@link ExtendedIterator#create(Iterator)} with {@code it}.
   *
   * <ul>
   *   <li>When create {@link ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedIterator#create(Iterator)}
   */
  @Test
  @DisplayName("Test create(Iterator) with 'it'; when create ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedIterator ExtendedIterator.create(Iterator)"})
  void testCreateWithIt_whenCreateArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ExtendedIterator<Object> it = ExtendedIterator.create(objectList.iterator());

    // Act
    ExtendedIterator<Object> actualCreateResult = ExtendedIterator.create(it);

    // Assert
    assertFalse(actualCreateResult.hasNext());
  }

  /**
   * Test {@link ExtendedIterator#create(Stream)} with {@code stream}.
   *
   * <p>Method under test: {@link ExtendedIterator#create(Stream)}
   */
  @Test
  @DisplayName("Test create(Stream) with 'stream'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedIterator ExtendedIterator.create(Stream)"})
  void testCreateWithStream() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Stream<Object> stream = objectList.stream();

    // Act
    ExtendedIterator<Object> actualCreateResult = ExtendedIterator.create(stream);

    // Assert
    assertFalse(actualCreateResult.hasNext());
  }

  /**
   * Test {@link ExtendedIterator#createNoRemove(Iterator)}.
   *
   * <p>Method under test: {@link ExtendedIterator#createNoRemove(Iterator)}
   */
  @Test
  @DisplayName("Test createNoRemove(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedIterator ExtendedIterator.createNoRemove(Iterator)"})
  void testCreateNoRemove() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    ExtendedIterator<Object> actualCreateNoRemoveResult =
        ExtendedIterator.createNoRemove(objectList.iterator());

    // Assert
    assertFalse(actualCreateNoRemoveResult.hasNext());
  }

  /**
   * Test {@link ExtendedIterator#emptyIterator()}.
   *
   * <p>Method under test: {@link ExtendedIterator#emptyIterator()}
   */
  @Test
  @DisplayName("Test emptyIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedIterator ExtendedIterator.emptyIterator()"})
  void testEmptyIterator() {
    // Arrange and Act
    ExtendedIterator<?> actualEmptyIteratorResult = ExtendedIterator.emptyIterator();

    // Assert
    assertFalse(actualEmptyIteratorResult.hasNext());
  }

  /**
   * Test {@link ExtendedIterator#flatten(Iterator)}.
   *
   * <p>Method under test: {@link ExtendedIterator#flatten(Iterator)}
   */
  @Test
  @DisplayName("Test flatten(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedIterator ExtendedIterator.flatten(Iterator)"})
  void testFlatten() {
    // Arrange
    ArrayList<Iterator<Object>> iteratorList = new ArrayList<>();

    // Act
    ExtendedIterator<Object> actualFlattenResult =
        ExtendedIterator.flatten(iteratorList.iterator());

    // Assert
    assertFalse(actualFlattenResult.hasNext());
  }

  /**
   * Test {@link ExtendedIterator#andThen(Iterator)}.
   *
   * <p>Method under test: {@link ExtendedIterator#andThen(Iterator)}
   */
  @Test
  @DisplayName("Test andThen(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedIterator ExtendedIterator.andThen(Iterator)"})
  void testAndThen() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ExtendedIterator<Object> createResult = ExtendedIterator.create(objectList.iterator());

    ArrayList<Object> objectList2 = new ArrayList<>();

    // Act and Assert
    assertFalse(createResult.andThen(objectList2.iterator()).hasNext());
  }

  /**
   * Test {@link ExtendedIterator#filter(Predicate)}.
   *
   * <ul>
   *   <li>When {@link java.util.function.Predicate}.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedIterator#filter(java.util.function.Predicate)}
   */
  @Test
  @DisplayName("Test filter(Predicate); when Predicate; then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedIterator ExtendedIterator.filter(java.util.function.Predicate)"})
  void testFilter_whenPredicate_thenReturnNotHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ExtendedIterator<Object> createResult = ExtendedIterator.create(objectList.iterator());

    // Act and Assert
    assertFalse(createResult.filter(mock(java.util.function.Predicate.class)).hasNext());
  }

  /**
   * Test {@link ExtendedIterator#forEachRemaining(Consumer)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then calls {@link Predicate#test(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedIterator#forEachRemaining(Consumer)}
   */
  @Test
  @DisplayName(
      "Test forEachRemaining(Consumer); given 'true'; when Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ExtendedIterator.forEachRemaining(Consumer)"})
  void testForEachRemaining_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    ExtendedIterator<Object> createResult = ExtendedIterator.create(objectList.iterator());

    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Closure<Object> trueClosure = mock(Closure.class);
    doNothing().when(trueClosure).accept(Mockito.<Object>any());

    IfClosure<? super Object> action = new IfClosure<>(predicate, trueClosure);

    // Act
    createResult.forEachRemaining(action);

    // Assert
    verify(trueClosure, atLeast(1)).accept(isA(Object.class));
    verify(predicate, atLeast(1)).test(isA(Object.class));
  }

  /**
   * Test {@link ExtendedIterator#forEachRemaining(Consumer)}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedIterator#forEachRemaining(Consumer)}
   */
  @Test
  @DisplayName("Test forEachRemaining(Consumer); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ExtendedIterator.forEachRemaining(Consumer)"})
  void testForEachRemaining_thenThrowUnsupportedOperationException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    ExtendedIterator<Object> createResult = ExtendedIterator.create(objectList.iterator());

    Closure<Object> closure = mock(Closure.class);
    doThrow(new UnsupportedOperationException()).when(closure).accept(Mockito.<Object>any());

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> createResult.forEachRemaining(new ChainedClosure<>(closure)));
    verify(closure).accept(isA(Object.class));
  }

  /**
   * Test {@link ExtendedIterator#forEachRemaining(Consumer)}.
   *
   * <ul>
   *   <li>When {@link Closure} {@link Closure#accept(Object)} does nothing.
   *   <li>Then calls {@link Closure#accept(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedIterator#forEachRemaining(Consumer)}
   */
  @Test
  @DisplayName(
      "Test forEachRemaining(Consumer); when Closure accept(Object) does nothing; then calls accept(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ExtendedIterator.forEachRemaining(Consumer)"})
  void testForEachRemaining_whenClosureAcceptDoesNothing_thenCallsAccept() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    ExtendedIterator<Object> createResult = ExtendedIterator.create(objectList.iterator());

    Closure<Object> closure = mock(Closure.class);
    doNothing().when(closure).accept(Mockito.<Object>any());

    // Act
    createResult.forEachRemaining(new ChainedClosure<>(closure));

    // Assert
    verify(closure).accept(isA(Object.class));
  }

  /**
   * Test {@link ExtendedIterator#forEachRemaining(Consumer)}.
   *
   * <ul>
   *   <li>When {@link Consumer}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedIterator#forEachRemaining(Consumer)}
   */
  @Test
  @DisplayName("Test forEachRemaining(Consumer); when Consumer; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ExtendedIterator.forEachRemaining(Consumer)"})
  void testForEachRemaining_whenConsumer_thenDoesNotThrow() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ExtendedIterator<Object> createResult = ExtendedIterator.create(objectList.iterator());

    // Act and Assert
    assertDoesNotThrow(() -> createResult.forEachRemaining(mock(Consumer.class)));
  }

  /**
   * Test {@link ExtendedIterator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ExtendedIterator.hasNext()"})
  void testHasNext_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    ExtendedIterator<Object> createResult = ExtendedIterator.create(objectList.iterator());

    // Act and Assert
    assertTrue(createResult.hasNext());
  }

  /**
   * Test {@link ExtendedIterator#hasNext()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ExtendedIterator.hasNext()"})
  void testHasNext_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ExtendedIterator<Object> createResult = ExtendedIterator.create(objectList.iterator());

    // Act and Assert
    assertFalse(createResult.hasNext());
  }

  /**
   * Test {@link ExtendedIterator#map(Function)}.
   *
   * <ul>
   *   <li>When {@link Function}.
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedIterator#map(Function)}
   */
  @Test
  @DisplayName("Test map(Function); when Function; then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedIterator ExtendedIterator.map(Function)"})
  void testMap_whenFunction_thenReturnNotHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ExtendedIterator<Object> createResult = ExtendedIterator.create(objectList.iterator());

    // Act and Assert
    assertFalse(createResult.map(mock(Function.class)).hasNext());
  }

  /**
   * Test {@link ExtendedIterator#next()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ExtendedIterator.next()"})
  void testNext_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    ExtendedIterator<Object> createResult = ExtendedIterator.create(objectList.iterator());

    // Act and Assert
    assertEquals("42", createResult.next());
  }

  /**
   * Test {@link ExtendedIterator#remove()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedIterator#remove()}
   */
  @Test
  @DisplayName("Test remove(); given ArrayList() add '42'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ExtendedIterator.remove()"})
  void testRemove_givenArrayListAdd42_thenDoesNotThrow() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    ExtendedIterator<Object> createResult = ExtendedIterator.create(objectList.iterator());
    createResult.addTo(new ArrayList<>());

    // Act and Assert
    assertDoesNotThrow(() -> createResult.remove());
  }

  /**
   * Test {@link ExtendedIterator#remove()}.
   *
   * <ul>
   *   <li>Given create {@link ArrayList#ArrayList()} stream.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedIterator#remove()}
   */
  @Test
  @DisplayName(
      "Test remove(); given create ArrayList() stream; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ExtendedIterator.remove()"})
  void testRemove_givenCreateArrayListStream_thenThrowUnsupportedOperationException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Stream<Object> stream = objectList.stream();
    ExtendedIterator<Object> createResult = ExtendedIterator.create(stream);

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> createResult.remove());
  }
}
