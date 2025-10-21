package org.apache.commons.collections4.multiset;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
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
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AbstractMapMultiSetDiffblueTest {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMapMultiSet.add(Object, int)"})
  public void testAddWithObjectOccurrences_givenHashMultiSetAddObject_whenTwo_thenReturnOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMapMultiSet.add(Object, int)"})
  public void testAddWithObjectOccurrences_givenHashMultiSet_whenTwo_thenHashMultiSetSizeIsTwo() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMapMultiSet.add(Object, int)"})
  public void testAddWithObjectOccurrences_whenMinusOne_thenThrowIllegalArgumentException() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMapMultiSet.add(Object, int)"})
  public void testAddWithObjectOccurrences_whenZero_thenHashMultiSetEmpty() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapMultiSet.contains(Object)"})
  public void testContains_givenHashMultiSetAddObject_thenReturnTrue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapMultiSet.contains(Object)"})
  public void testContains_givenHashMultiSet_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator AbstractMapMultiSet.createEntrySetIterator()"})
  public void testCreateEntrySetIterator() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator AbstractMapMultiSet.createUniqueSetIterator()"})
  public void testCreateUniqueSetIterator() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractMapMultiSet.doReadObject(ObjectInputStream)"})
  public void testDoReadObject_givenObject_thenHashMultiSetSizeIsOne() throws IOException, ClassNotFoundException {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void AbstractMapMultiSet.doReadObject(ObjectInputStream)"})
  public void testDoReadObject_thenThrowIllegalArgumentException() throws IOException, ClassNotFoundException {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean EntrySetIterator.hasNext()"})
  public void testEntrySetIteratorHasNext_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean EntrySetIterator.hasNext()"})
  public void testEntrySetIteratorHasNext_thenReturnTrue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EntrySetIterator.<init>(Iterator, AbstractMapMultiSet)"})
  public void testEntrySetIteratorNewEntrySetIterator() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"MultiSet.Entry EntrySetIterator.next()"})
  public void testEntrySetIteratorNext() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EntrySetIterator.remove()"})
  public void testEntrySetIteratorRemove() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapMultiSet.equals(Object)", "int AbstractMapMultiSet.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapMultiSet.equals(Object)", "int AbstractMapMultiSet.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapMultiSet.equals(Object)", "int AbstractMapMultiSet.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapMultiSet.equals(Object)", "int AbstractMapMultiSet.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapMultiSet.equals(Object)", "int AbstractMapMultiSet.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapMultiSet.equals(Object)", "int AbstractMapMultiSet.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapMultiSet.equals(Object)", "int AbstractMapMultiSet.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapMultiSet.equals(Object)", "int AbstractMapMultiSet.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapMultiSet.equals(Object)", "int AbstractMapMultiSet.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapMultiSet.equals(Object)", "int AbstractMapMultiSet.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapMultiSet.equals(Object)", "int AbstractMapMultiSet.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapMultiSet.equals(Object)", "int AbstractMapMultiSet.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMapMultiSet.getCount(Object)"})
  public void testGetCount_givenHashMultiSetAddObject_thenReturnOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMapMultiSet.getCount(Object)"})
  public void testGetCount_givenHashMultiSet_thenReturnZero() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Map AbstractMapMultiSet.getMap()"})
  public void testGetMap() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapMultiSet.isEmpty()"})
  public void testIsEmpty_givenHashMultiSetAddObject_thenReturnFalse() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMapMultiSet.isEmpty()"})
  public void testIsEmpty_givenHashMultiSet_thenReturnTrue() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator AbstractMapMultiSet.iterator()"})
  public void testIterator() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int MultiSetEntry.getCount()"})
  public void testMultiSetEntryGetCount_thenReturnFortyTwo() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object MultiSetEntry.getElement()"})
  public void testMultiSetEntryGetElement_givenMutableIntegerWithValueIsFortyTwo_thenReturn42() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void MultiSetEntry.<init>(Entry)"})
  public void testMultiSetEntryNewMultiSetEntry() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean MutableInteger.equals(Object)", "int MutableInteger.hashCode()"})
  public void testMutableIntegerEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean MutableInteger.equals(Object)", "int MutableInteger.hashCode()"})
  public void testMutableIntegerEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean MutableInteger.equals(Object)", "int MutableInteger.hashCode()"})
  public void testMutableIntegerEquals_whenOtherIsDifferent_thenReturnNotEqual() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean MutableInteger.equals(Object)", "int MutableInteger.hashCode()"})
  public void testMutableIntegerEquals_whenOtherIsNull_thenReturnNotEqual() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean MutableInteger.equals(Object)", "int MutableInteger.hashCode()"})
  public void testMutableIntegerEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MutableInteger(42), "Different type to MutableInteger");
  }

  /**
   * Test MutableInteger {@link MutableInteger#MutableInteger(int)}.
   * <p>
   * Method under test: {@link MutableInteger#MutableInteger(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void MutableInteger.<init>(int)"})
  public void testMutableIntegerNewMutableInteger() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMapMultiSet.remove(Object, int)"})
  public void testRemoveWithObjectOccurrences_givenHashMultiSetAddObject_whenOne_thenReturnOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMapMultiSet.remove(Object, int)"})
  public void testRemoveWithObjectOccurrences_givenHashMultiSetAddObject_whenOne_thenReturnTwo() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMapMultiSet.remove(Object, int)"})
  public void testRemoveWithObjectOccurrences_givenHashMultiSet_whenOne_thenReturnZero() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMapMultiSet.remove(Object, int)"})
  public void testRemoveWithObjectOccurrences_thenThrowIllegalArgumentException() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMapMultiSet.remove(Object, int)"})
  public void testRemoveWithObjectOccurrences_whenZero_thenReturnOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMapMultiSet.size()"})
  public void testSize() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object[] AbstractMapMultiSet.toArray(Object[])"})
  public void testToArrayWithObject_givenHashMultiSetAddObject_thenFirstElementIsArray() {
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
   * Test {@link AbstractMapMultiSet#uniqueElements()}.
   * <p>
   * Method under test: {@link AbstractMapMultiSet#uniqueElements()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMapMultiSet.uniqueElements()"})
  public void testUniqueElements() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void UniqueSetIterator.<init>(Iterator, AbstractMapMultiSet)"})
  public void testUniqueSetIteratorNewUniqueSetIterator_givenObject_whenHashMultiSetAddObject() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void UniqueSetIterator.<init>(Iterator, AbstractMapMultiSet)"})
  public void testUniqueSetIteratorNewUniqueSetIterator_givenObject_whenHashMultiSetAddObject2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void UniqueSetIterator.<init>(Iterator, AbstractMapMultiSet)"})
  public void testUniqueSetIteratorNewUniqueSetIterator_whenHashMultiSet() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object UniqueSetIterator.next()"})
  public void testUniqueSetIteratorNext_givenArrayListAdd42_thenReturn42() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void UniqueSetIterator.remove()"})
  public void testUniqueSetIteratorRemove() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();
    UniqueSetIterator<Object> uniqueSetIterator = new UniqueSetIterator<>(iterator, new HashMultiSet<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> uniqueSetIterator.remove());
  }
}
