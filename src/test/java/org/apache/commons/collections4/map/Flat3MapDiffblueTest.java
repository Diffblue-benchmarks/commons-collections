package org.apache.commons.collections4.map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.map.AbstractHashedMap.HashEntry;
import org.apache.commons.collections4.map.Flat3Map.EntryIterator;
import org.apache.commons.collections4.map.Flat3Map.EntrySet;
import org.apache.commons.collections4.map.Flat3Map.EntrySetIterator;
import org.apache.commons.collections4.map.Flat3Map.FlatMapEntry;
import org.apache.commons.collections4.map.Flat3Map.FlatMapIterator;
import org.apache.commons.collections4.map.Flat3Map.KeySet;
import org.apache.commons.collections4.map.Flat3Map.KeySetIterator;
import org.apache.commons.collections4.map.Flat3Map.Values;
import org.apache.commons.collections4.map.Flat3Map.ValuesIterator;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class Flat3MapDiffblueTest {
  /**
   * Test EntryIterator {@link EntryIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EntryIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean EntryIterator.hasNext()"})
  public void testEntryIteratorHasNext_givenFlat3MapNullIsNull_thenReturnTrue() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(parent);

    // Act and Assert
    assertTrue(entrySetIterator.hasNext());
  }

  /**
   * Test EntryIterator {@link EntryIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EntryIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean EntryIterator.hasNext()"})
  public void testEntryIteratorHasNext_thenReturnFalse() {
    // Arrange
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(new Flat3Map<>());

    // Act and Assert
    assertFalse(entrySetIterator.hasNext());
  }

  /**
   * Test EntryIterator {@link EntryIterator#nextEntry()}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@link FlatMapEntry}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EntryIterator#nextEntry()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Map.Entry EntryIterator.nextEntry()"})
  public void testEntryIteratorNextEntry_givenFlat3MapNullIsNull_thenReturnFlatMapEntry() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(parent);

    // Act and Assert
    assertTrue(entrySetIterator.nextEntry() instanceof FlatMapEntry);
    assertFalse(entrySetIterator.hasNext());
  }

  /**
   * Test EntryIterator {@link EntryIterator#nextEntry()}.
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EntryIterator#nextEntry()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Map.Entry EntryIterator.nextEntry()"})
  public void testEntryIteratorNextEntry_thenThrowNoSuchElementException() {
    // Arrange
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(new Flat3Map<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> entrySetIterator.nextEntry());
  }

  /**
   * Test EntryIterator {@link EntryIterator#remove()}.
   * <p>
   * Method under test: {@link EntryIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EntryIterator.remove()"})
  public void testEntryIteratorRemove() {
    // Arrange
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(new Flat3Map<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> entrySetIterator.remove());
  }

  /**
   * Test EntrySetIterator {@link EntrySetIterator#EntrySetIterator(Flat3Map)}.
   * <p>
   * Method under test: {@link EntrySetIterator#EntrySetIterator(Flat3Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EntrySetIterator.<init>(Flat3Map)"})
  public void testEntrySetIteratorNewEntrySetIterator() {
    // Arrange and Act
    EntrySetIterator<Object, Object> actualEntrySetIterator = new EntrySetIterator<>(new Flat3Map<>());

    // Assert
    assertFalse(actualEntrySetIterator.hasNext());
  }

  /**
   * Test EntrySetIterator {@link EntrySetIterator#next()}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@link FlatMapEntry}.</li>
   * </ul>
   * <p>
   * Method under test: {@link EntrySetIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Map.Entry EntrySetIterator.next()"})
  public void testEntrySetIteratorNext_givenFlat3MapNullIsNull_thenReturnFlatMapEntry() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    EntrySetIterator<Object, Object> entrySetIterator = new EntrySetIterator<>(parent);

    // Act and Assert
    assertTrue(entrySetIterator.next() instanceof FlatMapEntry);
    assertFalse(entrySetIterator.hasNext());
  }

  /**
   * Test EntrySet {@link EntrySet#EntrySet(Flat3Map)}.
   * <p>
   * Method under test: {@link EntrySet#EntrySet(Flat3Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void EntrySet.<init>(Flat3Map)"})
  public void testEntrySetNewEntrySet() {
    // Arrange and Act
    EntrySet<Object, Object> actualObjectSet = new EntrySet<>(new Flat3Map<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}, and {@link FlatMapEntry#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link FlatMapEntry#equals(Object)}
   *   <li>{@link FlatMapEntry#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  public void testFlatMapEntryEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);
    FlatMapEntry<Object, Object> flatMapEntry2 = new FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertEquals(flatMapEntry, flatMapEntry2);
    int expectedHashCodeResult = flatMapEntry.hashCode();
    assertEquals(expectedHashCodeResult, flatMapEntry2.hashCode());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}, and {@link FlatMapEntry#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link FlatMapEntry#equals(Object)}
   *   <li>{@link FlatMapEntry#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  public void testFlatMapEntryEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 2);
    FlatMapEntry<Object, Object> flatMapEntry2 = new FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertEquals(flatMapEntry, flatMapEntry2);
    int expectedHashCodeResult = flatMapEntry.hashCode();
    assertEquals(expectedHashCodeResult, flatMapEntry2.hashCode());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}, and {@link FlatMapEntry#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link FlatMapEntry#equals(Object)}
   *   <li>{@link FlatMapEntry#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  public void testFlatMapEntryEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 3);
    FlatMapEntry<Object, Object> flatMapEntry2 = new FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertEquals(flatMapEntry, flatMapEntry2);
    int expectedHashCodeResult = flatMapEntry.hashCode();
    assertEquals(expectedHashCodeResult, flatMapEntry2.hashCode());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}, and {@link FlatMapEntry#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link FlatMapEntry#equals(Object)}
   *   <li>{@link FlatMapEntry#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  public void testFlatMapEntryEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertEquals(flatMapEntry, flatMapEntry);
    int expectedHashCodeResult = flatMapEntry.hashCode();
    assertEquals(expectedHashCodeResult, flatMapEntry.hashCode());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  public void testFlatMapEntryEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(parent, 1);

    // Act and Assert
    assertNotEquals(flatMapEntry, new FlatMapEntry<>(new Flat3Map<>(), 1));
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  public void testFlatMapEntryEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertNotEquals(flatMapEntry, new SimpleEntry<>(AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  public void testFlatMapEntryEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertNotEquals(flatMapEntry, new HashEntry<>(null, 19088743, AbstractHashedMap.NULL, AbstractHashedMap.NULL));
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  public void testFlatMapEntryEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);
    flatMapEntry.setRemoved(true);

    // Act and Assert
    assertNotEquals(flatMapEntry, 1);
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  public void testFlatMapEntryEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(new FlatMapEntry<>(new Flat3Map<>(), 1), AbstractHashedMap.NULL);
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(parent, 1);

    // Act and Assert
    assertNotEquals(flatMapEntry, new FlatMapEntry<>(new Flat3Map<>(), 1));
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then throw exception.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  public void testFlatMapEntryEquals_whenOtherIsDifferent_thenThrowException() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 0);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.equals(new FlatMapEntry<>(new Flat3Map<>(), 1)));
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then throw exception.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  public void testFlatMapEntryEquals_whenOtherIsDifferent_thenThrowException2() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.equals(new FlatMapEntry<>(new Flat3Map<>(), 0)));
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then throw exception.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  public void testFlatMapEntryEquals_whenOtherIsDifferent_thenThrowException3() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);

    FlatMapEntry<Object, Object> flatMapEntry2 = new FlatMapEntry<>(new Flat3Map<>(), 1);
    flatMapEntry2.setRemoved(true);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.equals(flatMapEntry2));
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  public void testFlatMapEntryEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertNotEquals(flatMapEntry, null);
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapEntry#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FlatMapEntry.equals(Object)", "int FlatMapEntry.hashCode()"})
  public void testFlatMapEntryEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertNotEquals(flatMapEntry, "Different type to FlatMapEntry");
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#getKey()}.
   * <p>
   * Method under test: {@link FlatMapEntry#getKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FlatMapEntry.getKey()"})
  public void testFlatMapEntryGetKey() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);
    flatMapEntry.setRemoved(true);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.getKey());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#getKey()}.
   * <ul>
   *   <li>Given {@link FlatMapEntry#FlatMapEntry(Flat3Map, int)} with parent is {@link Flat3Map#Flat3Map()} and index is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapEntry#getKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FlatMapEntry.getKey()"})
  public void testFlatMapEntryGetKey_givenFlatMapEntryWithParentIsFlat3MapAndIndexIsOne() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertNull(flatMapEntry.getKey());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#getKey()}.
   * <ul>
   *   <li>Given {@link FlatMapEntry#FlatMapEntry(Flat3Map, int)} with parent is {@link Flat3Map#Flat3Map()} and index is three.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapEntry#getKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FlatMapEntry.getKey()"})
  public void testFlatMapEntryGetKey_givenFlatMapEntryWithParentIsFlat3MapAndIndexIsThree() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 3);

    // Act and Assert
    assertNull(flatMapEntry.getKey());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#getKey()}.
   * <ul>
   *   <li>Given {@link FlatMapEntry#FlatMapEntry(Flat3Map, int)} with parent is {@link Flat3Map#Flat3Map()} and index is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapEntry#getKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FlatMapEntry.getKey()"})
  public void testFlatMapEntryGetKey_givenFlatMapEntryWithParentIsFlat3MapAndIndexIsTwo() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 2);

    // Act and Assert
    assertNull(flatMapEntry.getKey());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#getKey()}.
   * <ul>
   *   <li>Given {@link FlatMapEntry#FlatMapEntry(Flat3Map, int)} with parent is {@link Flat3Map#Flat3Map()} and index is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapEntry#getKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FlatMapEntry.getKey()"})
  public void testFlatMapEntryGetKey_givenFlatMapEntryWithParentIsFlat3MapAndIndexIsZero() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 0);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.getKey());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#getValue()}.
   * <p>
   * Method under test: {@link FlatMapEntry#getValue()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FlatMapEntry.getValue()"})
  public void testFlatMapEntryGetValue() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);
    flatMapEntry.setRemoved(true);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.getValue());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#getValue()}.
   * <ul>
   *   <li>Given {@link FlatMapEntry#FlatMapEntry(Flat3Map, int)} with parent is {@link Flat3Map#Flat3Map()} and index is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapEntry#getValue()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FlatMapEntry.getValue()"})
  public void testFlatMapEntryGetValue_givenFlatMapEntryWithParentIsFlat3MapAndIndexIsOne() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertNull(flatMapEntry.getValue());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#getValue()}.
   * <ul>
   *   <li>Given {@link FlatMapEntry#FlatMapEntry(Flat3Map, int)} with parent is {@link Flat3Map#Flat3Map()} and index is three.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapEntry#getValue()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FlatMapEntry.getValue()"})
  public void testFlatMapEntryGetValue_givenFlatMapEntryWithParentIsFlat3MapAndIndexIsThree() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 3);

    // Act and Assert
    assertNull(flatMapEntry.getValue());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#getValue()}.
   * <ul>
   *   <li>Given {@link FlatMapEntry#FlatMapEntry(Flat3Map, int)} with parent is {@link Flat3Map#Flat3Map()} and index is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapEntry#getValue()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FlatMapEntry.getValue()"})
  public void testFlatMapEntryGetValue_givenFlatMapEntryWithParentIsFlat3MapAndIndexIsTwo() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 2);

    // Act and Assert
    assertNull(flatMapEntry.getValue());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#getValue()}.
   * <ul>
   *   <li>Given {@link FlatMapEntry#FlatMapEntry(Flat3Map, int)} with parent is {@link Flat3Map#Flat3Map()} and index is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapEntry#getValue()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FlatMapEntry.getValue()"})
  public void testFlatMapEntryGetValue_givenFlatMapEntryWithParentIsFlat3MapAndIndexIsZero() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 0);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.getValue());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#setValue(Object)}.
   * <p>
   * Method under test: {@link FlatMapEntry#setValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FlatMapEntry.setValue(Object)"})
  public void testFlatMapEntrySetValue() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertNull(flatMapEntry.setValue(object));
    assertSame(object, flatMapEntry.getValue());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#setValue(Object)}.
   * <p>
   * Method under test: {@link FlatMapEntry#setValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FlatMapEntry.setValue(Object)"})
  public void testFlatMapEntrySetValue2() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 2);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertNull(flatMapEntry.setValue(object));
    assertSame(object, flatMapEntry.getValue());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#setValue(Object)}.
   * <p>
   * Method under test: {@link FlatMapEntry#setValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FlatMapEntry.setValue(Object)"})
  public void testFlatMapEntrySetValue3() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 3);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertNull(flatMapEntry.setValue(object));
    assertSame(object, flatMapEntry.getValue());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#setValue(Object)}.
   * <p>
   * Method under test: {@link FlatMapEntry#setValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FlatMapEntry.setValue(Object)"})
  public void testFlatMapEntrySetValue4() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);
    flatMapEntry.setRemoved(true);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.setValue(AbstractHashedMap.NULL));
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#setValue(Object)}.
   * <ul>
   *   <li>Given {@link FlatMapEntry#FlatMapEntry(Flat3Map, int)} with parent is {@link Flat3Map#Flat3Map()} and index is zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapEntry#setValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FlatMapEntry.setValue(Object)"})
  public void testFlatMapEntrySetValue_givenFlatMapEntryWithParentIsFlat3MapAndIndexIsZero() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 0);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.setValue(AbstractHashedMap.NULL));
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#toString()}.
   * <ul>
   *   <li>Given {@link FlatMapEntry#FlatMapEntry(Flat3Map, int)} with parent is {@link Flat3Map#Flat3Map()} and index is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapEntry#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String FlatMapEntry.toString()"})
  public void testFlatMapEntryToString_givenFlatMapEntryWithParentIsFlat3MapAndIndexIsOne() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);

    // Act and Assert
    assertEquals("null=null", flatMapEntry.toString());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#toString()}.
   * <ul>
   *   <li>Given {@link FlatMapEntry#FlatMapEntry(Flat3Map, int)} with parent is {@link Flat3Map#Flat3Map()} and index is three.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapEntry#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String FlatMapEntry.toString()"})
  public void testFlatMapEntryToString_givenFlatMapEntryWithParentIsFlat3MapAndIndexIsThree() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 3);

    // Act and Assert
    assertEquals("null=null", flatMapEntry.toString());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#toString()}.
   * <ul>
   *   <li>Given {@link FlatMapEntry#FlatMapEntry(Flat3Map, int)} with parent is {@link Flat3Map#Flat3Map()} and index is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapEntry#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String FlatMapEntry.toString()"})
  public void testFlatMapEntryToString_givenFlatMapEntryWithParentIsFlat3MapAndIndexIsTwo() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 2);

    // Act and Assert
    assertEquals("null=null", flatMapEntry.toString());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#toString()}.
   * <ul>
   *   <li>Then return empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapEntry#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String FlatMapEntry.toString()"})
  public void testFlatMapEntryToString_thenReturnEmptyString() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 1);
    flatMapEntry.setRemoved(true);

    // Act and Assert
    assertEquals("", flatMapEntry.toString());
  }

  /**
   * Test FlatMapEntry {@link FlatMapEntry#toString()}.
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapEntry#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String FlatMapEntry.toString()"})
  public void testFlatMapEntryToString_thenThrowIllegalStateException() {
    // Arrange
    FlatMapEntry<Object, Object> flatMapEntry = new FlatMapEntry<>(new Flat3Map<>(), 0);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapEntry.toString());
  }

  /**
   * Test FlatMapIterator {@link FlatMapIterator#getKey()}.
   * <p>
   * Method under test: {@link FlatMapIterator#getKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FlatMapIterator.getKey()"})
  public void testFlatMapIteratorGetKey() {
    // Arrange
    FlatMapIterator<Object, Object> flatMapIterator = new FlatMapIterator<>(new Flat3Map<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapIterator.getKey());
  }

  /**
   * Test FlatMapIterator {@link FlatMapIterator#getValue()}.
   * <p>
   * Method under test: {@link FlatMapIterator#getValue()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FlatMapIterator.getValue()"})
  public void testFlatMapIteratorGetValue() {
    // Arrange
    FlatMapIterator<Object, Object> flatMapIterator = new FlatMapIterator<>(new Flat3Map<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapIterator.getValue());
  }

  /**
   * Test FlatMapIterator {@link FlatMapIterator#hasNext()}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FlatMapIterator.hasNext()"})
  public void testFlatMapIteratorHasNext_givenFlat3MapNullIsNull_thenReturnTrue() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    FlatMapIterator<Object, Object> flatMapIterator = new FlatMapIterator<>(parent);

    // Act and Assert
    assertTrue(flatMapIterator.hasNext());
  }

  /**
   * Test FlatMapIterator {@link FlatMapIterator#hasNext()}.
   * <ul>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean FlatMapIterator.hasNext()"})
  public void testFlatMapIteratorHasNext_thenReturnFalse() {
    // Arrange
    FlatMapIterator<Object, Object> flatMapIterator = new FlatMapIterator<>(new Flat3Map<>());

    // Act and Assert
    assertFalse(flatMapIterator.hasNext());
  }

  /**
   * Test FlatMapIterator {@link FlatMapIterator#FlatMapIterator(Flat3Map)}.
   * <p>
   * Method under test: {@link FlatMapIterator#FlatMapIterator(Flat3Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void FlatMapIterator.<init>(Flat3Map)"})
  public void testFlatMapIteratorNewFlatMapIterator() {
    // Arrange and Act
    FlatMapIterator<Object, Object> actualFlatMapIterator = new FlatMapIterator<>(new Flat3Map<>());

    // Assert
    assertFalse(actualFlatMapIterator.hasNext());
  }

  /**
   * Test FlatMapIterator {@link FlatMapIterator#next()}.
   * <ul>
   *   <li>Then not {@link FlatMapIterator#FlatMapIterator(Flat3Map)} with parent is {@link Flat3Map#Flat3Map()} hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FlatMapIterator.next()"})
  public void testFlatMapIteratorNext_thenNotFlatMapIteratorWithParentIsFlat3MapHasNext() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    FlatMapIterator<Object, Object> flatMapIterator = new FlatMapIterator<>(parent);

    // Act
    flatMapIterator.next();

    // Assert
    assertFalse(flatMapIterator.hasNext());
  }

  /**
   * Test FlatMapIterator {@link FlatMapIterator#next()}.
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FlatMapIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FlatMapIterator.next()"})
  public void testFlatMapIteratorNext_thenThrowNoSuchElementException() {
    // Arrange
    FlatMapIterator<Object, Object> flatMapIterator = new FlatMapIterator<>(new Flat3Map<>());

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> flatMapIterator.next());
  }

  /**
   * Test FlatMapIterator {@link FlatMapIterator#remove()}.
   * <p>
   * Method under test: {@link FlatMapIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void FlatMapIterator.remove()"})
  public void testFlatMapIteratorRemove() {
    // Arrange
    FlatMapIterator<Object, Object> flatMapIterator = new FlatMapIterator<>(new Flat3Map<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapIterator.remove());
  }

  /**
   * Test FlatMapIterator {@link FlatMapIterator#setValue(Object)}.
   * <p>
   * Method under test: {@link FlatMapIterator#setValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object FlatMapIterator.setValue(Object)"})
  public void testFlatMapIteratorSetValue() {
    // Arrange
    FlatMapIterator<Object, Object> flatMapIterator = new FlatMapIterator<>(new Flat3Map<>());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> flatMapIterator.setValue(AbstractHashedMap.NULL));
  }

  /**
   * Test FlatMapIterator {@link FlatMapIterator#toString()}.
   * <p>
   * Method under test: {@link FlatMapIterator#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String FlatMapIterator.toString()"})
  public void testFlatMapIteratorToString() {
    // Arrange
    FlatMapIterator<Object, Object> flatMapIterator = new FlatMapIterator<>(new Flat3Map<>());

    // Act and Assert
    assertEquals("Iterator[]", flatMapIterator.toString());
  }

  /**
   * Test KeySetIterator {@link KeySetIterator#KeySetIterator(Flat3Map)}.
   * <p>
   * Method under test: {@link KeySetIterator#KeySetIterator(Flat3Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void KeySetIterator.<init>(Flat3Map)"})
  public void testKeySetIteratorNewKeySetIterator() {
    // Arrange and Act
    KeySetIterator<Object> actualKeySetIterator = new KeySetIterator<>(new Flat3Map<>());

    // Assert
    assertFalse(actualKeySetIterator.hasNext());
  }

  /**
   * Test KeySetIterator {@link KeySetIterator#next()}.
   * <ul>
   *   <li>Then not {@link KeySetIterator#KeySetIterator(Flat3Map)} with parent is {@link Flat3Map#Flat3Map()} hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link KeySetIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object KeySetIterator.next()"})
  public void testKeySetIteratorNext_thenNotKeySetIteratorWithParentIsFlat3MapHasNext() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    KeySetIterator<Object> keySetIterator = new KeySetIterator<>(parent);

    // Act
    keySetIterator.next();

    // Assert
    assertFalse(keySetIterator.hasNext());
  }

  /**
   * Test KeySet {@link KeySet#KeySet(Flat3Map)}.
   * <p>
   * Method under test: {@link KeySet#KeySet(Flat3Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void KeySet.<init>(Flat3Map)"})
  public void testKeySetNewKeySet() {
    // Arrange and Act
    KeySet<Object> actualObjectSet = new KeySet<>(new Flat3Map<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test {@link Flat3Map#Flat3Map()}.
   * <p>
   * Method under test: {@link Flat3Map#Flat3Map()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void Flat3Map.<init>()"})
  public void testNewFlat3Map() {
    // Arrange and Act
    Flat3Map<Object, Object> actualObjectObjectMap = new Flat3Map<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link Flat3Map#clone()}.
   * <p>
   * Method under test: {@link Flat3Map#clone()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Flat3Map Flat3Map.clone()"})
  public void testClone() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap.clone());
  }

  /**
   * Test {@link Flat3Map#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@code 97437268} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.containsKey(Object)"})
  public void testContainsKey_givenFlat3Map97437268IsNull_whenNull_thenReturnFalse() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(97437268, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@code 97437268} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.containsKey(Object)"})
  public void testContainsKey_givenFlat3Map97437268IsNull_whenNull_thenReturnTrue() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(97437268, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.containsKey(Object)"})
  public void testContainsKey_givenFlat3MapNullIsNull_whenNull_thenReturnFalse() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(null));
  }

  /**
   * Test {@link Flat3Map#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.containsKey(Object)"})
  public void testContainsKey_givenFlat3MapNullIsNull_whenNull_thenReturnTrue() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@code null} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.containsKey(Object)"})
  public void testContainsKey_givenFlat3MapNullIsNull_whenNull_thenReturnTrue2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(null, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(null));
  }

  /**
   * Test {@link Flat3Map#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@code null} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.containsKey(Object)"})
  public void testContainsKey_givenFlat3MapNullIsNull_whenNull_thenReturnTrue3() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(null, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(null));
  }

  /**
   * Test {@link Flat3Map#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} one is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.containsKey(Object)"})
  public void testContainsKey_givenFlat3MapOneIsNull_whenNull_thenReturnFalse() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} one is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.containsKey(Object)"})
  public void testContainsKey_givenFlat3MapOneIsNull_whenNull_thenReturnFalse2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(null));
  }

  /**
   * Test {@link Flat3Map#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} one is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.containsKey(Object)"})
  public void testContainsKey_givenFlat3MapOneIsNull_whenNull_thenReturnTrue() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} one is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When one.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.containsKey(Object)"})
  public void testContainsKey_givenFlat3MapOneIsNull_whenOne_thenReturnTrue() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsKey(1));
  }

  /**
   * Test {@link Flat3Map#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.containsKey(Object)"})
  public void testContainsKey_givenFlat3Map_whenNull_thenReturnFalse() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#containsKey(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#containsKey(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.containsKey(Object)"})
  public void testContainsKey_givenFlat3Map_whenNull_thenReturnFalse2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsKey(null));
  }

  /**
   * Test {@link Flat3Map#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@code Key} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.containsValue(Object)"})
  public void testContainsValue_givenFlat3MapKeyIsNull_whenNull_thenReturnFalse() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put("Key", AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(null));
  }

  /**
   * Test {@link Flat3Map#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@code Key} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.containsValue(Object)"})
  public void testContainsValue_givenFlat3MapKeyIsNull_whenNull_thenReturnTrue() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put("Key", AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is forty-two.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.containsValue(Object)"})
  public void testContainsValue_givenFlat3MapNullIsFortyTwo_whenNull_thenReturnFalse() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, 42);

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is forty-two.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.containsValue(Object)"})
  public void testContainsValue_givenFlat3MapNullIsFortyTwo_whenNull_thenReturnTrue() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put("Key", AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, 42);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.containsValue(Object)"})
  public void testContainsValue_givenFlat3MapNullIsNull_whenNull_thenReturnFalse() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(null));
  }

  /**
   * Test {@link Flat3Map#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.containsValue(Object)"})
  public void testContainsValue_givenFlat3MapNullIsNull_whenNull_thenReturnTrue() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is {@code null}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.containsValue(Object)"})
  public void testContainsValue_givenFlat3MapNullIsNull_whenNull_thenReturnTrue2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, null);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(null));
  }

  /**
   * Test {@link Flat3Map#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is {@code null}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.containsValue(Object)"})
  public void testContainsValue_givenFlat3MapNullIsNull_whenNull_thenReturnTrue3() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put("Key", AbstractHashedMap.NULL);
    objectObjectMap.put(AbstractHashedMap.NULL, null);

    // Act and Assert
    assertTrue(objectObjectMap.containsValue(null));
  }

  /**
   * Test {@link Flat3Map#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.containsValue(Object)"})
  public void testContainsValue_givenFlat3Map_whenNull_thenReturnFalse() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#containsValue(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#containsValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.containsValue(Object)"})
  public void testContainsValue_givenFlat3Map_whenNull_thenReturnFalse2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertFalse(objectObjectMap.containsValue(null));
  }

  /**
   * Test {@link Flat3Map#createDelegateMap()}.
   * <p>
   * Method under test: {@link Flat3Map#createDelegateMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"AbstractHashedMap Flat3Map.createDelegateMap()"})
  public void testCreateDelegateMap() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap.createDelegateMap());
  }

  /**
   * Test {@link Flat3Map#entrySet()}.
   * <p>
   * Method under test: {@link Flat3Map#entrySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set Flat3Map.entrySet()"})
  public void testEntrySet() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertTrue(objectObjectMap.entrySet().isEmpty());
  }

  /**
   * Test {@link Flat3Map#equals(Object)}, and {@link Flat3Map#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Flat3Map#equals(Object)}
   *   <li>{@link Flat3Map#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.equals(Object)", "int Flat3Map.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    Flat3Map<Object, Object> objectObjectMap2 = new Flat3Map<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap2.hashCode());
  }

  /**
   * Test {@link Flat3Map#equals(Object)}, and {@link Flat3Map#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Flat3Map#equals(Object)}
   *   <li>{@link Flat3Map#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.equals(Object)", "int Flat3Map.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    Flat3Map<Object, Object> objectObjectMap2 = new Flat3Map<>();
    objectObjectMap2.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap2.hashCode());
  }

  /**
   * Test {@link Flat3Map#equals(Object)}, and {@link Flat3Map#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Flat3Map#equals(Object)}
   *   <li>{@link Flat3Map#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.equals(Object)", "int Flat3Map.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(null, AbstractHashedMap.NULL);

    Flat3Map<Object, Object> objectObjectMap2 = new Flat3Map<>();
    objectObjectMap2.put(null, AbstractHashedMap.NULL);

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap2);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap2.hashCode());
  }

  /**
   * Test {@link Flat3Map#equals(Object)}, and {@link Flat3Map#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Flat3Map#equals(Object)}
   *   <li>{@link Flat3Map#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.equals(Object)", "int Flat3Map.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertEquals(objectObjectMap, objectObjectMap);
    int expectedHashCodeResult = objectObjectMap.hashCode();
    assertEquals(expectedHashCodeResult, objectObjectMap.hashCode());
  }

  /**
   * Test {@link Flat3Map#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.equals(Object)", "int Flat3Map.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, new Flat3Map<>());
  }

  /**
   * Test {@link Flat3Map#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.equals(Object)", "int Flat3Map.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    Flat3Map<Object, Object> objectObjectMap2 = new Flat3Map<>();
    objectObjectMap2.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, objectObjectMap2);
  }

  /**
   * Test {@link Flat3Map#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.equals(Object)", "int Flat3Map.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(null, AbstractHashedMap.NULL);

    Flat3Map<Object, Object> objectObjectMap2 = new Flat3Map<>();
    objectObjectMap2.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, objectObjectMap2);
  }

  /**
   * Test {@link Flat3Map#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.equals(Object)", "int Flat3Map.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(97437268, AbstractHashedMap.NULL);

    Flat3Map<Object, Object> objectObjectMap2 = new Flat3Map<>();
    objectObjectMap2.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, objectObjectMap2);
  }

  /**
   * Test {@link Flat3Map#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.equals(Object)", "int Flat3Map.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, 42);

    Flat3Map<Object, Object> objectObjectMap2 = new Flat3Map<>();
    objectObjectMap2.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNotEquals(objectObjectMap, objectObjectMap2);
  }

  /**
   * Test {@link Flat3Map#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.equals(Object)", "int Flat3Map.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, null);
  }

  /**
   * Test {@link Flat3Map#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.equals(Object)", "int Flat3Map.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertNotEquals(objectObjectMap, "Different type to Flat3Map");
  }

  /**
   * Test {@link Flat3Map#get(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@code 97437268} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object Flat3Map.get(Object)"})
  public void testGet_givenFlat3Map97437268IsNull_whenNull_thenReturnNull() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(97437268, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#get(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@code 97437268} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@link AbstractHashedMap#NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object Flat3Map.get(Object)"})
  public void testGet_givenFlat3Map97437268IsNull_whenNull_thenReturnNull2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(97437268, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertSame(object, objectObjectMap.get(object));
  }

  /**
   * Test {@link Flat3Map#get(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@link AbstractHashedMap#NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object Flat3Map.get(Object)"})
  public void testGet_givenFlat3MapNullIsNull_whenNull_thenReturnNull() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertSame(object, objectObjectMap.get(object));
  }

  /**
   * Test {@link Flat3Map#get(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object Flat3Map.get(Object)"})
  public void testGet_givenFlat3MapNullIsNull_whenNull_thenReturnNull2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.get(null));
  }

  /**
   * Test {@link Flat3Map#get(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} one is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object Flat3Map.get(Object)"})
  public void testGet_givenFlat3MapOneIsNull_whenNull_thenReturnNull() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#get(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} one is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@link AbstractHashedMap#NULL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object Flat3Map.get(Object)"})
  public void testGet_givenFlat3MapOneIsNull_whenNull_thenReturnNull2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);
    Object object = AbstractHashedMap.NULL;

    // Act and Assert
    assertSame(object, objectObjectMap.get(object));
  }

  /**
   * Test {@link Flat3Map#get(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} one is {@link AbstractHashedMap#NULL}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object Flat3Map.get(Object)"})
  public void testGet_givenFlat3MapOneIsNull_whenNull_thenReturnNull3() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    objectObjectMap.put(1, AbstractHashedMap.NULL);

    // Act and Assert
    assertNull(objectObjectMap.get(null));
  }

  /**
   * Test {@link Flat3Map#get(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()}.</li>
   *   <li>When {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object Flat3Map.get(Object)"})
  public void testGet_givenFlat3Map_whenNull_thenReturnNull() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertNull(objectObjectMap.get(AbstractHashedMap.NULL));
  }

  /**
   * Test {@link Flat3Map#get(Object)}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object Flat3Map.get(Object)"})
  public void testGet_givenFlat3Map_whenNull_thenReturnNull2() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertNull(objectObjectMap.get(null));
  }

  /**
   * Test {@link Flat3Map#isEmpty()}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()} {@link AbstractHashedMap#NULL} is {@link AbstractHashedMap#NULL}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.isEmpty()"})
  public void testIsEmpty_givenFlat3MapNullIsNull_thenReturnFalse() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();
    objectObjectMap.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);

    // Act and Assert
    assertFalse(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link Flat3Map#isEmpty()}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#isEmpty()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean Flat3Map.isEmpty()"})
  public void testIsEmpty_givenFlat3Map_thenReturnTrue() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertTrue(objectObjectMap.isEmpty());
  }

  /**
   * Test {@link Flat3Map#keySet()}.
   * <p>
   * Method under test: {@link Flat3Map#keySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set Flat3Map.keySet()"})
  public void testKeySet() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertTrue(objectObjectMap.keySet().isEmpty());
  }

  /**
   * Test {@link Flat3Map#size()}.
   * <p>
   * Method under test: {@link Flat3Map#size()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int Flat3Map.size()"})
  public void testSize() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertEquals(0, objectObjectMap.size());
  }

  /**
   * Test {@link Flat3Map#toString()}.
   * <ul>
   *   <li>Given {@link Flat3Map#Flat3Map()}.</li>
   *   <li>Then return {@code {}}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Flat3Map#toString()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String Flat3Map.toString()"})
  public void testToString_givenFlat3Map_thenReturnLeftCurlyBracketRightCurlyBracket() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertEquals("{}", objectObjectMap.toString());
  }

  /**
   * Test {@link Flat3Map#values()}.
   * <p>
   * Method under test: {@link Flat3Map#values()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Collection Flat3Map.values()"})
  public void testValues() {
    // Arrange
    Flat3Map<Object, Object> objectObjectMap = new Flat3Map<>();

    // Act and Assert
    assertTrue(objectObjectMap.values().isEmpty());
  }

  /**
   * Test ValuesIterator {@link ValuesIterator#ValuesIterator(Flat3Map)}.
   * <p>
   * Method under test: {@link ValuesIterator#ValuesIterator(Flat3Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void ValuesIterator.<init>(Flat3Map)"})
  public void testValuesIteratorNewValuesIterator() {
    // Arrange and Act
    ValuesIterator<Object> actualValuesIterator = new ValuesIterator<>(new Flat3Map<>());

    // Assert
    assertFalse(actualValuesIterator.hasNext());
  }

  /**
   * Test ValuesIterator {@link ValuesIterator#next()}.
   * <ul>
   *   <li>Then not {@link ValuesIterator#ValuesIterator(Flat3Map)} with parent is {@link Flat3Map#Flat3Map()} hasNext.</li>
   * </ul>
   * <p>
   * Method under test: {@link ValuesIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ValuesIterator.next()"})
  public void testValuesIteratorNext_thenNotValuesIteratorWithParentIsFlat3MapHasNext() {
    // Arrange
    Flat3Map<Object, Object> parent = new Flat3Map<>();
    parent.put(AbstractHashedMap.NULL, AbstractHashedMap.NULL);
    ValuesIterator<Object> valuesIterator = new ValuesIterator<>(parent);

    // Act
    valuesIterator.next();

    // Assert
    assertFalse(valuesIterator.hasNext());
  }

  /**
   * Test Values {@link Values#Values(Flat3Map)}.
   * <p>
   * Method under test: {@link Values#Values(Flat3Map)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void Values.<init>(Flat3Map)"})
  public void testValuesNewValues() {
    // Arrange and Act
    Values<Object> actualValues = new Values<>(new Flat3Map<>());

    // Assert
    assertTrue(actualValues.isEmpty());
  }
}
