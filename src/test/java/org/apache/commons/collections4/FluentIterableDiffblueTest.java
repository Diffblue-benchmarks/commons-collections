package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.collections4.iterators.EmptyIterator;
import org.apache.commons.collections4.iterators.IteratorEnumeration;
import org.junit.Test;

public class FluentIterableDiffblueTest {
  /**
   * Method under test: {@link FluentIterable#empty()}
   */
  @Test
  public void testEmpty() {
    // Arrange and Act
    FluentIterable<Object> actualEmptyResult = FluentIterable.empty();

    // Assert
    assertTrue(actualEmptyResult.toList().isEmpty());
  }

  /**
   * Method under test: {@link FluentIterable#of(Iterable)}
   */
  @Test
  public void testOf() {
    // Arrange and Act
    FluentIterable<Object> actualOfResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Assert
    assertTrue(actualOfResult.toList().isEmpty());
  }

  /**
   * Method under test: {@link FluentIterable#of(Iterable)}
   */
  @Test
  public void testOf2() {
    // Arrange
    FluentIterable<Object> iterable = FluentIterable.empty();

    // Act
    FluentIterable<Object> actualOfResult = FluentIterable.of((Iterable<Object>) iterable);

    // Assert
    assertTrue(actualOfResult.toList().isEmpty());
  }

  /**
   * Method under test: {@link FluentIterable#of(Object)}
   */
  @Test
  public void testOf3() {
    // Arrange and Act
    FluentIterable<Object> actualOfResult = FluentIterable.of("Singleton");

    // Assert
    List<Object> toListResult = actualOfResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals("Singleton", toListResult.get(0));
  }

  /**
   * Method under test: {@link FluentIterable#of(Object[])}
   */
  @Test
  public void testOf4() {
    // Arrange and Act
    FluentIterable<Object> actualOfResult = FluentIterable.of("Elements");

    // Assert
    List<Object> toListResult = actualOfResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals("Elements", toListResult.get(0));
  }

