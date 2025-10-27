package org.apache.commons.collections4.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class FixedSizeListDiffblueTest {
  /**
   * Method under test: {@link FixedSizeList#fixedSizeList(List)}
   */
  @Test
  public void testFixedSizeList() {
    // Arrange and Act
    FixedSizeList<Object> actualFixedSizeListResult = FixedSizeList.fixedSizeList(new ArrayList<>());

    // Assert
    assertTrue(actualFixedSizeListResult.isEmpty());
  }

  /**
   * Method under test: {@link FixedSizeList#fixedSizeList(List)}
   */
  @Test
  public void testFixedSizeList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    FixedSizeList<Object> actualFixedSizeListResult = FixedSizeList.fixedSizeList(list);

    // Assert
    assertEquals(1, actualFixedSizeListResult.size());
    assertEquals("42", actualFixedSizeListResult.get(0));
  }

  /**
   * Method under test: {@link FixedSizeList#fixedSizeList(List)}
   */
  @Test
  public void testFixedSizeList3() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    FixedSizeList<Object> actualFixedSizeListResult = FixedSizeList.fixedSizeList(list);

    // Assert
    assertEquals(list, actualFixedSizeListResult);
  }

  /**
   * Method under test: {@link FixedSizeList#isFull()}
   */
  @Test
  public void testIsFull() {
    // Arrange
    FixedSizeList<Object> fixedSizeListResult = FixedSizeList.fixedSizeList(new ArrayList<>());

    // Act and Assert
    assertTrue(fixedSizeListResult.isFull());
  }

  /**
   * Method under test: {@link FixedSizeList#FixedSizeList(List)}
   */
  @Test
  public void testNewFixedSizeList() {
    // Arrange and Act
    FixedSizeList<Object> actualObjectList = new FixedSizeList<>(new ArrayList<>());

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Method under test: {@link FixedSizeList#FixedSizeList(List)}
   */
  @Test
  public void testNewFixedSizeList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    FixedSizeList<Object> actualObjectList = new FixedSizeList<>(list);

    // Assert
    assertEquals(1, actualObjectList.size());
    assertEquals("42", actualObjectList.get(0));
  }

  /**
   * Method under test: {@link FixedSizeList#FixedSizeList(List)}
   */
  @Test
  public void testNewFixedSizeList3() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act and Assert
    assertEquals(list, new FixedSizeList<>(list));
  }
}
