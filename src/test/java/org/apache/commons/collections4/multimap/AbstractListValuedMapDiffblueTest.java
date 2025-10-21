package org.apache.commons.collections4.multimap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.List;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AbstractListValuedMapDiffblueTest {
  /**
   * Test {@link AbstractListValuedMap#get(Object)}.
   * <p>
   * Method under test: {@link AbstractListValuedMap#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List AbstractListValuedMap.get(Object)"})
  public void testGet() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertTrue(arrayListValuedHashMap.get("Key").isEmpty());
  }

  /**
   * Test {@link AbstractListValuedMap#getMap()}.
   * <p>
   * Method under test: {@link AbstractListValuedMap#getMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Map AbstractListValuedMap.getMap()"})
  public void testGetMap() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertTrue(arrayListValuedHashMap.getMap().isEmpty());
  }

  /**
   * Test {@link AbstractListValuedMap#remove(Object)}.
   * <ul>
   *   <li>Given {@link ArrayListValuedHashMap#ArrayListValuedHashMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractListValuedMap#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List AbstractListValuedMap.remove(Object)"})
  public void testRemove_givenArrayListValuedHashMapKeyIsValue_thenReturnSizeIsOne() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();
    arrayListValuedHashMap.put("Key", "Value");

    // Act
    List<Object> actualRemoveResult = arrayListValuedHashMap.remove("Key");

    // Assert
    assertEquals(1, actualRemoveResult.size());
    assertEquals("Value", actualRemoveResult.get(0));
    assertEquals(0, arrayListValuedHashMap.size());
    assertTrue(arrayListValuedHashMap.getMap().isEmpty());
    assertTrue(arrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link AbstractListValuedMap#remove(Object)}.
   * <ul>
   *   <li>Given {@link ArrayListValuedHashMap#ArrayListValuedHashMap()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractListValuedMap#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List AbstractListValuedMap.remove(Object)"})
  public void testRemove_givenArrayListValuedHashMap_thenReturnEmpty() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act
    List<Object> actualRemoveResult = arrayListValuedHashMap.remove("Key");

    // Assert
    assertEquals(0, arrayListValuedHashMap.size());
    assertTrue(actualRemoveResult.isEmpty());
    assertTrue(arrayListValuedHashMap.getMap().isEmpty());
    assertTrue(arrayListValuedHashMap.isEmpty());
  }

  /**
   * Test {@link AbstractListValuedMap#wrappedCollection(Object)}.
   * <p>
   * Method under test: {@link AbstractListValuedMap#wrappedCollection(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List AbstractListValuedMap.wrappedCollection(Object)"})
  public void testWrappedCollection() {
    // Arrange
    ArrayListValuedHashMap<Object, Object> arrayListValuedHashMap = new ArrayListValuedHashMap<>();

    // Act and Assert
    assertTrue(arrayListValuedHashMap.wrappedCollection("Key").isEmpty());
  }
}
