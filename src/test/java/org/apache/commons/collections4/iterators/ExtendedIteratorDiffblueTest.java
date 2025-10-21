package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.commons.collections4.iterators.ObjectGraphIteratorTest.LeafFinder;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ExtendedIteratorDiffblueTest {
  /**
   * Test {@link ExtendedIterator#create(Iterator)} with {@code it}.
   * <p>
   * Method under test: {@link ExtendedIterator#create(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ExtendedIterator ExtendedIterator.create(Iterator)"})
  public void testCreateWithIt() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    ExtendedIterator<Object> actualCreateResult = ExtendedIterator.create(objectList.iterator());

    // Assert
    assertFalse(actualCreateResult.hasNext());
  }

  /**
   * Test {@link ExtendedIterator#create(Stream)} with {@code stream}.
   * <p>
   * Method under test: {@link ExtendedIterator#create(Stream)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ExtendedIterator ExtendedIterator.create(Stream)"})
  public void testCreateWithStream() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ExtendedIterator ExtendedIterator.createNoRemove(Iterator)"})
  public void testCreateNoRemove() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ExtendedIterator ExtendedIterator.emptyIterator()"})
  public void testEmptyIterator() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ExtendedIterator ExtendedIterator.flatten(Iterator)"})
  public void testFlatten() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ExtendedIterator ExtendedIterator.andThen(Iterator)"})
  public void testAndThen() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ExtendedIterator ExtendedIterator.filter(Predicate)"})
  public void testFilter_whenPredicate_thenReturnNotHasNext() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ExtendedIterator.hasNext()"})
  public void testHasNext_givenArrayListAdd42_thenReturnTrue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ExtendedIterator.hasNext()"})
  public void testHasNext_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"ExtendedIterator ExtendedIterator.map(Function)"})
  public void testMap() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ExtendedIterator.next()"})
  public void testNext_givenArrayListAdd42_thenReturn42() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ExtendedIterator.remove()"})
  public void testRemove_givenCreateArrayListStream_thenThrowUnsupportedOperationException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Stream<Object> stream = objectList.stream();
    ExtendedIterator<Object> createResult = ExtendedIterator.create(stream);

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> createResult.remove());
  }
}
