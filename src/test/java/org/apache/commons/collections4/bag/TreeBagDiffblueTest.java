package org.apache.commons.collections4.bag;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeMap;
import org.junit.Test;

public class TreeBagDiffblueTest {
  /**
   * Method under test: {@link TreeBag#add(Object)}
   */
  @Test
  public void testAdd() {
    // Arrange
    TreeBag<Object> treeBag = new TreeBag<>();

    // Act
    boolean actualAddResult = treeBag.add("Object");

    // Assert
    assertEquals(1, treeBag.size());
    assertTrue(actualAddResult);
  }

  /**
   * Method under test: {@link TreeBag#add(Object)}
   */
  @Test
  public void testAdd2() {
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
   * Method under test: {@link TreeBag#add(Object)}
   */
  @Test
  public void testAdd3() {
    // Arrange
    TreeBag<Object> treeBag = new TreeBag<>();
    treeBag.add(2);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> treeBag.add(new TreeMap<>()));
  }

  /**
   * Method under test: {@link TreeBag#first()}
   */
  @Test
  public void testFirst() {
    // Arrange
    TreeBag<Object> treeBag = new TreeBag<>();
    treeBag.add("Object");

    // Act and Assert
    assertEquals("Object", treeBag.first());
  }

  /**
   * Method under test: {@link TreeBag#getMap()}
   */
  @Test
  public void testGetMap() {
    // Arrange
    TreeBag<Object> treeBag = new TreeBag<>();

    // Act and Assert
    assertTrue(treeBag.getMap().isEmpty());
  }

  /**
   * Method under test: {@link TreeBag#last()}
   */
  @Test
  public void testLast() {
    // Arrange
    TreeBag<Object> treeBag = new TreeBag<>();
    treeBag.add("Object");

    // Act and Assert
    assertEquals("Object", treeBag.last());
  }

  /**
   * Method under test: {@link TreeBag#TreeBag()}
   */
  @Test
  public void testNewTreeBag() {
    // Arrange and Act
    TreeBag<Object> actualTreeBag = new TreeBag<>();

    // Assert
    assertTrue(actualTreeBag.isEmpty());
  }

  /**
   * Method under test: {@link TreeBag#TreeBag(Iterable)}
   */
  @Test
  public void testNewTreeBag2() {
    // Arrange and Act
    TreeBag<Object> actualTreeBag = new TreeBag<>((Iterable<?>) new ArrayList<>());

    // Assert
    assertTrue(actualTreeBag.isEmpty());
  }

  /**
   * Method under test: {@link TreeBag#TreeBag(Iterable)}
   */
  @Test
  public void testNewTreeBag3() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act
    TreeBag<Object> actualTreeBag = new TreeBag<>((Iterable<?>) iterable);

    // Assert
    assertEquals(1, actualTreeBag.size());
  }

  /**
   * Method under test: {@link TreeBag#TreeBag(Iterable)}
   */
  @Test
  public void testNewTreeBag4() {
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
   * Method under test: {@link TreeBag#TreeBag(Iterable)}
   */
  @Test
  public void testNewTreeBag5() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new TreeBag<>((Iterable<?>) iterable));
  }

  /**
   * Method under test: {@link TreeBag#TreeBag(Collection)}
   */
  @Test
  public void testNewTreeBag6() {
    // Arrange and Act
    TreeBag<Object> actualTreeBag = new TreeBag<>(new ArrayList<>());

    // Assert
    assertTrue(actualTreeBag.isEmpty());
  }

  /**
   * Method under test: {@link TreeBag#TreeBag(Collection)}
   */
  @Test
  public void testNewTreeBag7() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    TreeBag<Object> actualTreeBag = new TreeBag<>(coll);

    // Assert
    assertEquals(1, actualTreeBag.size());
  }

  /**
   * Method under test: {@link TreeBag#TreeBag(Collection)}
   */
  @Test
  public void testNewTreeBag8() {
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
   * Method under test: {@link TreeBag#TreeBag(Collection)}
   */
  @Test
  public void testNewTreeBag9() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new TreeBag<>(coll));
  }
}
