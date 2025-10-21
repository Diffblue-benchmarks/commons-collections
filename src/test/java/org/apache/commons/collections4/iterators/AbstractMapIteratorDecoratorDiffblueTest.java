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
import java.util.HashMap;
import org.apache.commons.collections4.MapIterator;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class AbstractMapIteratorDecoratorDiffblueTest {
  /**
   * Test {@link AbstractMapIteratorDecorator#AbstractMapIteratorDecorator(MapIterator)}.
   * <ul>
   *   <li>Then return not hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapIteratorDecorator#AbstractMapIteratorDecorator(MapIterator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractMapIteratorDecorator.<init>(MapIterator)"})
  public void testNewAbstractMapIteratorDecorator_thenReturnNotHasNext() {
    // Arrange and Act
    AbstractMapIteratorDecorator<Object, Object> actualAbstractMapIteratorDecorator = new AbstractMapIteratorDecorator<>(
        new AbstractOrderedMapIteratorDecorator<>(new EmptyOrderedMapIterator<>()));

    // Assert
    assertFalse(actualAbstractMapIteratorDecorator.hasNext());
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#getKey()}.
   * <ul>
   *   <li>Given {@link AbstractOrderedMapIteratorDecorator} {@link AbstractOrderedMapIteratorDecorator#getKey()} return {@code Key}.</li>
   *   <li>Then return {@code Key}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapIteratorDecorator#getKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractMapIteratorDecorator.getKey()"})
  public void testGetKey_givenAbstractOrderedMapIteratorDecoratorGetKeyReturnKey_thenReturnKey() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> iterator = mock(AbstractOrderedMapIteratorDecorator.class);
    when(iterator.getKey()).thenReturn("Key");
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator = new AbstractMapIteratorDecorator<>(
        new AbstractOrderedMapIteratorDecorator<>(iterator));

    // Act
    Object actualKey = abstractMapIteratorDecorator.getKey();

    // Assert
    verify(iterator).getKey();
    assertEquals("Key", actualKey);
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#getKey()}.
   * <ul>
   *   <li>Given {@link AbstractOrderedMapIteratorDecorator} {@link AbstractOrderedMapIteratorDecorator#getKey()} return {@code Key}.</li>
   *   <li>Then return {@code Key}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapIteratorDecorator#getKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractMapIteratorDecorator.getKey()"})
  public void testGetKey_givenAbstractOrderedMapIteratorDecoratorGetKeyReturnKey_thenReturnKey2() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> iterator = mock(AbstractOrderedMapIteratorDecorator.class);
    when(iterator.getKey()).thenReturn("Key");
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator = new AbstractMapIteratorDecorator<>(
        new AbstractMapIteratorDecorator<>(new AbstractOrderedMapIteratorDecorator<>(iterator)));

    // Act
    Object actualKey = abstractMapIteratorDecorator.getKey();

    // Assert
    verify(iterator).getKey();
    assertEquals("Key", actualKey);
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#getMapIterator()}.
   * <p>
   * Method under test: {@link AbstractMapIteratorDecorator#getMapIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MapIterator AbstractMapIteratorDecorator.getMapIterator()"})
  public void testGetMapIterator() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> iterator = new AbstractOrderedMapIteratorDecorator<>(
        new EmptyOrderedMapIterator<>());
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator = new AbstractMapIteratorDecorator<>(
        iterator);

    // Act
    MapIterator<Object, Object> actualMapIterator = abstractMapIteratorDecorator.getMapIterator();

    // Assert
    assertTrue(actualMapIterator instanceof AbstractOrderedMapIteratorDecorator);
    assertSame(iterator, actualMapIterator);
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#getValue()}.
   * <ul>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapIteratorDecorator#getValue()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractMapIteratorDecorator.getValue()"})
  public void testGetValue_thenReturnValue() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> iterator = mock(AbstractOrderedMapIteratorDecorator.class);
    when(iterator.getValue()).thenReturn("Value");
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator = new AbstractMapIteratorDecorator<>(
        new AbstractOrderedMapIteratorDecorator<>(iterator));

    // Act
    Object actualValue = abstractMapIteratorDecorator.getValue();

    // Assert
    verify(iterator).getValue();
    assertEquals("Value", actualValue);
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#getValue()}.
   * <ul>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapIteratorDecorator#getValue()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractMapIteratorDecorator.getValue()"})
  public void testGetValue_thenReturnValue2() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> iterator = mock(AbstractOrderedMapIteratorDecorator.class);
    when(iterator.getValue()).thenReturn("Value");
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator = new AbstractMapIteratorDecorator<>(
        new AbstractMapIteratorDecorator<>(new AbstractOrderedMapIteratorDecorator<>(iterator)));

    // Act
    Object actualValue = abstractMapIteratorDecorator.getValue();

    // Assert
    verify(iterator).getValue();
    assertEquals("Value", actualValue);
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#hasNext()}.
   * <p>
   * Method under test: {@link AbstractMapIteratorDecorator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapIteratorDecorator.hasNext()"})
  public void testHasNext() {
    // Arrange
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator = new AbstractMapIteratorDecorator<>(
        new AbstractMapIteratorDecorator<>(new AbstractOrderedMapIteratorDecorator<>(new EmptyOrderedMapIterator<>())));

    // Act and Assert
    assertFalse(abstractMapIteratorDecorator.hasNext());
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#hasNext()}.
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapIteratorDecorator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapIteratorDecorator.hasNext()"})
  public void testHasNext_givenHashMap42Is42_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator = new AbstractMapIteratorDecorator<>(
        new EntrySetMapIterator<>(map));

    // Act and Assert
    assertTrue(abstractMapIteratorDecorator.hasNext());
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapIteratorDecorator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapIteratorDecorator.hasNext()"})
  public void testHasNext_thenReturnFalse() {
    // Arrange
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator = new AbstractMapIteratorDecorator<>(
        new AbstractOrderedMapIteratorDecorator<>(new EmptyOrderedMapIterator<>()));

    // Act and Assert
    assertFalse(abstractMapIteratorDecorator.hasNext());
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#next()}.
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapIteratorDecorator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractMapIteratorDecorator.next()"})
  public void testNext_givenHashMap42Is42_thenReturn42() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator = new AbstractMapIteratorDecorator<>(
        new EntrySetMapIterator<>(map));

    // Act and Assert
    assertEquals("42", abstractMapIteratorDecorator.next());
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#next()}.
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapIteratorDecorator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractMapIteratorDecorator.next()"})
  public void testNext_givenHashMap42Is42_thenReturn422() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator = new AbstractMapIteratorDecorator<>(
        new AbstractMapIteratorDecorator<>(new EntrySetMapIterator<>(map)));

    // Act and Assert
    assertEquals("42", abstractMapIteratorDecorator.next());
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#remove()}.
   * <ul>
   *   <li>Then calls {@link AbstractOrderedMapIteratorDecorator#remove()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapIteratorDecorator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractMapIteratorDecorator.remove()"})
  public void testRemove_thenCallsRemove() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> iterator = mock(AbstractOrderedMapIteratorDecorator.class);
    doNothing().when(iterator).remove();
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator = new AbstractMapIteratorDecorator<>(
        new AbstractOrderedMapIteratorDecorator<>(iterator));

    // Act
    abstractMapIteratorDecorator.remove();

    // Assert
    verify(iterator).remove();
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#remove()}.
   * <ul>
   *   <li>Then calls {@link AbstractOrderedMapIteratorDecorator#remove()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapIteratorDecorator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractMapIteratorDecorator.remove()"})
  public void testRemove_thenCallsRemove2() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> iterator = mock(AbstractOrderedMapIteratorDecorator.class);
    doNothing().when(iterator).remove();
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator = new AbstractMapIteratorDecorator<>(
        new AbstractMapIteratorDecorator<>(new AbstractOrderedMapIteratorDecorator<>(iterator)));

    // Act
    abstractMapIteratorDecorator.remove();

    // Assert
    verify(iterator).remove();
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#setValue(Object)}.
   * <ul>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapIteratorDecorator#setValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractMapIteratorDecorator.setValue(Object)"})
  public void testSetValue_thenReturnValue() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> iterator = mock(AbstractOrderedMapIteratorDecorator.class);
    when(iterator.setValue(Mockito.<Object>any())).thenReturn("Value");
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator = new AbstractMapIteratorDecorator<>(
        new AbstractOrderedMapIteratorDecorator<>(iterator));

    // Act
    Object actualSetValueResult = abstractMapIteratorDecorator.setValue("Value");

    // Assert
    verify(iterator).setValue(isA(Object.class));
    assertEquals("Value", actualSetValueResult);
  }

  /**
   * Test {@link AbstractMapIteratorDecorator#setValue(Object)}.
   * <ul>
   *   <li>Then return {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapIteratorDecorator#setValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractMapIteratorDecorator.setValue(Object)"})
  public void testSetValue_thenReturnValue2() {
    // Arrange
    AbstractOrderedMapIteratorDecorator<Object, Object> iterator = mock(AbstractOrderedMapIteratorDecorator.class);
    when(iterator.setValue(Mockito.<Object>any())).thenReturn("Value");
    AbstractMapIteratorDecorator<Object, Object> abstractMapIteratorDecorator = new AbstractMapIteratorDecorator<>(
        new AbstractMapIteratorDecorator<>(new AbstractOrderedMapIteratorDecorator<>(iterator)));

    // Act
    Object actualSetValueResult = abstractMapIteratorDecorator.setValue("Value");

    // Assert
    verify(iterator).setValue(isA(Object.class));
    assertEquals("Value", actualSetValueResult);
  }
}
