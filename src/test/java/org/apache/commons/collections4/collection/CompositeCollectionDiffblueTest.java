package org.apache.commons.collections4.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.Test;

public class CompositeCollectionDiffblueTest {
  /**
   * Method under test: {@link CompositeCollection#add(Object)}
   */
  @Test
  public void testAdd() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> compositeCollection.add("Obj"));
  }

  /**
   * Method under test: {@link CompositeCollection#addAll(Collection)}
   */
  @Test
  public void testAddAll() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> compositeCollection.addAll(new ArrayList<>()));
  }

  /**
   * Method under test: {@link CompositeCollection#addAll(Collection)}
   */
  @Test
  public void testAddAll2() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> compositeCollection.addAll(coll));
  }

  /**
   * Method under test: {@link CompositeCollection#addAll(Collection)}
   */
  @Test
  public void testAddAll3() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> compositeCollection.addAll(coll));
  }

  /**
   * Method under test: {@link CompositeCollection#addComposited(Collection)}
   */
  @Test
  public void testAddComposited() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act
    compositeCollection.addComposited(new ArrayList<>());

    // Assert
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Method under test: {@link CompositeCollection#addComposited(Collection)}
   */
  @Test
  public void testAddComposited2() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act
    compositeCollection.addComposited((Collection<Object>) null);

    // Assert that nothing has changed
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Method under test: {@link CompositeCollection#addComposited(Collection)}
   */
  @Test
  public void testAddComposited3() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> compositeCollection2 = new ArrayList<>();
    compositeCollection2.add("42");

    // Act
    compositeCollection.addComposited(compositeCollection2);

    // Assert
    assertEquals(1, compositeCollection.size());
  }

  /**
   * Method under test: {@link CompositeCollection#addComposited(Collection)}
   */
  @Test
  public void testAddComposited4() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> compositeCollection2 = new ArrayList<>();
    compositeCollection2.add("42");
    compositeCollection2.add("42");

    // Act
    compositeCollection.addComposited(compositeCollection2);

    // Assert
    assertEquals(2, compositeCollection.size());
  }

  /**
   * Method under test:
   * {@link CompositeCollection#addComposited(Collection, Collection)}
   */
  @Test
  public void testAddComposited5() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    ArrayList<Object> compositeCollection1 = new ArrayList<>();

    // Act
    compositeCollection.addComposited(compositeCollection1, new ArrayList<>());

    // Assert
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Method under test:
   * {@link CompositeCollection#addComposited(Collection, Collection)}
   */
  @Test
  public void testAddComposited6() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act
    compositeCollection.addComposited(null, null);

    // Assert that nothing has changed
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Method under test:
   * {@link CompositeCollection#addComposited(Collection, Collection)}
   */
  @Test
  public void testAddComposited7() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> compositeCollection1 = new ArrayList<>();
    compositeCollection1.add("42");

    // Act
    compositeCollection.addComposited(compositeCollection1, new ArrayList<>());

    // Assert
    assertEquals(1, compositeCollection.size());
  }

  /**
   * Method under test:
   * {@link CompositeCollection#addComposited(Collection, Collection)}
   */
  @Test
  public void testAddComposited8() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> compositeCollection1 = new ArrayList<>();
    compositeCollection1.add("42");
    compositeCollection1.add("42");

    // Act
    compositeCollection.addComposited(compositeCollection1, new ArrayList<>());

    // Assert
    assertEquals(2, compositeCollection.size());
  }

  /**
   * Method under test:
   * {@link CompositeCollection#addComposited(Collection, Collection)}
   */
  @Test
  public void testAddComposited9() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    ArrayList<Object> compositeCollection1 = new ArrayList<>();

    ArrayList<Object> compositeCollection2 = new ArrayList<>();
    compositeCollection2.add("42");

    // Act
    compositeCollection.addComposited(compositeCollection1, compositeCollection2);

    // Assert
    assertEquals(1, compositeCollection.size());
  }

  /**
   * Method under test:
   * {@link CompositeCollection#addComposited(Collection, Collection)}
   */
  @Test
  public void testAddComposited10() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    ArrayList<Object> compositeCollection1 = new ArrayList<>();

    ArrayList<Object> compositeCollection2 = new ArrayList<>();
    compositeCollection2.add("42");
    compositeCollection2.add("42");

    // Act
    compositeCollection.addComposited(compositeCollection1, compositeCollection2);

    // Assert
    assertEquals(2, compositeCollection.size());
  }

  /**
   * Method under test: {@link CompositeCollection#contains(Object)}
   */
  @Test
  public void testContains() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertFalse(compositeCollection.contains("Obj"));
  }

  /**
   * Method under test: {@link CompositeCollection#contains(Object)}
   */
  @Test
  public void testContains2() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    compositeCollection.addComposited(new ArrayList<>());

    // Act and Assert
    assertFalse(compositeCollection.contains("Obj"));
  }

  /**
   * Method under test: {@link CompositeCollection#contains(Object)}
   */
  @Test
  public void testContains3() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add("42");

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>();
    compositeCollection2.addComposited(compositeCollection);

    // Act and Assert
    assertTrue(compositeCollection2.contains("42"));
  }

  /**
   * Method under test: {@link CompositeCollection#containsAll(Collection)}
   */
  @Test
  public void testContainsAll() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertTrue(compositeCollection.containsAll(new ArrayList<>()));
  }

  /**
   * Method under test: {@link CompositeCollection#containsAll(Collection)}
   */
  @Test
  public void testContainsAll2() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(compositeCollection.containsAll(coll));
  }

  /**
   * Method under test: {@link CompositeCollection#containsAll(Collection)}
   */
  @Test
  public void testContainsAll3() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(compositeCollection.containsAll(coll));
  }

  /**
   * Method under test: {@link CompositeCollection#getCollections()}
   */
  @Test
  public void testGetCollections() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertTrue(compositeCollection.getCollections().isEmpty());
  }

  /**
   * Method under test: {@link CompositeCollection#isEmpty()}
   */
  @Test
  public void testIsEmpty() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Method under test: {@link CompositeCollection#isEmpty()}
   */
  @Test
  public void testIsEmpty2() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    compositeCollection.addComposited(new ArrayList<>());

    // Act and Assert
    assertTrue(compositeCollection.isEmpty());
  }

  /**
   * Method under test: {@link CompositeCollection#isEmpty()}
   */
  @Test
  public void testIsEmpty3() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add("42");

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>();
    compositeCollection2.addComposited(compositeCollection);

    // Act and Assert
    assertFalse(compositeCollection2.isEmpty());
  }

  /**
   * Method under test: {@link CompositeCollection#remove(Object)}
   */
  @Test
  public void testRemove() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> compositeCollection.remove("Obj"));
  }

  /**
   * Method under test: {@link CompositeCollection#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertFalse(compositeCollection.removeAll(new ArrayList<>()));
  }

  /**
   * Method under test: {@link CompositeCollection#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll2() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(compositeCollection.removeAll(coll));
  }

  /**
   * Method under test: {@link CompositeCollection#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll3() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(compositeCollection.removeAll(coll));
  }

  /**
   * Method under test: {@link CompositeCollection#retainAll(Collection)}
   */
  @Test
  public void testRetainAll() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertFalse(compositeCollection.retainAll(new ArrayList<>()));
  }

  /**
   * Method under test: {@link CompositeCollection#retainAll(Collection)}
   */
  @Test
  public void testRetainAll2() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(compositeCollection.retainAll(coll));
  }

  /**
   * Method under test: {@link CompositeCollection#retainAll(Collection)}
   */
  @Test
  public void testRetainAll3() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(compositeCollection.retainAll(coll));
  }

  /**
   * Method under test: {@link CompositeCollection#size()}
   */
  @Test
  public void testSize() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertEquals(0, compositeCollection.size());
  }

  /**
   * Method under test: {@link CompositeCollection#size()}
   */
  @Test
  public void testSize2() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    compositeCollection.addComposited(new ArrayList<>());

    // Act and Assert
    assertEquals(0, compositeCollection.size());
  }

  /**
   * Method under test: {@link CompositeCollection#toArray()}
   */
  @Test
  public void testToArray() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act and Assert
    assertEquals(0, compositeCollection.toArray().length);
  }

  /**
   * Method under test: {@link CompositeCollection#toArray()}
   */
  @Test
  public void testToArray2() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    compositeCollection.addComposited(new ArrayList<>());

    // Act and Assert
    assertEquals(0, compositeCollection.toArray().length);
  }

  /**
   * Method under test: {@link CompositeCollection#toArray()}
   */
  @Test
  public void testToArray3() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add("42");

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>();
    compositeCollection2.addComposited(compositeCollection);

    // Act
    Object[] actualToArrayResult = compositeCollection2.toArray();

    // Assert
    assertEquals("42", actualToArrayResult[0]);
    assertEquals(1, actualToArrayResult.length);
  }

  /**
   * Method under test: {@link CompositeCollection#toArray(Object[])}
   */
  @Test
  public void testToArray4() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    Object[] array = new Object[]{"Array"};

    // Act
    Object[] actualToArrayResult = compositeCollection.toArray(array);

    // Assert
    assertNull(actualToArrayResult[0]);
    assertNull(array[0]);
    assertEquals(1, actualToArrayResult.length);
    assertEquals(1, array.length);
    assertSame(array, actualToArrayResult);
  }

  /**
   * Method under test: {@link CompositeCollection#toArray(Object[])}
   */
  @Test
  public void testToArray5() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    Object[] array = new Object[]{};

    // Act
    Object[] actualToArrayResult = compositeCollection.toArray(array);

    // Assert
    assertEquals(0, actualToArrayResult.length);
    assertSame(array, actualToArrayResult);
  }

  /**
   * Method under test: {@link CompositeCollection#toArray(Object[])}
   */
  @Test
  public void testToArray6() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    compositeCollection.addComposited(new ArrayList<>());
    Object[] array = new Object[]{"Array"};

    // Act
    Object[] actualToArrayResult = compositeCollection.toArray(array);

    // Assert
    assertNull(actualToArrayResult[0]);
    assertNull(array[0]);
    assertEquals(1, actualToArrayResult.length);
    assertEquals(1, array.length);
    assertSame(array, actualToArrayResult);
  }

  /**
   * Method under test: {@link CompositeCollection#toArray(Object[])}
   */
  @Test
  public void testToArray7() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add("42");

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>();
    compositeCollection2.addComposited(compositeCollection);
    Object[] array = new Object[]{"Array"};

    // Act
    Object[] actualToArrayResult = compositeCollection2.toArray(array);

    // Assert
    assertEquals("42", actualToArrayResult[0]);
    assertEquals("42", array[0]);
    assertEquals(1, actualToArrayResult.length);
    assertEquals(1, array.length);
    assertSame(array, actualToArrayResult);
  }

  /**
   * Method under test: {@link CompositeCollection#toArray(Object[])}
   */
  @Test
  public void testToArray8() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add("42");
    compositeCollection.add("42");

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>();
    compositeCollection2.addComposited(compositeCollection);
    Object[] array = new Object[]{"Array"};

    // Act
    Object[] actualToArrayResult = compositeCollection2.toArray(array);

    // Assert
    assertEquals("42", actualToArrayResult[0]);
    assertEquals("42", actualToArrayResult[1]);
    assertEquals("Array", array[0]);
    assertEquals(1, array.length);
    assertEquals(2, actualToArrayResult.length);
  }

  /**
   * Method under test: {@link CompositeCollection#toCollection()}
   */
  @Test
  public void testToCollection() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();

    // Act
    Collection<Object> actualToCollectionResult = compositeCollection.toCollection();

    // Assert
    assertTrue(actualToCollectionResult instanceof List);
    assertTrue(actualToCollectionResult.isEmpty());
  }

  /**
   * Method under test: {@link CompositeCollection#toCollection()}
   */
  @Test
  public void testToCollection2() {
    // Arrange
    CompositeCollection<Object> compositeCollection = new CompositeCollection<>();
    compositeCollection.addComposited(new ArrayList<>());

    // Act
    Collection<Object> actualToCollectionResult = compositeCollection.toCollection();

    // Assert
    assertTrue(actualToCollectionResult instanceof List);
    assertTrue(actualToCollectionResult.isEmpty());
  }

  /**
   * Method under test: {@link CompositeCollection#toCollection()}
   */
  @Test
  public void testToCollection3() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add("42");

    CompositeCollection<Object> compositeCollection2 = new CompositeCollection<>();
    compositeCollection2.addComposited(compositeCollection);

    // Act
    Collection<Object> actualToCollectionResult = compositeCollection2.toCollection();

    // Assert
    assertTrue(actualToCollectionResult instanceof List);
    assertEquals(1, actualToCollectionResult.size());
    assertEquals("42", ((List<Object>) actualToCollectionResult).get(0));
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link CompositeCollection#CompositeCollection()}
   *   <li>
   * {@link CompositeCollection#setMutator(CompositeCollection.CollectionMutator)}
   *   <li>{@link CompositeCollection#getMutator()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange and Act
    CompositeCollection<Object> actualCompositeCollection = new CompositeCollection<>();
    actualCompositeCollection.setMutator(null);
    actualCompositeCollection.getMutator();

    // Assert that nothing has changed
    assertTrue(actualCompositeCollection.isEmpty());
  }

  /**
   * Method under test:
   * {@link CompositeCollection#CompositeCollection(Collection)}
   */
  @Test
  public void testNewCompositeCollection() {
    // Arrange and Act
    CompositeCollection<Object> actualCompositeCollection = new CompositeCollection<>(new ArrayList<>());

    // Assert
    assertTrue(actualCompositeCollection.isEmpty());
  }

  /**
   * Method under test:
   * {@link CompositeCollection#CompositeCollection(Collection)}
   */
  @Test
  public void testNewCompositeCollection2() {
    // Arrange and Act
    CompositeCollection<Object> actualCompositeCollection = new CompositeCollection<>((Collection<Object>) null);

    // Assert
    assertTrue(actualCompositeCollection.isEmpty());
  }

  /**
   * Method under test:
   * {@link CompositeCollection#CompositeCollection(Collection)}
   */
  @Test
  public void testNewCompositeCollection3() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add("42");

    // Act
    CompositeCollection<Object> actualCompositeCollection = new CompositeCollection<>(compositeCollection);

    // Assert
    assertEquals(1, actualCompositeCollection.size());
  }

  /**
   * Method under test:
   * {@link CompositeCollection#CompositeCollection(Collection)}
   */
  @Test
  public void testNewCompositeCollection4() {
    // Arrange
    ArrayList<Object> compositeCollection = new ArrayList<>();
    compositeCollection.add("42");
    compositeCollection.add("42");

    // Act
    CompositeCollection<Object> actualCompositeCollection = new CompositeCollection<>(compositeCollection);

    // Assert
    assertEquals(2, actualCompositeCollection.size());
  }

  /**
   * Method under test:
   * {@link CompositeCollection#CompositeCollection(Collection, Collection)}
   */
  @Test
  public void testNewCompositeCollection5() {
    // Arrange
    ArrayList<Object> compositeCollection1 = new ArrayList<>();

    // Act
    CompositeCollection<Object> actualCompositeCollection = new CompositeCollection<>(compositeCollection1,
        new ArrayList<>());

    // Assert
    assertTrue(actualCompositeCollection.isEmpty());
  }

  /**
   * Method under test:
   * {@link CompositeCollection#CompositeCollection(Collection, Collection)}
   */
  @Test
  public void testNewCompositeCollection6() {
    // Arrange and Act
    CompositeCollection<Object> actualCompositeCollection = new CompositeCollection<>(null, null);

    // Assert
    assertTrue(actualCompositeCollection.isEmpty());
  }

  /**
   * Method under test:
   * {@link CompositeCollection#CompositeCollection(Collection, Collection)}
   */
  @Test
  public void testNewCompositeCollection7() {
    // Arrange
    ArrayList<Object> compositeCollection1 = new ArrayList<>();
    compositeCollection1.add("42");

    // Act
    CompositeCollection<Object> actualCompositeCollection = new CompositeCollection<>(compositeCollection1,
        new ArrayList<>());

    // Assert
    assertEquals(1, actualCompositeCollection.size());
  }

  /**
   * Method under test:
   * {@link CompositeCollection#CompositeCollection(Collection, Collection)}
   */
  @Test
  public void testNewCompositeCollection8() {
    // Arrange
    ArrayList<Object> compositeCollection1 = new ArrayList<>();
    compositeCollection1.add("42");
    compositeCollection1.add("42");

    // Act
    CompositeCollection<Object> actualCompositeCollection = new CompositeCollection<>(compositeCollection1,
        new ArrayList<>());

    // Assert
    assertEquals(2, actualCompositeCollection.size());
  }

  /**
   * Method under test:
   * {@link CompositeCollection#CompositeCollection(Collection, Collection)}
   */
  @Test
  public void testNewCompositeCollection9() {
    // Arrange
    ArrayList<Object> compositeCollection1 = new ArrayList<>();

    ArrayList<Object> compositeCollection2 = new ArrayList<>();
    compositeCollection2.add("42");

    // Act
    CompositeCollection<Object> actualCompositeCollection = new CompositeCollection<>(compositeCollection1,
        compositeCollection2);

    // Assert
    assertEquals(1, actualCompositeCollection.size());
  }

  /**
   * Method under test:
   * {@link CompositeCollection#CompositeCollection(Collection, Collection)}
   */
  @Test
  public void testNewCompositeCollection10() {
    // Arrange
    ArrayList<Object> compositeCollection1 = new ArrayList<>();

    ArrayList<Object> compositeCollection2 = new ArrayList<>();
    compositeCollection2.add("42");
    compositeCollection2.add("42");

    // Act
    CompositeCollection<Object> actualCompositeCollection = new CompositeCollection<>(compositeCollection1,
        compositeCollection2);

    // Assert
    assertEquals(2, actualCompositeCollection.size());
  }

  /**
   * Method under test:
   * {@link CompositeCollection#CompositeCollection(Collection[])}
   */
  @Test
  public void testNewCompositeCollection11() {
    // Arrange and Act
    CompositeCollection<Object> actualCompositeCollection = new CompositeCollection<>(new ArrayList<>());

    // Assert
    assertTrue(actualCompositeCollection.isEmpty());
  }
}
