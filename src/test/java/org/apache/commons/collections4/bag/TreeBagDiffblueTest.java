package org.apache.commons.collections4.bag;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TreeBagDiffblueTest {
  /**
   * Test {@link TreeBag#TreeBag()}.
   * <p>
   * Method under test: {@link TreeBag#TreeBag()}
   */
  @Test
  @DisplayName("Test new TreeBag()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TreeBag.<init>()"})
  void testNewTreeBag() {
    // Arrange and Act
    TreeBag<Object> actualTreeBag = new TreeBag<>();

    // Assert
    assertTrue(actualTreeBag.isEmpty());
  }

  /**
   * Test {@link TreeBag#TreeBag(Comparator)}.
   * <p>
   * Method under test: {@link TreeBag#TreeBag(Comparator)}
   */
  @Test
  @DisplayName("Test new TreeBag(Comparator)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TreeBag.<init>(Comparator)"})
  void testNewTreeBag2() {
    // Arrange and Act
    TreeBag<Object> actualTreeBag = new TreeBag<>(mock(Comparator.class));

    // Assert
    assertTrue(actualTreeBag.isEmpty());
  }

  /**
   * Test {@link TreeBag#TreeBag(Iterable)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBag#TreeBag(Iterable)}
   */
  @Test
  @DisplayName("Test new TreeBag(Iterable); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TreeBag.<init>(Iterable)"})
  void testNewTreeBag_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act
    TreeBag<Object> actualTreeBag = new TreeBag<>((Iterable<?>) iterable);

    // Assert
    assertEquals(1, actualTreeBag.size());
  }

  /**
   * Test {@link TreeBag#TreeBag(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBag#TreeBag(Collection)}
   */
  @Test
  @DisplayName("Test new TreeBag(Collection); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TreeBag.<init>(Collection)"})
  void testNewTreeBag_given42_whenArrayListAdd42_thenReturnSizeIsOne2() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    TreeBag<Object> actualTreeBag = new TreeBag<>(coll);

    // Assert
    assertEquals(1, actualTreeBag.size());
  }

  /**
   * Test {@link TreeBag#TreeBag(Iterable)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBag#TreeBag(Iterable)}
   */
  @Test
  @DisplayName("Test new TreeBag(Iterable); given '42'; when ArrayList() add '42'; then return size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TreeBag.<init>(Iterable)"})
  void testNewTreeBag_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");

    // Act
    TreeBag<Object> actualTreeBag = new TreeBag<>((Iterable<?>) iterable);

    // Assert
    assertEquals(2, actualTreeBag.size());
  }

  /**
   * Test {@link TreeBag#TreeBag(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBag#TreeBag(Collection)}
   */
  @Test
  @DisplayName("Test new TreeBag(Collection); given '42'; when ArrayList() add '42'; then return size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TreeBag.<init>(Collection)"})
  void testNewTreeBag_given42_whenArrayListAdd42_thenReturnSizeIsTwo2() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    TreeBag<Object> actualTreeBag = new TreeBag<>(coll);

    // Assert
    assertEquals(2, actualTreeBag.size());
  }

  /**
   * Test {@link TreeBag#TreeBag(Iterable)}.
   * <ul>
   *   <li>Given {@link HashMap#HashMap()}.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBag#TreeBag(Iterable)}
   */
  @Test
  @DisplayName("Test new TreeBag(Iterable); given HashMap(); then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TreeBag.<init>(Iterable)"})
  void testNewTreeBag_givenHashMap_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new TreeBag<>((Iterable<?>) iterable));
  }

  /**
   * Test {@link TreeBag#TreeBag(Collection)}.
   * <ul>
   *   <li>Given {@link HashMap#HashMap()}.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBag#TreeBag(Collection)}
   */
  @Test
  @DisplayName("Test new TreeBag(Collection); given HashMap(); then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TreeBag.<init>(Collection)"})
  void testNewTreeBag_givenHashMap_thenThrowIllegalArgumentException2() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new TreeBag<>(coll));
  }

  /**
   * Test {@link TreeBag#TreeBag(Iterable)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBag#TreeBag(Iterable)}
   */
  @Test
  @DisplayName("Test new TreeBag(Iterable); when ArrayList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TreeBag.<init>(Iterable)"})
  void testNewTreeBag_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    TreeBag<Object> actualTreeBag = new TreeBag<>((Iterable<?>) new ArrayList<>());

    // Assert
    assertTrue(actualTreeBag.isEmpty());
  }

  /**
   * Test {@link TreeBag#TreeBag(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBag#TreeBag(Collection)}
   */
  @Test
  @DisplayName("Test new TreeBag(Collection); when ArrayList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void TreeBag.<init>(Collection)"})
  void testNewTreeBag_whenArrayList_thenReturnEmpty2() {
    // Arrange and Act
    TreeBag<Object> actualTreeBag = new TreeBag<>(new ArrayList<>());

    // Assert
    assertTrue(actualTreeBag.isEmpty());
  }

  /**
   * Test {@link TreeBag#add(Object)} with {@code object}.
   * <ul>
   *   <li>Given {@link TreeBag#TreeBag()} add {@code Object}.</li>
   *   <li>When {@code Object}.</li>
   *   <li>Then {@link TreeBag#TreeBag()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBag#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object) with 'object'; given TreeBag() add 'Object'; when 'Object'; then TreeBag() size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TreeBag.add(Object)"})
  void testAddWithObject_givenTreeBagAddObject_whenObject_thenTreeBagSizeIsTwo() {
    // Arrange
    TreeBag<Object> treeBag = new TreeBag<>();
    treeBag.add("Object");

    // Act
    boolean actualAddResult = treeBag.add("Object");

    // Assert
    assertEquals(2, treeBag.size());
    assertFalse(actualAddResult);
  }

  /**
   * Test {@link TreeBag#add(Object)} with {@code object}.
   * <ul>
   *   <li>Given {@link TreeBag#TreeBag()}.</li>
   *   <li>When {@code Object}.</li>
   *   <li>Then {@link TreeBag#TreeBag()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBag#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object) with 'object'; given TreeBag(); when 'Object'; then TreeBag() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TreeBag.add(Object)"})
  void testAddWithObject_givenTreeBag_whenObject_thenTreeBagSizeIsOne() {
    // Arrange
    TreeBag<Object> treeBag = new TreeBag<>();

    // Act
    boolean actualAddResult = treeBag.add("Object");

    // Assert
    assertEquals(1, treeBag.size());
    assertTrue(actualAddResult);
  }

  /**
   * Test {@link TreeBag#add(Object)} with {@code object}.
   * <ul>
   *   <li>When {@link TreeMap#TreeMap()}.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBag#add(Object)}
   */
  @Test
  @DisplayName("Test add(Object) with 'object'; when TreeMap(); then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean TreeBag.add(Object)"})
  void testAddWithObject_whenTreeMap_thenThrowIllegalArgumentException() {
    // Arrange
    TreeBag<Object> treeBag = new TreeBag<>();
    treeBag.add(2);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> treeBag.add(new TreeMap<>()));
  }

  /**
   * Test {@link TreeBag#comparator()}.
   * <ul>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBag#comparator()}
   */
  @Test
  @DisplayName("Test comparator(); then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Comparator TreeBag.comparator()"})
  void testComparator_thenReturnNull() {
    // Arrange
    TreeBag<Object> treeBag = new TreeBag<>();

    // Act and Assert
    assertNull(treeBag.comparator());
  }

  /**
   * Test {@link TreeBag#first()}.
   * <ul>
   *   <li>Given {@link TreeBag#TreeBag()} add {@code Object}.</li>
   *   <li>Then return {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBag#first()}
   */
  @Test
  @DisplayName("Test first(); given TreeBag() add 'Object'; then return 'Object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object TreeBag.first()"})
  void testFirst_givenTreeBagAddObject_thenReturnObject() {
    // Arrange
    TreeBag<Object> treeBag = new TreeBag<>();
    treeBag.add("Object");

    // Act and Assert
    assertEquals("Object", treeBag.first());
  }

  /**
   * Test {@link TreeBag#getMap()}.
   * <p>
   * Method under test: {@link TreeBag#getMap()}
   */
  @Test
  @DisplayName("Test getMap()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.SortedMap TreeBag.getMap()"})
  void testGetMap() {
    // Arrange
    TreeBag<Object> treeBag = new TreeBag<>();

    // Act and Assert
    assertTrue(treeBag.getMap().isEmpty());
  }

  /**
   * Test {@link TreeBag#last()}.
   * <ul>
   *   <li>Given {@link TreeBag#TreeBag()} add {@code Object}.</li>
   *   <li>Then return {@code Object}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TreeBag#last()}
   */
  @Test
  @DisplayName("Test last(); given TreeBag() add 'Object'; then return 'Object'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object TreeBag.last()"})
  void testLast_givenTreeBagAddObject_thenReturnObject() {
    // Arrange
    TreeBag<Object> treeBag = new TreeBag<>();
    treeBag.add("Object");

    // Act and Assert
    assertEquals("Object", treeBag.last());
  }
}
