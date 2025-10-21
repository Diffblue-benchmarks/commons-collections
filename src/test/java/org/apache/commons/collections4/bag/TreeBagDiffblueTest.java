package org.apache.commons.collections4.bag;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TreeBagDiffblueTest {
  /**
   * Test {@link TreeBag#TreeBag()}.
   * <p>
   * Method under test: {@link TreeBag#TreeBag()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBag.<init>()"})
  public void testNewTreeBag() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBag.<init>(Comparator)"})
  public void testNewTreeBag2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBag.<init>(Iterable)"})
  public void testNewTreeBag_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBag.<init>(Collection)"})
  public void testNewTreeBag_given42_whenArrayListAdd42_thenReturnSizeIsOne2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBag.<init>(Iterable)"})
  public void testNewTreeBag_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBag.<init>(Collection)"})
  public void testNewTreeBag_given42_whenArrayListAdd42_thenReturnSizeIsTwo2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBag.<init>(Iterable)"})
  public void testNewTreeBag_givenHashMap_thenThrowIllegalArgumentException() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBag.<init>(Collection)"})
  public void testNewTreeBag_givenHashMap_thenThrowIllegalArgumentException2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBag.<init>(Iterable)"})
  public void testNewTreeBag_whenArrayList_thenReturnEmpty() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TreeBag.<init>(Collection)"})
  public void testNewTreeBag_whenArrayList_thenReturnEmpty2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeBag.add(Object)"})
  public void testAddWithObject_givenTreeBagAddObject_whenObject_thenTreeBagSizeIsTwo() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeBag.add(Object)"})
  public void testAddWithObject_givenTreeBag_whenObject_thenTreeBagSizeIsOne() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean TreeBag.add(Object)"})
  public void testAddWithObject_whenTreeMap_thenThrowIllegalArgumentException() {
    // Arrange
    TreeBag<Object> treeBag = new TreeBag<>();
    treeBag.add(2);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> treeBag.add(new TreeMap<>()));
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TreeBag.first()"})
  public void testFirst_givenTreeBagAddObject_thenReturnObject() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.SortedMap TreeBag.getMap()"})
  public void testGetMap() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object TreeBag.last()"})
  public void testLast_givenTreeBagAddObject_thenReturnObject() {
    // Arrange
    TreeBag<Object> treeBag = new TreeBag<>();
    treeBag.add("Object");

    // Act and Assert
    assertEquals("Object", treeBag.last());
  }
}
