package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.OrderedMapIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AbstractOrderedMapIteratorDecoratorDiffblueTest {
  /**
   * Test {@link AbstractOrderedMapIteratorDecorator#AbstractOrderedMapIteratorDecorator(OrderedMapIterator)}.
   * <ul>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractOrderedMapIteratorDecorator#AbstractOrderedMapIteratorDecorator(OrderedMapIterator)}
   */
  @Test
  @DisplayName("Test new AbstractOrderedMapIteratorDecorator(OrderedMapIterator); then return not hasNext")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractOrderedMapIteratorDecorator.<init>(OrderedMapIterator)"})
  void testNewAbstractOrderedMapIteratorDecorator_thenReturnNotHasNext() {
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
  @DisplayName("Test getKey(); given EmptyOrderedMapIterator getKey() return 'Key'; then return 'Key'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractOrderedMapIteratorDecorator.getKey()"})
  void testGetKey_givenEmptyOrderedMapIteratorGetKeyReturnKey_thenReturnKey() {
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
  @DisplayName("Test getKey(); given EmptyOrderedMapIterator getKey() return 'Key'; then return 'Key'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractOrderedMapIteratorDecorator.getKey()"})
  void testGetKey_givenEmptyOrderedMapIteratorGetKeyReturnKey_thenReturnKey2() {
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
  @DisplayName("Test getOrderedMapIterator()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"OrderedMapIterator AbstractOrderedMapIteratorDecorator.getOrderedMapIterator()"})
  void testGetOrderedMapIterator() {
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
  @DisplayName("Test getValue(); given EmptyOrderedMapIterator getValue() return 'Value'; then return 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractOrderedMapIteratorDecorator.getValue()"})
  void testGetValue_givenEmptyOrderedMapIteratorGetValueReturnValue_thenReturnValue() {
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
  @DisplayName("Test getValue(); given EmptyOrderedMapIterator getValue() return 'Value'; then return 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractOrderedMapIteratorDecorator.getValue()"})
  void testGetValue_givenEmptyOrderedMapIteratorGetValueReturnValue_thenReturnValue2() {
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
  @DisplayName("Test hasNext()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractOrderedMapIteratorDecorator.hasNext()"})
  void testHasNext() {
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
  @DisplayName("Test hasNext()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractOrderedMapIteratorDecorator.hasNext()"})
  void testHasNext2() {
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
  @DisplayName("Test hasPrevious()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractOrderedMapIteratorDecorator.hasPrevious()"})
  void testHasPrevious() {
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
  @DisplayName("Test hasPrevious()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractOrderedMapIteratorDecorator.hasPrevious()"})
  void testHasPrevious2() {
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
  @DisplayName("Test next(); given EmptyOrderedMapIterator next() return 'Next'; then return 'Next'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractOrderedMapIteratorDecorator.next()"})
  void testNext_givenEmptyOrderedMapIteratorNextReturnNext_thenReturnNext() {
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
  @DisplayName("Test next(); given EmptyOrderedMapIterator next() return 'Next'; then return 'Next'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractOrderedMapIteratorDecorator.next()"})
  void testNext_givenEmptyOrderedMapIteratorNextReturnNext_thenReturnNext2() {
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
  @DisplayName("Test previous(); then return 'Previous'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractOrderedMapIteratorDecorator.previous()"})
  void testPrevious_thenReturnPrevious() {
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
  @DisplayName("Test previous(); then return 'Previous'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractOrderedMapIteratorDecorator.previous()"})
  void testPrevious_thenReturnPrevious2() {
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
  @DisplayName("Test remove(); given EmptyOrderedMapIterator remove() does nothing; then calls remove()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractOrderedMapIteratorDecorator.remove()"})
  void testRemove_givenEmptyOrderedMapIteratorRemoveDoesNothing_thenCallsRemove() {
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
  @DisplayName("Test remove(); given EmptyOrderedMapIterator remove() does nothing; then calls remove()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractOrderedMapIteratorDecorator.remove()"})
  void testRemove_givenEmptyOrderedMapIteratorRemoveDoesNothing_thenCallsRemove2() {
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
  @DisplayName("Test setValue(Object); given EmptyOrderedMapIterator setValue(Object) return 'Value'; then return 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractOrderedMapIteratorDecorator.setValue(Object)"})
  void testSetValue_givenEmptyOrderedMapIteratorSetValueReturnValue_thenReturnValue() {
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
  @DisplayName("Test setValue(Object); given EmptyOrderedMapIterator setValue(Object) return 'Value'; then return 'Value'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractOrderedMapIteratorDecorator.setValue(Object)"})
  void testSetValue_givenEmptyOrderedMapIteratorSetValueReturnValue_thenReturnValue2() {
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
