package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.TruePredicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class FilterIteratorDiffblueTest {
  /**
   * Test {@link FilterIterator#FilterIterator(Iterator)}.
   * <p>
   * Method under test: {@link FilterIterator#FilterIterator(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void FilterIterator.<init>(Iterator)"})
  public void testNewFilterIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    FilterIterator<Object> actualFilterIterator = new FilterIterator<>(objectList.iterator());

    // Assert
    assertFalse(actualFilterIterator.hasNext());
  }

  /**
   * Test {@link FilterIterator#FilterIterator(Iterator, Predicate)}.
   * <ul>
   *   <li>When {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FilterIterator#FilterIterator(Iterator, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void FilterIterator.<init>(Iterator, Predicate)"})
  public void testNewFilterIterator_whenNull() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    FilterIterator<Object> actualFilterIterator = new FilterIterator<>(objectList.iterator(), null);

    // Assert
    assertFalse(actualFilterIterator.hasNext());
  }

  /**
   * Test {@link FilterIterator#FilterIterator(Iterator, Predicate)}.
   * <ul>
   *   <li>When {@link Predicate}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FilterIterator#FilterIterator(Iterator, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void FilterIterator.<init>(Iterator, Predicate)"})
  public void testNewFilterIterator_whenPredicate() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    FilterIterator<Object> actualFilterIterator = new FilterIterator<>(objectList.iterator(), mock(Predicate.class));

    // Assert
    assertFalse(actualFilterIterator.hasNext());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link FilterIterator#getIterator()}
   *   <li>{@link FilterIterator#getPredicate()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator FilterIterator.getIterator()", "Predicate FilterIterator.getPredicate()"})
  public void testGettersAndSetters() {
    // Arrange
    FilterIterator<Object> filterIterator = new FilterIterator<>();

    // Act
    Iterator<?> actualIterator = filterIterator.getIterator();

    // Assert
    assertTrue(filterIterator.getPredicate() instanceof TruePredicate);
    assertNull(actualIterator);
  }

  /**
   * Test {@link FilterIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FilterIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FilterIterator.hasNext()"})
  public void testHasNext_givenPredicateTestReturnFalse_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    FilterIterator<Object> filterIterator = new FilterIterator<>(iterator, predicate);

    // Act
    boolean actualHasNextResult = filterIterator.hasNext();

    // Assert
    verify(predicate).test(isA(Object.class));
    assertFalse(actualHasNextResult);
  }

  /**
   * Test {@link FilterIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FilterIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FilterIterator.hasNext()"})
  public void testHasNext_givenPredicateTestReturnTrue_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    FilterIterator<Object> filterIterator = new FilterIterator<>(iterator, predicate);

    // Act
    boolean actualHasNextResult = filterIterator.hasNext();

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualHasNextResult);
  }

  /**
   * Test {@link FilterIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FilterIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FilterIterator.hasNext()"})
  public void testHasNext_thenReturnFalse() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    FilterIterator<Object> filterIterator = new FilterIterator<>(objectList.iterator(), mock(Predicate.class));

    // Act and Assert
    assertFalse(filterIterator.hasNext());
  }

  /**
   * Test {@link FilterIterator#hasNext()}.
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FilterIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FilterIterator.hasNext()"})
  public void testHasNext_thenThrowNoSuchElementException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new NoSuchElementException("foo"));
    FilterIterator<Object> filterIterator = new FilterIterator<>(iterator, predicate);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> filterIterator.hasNext());
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link FilterIterator#next()}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FilterIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FilterIterator.next()"})
  public void testNext_givenPredicateTestReturnFalse_thenThrowNoSuchElementException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);
    FilterIterator<Object> filterIterator = new FilterIterator<>(iterator, predicate);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> filterIterator.next());
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link FilterIterator#next()}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FilterIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FilterIterator.next()"})
  public void testNext_givenPredicateTestReturnTrue_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);
    FilterIterator<Object> filterIterator = new FilterIterator<>(iterator, predicate);

    // Act
    Object actualNextResult = filterIterator.next();

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals("42", actualNextResult);
  }

  /**
   * Test {@link FilterIterator#next()}.
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} throw {@link NoSuchElementException#NoSuchElementException(String)} with {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FilterIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FilterIterator.next()"})
  public void testNext_givenPredicateTestThrowNoSuchElementExceptionWithFoo() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new NoSuchElementException("foo"));
    FilterIterator<Object> filterIterator = new FilterIterator<>(iterator, predicate);

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> filterIterator.next());
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link FilterIterator#next()}.
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FilterIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FilterIterator.next()"})
  public void testNext_thenThrowNoSuchElementException() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    FilterIterator<Object> filterIterator = new FilterIterator<>(objectList.iterator(), mock(Predicate.class));

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> filterIterator.next());
  }

  /**
   * Test {@link FilterIterator#setIterator(Iterator)}.
   * <p>
   * Method under test: {@link FilterIterator#setIterator(Iterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void FilterIterator.setIterator(Iterator)"})
  public void testSetIterator() {
    // Arrange
    FilterIterator<Object> filterIterator = new FilterIterator<>();

    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    filterIterator.setIterator(objectList.iterator());

    // Assert
    assertFalse(filterIterator.hasNext());
  }
}
