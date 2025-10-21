package org.apache.commons.collections4.multimap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Set;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AbstractSetValuedMapDiffblueTest {
  /**
   * Test {@link AbstractSetValuedMap#get(Object)}.
   * <p>
   * Method under test: {@link AbstractSetValuedMap#get(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set AbstractSetValuedMap.get(Object)"})
  public void testGet() {
    // Arrange
    HashSetValuedHashMap<Object, Object> hashSetValuedHashMap = new HashSetValuedHashMap<>();

    // Act and Assert
    assertTrue(hashSetValuedHashMap.get("Key").isEmpty());
  }

  /**
   * Test {@link AbstractSetValuedMap#getMap()}.
   * <p>
   * Method under test: {@link AbstractSetValuedMap#getMap()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Map AbstractSetValuedMap.getMap()"})
  public void testGetMap() {
    // Arrange
    HashSetValuedHashMap<Object, Object> hashSetValuedHashMap = new HashSetValuedHashMap<>();

    // Act and Assert
    assertTrue(hashSetValuedHashMap.getMap().isEmpty());
  }

  /**
   * Test {@link AbstractSetValuedMap#remove(Object)}.
   * <ul>
   *   <li>Given {@link HashSetValuedHashMap#HashSetValuedHashMap()} {@code Key} is {@code Value}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractSetValuedMap#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set AbstractSetValuedMap.remove(Object)"})
  public void testRemove_givenHashSetValuedHashMapKeyIsValue_thenReturnSizeIsOne() {
    // Arrange
    HashSetValuedHashMap<Object, Object> hashSetValuedHashMap = new HashSetValuedHashMap<>();
    hashSetValuedHashMap.put("Key", "Value");

    // Act
    Set<Object> actualRemoveResult = hashSetValuedHashMap.remove("Key");

    // Assert
    assertEquals(0, hashSetValuedHashMap.size());
    assertEquals(1, actualRemoveResult.size());
    assertTrue(hashSetValuedHashMap.getMap().isEmpty());
    assertTrue(hashSetValuedHashMap.isEmpty());
  }

  /**
   * Test {@link AbstractSetValuedMap#remove(Object)}.
   * <ul>
   *   <li>Given {@link HashSetValuedHashMap#HashSetValuedHashMap()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractSetValuedMap#remove(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set AbstractSetValuedMap.remove(Object)"})
  public void testRemove_givenHashSetValuedHashMap_thenReturnEmpty() {
    // Arrange
    HashSetValuedHashMap<Object, Object> hashSetValuedHashMap = new HashSetValuedHashMap<>();

    // Act
    Set<Object> actualRemoveResult = hashSetValuedHashMap.remove("Key");

    // Assert
    assertEquals(0, hashSetValuedHashMap.size());
    assertTrue(hashSetValuedHashMap.getMap().isEmpty());
    assertTrue(actualRemoveResult.isEmpty());
    assertTrue(hashSetValuedHashMap.isEmpty());
  }

  /**
   * Test {@link AbstractSetValuedMap#wrappedCollection(Object)}.
   * <p>
   * Method under test: {@link AbstractSetValuedMap#wrappedCollection(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Set AbstractSetValuedMap.wrappedCollection(Object)"})
  public void testWrappedCollection() {
    // Arrange
    HashSetValuedHashMap<Object, Object> hashSetValuedHashMap = new HashSetValuedHashMap<>();

    // Act and Assert
    assertTrue(hashSetValuedHashMap.wrappedCollection("Key").isEmpty());
  }
}
