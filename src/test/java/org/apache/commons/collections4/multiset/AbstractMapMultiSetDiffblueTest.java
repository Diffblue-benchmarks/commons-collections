package org.apache.commons.collections4.multiset;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.multiset.AbstractMapMultiSet.EntrySetIterator;
import org.apache.commons.collections4.multiset.AbstractMapMultiSet.MultiSetEntry;
import org.apache.commons.collections4.multiset.AbstractMapMultiSet.MutableInteger;
import org.apache.commons.collections4.multiset.AbstractMapMultiSet.UniqueSetIterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractMapMultiSetDiffblueTest {
  /**
   * Test {@link AbstractMapMultiSet#add(Object, int)} with {@code object}, {@code occurrences}.
   * <ul>
   *   <li>Given {@link HashMultiSet#HashMultiSet()} add {@code Object}.</li>
   *   <li>When two.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#add(Object, int)}
   */
  @Test
  @DisplayName("Test add(Object, int) with 'object', 'occurrences'; given HashMultiSet() add 'Object'; when two; then return one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AbstractMapMultiSet.add(Object, int)"})
  void testAddWithObjectOccurrences_givenHashMultiSetAddObject_whenTwo_thenReturnOne() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    // Act and Assert
    assertEquals(1, hashMultiSet.add("Object", 2));
    assertEquals(3, hashMultiSet.size());
  }

  /**
   * Test {@link AbstractMapMultiSet#add(Object, int)} with {@code object}, {@code occurrences}.
   * <ul>
   *   <li>Given {@link HashMultiSet#HashMultiSet()}.</li>
   *   <li>When two.</li>
   *   <li>Then {@link HashMultiSet#HashMultiSet()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#add(Object, int)}
   */
  @Test
  @DisplayName("Test add(Object, int) with 'object', 'occurrences'; given HashMultiSet(); when two; then HashMultiSet() size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AbstractMapMultiSet.add(Object, int)"})
  void testAddWithObjectOccurrences_givenHashMultiSet_whenTwo_thenHashMultiSetSizeIsTwo() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(0, hashMultiSet.add("Object", 2));
    assertEquals(2, hashMultiSet.size());
  }

  /**
   * Test {@link AbstractMapMultiSet#add(Object, int)} with {@code object}, {@code occurrences}.
   * <ul>
   *   <li>When minus one.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#add(Object, int)}
   */
  @Test
  @DisplayName("Test add(Object, int) with 'object', 'occurrences'; when minus one; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AbstractMapMultiSet.add(Object, int)"})
  void testAddWithObjectOccurrences_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.setMap(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> hashMultiSet.add("Object", -1));
  }

  /**
   * Test {@link AbstractMapMultiSet#add(Object, int)} with {@code object}, {@code occurrences}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then {@link HashMultiSet#HashMultiSet()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#add(Object, int)}
   */
  @Test
  @DisplayName("Test add(Object, int) with 'object', 'occurrences'; when zero; then HashMultiSet() Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AbstractMapMultiSet.add(Object, int)"})
  void testAddWithObjectOccurrences_whenZero_thenHashMultiSetEmpty() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.setMap(new HashMap<>());

    // Act and Assert
    assertEquals(0, hashMultiSet.add("Object", 0));
    assertTrue(hashMultiSet.isEmpty());
  }

  /**
   * Test {@link AbstractMapMultiSet#contains(Object)}.
   * <ul>
   *   <li>Given {@link HashMultiSet#HashMultiSet()} add {@code Object}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#contains(Object)}
   */
  @Test
  @DisplayName("Test contains(Object); given HashMultiSet() add 'Object'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMapMultiSet.contains(Object)"})
  void testContains_givenHashMultiSetAddObject_thenReturnTrue() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    // Act and Assert
    assertTrue(hashMultiSet.contains("Object"));
  }

  /**
   * Test {@link AbstractMapMultiSet#contains(Object)}.
   * <ul>
   *   <li>Given {@link HashMultiSet#HashMultiSet()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#contains(Object)}
   */
  @Test
  @DisplayName("Test contains(Object); given HashMultiSet(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMapMultiSet.contains(Object)"})
  void testContains_givenHashMultiSet_thenReturnFalse() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertFalse(hashMultiSet.contains("Object"));
  }

  /**
   * Test {@link AbstractMapMultiSet#createEntrySetIterator()}.
   * <p>
   * Method under test: {@link AbstractMapMultiSet#createEntrySetIterator()}
   */
  @Test
  @DisplayName("Test createEntrySetIterator()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Iterator AbstractMapMultiSet.createEntrySetIterator()"})
  void testCreateEntrySetIterator() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act
    Iterator<MultiSet.Entry<Object>> actualCreateEntrySetIteratorResult = hashMultiSet.createEntrySetIterator();

    // Assert
    assertTrue(actualCreateEntrySetIteratorResult instanceof EntrySetIterator);
    assertFalse(actualCreateEntrySetIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractMapMultiSet#createUniqueSetIterator()}.
   * <p>
   * Method under test: {@link AbstractMapMultiSet#createUniqueSetIterator()}
   */
  @Test
  @DisplayName("Test createUniqueSetIterator()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Iterator AbstractMapMultiSet.createUniqueSetIterator()"})
  void testCreateUniqueSetIterator() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act
    Iterator<Object> actualCreateUniqueSetIteratorResult = hashMultiSet.createUniqueSetIterator();

    // Assert
    assertTrue(actualCreateUniqueSetIteratorResult instanceof UniqueSetIterator);
    assertFalse(actualCreateUniqueSetIteratorResult.hasNext());
  }

  /**
   * Test {@link AbstractMapMultiSet#doReadObject(ObjectInputStream)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>Then {@link HashMultiSet#HashMultiSet()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#doReadObject(ObjectInputStream)}
   */
  @Test
  @DisplayName("Test doReadObject(ObjectInputStream); given 'Object'; then HashMultiSet() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractMapMultiSet.doReadObject(ObjectInputStream)"})
  void testDoReadObject_givenObject_thenHashMultiSetSizeIsOne() throws IOException, ClassNotFoundException {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenReturn("Object");
    when(in.readInt()).thenReturn(1);

    // Act
    hashMultiSet.doReadObject(in);

    // Assert
    verify(in, atLeast(1)).readInt();
    verify(in).readObject();
    assertEquals(1, hashMultiSet.size());
  }

  /**
   * Test {@link AbstractMapMultiSet#doReadObject(ObjectInputStream)}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#doReadObject(ObjectInputStream)}
   */
  @Test
  @DisplayName("Test doReadObject(ObjectInputStream); then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractMapMultiSet.doReadObject(ObjectInputStream)"})
  void testDoReadObject_thenThrowIllegalArgumentException() throws IOException, ClassNotFoundException {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readObject()).thenThrow(new IllegalArgumentException("foo"));
    when(in.readInt()).thenReturn(1);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> hashMultiSet.doReadObject(in));
    verify(in).readInt();
    verify(in).readObject();
  }

  /**
   * Test EntrySetIterator {@link EntrySetIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EntrySetIterator#hasNext()}
   */
  @Test
  @DisplayName("Test EntrySetIterator hasNext(); then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean EntrySetIterator.hasNext()"})
  void testEntrySetIteratorHasNext_thenReturnFalse() {
    // Arrange
    ArrayList<Entry<Object, MutableInteger>> entryList = new ArrayList<>();
    Iterator<Entry<Object, MutableInteger>> decorated = entryList.iterator();
    EntrySetIterator<Object> entrySetIterator = new EntrySetIterator<>(decorated, new HashMultiSet<>());

    // Act and Assert
    assertFalse(entrySetIterator.hasNext());
  }

  /**
   * Test EntrySetIterator {@link EntrySetIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EntrySetIterator#hasNext()}
   */
  @Test
  @DisplayName("Test EntrySetIterator hasNext(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean EntrySetIterator.hasNext()"})
  void testEntrySetIteratorHasNext_thenReturnTrue() {
    // Arrange
    ArrayList<Entry<Object, MutableInteger>> entryList = new ArrayList<>();
    entryList.add(new SimpleEntry<>("42", new MutableInteger(42)));
    Iterator<Entry<Object, MutableInteger>> decorated = entryList.iterator();
    EntrySetIterator<Object> entrySetIterator = new EntrySetIterator<>(decorated, new HashMultiSet<>());

    // Act and Assert
    assertTrue(entrySetIterator.hasNext());
  }

  /**
   * Test EntrySetIterator {@link EntrySetIterator#EntrySetIterator(Iterator, AbstractMapMultiSet)}.
   * <p>
   * Method under test: {@link EntrySetIterator#EntrySetIterator(Iterator, AbstractMapMultiSet)}
   */
  @Test
  @DisplayName("Test EntrySetIterator new EntrySetIterator(Iterator, AbstractMapMultiSet)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EntrySetIterator.<init>(Iterator, AbstractMapMultiSet)"})
  void testEntrySetIteratorNewEntrySetIterator() {
    // Arrange
    ArrayList<Entry<Object, MutableInteger>> entryList = new ArrayList<>();
    Iterator<Entry<Object, MutableInteger>> decorated = entryList.iterator();

    // Act
    EntrySetIterator<Object> actualEntrySetIterator = new EntrySetIterator<>(decorated, new HashMultiSet<>());

    // Assert
    assertFalse(actualEntrySetIterator.hasNext());
  }

  /**
   * Test EntrySetIterator {@link EntrySetIterator#next()}.
   * <p>
   * Method under test: {@link EntrySetIterator#next()}
   */
  @Test
  @DisplayName("Test EntrySetIterator next()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"MultiSet.Entry EntrySetIterator.next()"})
  void testEntrySetIteratorNext() {
    // Arrange
    ArrayList<Entry<Object, MutableInteger>> entryList = new ArrayList<>();
    entryList.add(new SimpleEntry<>("42", new MutableInteger(42)));
    Iterator<Entry<Object, MutableInteger>> decorated = entryList.iterator();
    EntrySetIterator<Object> entrySetIterator = new EntrySetIterator<>(decorated, new HashMultiSet<>());

    // Act
    MultiSet.Entry<Object> actualNextResult = entrySetIterator.next();

    // Assert
    assertFalse(entrySetIterator.hasNext());
    assertSame(entrySetIterator.last, actualNextResult);
  }

  /**
   * Test EntrySetIterator {@link EntrySetIterator#remove()}.
   * <p>
   * Method under test: {@link EntrySetIterator#remove()}
   */
  @Test
  @DisplayName("Test EntrySetIterator remove()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void EntrySetIterator.remove()"})
  void testEntrySetIteratorRemove() {
    // Arrange
    ArrayList<Entry<Object, MutableInteger>> entryList = new ArrayList<>();
    Iterator<Entry<Object, MutableInteger>> decorated = entryList.iterator();
    EntrySetIterator<Object> entrySetIterator = new EntrySetIterator<>(decorated, new HashMultiSet<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetIterator.remove());
  }

  /**
   * Test {@link AbstractMapMultiSet#equals(Object)}, and {@link AbstractMapMultiSet#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMapMultiSet#equals(Object)}
   *   <li>{@link AbstractMapMultiSet#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMapMultiSet.equals(Object)", "int AbstractMapMultiSet.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    HashMultiSet<Object> hashMultiSet2 = new HashMultiSet<>();

    // Act and Assert
    assertEquals(hashMultiSet, hashMultiSet2);
    int expectedHashCodeResult = hashMultiSet.hashCode();
    assertEquals(expectedHashCodeResult, hashMultiSet2.hashCode());
  }

  /**
   * Test {@link AbstractMapMultiSet#equals(Object)}, and {@link AbstractMapMultiSet#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMapMultiSet#equals(Object)}
   *   <li>{@link AbstractMapMultiSet#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMapMultiSet.equals(Object)", "int AbstractMapMultiSet.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    HashMultiSet<Object> hashMultiSet2 = new HashMultiSet<>();
    hashMultiSet2.add("Object");

    // Act and Assert
    assertEquals(hashMultiSet, hashMultiSet2);
    int expectedHashCodeResult = hashMultiSet.hashCode();
    assertEquals(expectedHashCodeResult, hashMultiSet2.hashCode());
  }

  /**
   * Test {@link AbstractMapMultiSet#equals(Object)}, and {@link AbstractMapMultiSet#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractMapMultiSet#equals(Object)}
   *   <li>{@link AbstractMapMultiSet#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMapMultiSet.equals(Object)", "int AbstractMapMultiSet.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(hashMultiSet, hashMultiSet);
    int expectedHashCodeResult = hashMultiSet.hashCode();
    assertEquals(expectedHashCodeResult, hashMultiSet.hashCode());
  }

  /**
   * Test {@link AbstractMapMultiSet#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMapMultiSet.equals(Object)", "int AbstractMapMultiSet.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    // Act and Assert
    assertNotEquals(hashMultiSet, new HashMultiSet<>());
  }

  /**
   * Test {@link AbstractMapMultiSet#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMapMultiSet.equals(Object)", "int AbstractMapMultiSet.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    HashMultiSet<Object> hashMultiSet2 = new HashMultiSet<>();
    hashMultiSet2.add(2);

    // Act and Assert
    assertNotEquals(hashMultiSet, hashMultiSet2);
  }

  /**
   * Test {@link AbstractMapMultiSet#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMapMultiSet.equals(Object)", "int AbstractMapMultiSet.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add(new HashMultiSet<>());

    HashMultiSet<Object> hashMultiSet2 = new HashMultiSet<>();
    hashMultiSet2.add("Object");

    // Act and Assert
    assertNotEquals(hashMultiSet, hashMultiSet2);
  }

  /**
   * Test {@link AbstractMapMultiSet#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMapMultiSet.equals(Object)", "int AbstractMapMultiSet.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    HashMultiSet<Object> hashMultiSet2 = new HashMultiSet<>();
    hashMultiSet2.add(hashMultiSet);

    HashMultiSet<Object> hashMultiSet3 = new HashMultiSet<>();
    hashMultiSet3.add("Object");

    // Act and Assert
    assertNotEquals(hashMultiSet2, hashMultiSet3);
  }

  /**
   * Test {@link AbstractMapMultiSet#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMapMultiSet.equals(Object)", "int AbstractMapMultiSet.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add(new HashMultiSet<>());

    HashMultiSet<Object> hashMultiSet2 = new HashMultiSet<>();
    hashMultiSet2.add(hashMultiSet);

    HashMultiSet<Object> hashMultiSet3 = new HashMultiSet<>();
    hashMultiSet3.add("Object");

    // Act and Assert
    assertNotEquals(hashMultiSet2, hashMultiSet3);
  }

  /**
   * Test {@link AbstractMapMultiSet#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMapMultiSet.equals(Object)", "int AbstractMapMultiSet.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add(null);

    HashMultiSet<Object> hashMultiSet2 = new HashMultiSet<>();
    hashMultiSet2.add(hashMultiSet);

    HashMultiSet<Object> hashMultiSet3 = new HashMultiSet<>();
    hashMultiSet3.add("Object");

    // Act and Assert
    assertNotEquals(hashMultiSet2, hashMultiSet3);
  }

  /**
   * Test {@link AbstractMapMultiSet#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMapMultiSet.equals(Object)", "int AbstractMapMultiSet.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add(0);
    hashMultiSet.add("Object");

    HashMultiSet<Object> hashMultiSet2 = new HashMultiSet<>();
    hashMultiSet2.add(hashMultiSet);

    HashMultiSet<Object> hashMultiSet3 = new HashMultiSet<>();
    hashMultiSet3.add("Object");

    // Act and Assert
    assertNotEquals(hashMultiSet2, hashMultiSet3);
  }

  /**
   * Test {@link AbstractMapMultiSet#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMapMultiSet.equals(Object)", "int AbstractMapMultiSet.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertNotEquals(hashMultiSet, null);
  }

  /**
   * Test {@link AbstractMapMultiSet#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMapMultiSet.equals(Object)", "int AbstractMapMultiSet.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertNotEquals(hashMultiSet, "Different type to AbstractMapMultiSet");
  }

  /**
   * Test {@link AbstractMapMultiSet#getCount(Object)}.
   * <ul>
   *   <li>Given {@link HashMultiSet#HashMultiSet()} add {@code Object}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#getCount(Object)}
   */
  @Test
  @DisplayName("Test getCount(Object); given HashMultiSet() add 'Object'; then return one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AbstractMapMultiSet.getCount(Object)"})
  void testGetCount_givenHashMultiSetAddObject_thenReturnOne() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    // Act and Assert
    assertEquals(1, hashMultiSet.getCount("Object"));
  }

  /**
   * Test {@link AbstractMapMultiSet#getCount(Object)}.
   * <ul>
   *   <li>Given {@link HashMultiSet#HashMultiSet()}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#getCount(Object)}
   */
  @Test
  @DisplayName("Test getCount(Object); given HashMultiSet(); then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AbstractMapMultiSet.getCount(Object)"})
  void testGetCount_givenHashMultiSet_thenReturnZero() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(0, hashMultiSet.getCount("Object"));
  }

  /**
   * Test {@link AbstractMapMultiSet#getMap()}.
   * <p>
   * Method under test: {@link AbstractMapMultiSet#getMap()}
   */
  @Test
  @DisplayName("Test getMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Map AbstractMapMultiSet.getMap()"})
  void testGetMap() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertTrue(hashMultiSet.getMap().isEmpty());
  }

  /**
   * Test {@link AbstractMapMultiSet#isEmpty()}.
   * <ul>
   *   <li>Given {@link HashMultiSet#HashMultiSet()} add {@code Object}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given HashMultiSet() add 'Object'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMapMultiSet.isEmpty()"})
  void testIsEmpty_givenHashMultiSetAddObject_thenReturnFalse() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    // Act and Assert
    assertFalse(hashMultiSet.isEmpty());
  }

  /**
   * Test {@link AbstractMapMultiSet#isEmpty()}.
   * <ul>
   *   <li>Given {@link HashMultiSet#HashMultiSet()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given HashMultiSet(); then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractMapMultiSet.isEmpty()"})
  void testIsEmpty_givenHashMultiSet_thenReturnTrue() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertTrue(hashMultiSet.isEmpty());
  }

  /**
   * Test {@link AbstractMapMultiSet#iterator()}.
   * <p>
   * Method under test: {@link AbstractMapMultiSet#iterator()}
   */
  @Test
  @DisplayName("Test iterator()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Iterator AbstractMapMultiSet.iterator()"})
  void testIterator() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertFalse(hashMultiSet.iterator().hasNext());
  }

  /**
   * Test MultiSetEntry {@link MultiSetEntry#getCount()}.
   * <ul>
   *   <li>Then return forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiSetEntry#getCount()}
   */
  @Test
  @DisplayName("Test MultiSetEntry getCount(); then return forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int MultiSetEntry.getCount()"})
  void testMultiSetEntryGetCount_thenReturnFortyTwo() {
    // Arrange
    MultiSetEntry<Object> multiSetEntry = new MultiSetEntry<>(new SimpleEntry<>("42", new MutableInteger(42)));

    // Act and Assert
    assertEquals(42, multiSetEntry.getCount());
  }

  /**
   * Test MultiSetEntry {@link MultiSetEntry#getElement()}.
   * <ul>
   *   <li>Given {@link MutableInteger#MutableInteger(int)} with value is forty-two.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MultiSetEntry#getElement()}
   */
  @Test
  @DisplayName("Test MultiSetEntry getElement(); given MutableInteger(int) with value is forty-two; then return '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object MultiSetEntry.getElement()"})
  void testMultiSetEntryGetElement_givenMutableIntegerWithValueIsFortyTwo_thenReturn42() {
    // Arrange
    MultiSetEntry<Object> multiSetEntry = new MultiSetEntry<>(new SimpleEntry<>("42", new MutableInteger(42)));

    // Act and Assert
    assertEquals("42", multiSetEntry.getElement());
  }

  /**
   * Test MultiSetEntry {@link MultiSetEntry#MultiSetEntry(Entry)}.
   * <p>
   * Method under test: {@link MultiSetEntry#MultiSetEntry(Entry)}
   */
  @Test
  @DisplayName("Test MultiSetEntry new MultiSetEntry(Entry)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MultiSetEntry.<init>(Entry)"})
  void testMultiSetEntryNewMultiSetEntry() {
    // Arrange and Act
    MultiSetEntry<Object> actualMultiSetEntry = new MultiSetEntry<>(new SimpleEntry<>("42", new MutableInteger(42)));

    // Assert
    assertEquals("42", actualMultiSetEntry.getElement());
    assertEquals(42, actualMultiSetEntry.getCount());
  }

  /**
   * Test MutableInteger {@link MutableInteger#equals(Object)}, and {@link MutableInteger#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link MutableInteger#equals(Object)}
   *   <li>{@link MutableInteger#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test MutableInteger equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MutableInteger.equals(Object)", "int MutableInteger.hashCode()"})
  void testMutableIntegerEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MutableInteger mutableInteger = new MutableInteger(42);
    MutableInteger mutableInteger2 = new MutableInteger(42);

    // Act and Assert
    assertEquals(mutableInteger, mutableInteger2);
    int expectedHashCodeResult = mutableInteger.hashCode();
    assertEquals(expectedHashCodeResult, mutableInteger2.hashCode());
  }

  /**
   * Test MutableInteger {@link MutableInteger#equals(Object)}, and {@link MutableInteger#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link MutableInteger#equals(Object)}
   *   <li>{@link MutableInteger#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test MutableInteger equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MutableInteger.equals(Object)", "int MutableInteger.hashCode()"})
  void testMutableIntegerEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MutableInteger mutableInteger = new MutableInteger(42);

    // Act and Assert
    assertEquals(mutableInteger, mutableInteger);
    int expectedHashCodeResult = mutableInteger.hashCode();
    assertEquals(expectedHashCodeResult, mutableInteger.hashCode());
  }

  /**
   * Test MutableInteger {@link MutableInteger#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MutableInteger#equals(Object)}
   */
  @Test
  @DisplayName("Test MutableInteger equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MutableInteger.equals(Object)", "int MutableInteger.hashCode()"})
  void testMutableIntegerEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    MutableInteger mutableInteger = new MutableInteger(1);

    // Act and Assert
    assertNotEquals(mutableInteger, new MutableInteger(42));
  }

  /**
   * Test MutableInteger {@link MutableInteger#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MutableInteger#equals(Object)}
   */
  @Test
  @DisplayName("Test MutableInteger equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MutableInteger.equals(Object)", "int MutableInteger.hashCode()"})
  void testMutableIntegerEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MutableInteger(42), null);
  }

  /**
   * Test MutableInteger {@link MutableInteger#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MutableInteger#equals(Object)}
   */
  @Test
  @DisplayName("Test MutableInteger equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean MutableInteger.equals(Object)", "int MutableInteger.hashCode()"})
  void testMutableIntegerEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MutableInteger(42), "Different type to MutableInteger");
  }

  /**
   * Test MutableInteger {@link MutableInteger#MutableInteger(int)}.
   * <p>
   * Method under test: {@link MutableInteger#MutableInteger(int)}
   */
  @Test
  @DisplayName("Test MutableInteger new MutableInteger(int)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void MutableInteger.<init>(int)"})
  void testMutableIntegerNewMutableInteger() {
    // Arrange, Act and Assert
    assertEquals(42, (new MutableInteger(42)).value);
  }

  /**
   * Test {@link AbstractMapMultiSet#remove(Object, int)} with {@code object}, {@code occurrences}.
   * <ul>
   *   <li>Given {@link HashMultiSet#HashMultiSet()} add {@code Object}.</li>
   *   <li>When one.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#remove(Object, int)}
   */
  @Test
  @DisplayName("Test remove(Object, int) with 'object', 'occurrences'; given HashMultiSet() add 'Object'; when one; then return one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AbstractMapMultiSet.remove(Object, int)"})
  void testRemoveWithObjectOccurrences_givenHashMultiSetAddObject_whenOne_thenReturnOne() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    // Act and Assert
    assertEquals(1, hashMultiSet.remove("Object", 1));
    assertTrue(hashMultiSet.isEmpty());
  }

  /**
   * Test {@link AbstractMapMultiSet#remove(Object, int)} with {@code object}, {@code occurrences}.
   * <ul>
   *   <li>Given {@link HashMultiSet#HashMultiSet()} add {@code Object}.</li>
   *   <li>When one.</li>
   *   <li>Then return two.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#remove(Object, int)}
   */
  @Test
  @DisplayName("Test remove(Object, int) with 'object', 'occurrences'; given HashMultiSet() add 'Object'; when one; then return two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AbstractMapMultiSet.remove(Object, int)"})
  void testRemoveWithObjectOccurrences_givenHashMultiSetAddObject_whenOne_thenReturnTwo() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");
    hashMultiSet.add("Object");

    // Act
    int actualRemoveResult = hashMultiSet.remove("Object", 1);

    // Assert
    assertEquals(1, hashMultiSet.size());
    assertEquals(2, actualRemoveResult);
  }

  /**
   * Test {@link AbstractMapMultiSet#remove(Object, int)} with {@code object}, {@code occurrences}.
   * <ul>
   *   <li>Given {@link HashMultiSet#HashMultiSet()}.</li>
   *   <li>When one.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#remove(Object, int)}
   */
  @Test
  @DisplayName("Test remove(Object, int) with 'object', 'occurrences'; given HashMultiSet(); when one; then return zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AbstractMapMultiSet.remove(Object, int)"})
  void testRemoveWithObjectOccurrences_givenHashMultiSet_whenOne_thenReturnZero() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(0, hashMultiSet.remove("Object", 1));
    assertTrue(hashMultiSet.isEmpty());
  }

  /**
   * Test {@link AbstractMapMultiSet#remove(Object, int)} with {@code object}, {@code occurrences}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#remove(Object, int)}
   */
  @Test
  @DisplayName("Test remove(Object, int) with 'object', 'occurrences'; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AbstractMapMultiSet.remove(Object, int)"})
  void testRemoveWithObjectOccurrences_thenThrowIllegalArgumentException() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.setMap(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> hashMultiSet.remove("Object", -1));
  }

  /**
   * Test {@link AbstractMapMultiSet#remove(Object, int)} with {@code object}, {@code occurrences}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#remove(Object, int)}
   */
  @Test
  @DisplayName("Test remove(Object, int) with 'object', 'occurrences'; when zero; then return one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AbstractMapMultiSet.remove(Object, int)"})
  void testRemoveWithObjectOccurrences_whenZero_thenReturnOne() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    // Act and Assert
    assertEquals(1, hashMultiSet.remove("Object", 0));
    assertEquals(1, hashMultiSet.size());
  }

  /**
   * Test {@link AbstractMapMultiSet#size()}.
   * <p>
   * Method under test: {@link AbstractMapMultiSet#size()}
   */
  @Test
  @DisplayName("Test size()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AbstractMapMultiSet.size()"})
  void testSize() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(0, hashMultiSet.size());
  }

  /**
   * Test {@link AbstractMapMultiSet#toArray(Object[])} with {@code Object[]}.
   * <ul>
   *   <li>Given {@link HashMultiSet#HashMultiSet()} add {@code Object}.</li>
   *   <li>Then first element is {@code Array}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#toArray(Object[])}
   */
  @Test
  @DisplayName("Test toArray(Object[]) with 'Object[]'; given HashMultiSet() add 'Object'; then first element is 'Array'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object[] AbstractMapMultiSet.toArray(Object[])"})
  void testToArrayWithObject_givenHashMultiSetAddObject_thenFirstElementIsArray() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");
    hashMultiSet.add("Object");
    Object[] array = new Object[]{"Array"};

    // Act
    Object[] actualToArrayResult = hashMultiSet.toArray(array);

    // Assert
    assertEquals("Array", array[0]);
    assertEquals("Object", actualToArrayResult[0]);
    assertEquals("Object", actualToArrayResult[1]);
    assertEquals(1, array.length);
    assertEquals(2, actualToArrayResult.length);
  }

  /**
   * Test {@link AbstractMapMultiSet#toArray()}.
   * <ul>
   *   <li>Given {@link HashMultiSet#HashMultiSet()} add {@code Object}.</li>
   *   <li>Then return first element is {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#toArray()}
   */
  @Test
  @DisplayName("Test toArray(); given HashMultiSet() add 'Object'; then return first element is 'Object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object[] AbstractMapMultiSet.toArray()"})
  void testToArray_givenHashMultiSetAddObject_thenReturnFirstElementIsObject() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    // Act
    Object[] actualToArrayResult = hashMultiSet.toArray();

    // Assert
    assertEquals("Object", actualToArrayResult[0]);
    assertEquals(1, actualToArrayResult.length);
  }

  /**
   * Test {@link AbstractMapMultiSet#toArray()}.
   * <ul>
   *   <li>Given {@link HashMultiSet#HashMultiSet()}.</li>
   *   <li>Then return array length is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMapMultiSet#toArray()}
   */
  @Test
  @DisplayName("Test toArray(); given HashMultiSet(); then return array length is zero")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object[] AbstractMapMultiSet.toArray()"})
  void testToArray_givenHashMultiSet_thenReturnArrayLengthIsZero() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(0, hashMultiSet.toArray().length);
  }

  /**
   * Test {@link AbstractMapMultiSet#uniqueElements()}.
   * <p>
   * Method under test: {@link AbstractMapMultiSet#uniqueElements()}
   */
  @Test
  @DisplayName("Test uniqueElements()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"int AbstractMapMultiSet.uniqueElements()"})
  void testUniqueElements() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(0, hashMultiSet.uniqueElements());
  }

  /**
   * Test UniqueSetIterator {@link UniqueSetIterator#UniqueSetIterator(Iterator, AbstractMapMultiSet)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashMultiSet#HashMultiSet()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UniqueSetIterator#UniqueSetIterator(Iterator, AbstractMapMultiSet)}
   */
  @Test
  @DisplayName("Test UniqueSetIterator new UniqueSetIterator(Iterator, AbstractMapMultiSet); given 'Object'; when HashMultiSet() add 'Object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void UniqueSetIterator.<init>(Iterator, AbstractMapMultiSet)"})
  void testUniqueSetIteratorNewUniqueSetIterator_givenObject_whenHashMultiSetAddObject() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    HashMultiSet<Object> parent = new HashMultiSet<>();
    parent.add("Object");

    // Act
    UniqueSetIterator<Object> actualUniqueSetIterator = new UniqueSetIterator<>(iterator, parent);

    // Assert
    assertFalse(actualUniqueSetIterator.hasNext());
  }

  /**
   * Test UniqueSetIterator {@link UniqueSetIterator#UniqueSetIterator(Iterator, AbstractMapMultiSet)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>When {@link HashMultiSet#HashMultiSet()} add {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UniqueSetIterator#UniqueSetIterator(Iterator, AbstractMapMultiSet)}
   */
  @Test
  @DisplayName("Test UniqueSetIterator new UniqueSetIterator(Iterator, AbstractMapMultiSet); given 'Object'; when HashMultiSet() add 'Object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void UniqueSetIterator.<init>(Iterator, AbstractMapMultiSet)"})
  void testUniqueSetIteratorNewUniqueSetIterator_givenObject_whenHashMultiSetAddObject2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    HashMultiSet<Object> parent = new HashMultiSet<>();
    parent.add("Object");
    parent.add("Object");

    // Act
    UniqueSetIterator<Object> actualUniqueSetIterator = new UniqueSetIterator<>(iterator, parent);

    // Assert
    assertFalse(actualUniqueSetIterator.hasNext());
  }

  /**
   * Test UniqueSetIterator {@link UniqueSetIterator#UniqueSetIterator(Iterator, AbstractMapMultiSet)}.
   * <ul>
   *   <li>When {@link HashMultiSet#HashMultiSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UniqueSetIterator#UniqueSetIterator(Iterator, AbstractMapMultiSet)}
   */
  @Test
  @DisplayName("Test UniqueSetIterator new UniqueSetIterator(Iterator, AbstractMapMultiSet); when HashMultiSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void UniqueSetIterator.<init>(Iterator, AbstractMapMultiSet)"})
  void testUniqueSetIteratorNewUniqueSetIterator_whenHashMultiSet() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();

    // Act
    UniqueSetIterator<Object> actualUniqueSetIterator = new UniqueSetIterator<>(iterator, new HashMultiSet<>());

    // Assert
    assertFalse(actualUniqueSetIterator.hasNext());
  }

  /**
   * Test UniqueSetIterator {@link UniqueSetIterator#next()}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UniqueSetIterator#next()}
   */
  @Test
  @DisplayName("Test UniqueSetIterator next(); given ArrayList() add '42'; then return '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object UniqueSetIterator.next()"})
  void testUniqueSetIteratorNext_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();
    UniqueSetIterator<Object> uniqueSetIterator = new UniqueSetIterator<>(iterator, new HashMultiSet<>());

    // Act
    Object actualNextResult = uniqueSetIterator.next();

    // Assert
    assertEquals("42", actualNextResult);
    assertSame(uniqueSetIterator.lastElement, actualNextResult);
  }

  /**
   * Test UniqueSetIterator {@link UniqueSetIterator#remove()}.
   * <p>
   * Method under test: {@link UniqueSetIterator#remove()}
   */
  @Test
  @DisplayName("Test UniqueSetIterator remove()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void UniqueSetIterator.remove()"})
  void testUniqueSetIteratorRemove() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();
    UniqueSetIterator<Object> uniqueSetIterator = new UniqueSetIterator<>(iterator, new HashMultiSet<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> uniqueSetIterator.remove());
  }
}
