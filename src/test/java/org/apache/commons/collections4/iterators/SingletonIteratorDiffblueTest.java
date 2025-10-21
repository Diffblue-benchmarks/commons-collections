package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SingletonIteratorDiffblueTest {
  /**
   * Test getters and setters.
   * <ul>
   *   <li>When {@code Object}.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link SingletonIterator#SingletonIterator(Object)}
   *   <li>{@link SingletonIterator#reset()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SingletonIterator.<init>(Object)", "void SingletonIterator.<init>(Object, boolean)",
      "void SingletonIterator.reset()"})
  public void testGettersAndSetters_whenObject() {
    // Arrange and Act
    SingletonIterator<Object> actualSingletonIterator = new SingletonIterator<>("Object");
    actualSingletonIterator.reset();

    // Assert
    assertEquals("Object", actualSingletonIterator.next());
    assertFalse(actualSingletonIterator.hasNext());
  }

  /**
   * Test getters and setters.
   * <ul>
   *   <li>When {@code true}.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link SingletonIterator#SingletonIterator(Object, boolean)}
   *   <li>{@link SingletonIterator#reset()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SingletonIterator.<init>(Object)", "void SingletonIterator.<init>(Object, boolean)",
      "void SingletonIterator.reset()"})
  public void testGettersAndSetters_whenTrue() {
    // Arrange and Act
    SingletonIterator<Object> actualSingletonIterator = new SingletonIterator<>("Object", true);
    actualSingletonIterator.reset();

    // Assert
    assertEquals("Object", actualSingletonIterator.next());
    assertFalse(actualSingletonIterator.hasNext());
  }

  /**
   * Test {@link SingletonIterator#hasNext()}.
   * <p>
   * Method under test: {@link SingletonIterator#hasNext()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean SingletonIterator.hasNext()"})
  public void testHasNext() {
    // Arrange
    SingletonIterator<Object> singletonIterator = new SingletonIterator<>("Object", true);

    // Act and Assert
    assertTrue(singletonIterator.hasNext());
  }

  /**
   * Test {@link SingletonIterator#next()}.
   * <p>
   * Method under test: {@link SingletonIterator#next()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object SingletonIterator.next()"})
  public void testNext() {
    // Arrange
    SingletonIterator<Object> singletonIterator = new SingletonIterator<>("Object", true);

    // Act and Assert
    assertEquals("Object", singletonIterator.next());
    assertFalse(singletonIterator.hasNext());
  }

  /**
   * Test {@link SingletonIterator#remove()}.
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SingletonIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SingletonIterator.remove()"})
  public void testRemove_thenThrowIllegalStateException() {
    // Arrange
    SingletonIterator<Object> singletonIterator = new SingletonIterator<>("Object", true);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> singletonIterator.remove());
  }

  /**
   * Test {@link SingletonIterator#remove()}.
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link SingletonIterator#remove()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SingletonIterator.remove()"})
  public void testRemove_thenThrowUnsupportedOperationException() {
    // Arrange
    SingletonIterator<Object> singletonIterator = new SingletonIterator<>("Object", false);

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> singletonIterator.remove());
  }
}
