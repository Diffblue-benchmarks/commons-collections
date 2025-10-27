package org.apache.commons.collections4.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class UnmodifiableListDiffblueTest {
  /**
   * Method under test: {@link UnmodifiableList#UnmodifiableList(List)}
   */
  @Test
  public void testNewUnmodifiableList() {
    // Arrange and Act
    UnmodifiableList<Object> actualObjectList = new UnmodifiableList<>(new ArrayList<>());

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Method under test: {@link UnmodifiableList#unmodifiableList(List)}
   */
  @Test
  public void testUnmodifiableList() {
    // Arrange and Act
    List<Object> actualUnmodifiableListResult = UnmodifiableList.unmodifiableList(new ArrayList<>());

    // Assert
    assertTrue(actualUnmodifiableListResult.isEmpty());
  }

  /**
   * Method under test: {@link UnmodifiableList#unmodifiableList(List)}
   */
  @Test
  public void testUnmodifiableList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    List<Object> actualUnmodifiableListResult = UnmodifiableList.unmodifiableList(list);

    // Assert
    assertEquals(1, actualUnmodifiableListResult.size());
    assertEquals("42", actualUnmodifiableListResult.get(0));
  }

  /**
   * Method under test: {@link UnmodifiableList#unmodifiableList(List)}
   */
  @Test
  public void testUnmodifiableList3() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    List<Object> actualUnmodifiableListResult = UnmodifiableList.unmodifiableList(list);

    // Assert
    assertEquals(list, actualUnmodifiableListResult);
  }

  /**
   * Method under test: {@link UnmodifiableList#UnmodifiableList(List)}
   */
  @Test
  public void testNewUnmodifiableList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    UnmodifiableList<Object> actualObjectList = new UnmodifiableList<>(list);

    // Assert
    assertEquals(1, actualObjectList.size());
    assertEquals("42", actualObjectList.get(0));
  }

  /**
   * Method under test: {@link UnmodifiableList#UnmodifiableList(List)}
   */
  @Test
  public void testNewUnmodifiableList3() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act and Assert
    assertEquals(list, new UnmodifiableList<>(list));
  }
}
