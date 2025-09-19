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
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import org.apache.commons.collections4.MapIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AbstractMapIteratorDecoratorDiffblueTest {
  /**
   * Test {@link AbstractMapIteratorDecorator#AbstractMapIteratorDecorator(MapIterator)}.
   *
   * <ul>
   *   <li>Then return not hasNext.
   * </ul>
   *
   * <p>Method under test: {@link
   * AbstractMapIteratorDecorator#AbstractMapIteratorDecorator(MapIterator)}
   */
  @Test
  @DisplayName("Test new AbstractMapIteratorDecorator(MapIterator); then return not hasNext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractMapIteratorDecorator.<init>(MapIterator)"})
  void testNewAbstractMapIteratorDecorator_thenReturnNotHasNext() {
    // Arrange and Act
    AbstractMapIteratorDecorator<Object, Object> actualAbstractMapIteratorDecorator =
        new AbstractMapIteratorDecorator<>(
            new AbstractOrderedMapIteratorDecorator<>(new EmptyOrderedMapIterator<>()));

    // Assert
    assertFalse(actualAbstractMapIteratorDecorator.hasNext());
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#getKey()}.
   *
   * <ul>
   *   <li>Given {@link AbstractOrderedMapIteratorDecorator} {@link
   *       AbstractOrderedMapIteratorDecorator#getKey()} return {@code Key}.
   *   <li>Then return {@code Key}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapIteratorDecorator#getKey()}
   */
  @Test
  @DisplayName(
      "Test getKey(); given AbstractOrderedMapIteratorDecorator getKey() return 'Key'; then return 'Key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractMapIteratorDecorator.getKey()"})
  void testGetKey_givenAbstractOrderedMapIteratorDecoratorGetKeyReturnKey_thenReturnKey() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> iterator =
        mock(AbstractOrderedMapIteratorDecorator.class);
    when(iterator.getKey()).thenReturn("Key");
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator =
        new AbstractMapIteratorDecorator<>(iterator);

    // Act
    Object actualKey = abstractMapIteratorDecorator.getKey();

    // Assert
    verify(iterator).getKey();
    assertEquals("Key", actualKey);
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#getKey()}.
   *
   * <ul>
   *   <li>Given {@link AbstractOrderedMapIteratorDecorator} {@link
   *       AbstractOrderedMapIteratorDecorator#getKey()} return {@code Key}.
   *   <li>Then return {@code Key}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapIteratorDecorator#getKey()}
   */
  @Test
  @DisplayName(
      "Test getKey(); given AbstractOrderedMapIteratorDecorator getKey() return 'Key'; then return 'Key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractMapIteratorDecorator.getKey()"})
  void testGetKey_givenAbstractOrderedMapIteratorDecoratorGetKeyReturnKey_thenReturnKey2() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> iterator =
        mock(AbstractOrderedMapIteratorDecorator.class);
    when(iterator.getKey()).thenReturn("Key");
    AbstractMapIteratorDecorator<Object, Object> iterator2 =
        new AbstractMapIteratorDecorator<>(iterator);
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator =
        new AbstractMapIteratorDecorator<>(iterator2);

    // Act
    Object actualKey = abstractMapIteratorDecorator.getKey();

    // Assert
    verify(iterator).getKey();
    assertEquals("Key", actualKey);
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#getMapIterator()}.
   *
   * <p>Method under test: {@link AbstractMapIteratorDecorator#getMapIterator()}
   */
  @Test
  @DisplayName("Test getMapIterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MapIterator AbstractMapIteratorDecorator.getMapIterator()"})
  void testGetMapIterator() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> iterator =
        new AbstractOrderedMapIteratorDecorator<>(new EmptyOrderedMapIterator<>());
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator =
        new AbstractMapIteratorDecorator<>(iterator);

    // Act
    MapIterator<Object, Object> actualMapIterator = abstractMapIteratorDecorator.getMapIterator();

    // Assert
    assertTrue(actualMapIterator instanceof AbstractOrderedMapIteratorDecorator);
    assertSame(iterator, actualMapIterator);
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#getValue()}.
   *
   * <ul>
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapIteratorDecorator#getValue()}
   */
  @Test
  @DisplayName("Test getValue(); then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractMapIteratorDecorator.getValue()"})
  void testGetValue_thenReturnValue() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> iterator =
        mock(AbstractOrderedMapIteratorDecorator.class);
    when(iterator.getValue()).thenReturn("Value");
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator =
        new AbstractMapIteratorDecorator<>(iterator);

    // Act
    Object actualValue = abstractMapIteratorDecorator.getValue();

    // Assert
    verify(iterator).getValue();
    assertEquals("Value", actualValue);
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#getValue()}.
   *
   * <ul>
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapIteratorDecorator#getValue()}
   */
  @Test
  @DisplayName("Test getValue(); then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractMapIteratorDecorator.getValue()"})
  void testGetValue_thenReturnValue2() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> iterator =
        mock(AbstractOrderedMapIteratorDecorator.class);
    when(iterator.getValue()).thenReturn("Value");
    AbstractMapIteratorDecorator<Object, Object> iterator2 =
        new AbstractMapIteratorDecorator<>(iterator);
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator =
        new AbstractMapIteratorDecorator<>(iterator2);

    // Act
    Object actualValue = abstractMapIteratorDecorator.getValue();

    // Assert
    verify(iterator).getValue();
    assertEquals("Value", actualValue);
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#hasNext()}.
   *
   * <p>Method under test: {@link AbstractMapIteratorDecorator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapIteratorDecorator.hasNext()"})
  void testHasNext() {
    // Arrange
    AbstractMapIteratorDecorator<Object, Object> iterator =
        new AbstractMapIteratorDecorator<>(
            new AbstractOrderedMapIteratorDecorator<>(new EmptyOrderedMapIterator<>()));
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator =
        new AbstractMapIteratorDecorator<>(iterator);

    // Act and Assert
    assertFalse(abstractMapIteratorDecorator.hasNext());
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#hasNext()}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapIteratorDecorator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); given HashMap() '42' is '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapIteratorDecorator.hasNext()"})
  void testHasNext_givenHashMap42Is42_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator =
        new AbstractMapIteratorDecorator<>(new EntrySetMapIterator<>(map));

    // Act and Assert
    assertTrue(abstractMapIteratorDecorator.hasNext());
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#hasNext()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapIteratorDecorator#hasNext()}
   */
  @Test
  @DisplayName("Test hasNext(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AbstractMapIteratorDecorator.hasNext()"})
  void testHasNext_thenReturnFalse() {
    // Arrange
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator =
        new AbstractMapIteratorDecorator<>(
            new AbstractOrderedMapIteratorDecorator<>(new EmptyOrderedMapIterator<>()));

    // Act and Assert
    assertFalse(abstractMapIteratorDecorator.hasNext());
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#next()}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapIteratorDecorator#next()}
   */
  @Test
  @DisplayName("Test next(); given HashMap() '42' is '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractMapIteratorDecorator.next()"})
  void testNext_givenHashMap42Is42_thenReturn42() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator =
        new AbstractMapIteratorDecorator<>(new EntrySetMapIterator<>(map));

    // Act and Assert
    assertEquals("42", abstractMapIteratorDecorator.next());
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#next()}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code 42} is {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapIteratorDecorator#next()}
   */
  @Test
  @DisplayName("Test next(); given HashMap() '42' is '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractMapIteratorDecorator.next()"})
  void testNext_givenHashMap42Is42_thenReturn422() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");
    AbstractMapIteratorDecorator<Object, Object> iterator =
        new AbstractMapIteratorDecorator<>(new EntrySetMapIterator<>(map));
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator =
        new AbstractMapIteratorDecorator<>(iterator);

    // Act and Assert
    assertEquals("42", abstractMapIteratorDecorator.next());
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#remove()}.
   *
   * <ul>
   *   <li>Then calls {@link AbstractOrderedMapIteratorDecorator#remove()}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapIteratorDecorator#remove()}
   */
  @Test
  @DisplayName("Test remove(); then calls remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractMapIteratorDecorator.remove()"})
  void testRemove_thenCallsRemove() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> iterator =
        mock(AbstractOrderedMapIteratorDecorator.class);
    doNothing().when(iterator).remove();
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator =
        new AbstractMapIteratorDecorator<>(iterator);

    // Act
    abstractMapIteratorDecorator.remove();

    // Assert
    verify(iterator).remove();
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#remove()}.
   *
   * <ul>
   *   <li>Then calls {@link AbstractOrderedMapIteratorDecorator#remove()}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapIteratorDecorator#remove()}
   */
  @Test
  @DisplayName("Test remove(); then calls remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractMapIteratorDecorator.remove()"})
  void testRemove_thenCallsRemove2() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> iterator =
        mock(AbstractOrderedMapIteratorDecorator.class);
    doNothing().when(iterator).remove();
    AbstractMapIteratorDecorator<Object, Object> iterator2 =
        new AbstractMapIteratorDecorator<>(iterator);
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator =
        new AbstractMapIteratorDecorator<>(iterator2);

    // Act
    abstractMapIteratorDecorator.remove();

    // Assert
    verify(iterator).remove();
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#setValue(Object)}.
   *
   * <ul>
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapIteratorDecorator#setValue(Object)}
   */
  @Test
  @DisplayName("Test setValue(Object); then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractMapIteratorDecorator.setValue(Object)"})
  void testSetValue_thenReturnValue() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> iterator =
        mock(AbstractOrderedMapIteratorDecorator.class);
    when(iterator.setValue(Mockito.<Object>any())).thenReturn("Value");
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator =
        new AbstractMapIteratorDecorator<>(iterator);

    // Act
    Object actualSetValueResult = abstractMapIteratorDecorator.setValue("Value");

    // Assert
    verify(iterator).setValue(isA(Object.class));
    assertEquals("Value", actualSetValueResult);
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#setValue(Object)}.
   *
   * <ul>
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractMapIteratorDecorator#setValue(Object)}
   */
  @Test
  @DisplayName("Test setValue(Object); then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractMapIteratorDecorator.setValue(Object)"})
  void testSetValue_thenReturnValue2() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> iterator =
        mock(AbstractOrderedMapIteratorDecorator.class);
    when(iterator.setValue(Mockito.<Object>any())).thenReturn("Value");
    AbstractMapIteratorDecorator<Object, Object> iterator2 =
        new AbstractMapIteratorDecorator<>(iterator);
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator =
        new AbstractMapIteratorDecorator<>(iterator2);

    // Act
    Object actualSetValueResult = abstractMapIteratorDecorator.setValue("Value");

    // Assert
    verify(iterator).setValue(isA(Object.class));
    assertEquals("Value", actualSetValueResult);
  }
}
