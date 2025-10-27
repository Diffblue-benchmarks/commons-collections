package org.apache.commons.collections4.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.apache.commons.collections4.list.GrowthList;
import org.junit.Test;

public class AbstractCollectionDecoratorDiffblueTest {
  /**
   * Method under test: {@link AbstractCollectionDecorator#add(Object)}
   */
  @Test
  public void testAdd() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act
    boolean actualAddResult = objectList.add("Object");

    // Assert
    assertEquals(1, objectList.size());
    assertEquals("Object", objectList.get(0));
    assertTrue(actualAddResult);
  }

  /**
   * Method under test: {@link AbstractCollectionDecorator#addAll(Collection)}
   */
  @Test
  public void testAddAll() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    ArrayList<Object> coll = new ArrayList<>();

    // Act and Assert
    assertFalse(objectList.addAll(coll));
    assertTrue(coll.isEmpty());
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractCollectionDecorator#addAll(Collection)}
   */
  @Test
  public void testAddAll2() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualAddAllResult = objectList.addAll(coll);

    // Assert
    assertEquals(1, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals(1, coll.size());
    assertTrue(actualAddAllResult);
  }

  /**
   * Method under test: {@link AbstractCollectionDecorator#addAll(Collection)}
   */
  @Test
  public void testAddAll3() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    boolean actualAddAllResult = objectList.addAll(coll);

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals("42", objectList.get(1));
    assertTrue(actualAddAllResult);
    assertEquals(objectList, coll);
  }

  /**
   * Method under test: {@link AbstractCollectionDecorator#contains(Object)}
   */
  @Test
  public void testContains() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertFalse(objectList.contains("Object"));
  }

  /**
   * Method under test: {@link AbstractCollectionDecorator#contains(Object)}
   */
  @Test
  public void testContains2() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("Object");

    // Act and Assert
    assertTrue(objectList.contains("Object"));
  }

  /**
   * Method under test:
   * {@link AbstractCollectionDecorator#containsAll(Collection)}
   */
  @Test
  public void testContainsAll() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertTrue(objectList.containsAll(new ArrayList<>()));
  }

  /**
   * Method under test:
   * {@link AbstractCollectionDecorator#containsAll(Collection)}
   */
  @Test
  public void testContainsAll2() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(objectList.containsAll(coll));
  }

  /**
   * Method under test:
   * {@link AbstractCollectionDecorator#containsAll(Collection)}
   */
  @Test
  public void testContainsAll3() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(objectList.containsAll(coll));
  }

  /**
   * Method under test: {@link AbstractCollectionDecorator#decorated()}
   */
  @Test
  public void testDecorated() {
    // Arrange and Act
    Collection<Object> actualDecoratedResult = ((AbstractCollectionDecorator<Object>) new GrowthList<>()).decorated();

    // Assert
    assertTrue(actualDecoratedResult instanceof List);
    assertTrue(actualDecoratedResult.isEmpty());
  }

  /**
   * Method under test: {@link AbstractCollectionDecorator#isEmpty()}
   */
  @Test
  public void testIsEmpty() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractCollectionDecorator#isEmpty()}
   */
  @Test
  public void testIsEmpty2() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("Object");

    // Act and Assert
    assertFalse(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractCollectionDecorator#iterator()}
   */
  @Test
  public void testIterator() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertFalse(objectList.iterator().hasNext());
  }

  /**
   * Method under test: {@link AbstractCollectionDecorator#remove(Object)}
   */
  @Test
  public void testRemove() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertFalse(objectList.remove("Object"));
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractCollectionDecorator#remove(Object)}
   */
  @Test
  public void testRemove2() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("Object");

    // Act
    boolean actualRemoveResult = objectList.remove("Object");

    // Assert
    assertTrue(objectList.isEmpty());
    assertTrue(actualRemoveResult);
  }

  /**
   * Method under test: {@link AbstractCollectionDecorator#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertFalse(objectList.removeAll(new ArrayList<>()));
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractCollectionDecorator#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll2() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act and Assert
    assertFalse(objectList.removeAll(coll));
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractCollectionDecorator#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll3() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act and Assert
    assertFalse(objectList.removeAll(coll));
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractCollectionDecorator#removeAll(Collection)}
   */
  @Test
  public void testRemoveAll4() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("42");

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualRemoveAllResult = objectList.removeAll(coll);

    // Assert
    assertTrue(objectList.isEmpty());
    assertTrue(actualRemoveAllResult);
  }

  /**
   * Method under test: {@link AbstractCollectionDecorator#removeIf(Predicate)}
   */
  @Test
  public void testRemoveIf() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    UniquePredicate<Object> filter = new UniquePredicate<>();

    // Act and Assert
    assertFalse(objectList.removeIf(filter));
    assertTrue(objectList.isEmpty());
    assertTrue(filter.evaluate("Object"));
  }

  /**
   * Method under test: {@link AbstractCollectionDecorator#removeIf(Predicate)}
   */
  @Test
  public void testRemoveIf2() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("Object");
    UniquePredicate<Object> filter = new UniquePredicate<>();

    // Act
    boolean actualRemoveIfResult = objectList.removeIf(filter);

    // Assert
    assertFalse(filter.evaluate("Object"));
    assertTrue(objectList.isEmpty());
    assertTrue(actualRemoveIfResult);
  }

  /**
   * Method under test: {@link AbstractCollectionDecorator#retainAll(Collection)}
   */
  @Test
  public void testRetainAll() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    ArrayList<Object> coll = new ArrayList<>();

    // Act and Assert
    assertFalse(objectList.retainAll(coll));
    assertTrue(coll.isEmpty());
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractCollectionDecorator#retainAll(Collection)}
   */
  @Test
  public void testRetainAll2() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    objectList.add("Object");
    ArrayList<Object> coll = new ArrayList<>();

    // Act
    boolean actualRetainAllResult = objectList.retainAll(coll);

    // Assert
    assertTrue(coll.isEmpty());
    assertTrue(objectList.isEmpty());
    assertTrue(actualRetainAllResult);
  }

  /**
   * Method under test: {@link AbstractCollectionDecorator#retainAll(Collection)}
   */
  @Test
  public void testRetainAll3() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    boolean actualRetainAllResult = objectList.retainAll(coll);

    // Assert
    assertEquals(1, coll.size());
    assertFalse(actualRetainAllResult);
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test: {@link AbstractCollectionDecorator#retainAll(Collection)}
   */
  @Test
  public void testRetainAll4() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    boolean actualRetainAllResult = objectList.retainAll(coll);

    // Assert
    assertEquals(2, coll.size());
    assertFalse(actualRetainAllResult);
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test:
   * {@link AbstractCollectionDecorator#setCollection(Collection)}
   */
  @Test
  public void testSetCollection() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    ArrayList<Object> collection = new ArrayList<>();

    // Act
    objectList.setCollection(collection);

    // Assert
    assertTrue(collection.isEmpty());
    assertTrue(objectList.isEmpty());
  }

  /**
   * Method under test:
   * {@link AbstractCollectionDecorator#setCollection(Collection)}
   */
  @Test
  public void testSetCollection2() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    objectList.setCollection(collection);

    // Assert
    assertEquals(1, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals(1, collection.size());
  }

  /**
   * Method under test:
   * {@link AbstractCollectionDecorator#setCollection(Collection)}
   */
  @Test
  public void testSetCollection3() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    objectList.setCollection(collection);

    // Assert
    assertEquals(2, objectList.size());
    assertEquals("42", objectList.get(0));
    assertEquals("42", objectList.get(1));
    assertEquals(objectList, collection);
  }

  /**
   * Method under test: {@link AbstractCollectionDecorator#size()}
   */
  @Test
  public void testSize() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertEquals(0, objectList.size());
  }

  /**
   * Method under test: {@link AbstractCollectionDecorator#toArray()}
   */
  @Test
  public void testToArray() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertEquals(0, objectList.toArray().length);
  }

  /**
   * Method under test: {@link AbstractCollectionDecorator#toArray(Object[])}
   */
  @Test
  public void testToArray2() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();
    Object[] object = new Object[]{"Object"};

    // Act
    Object[] actualToArrayResult = objectList.toArray(object);

    // Assert
    assertNull(actualToArrayResult[0]);
    assertNull(object[0]);
    assertEquals(1, actualToArrayResult.length);
    assertEquals(1, object.length);
    assertSame(object, actualToArrayResult);
  }

  /**
   * Method under test: {@link AbstractCollectionDecorator#toString()}
   */
  @Test
  public void testToString() {
    // Arrange
    GrowthList<Object> objectList = new GrowthList<>();

    // Act and Assert
    assertEquals("[]", objectList.toString());
  }
}
