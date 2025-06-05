package org.apache.commons.collections4.set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.collections4.set.CompositeSet.SetMutator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CompositeSetDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompositeSet#CompositeSet()}
   *   <li>{@link CompositeSet#setMutator(SetMutator)}
   *   <li>{@link CompositeSet#getMutator()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeSet.<init>()", "SetMutator CompositeSet.getMutator()",
      "void CompositeSet.setMutator(SetMutator)"})
  void testGettersAndSetters() {
    // Arrange and Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>();
    actualObjectSet.setMutator(null);

    // Assert
    assertNull(actualObjectSet.getMutator());
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set[])}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then throw {@link UnsupportedOperationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#CompositeSet(Set[])}
   */
  @Test
  @DisplayName("Test new CompositeSet(Set[]); given '42'; then throw UnsupportedOperationException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeSet.<init>(Set[])"})
  void testNewCompositeSet_given42_thenThrowUnsupportedOperationException() {
    // Arrange
    HashSet<Object> objectSet = new HashSet<>();
    objectSet.add("42");

    HashSet<Object> objectSet2 = new HashSet<>();
    objectSet2.add("42");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> new CompositeSet<>(objectSet, objectSet2));
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#CompositeSet(Set)}
   */
  @Test
  @DisplayName("Test new CompositeSet(Set); given '42'; when HashSet() add '42'; then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeSet.<init>(Set)"})
  void testNewCompositeSet_given42_whenHashSetAdd42_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act and Assert
    assertEquals(set, new CompositeSet<>(set));
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set[])}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#CompositeSet(Set[])}
   */
  @Test
  @DisplayName("Test new CompositeSet(Set[]); given '42'; when HashSet() add '42'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeSet.<init>(Set[])"})
  void testNewCompositeSet_given42_whenHashSetAdd42_thenReturnSizeIsOne() {
    // Arrange
    HashSet<Object> objectSet = new HashSet<>();
    objectSet.add("42");

    // Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>(objectSet, new HashSet<>());

    // Assert
    assertEquals(1, actualObjectSet.size());
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#CompositeSet(Set)}
   */
  @Test
  @DisplayName("Test new CompositeSet(Set); given two; when HashSet() add two; then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeSet.<init>(Set)"})
  void testNewCompositeSet_givenTwo_whenHashSetAddTwo_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act and Assert
    assertEquals(set, new CompositeSet<>(set));
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set[])}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()} and {@link HashSet#HashSet()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#CompositeSet(Set[])}
   */
  @Test
  @DisplayName("Test new CompositeSet(Set[]); when HashSet() and HashSet(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeSet.<init>(Set[])"})
  void testNewCompositeSet_whenHashSetAndHashSet_thenReturnEmpty() {
    // Arrange
    HashSet<Object> objectSet = new HashSet<>();

    // Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>(objectSet, new HashSet<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set[])}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#CompositeSet(Set[])}
   */
  @Test
  @DisplayName("Test new CompositeSet(Set[]); when HashSet(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeSet.<init>(Set[])"})
  void testNewCompositeSet_whenHashSet_thenReturnEmpty() {
    // Arrange and Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>(new HashSet<>());

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set)}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then return {@link HashSet#HashSet()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#CompositeSet(Set)}
   */
  @Test
  @DisplayName("Test new CompositeSet(Set); when HashSet(); then return HashSet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeSet.<init>(Set)"})
  void testNewCompositeSet_whenHashSet_thenReturnHashSet() {
    // Arrange
    HashSet<Object> set = new HashSet<>();

    // Act and Assert
    assertEquals(set, new CompositeSet<>(set));
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#CompositeSet(Set)}
   */
  @Test
  @DisplayName("Test new CompositeSet(Set); when 'null'; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeSet.<init>(Set)"})
  void testNewCompositeSet_whenNull_thenReturnEmpty() {
    // Arrange and Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>((Set<Object>) null);

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#CompositeSet(Set[])}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#CompositeSet(Set[])}
   */
  @Test
  @DisplayName("Test new CompositeSet(Set[]); when 'null'; then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeSet.<init>(Set[])"})
  void testNewCompositeSet_whenNull_thenReturnEmpty2() {
    // Arrange and Act
    CompositeSet<Object> actualObjectSet = new CompositeSet<>((Set<Object>[]) null);

    // Assert
    assertTrue(actualObjectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#add(Object)}.
   * <p>
   * Method under test: {@link CompositeSet#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompositeSet.add(Object)"})
  void testAdd() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectSet.add("Obj"));
  }

  /**
   * Test {@link CompositeSet#addAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#addAll(Collection)}
   */
  @Test
  @DisplayName("Test addAll(Collection); given '42'; when ArrayList() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompositeSet.addAll(Collection)"})
  void testAddAll_given42_whenArrayListAdd42() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectSet.addAll(coll));
  }

  /**
   * Test {@link CompositeSet#addAll(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#addAll(Collection)}
   */
  @Test
  @DisplayName("Test addAll(Collection); given '42'; when ArrayList() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompositeSet.addAll(Collection)"})
  void testAddAll_given42_whenArrayListAdd422() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectSet.addAll(coll));
  }

  /**
   * Test {@link CompositeSet#addAll(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#addAll(Collection)}
   */
  @Test
  @DisplayName("Test addAll(Collection); when ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompositeSet.addAll(Collection)"})
  void testAddAll_whenArrayList() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> objectSet.addAll(new ArrayList<>()));
  }

  /**
   * Test {@link CompositeSet#addComposited(Set, Set)} with {@code set1}, {@code set2}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then {@link CompositeSet#CompositeSet()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#addComposited(Set, Set)}
   */
  @Test
  @DisplayName("Test addComposited(Set, Set) with 'set1', 'set2'; when HashSet(); then CompositeSet() Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeSet.addComposited(Set, Set)"})
  void testAddCompositedWithSet1Set2_whenHashSet_thenCompositeSetEmpty() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    HashSet<Object> set1 = new HashSet<>();

    // Act
    objectSet.addComposited(set1, new HashSet<>());

    // Assert that nothing has changed
    assertTrue(objectSet.isEmpty());
    assertEquals(objectSet, set1);
  }

  /**
   * Test {@link CompositeSet#addComposited(Set)} with {@code set}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.</li>
   *   <li>Then {@link CompositeSet#CompositeSet()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#addComposited(Set)}
   */
  @Test
  @DisplayName("Test addComposited(Set) with 'set'; given '42'; when HashSet() add '42'; then CompositeSet() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeSet.addComposited(Set)"})
  void testAddCompositedWithSet_given42_whenHashSetAdd42_thenCompositeSetSizeIsOne() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    HashSet<Object> set = new HashSet<>();
    set.add("42");

    // Act
    objectSet.addComposited(set);

    // Assert
    assertEquals(1, objectSet.size());
    assertEquals(objectSet, set);
  }

  /**
   * Test {@link CompositeSet#addComposited(Set)} with {@code set}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link HashSet#HashSet()} add two.</li>
   *   <li>Then {@link CompositeSet#CompositeSet()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#addComposited(Set)}
   */
  @Test
  @DisplayName("Test addComposited(Set) with 'set'; given two; when HashSet() add two; then CompositeSet() size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeSet.addComposited(Set)"})
  void testAddCompositedWithSet_givenTwo_whenHashSetAddTwo_thenCompositeSetSizeIsTwo() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    HashSet<Object> set = new HashSet<>();
    set.add(2);
    set.add("42");

    // Act
    objectSet.addComposited(set);

    // Assert
    assertEquals(2, objectSet.size());
    assertEquals(objectSet, set);
  }

  /**
   * Test {@link CompositeSet#addComposited(Set)} with {@code set}.
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.</li>
   *   <li>Then {@link CompositeSet#CompositeSet()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#addComposited(Set)}
   */
  @Test
  @DisplayName("Test addComposited(Set) with 'set'; when HashSet(); then CompositeSet() Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeSet.addComposited(Set)"})
  void testAddCompositedWithSet_whenHashSet_thenCompositeSetEmpty() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    HashSet<Object> set = new HashSet<>();

    // Act
    objectSet.addComposited(set);

    // Assert that nothing has changed
    assertTrue(objectSet.isEmpty());
    assertEquals(objectSet, set);
  }

  /**
   * Test {@link CompositeSet#addComposited(Set)} with {@code set}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then {@link CompositeSet#CompositeSet()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#addComposited(Set)}
   */
  @Test
  @DisplayName("Test addComposited(Set) with 'set'; when 'null'; then CompositeSet() Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void CompositeSet.addComposited(Set)"})
  void testAddCompositedWithSet_whenNull_thenCompositeSetEmpty() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act
    objectSet.addComposited((Set<Object>) null);

    // Assert that nothing has changed
    assertTrue(objectSet.isEmpty());
  }

  /**
   * Test {@link CompositeSet#equals(Object)}, and {@link CompositeSet#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompositeSet#equals(Object)}
   *   <li>{@link CompositeSet#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompositeSet.equals(Object)", "int CompositeSet.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    CompositeSet<Object> objectSet2 = new CompositeSet<>();

    // Act and Assert
    assertEquals(objectSet, objectSet2);
    int expectedHashCodeResult = objectSet.hashCode();
    assertEquals(expectedHashCodeResult, objectSet2.hashCode());
  }

  /**
   * Test {@link CompositeSet#equals(Object)}, and {@link CompositeSet#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompositeSet#equals(Object)}
   *   <li>{@link CompositeSet#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompositeSet.equals(Object)", "int CompositeSet.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());
    CompositeSet<Object> objectSet2 = new CompositeSet<>();

    // Act and Assert
    assertEquals(objectSet, objectSet2);
    int expectedHashCodeResult = objectSet.hashCode();
    assertEquals(expectedHashCodeResult, objectSet2.hashCode());
  }

  /**
   * Test {@link CompositeSet#equals(Object)}, and {@link CompositeSet#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompositeSet#equals(Object)}
   *   <li>{@link CompositeSet#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompositeSet.equals(Object)", "int CompositeSet.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(new HashSet<>());
    objectSet.addComposited(new HashSet<>());
    CompositeSet<Object> objectSet2 = new CompositeSet<>();

    // Act and Assert
    assertEquals(objectSet, objectSet2);
    int expectedHashCodeResult = objectSet.hashCode();
    assertEquals(expectedHashCodeResult, objectSet2.hashCode());
  }

  /**
   * Test {@link CompositeSet#equals(Object)}, and {@link CompositeSet#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompositeSet#equals(Object)}
   *   <li>{@link CompositeSet#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompositeSet.equals(Object)", "int CompositeSet.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertEquals(objectSet, objectSet);
    int expectedHashCodeResult = objectSet.hashCode();
    assertEquals(expectedHashCodeResult, objectSet.hashCode());
  }

  /**
   * Test {@link CompositeSet#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompositeSet.equals(Object)", "int CompositeSet.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HashSet<Object> set = new HashSet<>();
    set.add("42");

    CompositeSet<Object> objectSet = new CompositeSet<>();
    objectSet.addComposited(set);

    // Act and Assert
    assertNotEquals(objectSet, new CompositeSet<>());
  }

  /**
   * Test {@link CompositeSet#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompositeSet.equals(Object)", "int CompositeSet.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertNotEquals(objectSet, null);
  }

  /**
   * Test {@link CompositeSet#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompositeSet#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean CompositeSet.equals(Object)", "int CompositeSet.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    CompositeSet<Object> objectSet = new CompositeSet<>();

    // Act and Assert
    assertNotEquals(objectSet, "Different type to CompositeSet");
  }
}
