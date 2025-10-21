package org.apache.commons.collections4.map;

import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class HashedMapDiffblueTest {
  /**
   * Test {@link HashedMap#HashedMap()}.
   * <p>
   * Method under test: {@link HashedMap#HashedMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void HashedMap.<init>()"})
  public void testNewHashedMap() {
    // Arrange and Act
    HashedMap<Object, Object> actualObjectObjectMap = new HashedMap<>();

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link HashedMap#HashedMap(int)}.
   * <ul>
   *   <li>When one.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashedMap#HashedMap(int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void HashedMap.<init>(int)"})
  public void testNewHashedMap_whenOne_thenReturnEmpty() {
    // Arrange and Act
    HashedMap<Object, Object> actualObjectObjectMap = new HashedMap<>(1);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }

  /**
   * Test {@link HashedMap#HashedMap(int, float)}.
   * <ul>
   *   <li>When ten.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link HashedMap#HashedMap(int, float)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void HashedMap.<init>(int, float)"})
  public void testNewHashedMap_whenTen_thenReturnEmpty() {
    // Arrange and Act
    HashedMap<Object, Object> actualObjectObjectMap = new HashedMap<>(1, 10.0f);

    // Assert
    assertTrue(actualObjectObjectMap.isEmpty());
  }
}
