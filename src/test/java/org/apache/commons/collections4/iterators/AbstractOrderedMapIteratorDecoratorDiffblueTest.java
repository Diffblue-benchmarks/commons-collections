package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.OrderedMapIterator;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class AbstractOrderedMapIteratorDecoratorDiffblueTest {
  /**
   * Test {@link AbstractOrderedMapIteratorDecorator#AbstractOrderedMapIteratorDecorator(OrderedMapIterator)}.
   * <ul>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractOrderedMapIteratorDecorator#AbstractOrderedMapIteratorDecorator(OrderedMapIterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractOrderedMapIteratorDecorator.<init>(OrderedMapIterator)"})
  public void testNewAbstractOrderedMapIteratorDecorator_thenReturnNotHasNext() {
    // Arrange and Act
    AbstractOrderedMapIteratorDecorator<Object, Object> actualAbstractOrderedMapIteratorDecorator = new AbstractOrderedMapIteratorDecorator<>(
        new EmptyOrderedMapIterator<>());

    // Assert
    assertFalse(actualAbstractOrderedMapIteratorDecorator.hasNext());
  }

  /**
   * Test {@link AbstractOrderedMapIteratorDecorator#getKey()}.
   * <ul>
   *   <li>Given {@link EmptyOrderedMapIterator} {@link AbstractEmptyMapIterator#getKey()} return {@code Key}.</li>
   *   <li>Then return {@code Key}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractOrderedMapIteratorDecorator#getKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractOrderedMapIteratorDecorator.getKey()"})
  public void testGetKey_givenEmptyOrderedMapIteratorGetKeyReturnKey_thenReturnKey() {
    // Arrange
    EmptyOrderedMapIterator<Object, Object> iterator = mock(EmptyOrderedMapIterator.class);
    when(iterator.getKey()).thenReturn("Key");
    AbstractOrderedMapIteratorDecorator<Object, Object> abstractOrderedMapIteratorDecorator = new AbstractOrderedMapIteratorDecorator<>(
        iterator);

    // Act
    Object actualKey = abstractOrderedMapIteratorDecorator.getKey();

    // Assert
    verify(iterator).getKey();
    assertEquals("Key", actualKey);
  }

  /**
   * Test {@link AbstractOrderedMapIteratorDecorator#getKey()}.
   * <ul>
   *   <li>Given {@link EmptyOrderedMapIterator} {@link AbstractEmptyMapIterator#getKey()} return {@code Key}.</li>
   *   <li>Then return {@code Key}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractOrderedMapIteratorDecorator#getKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractOrderedMapIteratorDecorator.getKey()"})
  public void testGetKey_givenEmptyOrderedMapIteratorGetKeyReturnKey_thenReturnKey2() {
    // Arrange
    EmptyOrderedMapIterator<Object, Object> iterator = mock(EmptyOrderedMapIterator.class);
    when(iterator.getKey()).thenReturn("Key");
    AbstractOrderedMapIteratorDecorator<Object, Object> abstractOrderedMapIteratorDecorator = new AbstractOrderedMapIteratorDecorator<>(
        new AbstractOrderedMapIteratorDecorator<>(iterator));

    // Act
    Object actualKey = abstractOrderedMapIteratorDecorator.getKey();

    // Assert
    verify(iterator).getKey();
    assertEquals("Key", actualKey);
  }

  /**
   * Test {@link AbstractOrderedMapIteratorDecorator#getOrderedMapIterator()}.
   * <p>
   * Method under test: {@link AbstractOrderedMapIteratorDecorator#getOrderedMapIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"OrderedMapIterator AbstractOrderedMapIteratorDecorator.getOrderedMapIterator()"})
  public void testGetOrderedMapIterator() {
    // Arrange
    EmptyOrderedMapIterator<Object, Object> iterator = new EmptyOrderedMapIterator<>();
    AbstractOrderedMapIteratorDecorator<Object, Object> abstractOrderedMapIteratorDecorator = new AbstractOrderedMapIteratorDecorator<>(
        iterator);

    // Act
    OrderedMapIterator<Object, Object> actualOrderedMapIterator = abstractOrderedMapIteratorDecorator
        .getOrderedMapIterator();

    // Assert
    assertTrue(actualOrderedMapIterator instanceof EmptyOrderedMapIterator);
    assertSame(iterator, actualOrderedMapIterator);
  }

  /**
   * Test {@link AbstractOrderedMapIteratorDecorator#getValue()}.
   * <ul>
   *   <li>Given {@link EmptyOrderedMapIterator} {@link AbstractEmptyMapIterator#getValue()} return {@code Value}.</li>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractOrderedMapIteratorDecorator#getValue()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractOrderedMapIteratorDecorator.getValue()"})
  public void testGetValue_givenEmptyOrderedMapIteratorGetValueReturnValue_thenReturnValue() {
    // Arrange
    EmptyOrderedMapIterator<Object, Object> iterator = mock(EmptyOrderedMapIterator.class);
    when(iterator.getValue()).thenReturn("Value");
    AbstractOrderedMapIteratorDecorator<Object, Object> abstractOrderedMapIteratorDecorator = new AbstractOrderedMapIteratorDecorator<>(
        iterator);

    // Act
    Object actualValue = abstractOrderedMapIteratorDecorator.getValue();

    // Assert
    verify(iterator).getValue();
    assertEquals("Value", actualValue);
  }

  /**
   * Test {@link AbstractOrderedMapIteratorDecorator#getValue()}.
   * <ul>
   *   <li>Given {@link EmptyOrderedMapIterator} {@link AbstractEmptyMapIterator#getValue()} return {@code Value}.</li>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractOrderedMapIteratorDecorator#getValue()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractOrderedMapIteratorDecorator.getValue()"})
  public void testGetValue_givenEmptyOrderedMapIteratorGetValueReturnValue_thenReturnValue2() {
    // Arrange
    EmptyOrderedMapIterator<Object, Object> iterator = mock(EmptyOrderedMapIterator.class);
    when(iterator.getValue()).thenReturn("Value");
    AbstractOrderedMapIteratorDecorator<Object, Object> abstractOrderedMapIteratorDecorator = new AbstractOrderedMapIteratorDecorator<>(
        new AbstractOrderedMapIteratorDecorator<>(iterator));

    // Act
    Object actualValue = abstractOrderedMapIteratorDecorator.getValue();

    // Assert
    verify(iterator).getValue();
    assertEquals("Value", actualValue);
  }

  /**
   * Test {@link AbstractOrderedMapIteratorDecorator#hasNext()}.
   * <p>
   * Method under test: {@link AbstractOrderedMapIteratorDecorator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractOrderedMapIteratorDecorator.hasNext()"})
  public void testHasNext() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> abstractOrderedMapIteratorDecorator = new AbstractOrderedMapIteratorDecorator<>(
        new EmptyOrderedMapIterator<>());

    // Act and Assert
    assertFalse(abstractOrderedMapIteratorDecorator.hasNext());
  }

  /**
   * Test {@link AbstractOrderedMapIteratorDecorator#hasNext()}.
   * <p>
   * Method under test: {@link AbstractOrderedMapIteratorDecorator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractOrderedMapIteratorDecorator.hasNext()"})
  public void testHasNext2() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> abstractOrderedMapIteratorDecorator = new AbstractOrderedMapIteratorDecorator<>(
        new AbstractOrderedMapIteratorDecorator<>(new EmptyOrderedMapIterator<>()));

    // Act and Assert
    assertFalse(abstractOrderedMapIteratorDecorator.hasNext());
  }

  /**
   * Test {@link AbstractOrderedMapIteratorDecorator#hasPrevious()}.
   * <p>
   * Method under test: {@link AbstractOrderedMapIteratorDecorator#hasPrevious()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractOrderedMapIteratorDecorator.hasPrevious()"})
  public void testHasPrevious() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> abstractOrderedMapIteratorDecorator = new AbstractOrderedMapIteratorDecorator<>(
        new EmptyOrderedMapIterator<>());

    // Act and Assert
    assertFalse(abstractOrderedMapIteratorDecorator.hasPrevious());
  }

  /**
   * Test {@link AbstractOrderedMapIteratorDecorator#hasPrevious()}.
   * <p>
   * Method under test: {@link AbstractOrderedMapIteratorDecorator#hasPrevious()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractOrderedMapIteratorDecorator.hasPrevious()"})
  public void testHasPrevious2() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> abstractOrderedMapIteratorDecorator = new AbstractOrderedMapIteratorDecorator<>(
        new AbstractOrderedMapIteratorDecorator<>(new EmptyOrderedMapIterator<>()));

    // Act and Assert
    assertFalse(abstractOrderedMapIteratorDecorator.hasPrevious());
  }

  /**
   * Test {@link AbstractOrderedMapIteratorDecorator#next()}.
   * <ul>
   *   <li>Given {@link EmptyOrderedMapIterator} {@link AbstractEmptyIterator#next()} return {@code Next}.</li>
   *   <li>Then return {@code Next}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractOrderedMapIteratorDecorator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractOrderedMapIteratorDecorator.next()"})
  public void testNext_givenEmptyOrderedMapIteratorNextReturnNext_thenReturnNext() {
    // Arrange
    EmptyOrderedMapIterator<Object, Object> iterator = mock(EmptyOrderedMapIterator.class);
    when(iterator.next()).thenReturn("Next");
    AbstractOrderedMapIteratorDecorator<Object, Object> abstractOrderedMapIteratorDecorator = new AbstractOrderedMapIteratorDecorator<>(
        iterator);

    // Act
    Object actualNextResult = abstractOrderedMapIteratorDecorator.next();

    // Assert
    verify(iterator).next();
    assertEquals("Next", actualNextResult);
  }

  /**
   * Test {@link AbstractOrderedMapIteratorDecorator#next()}.
   * <ul>
   *   <li>Given {@link EmptyOrderedMapIterator} {@link AbstractEmptyIterator#next()} return {@code Next}.</li>
   *   <li>Then return {@code Next}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractOrderedMapIteratorDecorator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractOrderedMapIteratorDecorator.next()"})
  public void testNext_givenEmptyOrderedMapIteratorNextReturnNext_thenReturnNext2() {
    // Arrange
    EmptyOrderedMapIterator<Object, Object> iterator = mock(EmptyOrderedMapIterator.class);
    when(iterator.next()).thenReturn("Next");
    AbstractOrderedMapIteratorDecorator<Object, Object> abstractOrderedMapIteratorDecorator = new AbstractOrderedMapIteratorDecorator<>(
        new AbstractOrderedMapIteratorDecorator<>(iterator));

    // Act
    Object actualNextResult = abstractOrderedMapIteratorDecorator.next();

    // Assert
    verify(iterator).next();
    assertEquals("Next", actualNextResult);
  }

  /**
   * Test {@link AbstractOrderedMapIteratorDecorator#previous()}.
   * <ul>
   *   <li>Then return {@code Previous}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractOrderedMapIteratorDecorator#previous()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractOrderedMapIteratorDecorator.previous()"})
  public void testPrevious_thenReturnPrevious() {
    // Arrange
    EmptyOrderedMapIterator<Object, Object> iterator = mock(EmptyOrderedMapIterator.class);
    when(iterator.previous()).thenReturn("Previous");
    AbstractOrderedMapIteratorDecorator<Object, Object> abstractOrderedMapIteratorDecorator = new AbstractOrderedMapIteratorDecorator<>(
        iterator);

    // Act
    Object actualPreviousResult = abstractOrderedMapIteratorDecorator.previous();

    // Assert
    verify(iterator).previous();
    assertEquals("Previous", actualPreviousResult);
  }

  /**
   * Test {@link AbstractOrderedMapIteratorDecorator#previous()}.
   * <ul>
   *   <li>Then return {@code Previous}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractOrderedMapIteratorDecorator#previous()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractOrderedMapIteratorDecorator.previous()"})
  public void testPrevious_thenReturnPrevious2() {
    // Arrange
    EmptyOrderedMapIterator<Object, Object> iterator = mock(EmptyOrderedMapIterator.class);
    when(iterator.previous()).thenReturn("Previous");
    AbstractOrderedMapIteratorDecorator<Object, Object> abstractOrderedMapIteratorDecorator = new AbstractOrderedMapIteratorDecorator<>(
        new AbstractOrderedMapIteratorDecorator<>(iterator));

    // Act
    Object actualPreviousResult = abstractOrderedMapIteratorDecorator.previous();

    // Assert
    verify(iterator).previous();
    assertEquals("Previous", actualPreviousResult);
  }

  /**
   * Test {@link AbstractOrderedMapIteratorDecorator#remove()}.
   * <ul>
   *   <li>Given {@link EmptyOrderedMapIterator} {@link AbstractEmptyIterator#remove()} does nothing.</li>
   *   <li>Then calls {@link AbstractEmptyIterator#remove()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractOrderedMapIteratorDecorator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractOrderedMapIteratorDecorator.remove()"})
  public void testRemove_givenEmptyOrderedMapIteratorRemoveDoesNothing_thenCallsRemove() {
    // Arrange
    EmptyOrderedMapIterator<Object, Object> iterator = mock(EmptyOrderedMapIterator.class);
    doNothing().when(iterator).remove();
    AbstractOrderedMapIteratorDecorator<Object, Object> abstractOrderedMapIteratorDecorator = new AbstractOrderedMapIteratorDecorator<>(
        iterator);

    // Act
    abstractOrderedMapIteratorDecorator.remove();

    // Assert
    verify(iterator).remove();
  }

  /**
   * Test {@link AbstractOrderedMapIteratorDecorator#remove()}.
   * <ul>
   *   <li>Given {@link EmptyOrderedMapIterator} {@link AbstractEmptyIterator#remove()} does nothing.</li>
   *   <li>Then calls {@link AbstractEmptyIterator#remove()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractOrderedMapIteratorDecorator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractOrderedMapIteratorDecorator.remove()"})
  public void testRemove_givenEmptyOrderedMapIteratorRemoveDoesNothing_thenCallsRemove2() {
    // Arrange
    EmptyOrderedMapIterator<Object, Object> iterator = mock(EmptyOrderedMapIterator.class);
    doNothing().when(iterator).remove();
    AbstractOrderedMapIteratorDecorator<Object, Object> abstractOrderedMapIteratorDecorator = new AbstractOrderedMapIteratorDecorator<>(
        new AbstractOrderedMapIteratorDecorator<>(iterator));

    // Act
    abstractOrderedMapIteratorDecorator.remove();

    // Assert
    verify(iterator).remove();
  }

  /**
   * Test {@link AbstractOrderedMapIteratorDecorator#setValue(Object)}.
   * <ul>
   *   <li>Given {@link EmptyOrderedMapIterator} {@link AbstractEmptyMapIterator#setValue(Object)} return {@code Value}.</li>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractOrderedMapIteratorDecorator#setValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractOrderedMapIteratorDecorator.setValue(Object)"})
  public void testSetValue_givenEmptyOrderedMapIteratorSetValueReturnValue_thenReturnValue() {
    // Arrange
    EmptyOrderedMapIterator<Object, Object> iterator = mock(EmptyOrderedMapIterator.class);
    when(iterator.setValue(Mockito.<Object>any())).thenReturn("Value");
    AbstractOrderedMapIteratorDecorator<Object, Object> abstractOrderedMapIteratorDecorator = new AbstractOrderedMapIteratorDecorator<>(
        iterator);

    // Act
    Object actualSetValueResult = abstractOrderedMapIteratorDecorator.setValue("Value");

    // Assert
    verify(iterator).setValue(isA(Object.class));
    assertEquals("Value", actualSetValueResult);
  }

  /**
   * Test {@link AbstractOrderedMapIteratorDecorator#setValue(Object)}.
   * <ul>
   *   <li>Given {@link EmptyOrderedMapIterator} {@link AbstractEmptyMapIterator#setValue(Object)} return {@code Value}.</li>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractOrderedMapIteratorDecorator#setValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractOrderedMapIteratorDecorator.setValue(Object)"})
  public void testSetValue_givenEmptyOrderedMapIteratorSetValueReturnValue_thenReturnValue2() {
    // Arrange
    EmptyOrderedMapIterator<Object, Object> iterator = mock(EmptyOrderedMapIterator.class);
    when(iterator.setValue(Mockito.<Object>any())).thenReturn("Value");
    AbstractOrderedMapIteratorDecorator<Object, Object> abstractOrderedMapIteratorDecorator = new AbstractOrderedMapIteratorDecorator<>(
        new AbstractOrderedMapIteratorDecorator<>(iterator));

    // Act
    Object actualSetValueResult = abstractOrderedMapIteratorDecorator.setValue("Value");

    // Assert
    verify(iterator).setValue(isA(Object.class));
    assertEquals("Value", actualSetValueResult);
  }
}
