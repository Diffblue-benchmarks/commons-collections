package org.apache.commons.collections4.multiset;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.apache.commons.collections4.multiset.AbstractMapMultiSet.MultiSetEntry;
import org.apache.commons.collections4.multiset.AbstractMapMultiSet.MutableInteger;
import org.apache.commons.collections4.multiset.AbstractMapMultiSet.UniqueSetIterator;
import org.apache.commons.collections4.multiset.AbstractMultiSet.AbstractEntry;
import org.apache.commons.collections4.multiset.AbstractMultiSet.EntrySet;
import org.apache.commons.collections4.multiset.AbstractMultiSet.UniqueSet;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AbstractMultiSetDiffblueTest {
  /**
   * Test AbstractEntry {@link AbstractEntry#equals(Object)}, and {@link AbstractEntry#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractEntry#equals(Object)}
   *   <li>{@link AbstractEntry#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractEntry.equals(Object)", "int AbstractEntry.hashCode()"})
  public void testAbstractEntryEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MultiSetEntry<Object> multiSetEntry = new MultiSetEntry<>(new SimpleEntry<>("42", new MutableInteger(42)));
    MultiSetEntry<Object> multiSetEntry2 = new MultiSetEntry<>(new SimpleEntry<>("42", new MutableInteger(42)));

    // Act and Assert
    assertEquals(multiSetEntry, multiSetEntry2);
    int expectedHashCodeResult = multiSetEntry.hashCode();
    assertEquals(expectedHashCodeResult, multiSetEntry2.hashCode());
  }

  /**
   * Test AbstractEntry {@link AbstractEntry#equals(Object)}, and {@link AbstractEntry#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractEntry#equals(Object)}
   *   <li>{@link AbstractEntry#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractEntry.equals(Object)", "int AbstractEntry.hashCode()"})
  public void testAbstractEntryEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MultiSetEntry<Object> multiSetEntry = new MultiSetEntry<>(new SimpleEntry<>("42", new MutableInteger(42)));

    // Act and Assert
    assertEquals(multiSetEntry, multiSetEntry);
    int expectedHashCodeResult = multiSetEntry.hashCode();
    assertEquals(expectedHashCodeResult, multiSetEntry.hashCode());
  }

  /**
   * Test AbstractEntry {@link AbstractEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractEntry.equals(Object)", "int AbstractEntry.hashCode()"})
  public void testAbstractEntryEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    MultiSetEntry<Object> multiSetEntry = new MultiSetEntry<>(new SimpleEntry<>(1, new MutableInteger(42)));

    // Act and Assert
    assertNotEquals(multiSetEntry, new MultiSetEntry<>(new SimpleEntry<>("42", new MutableInteger(42))));
  }

  /**
   * Test AbstractEntry {@link AbstractEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractEntry.equals(Object)", "int AbstractEntry.hashCode()"})
  public void testAbstractEntryEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    MultiSetEntry<Object> multiSetEntry = new MultiSetEntry<>(new SimpleEntry<>("42", new MutableInteger(42)));
    MultiSetEntry<Object> multiSetEntry2 = new MultiSetEntry<>(
        new SimpleEntry<>(multiSetEntry, new MutableInteger(42)));

    // Act and Assert
    assertNotEquals(multiSetEntry2, new MultiSetEntry<>(new SimpleEntry<>("42", new MutableInteger(42))));
  }

  /**
   * Test AbstractEntry {@link AbstractEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractEntry.equals(Object)", "int AbstractEntry.hashCode()"})
  public void testAbstractEntryEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    MultiSetEntry<Object> multiSetEntry = new MultiSetEntry<>(new SimpleEntry<>("42", new MutableInteger(1)));

    // Act and Assert
    assertNotEquals(multiSetEntry, new MultiSetEntry<>(new SimpleEntry<>("42", new MutableInteger(42))));
  }

  /**
   * Test AbstractEntry {@link AbstractEntry#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractEntry.equals(Object)", "int AbstractEntry.hashCode()"})
  public void testAbstractEntryEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    MultiSetEntry<Object> multiSetEntry = new MultiSetEntry<>(new SimpleEntry<>("42", new MutableInteger(42)));

    // Act and Assert
    assertNotEquals(multiSetEntry, null);
  }

  /**
   * Test AbstractEntry {@link AbstractEntry#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractEntry.equals(Object)", "int AbstractEntry.hashCode()"})
  public void testAbstractEntryEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    MultiSetEntry<Object> multiSetEntry = new MultiSetEntry<>(new SimpleEntry<>("42", new MutableInteger(42)));

    // Act and Assert
    assertNotEquals(multiSetEntry, "Different type to AbstractEntry");
  }

  /**
   * Test AbstractEntry {@link AbstractEntry#toString()}.
   * <ul>
   *   <li>Given {@link MutableInteger#MutableInteger(int)} with value is forty-two.</li>
   *   <li>Then return {@code 42:42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractEntry#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String AbstractEntry.toString()"})
  public void testAbstractEntryToString_givenMutableIntegerWithValueIsFortyTwo_thenReturn4242() {
    // Arrange
    MultiSetEntry<Object> multiSetEntry = new MultiSetEntry<>(new SimpleEntry<>("42", new MutableInteger(42)));

    // Act and Assert
    assertEquals("42:42", multiSetEntry.toString());
  }

  /**
   * Test {@link AbstractMultiSet#add(Object)} with {@code object}.
   * <p>
   * Method under test: {@link AbstractMultiSet#add(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiSet.add(Object)"})
  public void testAddWithObject() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act
    boolean actualAddResult = hashMultiSet.add("Object");

    // Assert
    assertEquals(1, hashMultiSet.size());
    assertTrue(actualAddResult);
  }

  /**
   * Test {@link AbstractMultiSet#add(Object, int)} with {@code object}, {@code occurrences}.
   * <p>
   * Method under test: {@link AbstractMultiSet#add(Object, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMultiSet.add(Object, int)"})
  public void testAddWithObjectOccurrences() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(0, hashMultiSet.add("Object", 2));
    assertEquals(2, hashMultiSet.size());
  }

  /**
   * Test {@link AbstractMultiSet#contains(Object)}.
   * <ul>
   *   <li>Given {@link HashMultiSet#HashMultiSet()} add {@code Object}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiSet#contains(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiSet.contains(Object)"})
  public void testContains_givenHashMultiSetAddObject_thenReturnTrue() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    // Act and Assert
    assertTrue(hashMultiSet.contains("Object"));
  }

  /**
   * Test {@link AbstractMultiSet#contains(Object)}.
   * <ul>
   *   <li>Given {@link HashMultiSet#HashMultiSet()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiSet#contains(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiSet.contains(Object)"})
  public void testContains_givenHashMultiSet_thenReturnFalse() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertFalse(hashMultiSet.contains("Object"));
  }

  /**
   * Test {@link AbstractMultiSet#createEntrySet()}.
   * <p>
   * Method under test: {@link AbstractMultiSet#createEntrySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set AbstractMultiSet.createEntrySet()"})
  public void testCreateEntrySet() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertTrue(hashMultiSet.createEntrySet().isEmpty());
  }

  /**
   * Test {@link AbstractMultiSet#createUniqueSet()}.
   * <p>
   * Method under test: {@link AbstractMultiSet#createUniqueSet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set AbstractMultiSet.createUniqueSet()"})
  public void testCreateUniqueSet() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertTrue(hashMultiSet.createUniqueSet().isEmpty());
  }

  /**
   * Test {@link AbstractMultiSet#createUniqueSetIterator()}.
   * <p>
   * Method under test: {@link AbstractMultiSet#createUniqueSetIterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator AbstractMultiSet.createUniqueSetIterator()"})
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
   * Test {@link AbstractMultiSet#entrySet()}.
   * <p>
   * Method under test: {@link AbstractMultiSet#entrySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set AbstractMultiSet.entrySet()"})
  public void testEntrySet() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertTrue(hashMultiSet.entrySet().isEmpty());
  }

  /**
   * Test EntrySet {@link EntrySet#EntrySet(AbstractMultiSet)}.
   * <p>
   * Method under test: {@link EntrySet#EntrySet(AbstractMultiSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EntrySet.<init>(AbstractMultiSet)"})
  public void testEntrySetNewEntrySet() {
    // Arrange and Act
    EntrySet<Object> actualObjectSet = new EntrySet<>(new HashMultiSet<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test {@link AbstractMultiSet#equals(Object)}, and {@link AbstractMultiSet#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiSet#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiSet.equals(Object)", "int AbstractMultiSet.hashCode()"})
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
   * Test {@link AbstractMultiSet#equals(Object)}, and {@link AbstractMultiSet#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiSet#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiSet.equals(Object)", "int AbstractMultiSet.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(hashMultiSet, hashMultiSet);
    int expectedHashCodeResult = hashMultiSet.hashCode();
    assertEquals(expectedHashCodeResult, hashMultiSet.hashCode());
  }

  /**
   * Test {@link AbstractMultiSet#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiSet#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiSet.equals(Object)", "int AbstractMultiSet.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    // Act and Assert
    assertNotEquals(hashMultiSet, new HashMultiSet<>());
  }

  /**
   * Test {@link AbstractMultiSet#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiSet#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiSet.equals(Object)", "int AbstractMultiSet.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertNotEquals(hashMultiSet, null);
  }

  /**
   * Test {@link AbstractMultiSet#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiSet#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiSet.equals(Object)", "int AbstractMultiSet.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertNotEquals(hashMultiSet, "Different type to AbstractMultiSet");
  }

  /**
   * Test {@link AbstractMultiSet#getCount(Object)}.
   * <p>
   * Method under test: {@link AbstractMultiSet#getCount(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMultiSet.getCount(Object)"})
  public void testGetCount() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(0, hashMultiSet.getCount("Object"));
  }

  /**
   * Test {@link AbstractMultiSet#iterator()}.
   * <p>
   * Method under test: {@link AbstractMultiSet#iterator()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Iterator AbstractMultiSet.iterator()"})
  public void testIterator() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertFalse(hashMultiSet.iterator().hasNext());
  }

  /**
   * Test {@link AbstractMultiSet#remove(Object, int)} with {@code object}, {@code occurrences}.
   * <p>
   * Method under test: {@link AbstractMultiSet#remove(Object, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMultiSet.remove(Object, int)"})
  public void testRemoveWithObjectOccurrences() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(0, hashMultiSet.remove("Object", 1));
  }

  /**
   * Test {@link AbstractMultiSet#remove(Object)} with {@code object}.
   * <ul>
   *   <li>Given {@link HashMultiSet#HashMultiSet()} add {@code Object}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiSet#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiSet.remove(Object)"})
  public void testRemoveWithObject_givenHashMultiSetAddObject_thenReturnTrue() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("Object");

    // Act
    boolean actualRemoveResult = hashMultiSet.remove("Object");

    // Assert
    assertTrue(hashMultiSet.isEmpty());
    assertTrue(actualRemoveResult);
  }

  /**
   * Test {@link AbstractMultiSet#remove(Object)} with {@code object}.
   * <ul>
   *   <li>Given {@link HashMultiSet#HashMultiSet()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiSet#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiSet.remove(Object)"})
  public void testRemoveWithObject_givenHashMultiSet_thenReturnFalse() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertFalse(hashMultiSet.remove("Object"));
    assertTrue(hashMultiSet.isEmpty());
  }

  /**
   * Test {@link AbstractMultiSet#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@link HashMultiSet#HashMultiSet()} add {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiSet#removeAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiSet.removeAll(Collection)"})
  public void testRemoveAll_givenHashMultiSetAdd42_whenArrayListAdd42_thenReturnTrue() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualRemoveAllResult = hashMultiSet.removeAll(coll);

    // Assert
    assertTrue(hashMultiSet.isEmpty());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Test {@link AbstractMultiSet#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@link HashMultiSet#HashMultiSet()} add {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiSet#removeAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiSet.removeAll(Collection)"})
  public void testRemoveAll_givenHashMultiSetAdd42_whenArrayListAdd42_thenReturnTrue2() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();
    hashMultiSet.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    boolean actualRemoveAllResult = hashMultiSet.removeAll(coll);

    // Assert
    assertTrue(hashMultiSet.isEmpty());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Test {@link AbstractMultiSet#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@link HashMultiSet#HashMultiSet()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiSet#removeAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiSet.removeAll(Collection)"})
  public void testRemoveAll_givenHashMultiSet_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(hashMultiSet.removeAll(coll));
    assertTrue(hashMultiSet.isEmpty());
  }

  /**
   * Test {@link AbstractMultiSet#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@link HashMultiSet#HashMultiSet()}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiSet#removeAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiSet.removeAll(Collection)"})
  public void testRemoveAll_givenHashMultiSet_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(hashMultiSet.removeAll(coll));
    assertTrue(hashMultiSet.isEmpty());
  }

  /**
   * Test {@link AbstractMultiSet#removeAll(Collection)}.
   * <ul>
   *   <li>Given {@link HashMultiSet#HashMultiSet()}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiSet#removeAll(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractMultiSet.removeAll(Collection)"})
  public void testRemoveAll_givenHashMultiSet_whenArrayList_thenReturnFalse() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertFalse(hashMultiSet.removeAll(new ArrayList<>()));
    assertTrue(hashMultiSet.isEmpty());
  }

  /**
   * Test {@link AbstractMultiSet#setCount(Object, int)}.
   * <ul>
   *   <li>When minus one.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiSet#setCount(Object, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMultiSet.setCount(Object, int)"})
  public void testSetCount_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> hashMultiSet.setCount("Object", -1));
  }

  /**
   * Test {@link AbstractMultiSet#setCount(Object, int)}.
   * <ul>
   *   <li>When three.</li>
   *   <li>Then {@link HashMultiSet#HashMultiSet()} size is three.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiSet#setCount(Object, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMultiSet.setCount(Object, int)"})
  public void testSetCount_whenThree_thenHashMultiSetSizeIsThree() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(0, hashMultiSet.setCount("Object", 3));
    assertEquals(3, hashMultiSet.size());
  }

  /**
   * Test {@link AbstractMultiSet#setCount(Object, int)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then {@link HashMultiSet#HashMultiSet()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractMultiSet#setCount(Object, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMultiSet.setCount(Object, int)"})
  public void testSetCount_whenZero_thenHashMultiSetEmpty() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(0, hashMultiSet.setCount("Object", 0));
    assertTrue(hashMultiSet.isEmpty());
  }

  /**
   * Test {@link AbstractMultiSet#size()}.
   * <p>
   * Method under test: {@link AbstractMultiSet#size()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int AbstractMultiSet.size()"})
  public void testSize() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals(0, hashMultiSet.size());
  }

  /**
   * Test {@link AbstractMultiSet#toString()}.
   * <p>
   * Method under test: {@link AbstractMultiSet#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String AbstractMultiSet.toString()"})
  public void testToString() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertEquals("[]", hashMultiSet.toString());
  }

  /**
   * Test {@link AbstractMultiSet#uniqueSet()}.
   * <p>
   * Method under test: {@link AbstractMultiSet#uniqueSet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set AbstractMultiSet.uniqueSet()"})
  public void testUniqueSet() {
    // Arrange
    HashMultiSet<Object> hashMultiSet = new HashMultiSet<>();

    // Act and Assert
    assertTrue(hashMultiSet.uniqueSet().isEmpty());
  }

  /**
   * Test UniqueSet {@link UniqueSet#UniqueSet(AbstractMultiSet)}.
   * <p>
   * Method under test: {@link UniqueSet#UniqueSet(AbstractMultiSet)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void UniqueSet.<init>(AbstractMultiSet)"})
  public void testUniqueSetNewUniqueSet() {
    // Arrange and Act
    UniqueSet<Object> actualObjectSet = new UniqueSet<>(new HashMultiSet<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }
}
