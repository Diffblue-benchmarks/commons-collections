package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IteratorEnumerationDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IteratorEnumeration#IteratorEnumeration()}
   *   <li>{@link IteratorEnumeration#setIterator(Iterator)}
   *   <li>{@link IteratorEnumeration#getIterator()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void IteratorEnumeration.<init>()",
    "void IteratorEnumeration.<init>(Iterator)",
    "Iterator IteratorEnumeration.getIterator()",
    "void IteratorEnumeration.setIterator(Iterator)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    IteratorEnumeration<Object> actualIteratorEnumeration = new IteratorEnumeration<>();
    ArrayList<Object> objectList = new ArrayList<>();
    Iterator<Object> iterator = objectList.iterator();
    actualIteratorEnumeration.setIterator(iterator);
    Iterator<?> actualIterator = actualIteratorEnumeration.getIterator();

    // Assert
    assertFalse(actualIterator.hasNext());
    assertSame(iterator, actualIterator);
  }

  /**
   * Test getters and setters.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} iterator.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IteratorEnumeration#IteratorEnumeration(Iterator)}
   *   <li>{@link IteratorEnumeration#setIterator(Iterator)}
   *   <li>{@link IteratorEnumeration#getIterator()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters; when ArrayList() iterator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void IteratorEnumeration.<init>()",
    "void IteratorEnumeration.<init>(Iterator)",
    "Iterator IteratorEnumeration.getIterator()",
    "void IteratorEnumeration.setIterator(Iterator)"
  })
  void testGettersAndSetters_whenArrayListIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    IteratorEnumeration<Object> actualIteratorEnumeration =
        new IteratorEnumeration<>(objectList.iterator());
    ArrayList<Object> objectList2 = new ArrayList<>();
    Iterator<Object> iterator = objectList2.iterator();
    actualIteratorEnumeration.setIterator(iterator);
    Iterator<?> actualIterator = actualIteratorEnumeration.getIterator();

    // Assert
    assertFalse(actualIterator.hasNext());
    assertSame(iterator, actualIterator);
  }

  /**
   * Test {@link IteratorEnumeration#hasMoreElements()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorEnumeration#hasMoreElements()}
   */
  @Test
  @DisplayName("Test hasMoreElements(); given ArrayList() add '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorEnumeration.hasMoreElements()"})
  void testHasMoreElements_givenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    IteratorEnumeration<Object> iteratorEnumeration = new IteratorEnumeration<>();
    iteratorEnumeration.setIterator(iterator);

    // Act and Assert
    assertTrue(iteratorEnumeration.hasMoreElements());
  }

  /**
   * Test {@link IteratorEnumeration#hasMoreElements()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorEnumeration#hasMoreElements()}
   */
  @Test
  @DisplayName("Test hasMoreElements(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IteratorEnumeration.hasMoreElements()"})
  void testHasMoreElements_thenReturnFalse() {
    // Arrange
    IteratorEnumeration<Object> iteratorEnumeration = new IteratorEnumeration<>();

    ArrayList<Object> objectList = new ArrayList<>();
    iteratorEnumeration.setIterator(objectList.iterator());

    // Act and Assert
    assertFalse(iteratorEnumeration.hasMoreElements());
  }

  /**
   * Test {@link IteratorEnumeration#nextElement()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link IteratorEnumeration#nextElement()}
   */
  @Test
  @DisplayName("Test nextElement(); given ArrayList() add '42'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object IteratorEnumeration.nextElement()"})
  void testNextElement_givenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    Iterator<Object> iterator = objectList.iterator();

    IteratorEnumeration<Object> iteratorEnumeration = new IteratorEnumeration<>();
    iteratorEnumeration.setIterator(iterator);

    // Act and Assert
    assertEquals("42", iteratorEnumeration.nextElement());
    assertFalse(iteratorEnumeration.getIterator().hasNext());
    assertFalse(iteratorEnumeration.hasMoreElements());
  }
}
