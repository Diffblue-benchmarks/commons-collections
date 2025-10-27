package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ArrayUtilsDiffblueTest {
  /**
   * Method under test: {@link ArrayUtils#contains(Object[], Object)}
   */
  @Test
  public void testContains() {
    // Arrange, Act and Assert
    assertFalse(ArrayUtils.contains(new Object[]{"Array"}, "Object To Find"));
    assertTrue(ArrayUtils.contains(new Object[]{"Object To Find"}, "Object To Find"));
    assertFalse(ArrayUtils.contains(null, "Object To Find"));
    assertFalse(ArrayUtils.contains(new Object[]{"Array"}, null));
    assertTrue(ArrayUtils.contains(new Object[]{null}, null));
  }

  /**
   * Method under test: {@link ArrayUtils#indexOf(Object[], Object)}
   */
  @Test
  public void testIndexOf() {
    // Arrange, Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new Object[]{"Array"}, "Object To Find"));
    assertEquals(0, ArrayUtils.indexOf(new Object[]{"Object To Find"}, "Object To Find"));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(null, "Object To Find"));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new Object[]{"Array"}, null));
    assertEquals(0, ArrayUtils.indexOf(new Object[]{null}, null));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new Object[]{"Array"}, "Object To Find", 1));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(null, "Object To Find", 1));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND,
        ArrayUtils.indexOf(new Object[]{"Array", "Array"}, "Object To Find", 1));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new Object[]{"Array"}, null, 1));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND,
        ArrayUtils.indexOf(new Object[]{"Array"}, "Object To Find", CollectionUtils.INDEX_NOT_FOUND));
    assertEquals(1, ArrayUtils.indexOf(new Object[]{"Array", "Object To Find"}, "Object To Find", 1));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, ArrayUtils.indexOf(new Object[]{"Array", "Array"}, null, 1));
    assertEquals(1, ArrayUtils.indexOf(new Object[]{"Array", null}, null, 1));
  }
}
