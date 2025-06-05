package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.commons.collections4.iterators.ObjectGraphIteratorTest.LeafFinder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ExtendedIteratorDiffblueTest {
  /**
   * Test {@link ExtendedIterator#create(Iterator)} with {@code it}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link ExtendedIterator#create(Iterator)}
   */
  @Test
  @DisplayName("Test create(Iterator) with 'it'; when ArrayList() iterator")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>When create {@link ArrayList#ArrayList()} iterator.</li>
   * </ul>
   * <p>
   * Method under test: {@link ExtendedIterator#create(Iterator)}
   */
  @Test
  @DisplayName("Test create(Iterator) with 'it'; when create ArrayList() iterator")
  @Tag("MaintainedByDiffblue")
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
   * <p>
   * Method under test: {@link ExtendedIterator#create(Stream)}
   */
  @Test
  @DisplayName("Test create(Stream) with 'stream'")
  @Tag("MaintainedByDiffblue")
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
   * <p>
   * Method under test: {@link ExtendedIterator#createNoRemove(Iterator)}
   */
  @Test
  @DisplayName("Test createNoRemove(Iterator)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ExtendedIterator ExtendedIterator.createNoRemove(Iterator)"})
  void testCreateNoRemove() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    ExtendedIterator<Object> actualCreateNoRemoveResult = ExtendedIterator.createNoRemove(objectList.iterator());

    // Assert
    assertFalse(actualCreateNoRemoveResult.hasNext());
  }

  /**
   * Test {@link ExtendedIterator#emptyIterator()}.
   * <p>
   * Method under test: {@link ExtendedIterator#emptyIterator()}
   */
  @Test
  @DisplayName("Test emptyIterator()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ExtendedIterator ExtendedIterator.emptyIterator()"})
  void testEmptyIterator() {
    // Arrange and Act
    ExtendedIterator<?> actualEmptyIteratorResult = ExtendedIterator.emptyIterator();

    // Assert
    assertFalse(actualEmptyIteratorResult.hasNext());
  }

  /**
   * Test {@link ExtendedIterator#flatten(Iterator)}.
   * <p>
   * Method under test: {@link ExtendedIterator#flatten(Iterator)}
   */
  @Test
  @DisplayName("Test flatten(Iterator)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ExtendedIterator ExtendedIterator.flatten(Iterator)"})
  void testFlatten() {
    // Arrange
    ArrayList<Iterator<Object>> iteratorList = new ArrayList<>();

    // Act
    ExtendedIterator<Object> actualFlattenResult = ExtendedIterator.flatten(iteratorList.iterator());

    // Assert
    assertFalse(actualFlattenResult.hasNext());
  }

  /**
   * Test {@link ExtendedIterator#andThen(Iterator)}.
   * <p>
   * Method under test: {@link ExtendedIterator#andThen(Iterator)}
   */
  @Test
  @DisplayName("Test andThen(Iterator)")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link ExtendedIterator#filter(Predicate)}
   */
  @Test
  @DisplayName("Test filter(Predicate); when Predicate; then return not hasNext")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ExtendedIterator ExtendedIterator.filter(Predicate)"})
  void testFilter_whenPredicate_thenReturnNotHasNext() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ExtendedIterator<Object> createResult = ExtendedIterator.create(objectList.iterator());

    // Act and Assert
    assertFalse(createResult.filter(mock(Predicate.class)).hasNext());
  }

  /**
   * Test {@link ExtendedIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ExtendedIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given ArrayList() add '42'; then return 'true'")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ExtendedIterator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); then return 'false'")
  @Tag("MaintainedByDiffblue")
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
   * <p>
   * Method under test: {@link ExtendedIterator#map(Function)}
   */
  @Test
  @DisplayName("Test map(Function)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ExtendedIterator ExtendedIterator.map(Function)"})
  void testMap() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    ExtendedIterator<Object> createResult = ExtendedIterator.create(objectList.iterator());

    // Act and Assert
    assertFalse(createResult.map(mock(LeafFinder.class)::transform).hasNext());
  }

  /**
   * Test {@link ExtendedIterator#next()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ExtendedIterator#next()}
   */
  @Test
  @DisplayName("Test next(); given ArrayList() add '42'; then return '42'")
  @Tag("MaintainedByDiffblue")
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
   * <ul>
   *   <li>Given create {@link ArrayList#ArrayList()} stream.</li>
   *   <li>Then throw {@link UnsupportedOperationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ExtendedIterator#remove()}
   */
  @Test
  @DisplayName("Test remove(); given create ArrayList() stream; then throw UnsupportedOperationException")
  @Tag("MaintainedByDiffblue")
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
