package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class EntrySetMapIteratorDiffblueTest {
  /**
   * Test {@link EntrySetMapIterator#EntrySetMapIterator(Map)}.
   * <p>
   * Method under test: {@link EntrySetMapIterator#EntrySetMapIterator(Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EntrySetMapIterator.<init>(Map)"})
  public void testNewEntrySetMapIterator() {
    // Arrange and Act
    EntrySetMapIterator<Object, Object> actualEntrySetMapIterator = new EntrySetMapIterator<>(new HashMap<>());

    // Assert
    assertFalse(actualEntrySetMapIterator.hasNext());
  }

  /**
   * Test {@link EntrySetMapIterator#getKey()}.
   * <p>
   * Method under test: {@link EntrySetMapIterator#getKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object EntrySetMapIterator.getKey()"})
  public void testGetKey() {
    // Arrange
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetMapIterator.getKey());
  }

  /**
   * Test {@link EntrySetMapIterator#getValue()}.
   * <p>
   * Method under test: {@link EntrySetMapIterator#getValue()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object EntrySetMapIterator.getValue()"})
  public void testGetValue() {
    // Arrange
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetMapIterator.getValue());
  }

  /**
   * Test {@link EntrySetMapIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EntrySetMapIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean EntrySetMapIterator.hasNext()"})
  public void testHasNext_givenHashMap42Is42_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(map);

    // Act and Assert
    assertTrue(entrySetMapIterator.hasNext());
  }

  /**
   * Test {@link EntrySetMapIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EntrySetMapIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean EntrySetMapIterator.hasNext()"})
  public void testHasNext_thenReturnFalse() {
    // Arrange
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(new HashMap<>());

    // Act and Assert
    assertFalse(entrySetMapIterator.hasNext());
  }

  /**
   * Test {@link EntrySetMapIterator#next()}.
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code 42} is {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EntrySetMapIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object EntrySetMapIterator.next()"})
  public void testNext_givenHashMap42Is42_thenReturn42() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "42");
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(map);

    // Act and Assert
    assertEquals("42", entrySetMapIterator.next());
    assertFalse(entrySetMapIterator.hasNext());
  }

  /**
   * Test {@link EntrySetMapIterator#remove()}.
   * <p>
   * Method under test: {@link EntrySetMapIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EntrySetMapIterator.remove()"})
  public void testRemove() {
    // Arrange
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetMapIterator.remove());
  }

  /**
   * Test {@link EntrySetMapIterator#setValue(Object)}.
   * <p>
   * Method under test: {@link EntrySetMapIterator#setValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object EntrySetMapIterator.setValue(Object)"})
  public void testSetValue() {
    // Arrange
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetMapIterator.setValue("Value"));
  }

  /**
   * Test {@link EntrySetMapIterator#toString()}.
   * <p>
   * Method under test: {@link EntrySetMapIterator#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String EntrySetMapIterator.toString()"})
  public void testToString() {
    // Arrange
    EntrySetMapIterator<Object, Object> entrySetMapIterator = new EntrySetMapIterator<>(new HashMap<>());

    // Act and Assert
    assertEquals("MapIterator[]", entrySetMapIterator.toString());
  }
}