  /**
   * Method under test: {@link FluentIterable#append(Iterable)}
   */
  @Test
  public void testAppend() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.append(new ArrayList<>()).toList().isEmpty());
  }

  /**
   * Method under test: {@link FluentIterable#append(Object[])}
   */
  @Test
  public void testAppend2() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    List<Object> toListResult = emptyResult.append("Elements").toList();
    assertEquals(1, toListResult.size());
    assertEquals("Elements", toListResult.get(0));
  }

  /**
   * Method under test: {@link FluentIterable#asEnumeration()}
   */
  @Test
  public void testAsEnumeration() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act
    Enumeration<Object> actualAsEnumerationResult = emptyResult.asEnumeration();

    // Assert
    Iterator<?> iterator = ((IteratorEnumeration<Object>) actualAsEnumerationResult).getIterator();
    assertTrue(iterator instanceof EmptyIterator);
    assertTrue(actualAsEnumerationResult instanceof IteratorEnumeration);
    assertFalse(actualAsEnumerationResult.hasMoreElements());
    assertFalse(iterator.hasNext());
  }

  /**
   * Method under test: {@link FluentIterable#asEnumeration()}
   */
  @Test
  public void testAsEnumeration2() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act
    Enumeration<Object> actualAsEnumerationResult = ofResult.asEnumeration();

    // Assert
    assertTrue(actualAsEnumerationResult instanceof IteratorEnumeration);
    assertFalse(actualAsEnumerationResult.hasMoreElements());
    assertFalse(((IteratorEnumeration<Object>) actualAsEnumerationResult).getIterator().hasNext());
  }

  /**
   * Method under test: {@link FluentIterable#collate(Iterable)}
   */
  @Test
  public void testCollate() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.collate(new ArrayList<>()).toList().isEmpty());
  }

  /**
   * Method under test: {@link FluentIterable#contains(Object)}
   */
  @Test
  public void testContains() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertFalse(emptyResult.contains("Object"));
  }

  /**
   * Method under test: {@link FluentIterable#contains(Object)}
   */
  @Test
  public void testContains2() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertFalse(ofResult.contains("Object"));
  }

  /**
   * Method under test: {@link FluentIterable#contains(Object)}
   */
  @Test
  public void testContains3() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertFalse(emptyResult.contains(null));
  }

  /**
   * Method under test: {@link FluentIterable#eval()}
   */
  @Test
  public void testEval() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.eval().toList().isEmpty());
  }

  /**
   * Method under test: {@link FluentIterable#eval()}
   */
  @Test
  public void testEval2() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.eval().toList().isEmpty());
  }

  /**
   * Method under test: {@link FluentIterable#eval()}
   */
  @Test
  public void testEval3() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) iterable);

    // Act and Assert
    List<Object> toListResult = ofResult.eval().toList();
    assertEquals(1, toListResult.size());
    assertEquals("42", toListResult.get(0));
  }

  /**
   * Method under test: {@link FluentIterable#get(int)}
   */
  @Test
  public void testGet() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) iterable);

    // Act and Assert
    assertEquals("42", ofResult.get(1));
  }

  /**
   * Method under test: {@link FluentIterable#isEmpty()}
   */
  @Test
  public void testIsEmpty() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.isEmpty());
  }

  /**
   * Method under test: {@link FluentIterable#isEmpty()}
   */
  @Test
  public void testIsEmpty2() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.isEmpty());
  }

  /**
   * Method under test: {@link FluentIterable#isEmpty()}
   */
  @Test
  public void testIsEmpty3() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) iterable);

    // Act and Assert
    assertFalse(ofResult.isEmpty());
  }

  /**
   * Method under test: {@link FluentIterable#iterator()}
   */
  @Test
  public void testIterator() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertFalse(ofResult.iterator().hasNext());
  }

  /**
   * Method under test: {@link FluentIterable#limit(long)}
   */
  @Test
  public void testLimit() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.limit(3L).toList().isEmpty());
  }

  /**
   * Method under test: {@link FluentIterable#loop()}
   */
  @Test
  public void testLoop() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.loop().toList().isEmpty());
  }

  /**
   * Method under test: {@link FluentIterable#reverse()}
   */
  @Test
  public void testReverse() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.reverse().toList().isEmpty());
  }

  /**
   * Method under test: {@link FluentIterable#size()}
   */
  @Test
  public void testSize() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertEquals(0, emptyResult.size());
  }

  /**
   * Method under test: {@link FluentIterable#size()}
   */
  @Test
  public void testSize2() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertEquals(0, ofResult.size());
  }

  /**
   * Method under test: {@link FluentIterable#skip(long)}
   */
  @Test
  public void testSkip() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.skip(1L).toList().isEmpty());
  }

  /**
   * Method under test: {@link FluentIterable#toArray(Class)}
   */
  @Test
  public void testToArray() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();
    Class<Object> arrayClass = Object.class;

    // Act and Assert
    assertEquals(0, emptyResult.toArray(arrayClass).length);
  }

  /**
   * Method under test: {@link FluentIterable#toArray(Class)}
   */
  @Test
  public void testToArray2() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());
    Class<Object> arrayClass = Object.class;

    // Act and Assert
    assertEquals(0, ofResult.toArray(arrayClass).length);
  }

  /**
   * Method under test: {@link FluentIterable#toArray(Class)}
   */
  @Test
  public void testToArray3() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) iterable);
    Class<Object> arrayClass = Object.class;

    // Act
    Object[] actualToArrayResult = ofResult.toArray(arrayClass);

    // Assert
    assertEquals("42", actualToArrayResult[0]);
    assertEquals(1, actualToArrayResult.length);
  }

  /**
   * Method under test: {@link FluentIterable#toList()}
   */
  @Test
  public void testToList() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.toList().isEmpty());
  }

  /**
   * Method under test: {@link FluentIterable#toList()}
   */
  @Test
  public void testToList2() {
    // Arrange
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.toList().isEmpty());
  }

  /**
   * Method under test: {@link FluentIterable#toList()}
   */
  @Test
  public void testToList3() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    FluentIterable<Object> ofResult = FluentIterable.of((Iterable<Object>) iterable);

    // Act
    List<Object> actualToListResult = ofResult.toList();

    // Assert
    assertEquals(1, actualToListResult.size());
    assertEquals("42", actualToListResult.get(0));
  }

  /**
   * Method under test: {@link FluentIterable#toString()}
   */
  @Test
  public void testToString() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertEquals("[]", emptyResult.toString());
  }

  /**
   * Method under test: {@link FluentIterable#unique()}
   */
  @Test
  public void testUnique() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.unique().toList().isEmpty());
  }

  /**
   * Method under test: {@link FluentIterable#unmodifiable()}
   */
  @Test
  public void testUnmodifiable() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.unmodifiable().toList().isEmpty());
  }

  /**
   * Method under test: {@link FluentIterable#zip(Iterable)}
   */
  @Test
  public void testZip() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.zip(new ArrayList<>()).toList().isEmpty());
  }

  /**
   * Method under test: {@link FluentIterable#zip(Iterable[])}
   */
  @Test
  public void testZip2() {
    // Arrange
    FluentIterable<Object> emptyResult = FluentIterable.empty();

    // Act and Assert
    assertTrue(emptyResult.zip(new ArrayList<>()).toList().isEmpty());
  }
}
