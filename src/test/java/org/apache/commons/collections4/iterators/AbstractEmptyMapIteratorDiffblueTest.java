package org.apache.commons.collections4.iterators;

import static org.junit.Assert.assertThrows;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AbstractEmptyMapIteratorDiffblueTest {
  /**
   * Test {@link AbstractEmptyMapIterator#getKey()}.
   * <p>
   * Method under test: {@link AbstractEmptyMapIterator#getKey()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractEmptyMapIterator.getKey()"})
  public void testGetKey() {
    // Arrange
    EmptyMapIterator<Object, Object> emptyMapIterator = new EmptyMapIterator<>();

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> emptyMapIterator.getKey());
  }

  /**
   * Test {@link AbstractEmptyMapIterator#getValue()}.
   * <p>
   * Method under test: {@link AbstractEmptyMapIterator#getValue()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractEmptyMapIterator.getValue()"})
  public void testGetValue() {
    // Arrange
    EmptyMapIterator<Object, Object> emptyMapIterator = new EmptyMapIterator<>();

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> emptyMapIterator.getValue());
  }

  /**
   * Test {@link AbstractEmptyMapIterator#setValue(Object)}.
   * <p>
   * Method under test: {@link AbstractEmptyMapIterator#setValue(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object AbstractEmptyMapIterator.setValue(Object)"})
  public void testSetValue() {
    // Arrange
    EmptyMapIterator<Object, Object> emptyMapIterator = new EmptyMapIterator<>();

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> emptyMapIterator.setValue("Ignored"));
  }
}
