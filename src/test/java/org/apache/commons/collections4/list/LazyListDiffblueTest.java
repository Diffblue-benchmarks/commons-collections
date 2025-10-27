package org.apache.commons.collections4.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.junit.Test;

public class LazyListDiffblueTest {
  /**
   * Method under test: {@link LazyList#lazyList(List, Factory)}
   */
  @Test
  public void testLazyList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    LazyList<Object> actualLazyListResult = LazyList.lazyList(list, new ConstantFactory<>("Constant To Return"));

    // Assert
    assertTrue(actualLazyListResult.isEmpty());
  }

  /**
   * Method under test: {@link LazyList#lazyList(List, Factory)}
   */
  @Test
  public void testLazyList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    LazyList<Object> actualLazyListResult = LazyList.lazyList(list, new ConstantFactory<>("Constant To Return"));

    // Assert
    assertEquals(1, actualLazyListResult.size());
    assertEquals("42", actualLazyListResult.get(0));
  }

  /**
   * Method under test: {@link LazyList#lazyList(List, Factory)}
   */
  @Test
  public void testLazyList3() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    LazyList<Object> actualLazyListResult = LazyList.lazyList(list, new ConstantFactory<>("Constant To Return"));

    // Assert
    assertEquals(list, actualLazyListResult);
  }

  /**
   * Method under test: {@link LazyList#LazyList(List, Factory)}
   */
  @Test
  public void testNewLazyList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    LazyList<Object> actualObjectList = new LazyList<>(list, new ConstantFactory<>("Constant To Return"));

    // Assert
    assertTrue(actualObjectList.isEmpty());
  }

  /**
   * Method under test: {@link LazyList#LazyList(List, Factory)}
   */
  @Test
  public void testNewLazyList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    LazyList<Object> actualObjectList = new LazyList<>(list, new ConstantFactory<>("Constant To Return"));

    // Assert
    assertEquals(1, actualObjectList.size());
    assertEquals("42", actualObjectList.get(0));
  }

  /**
   * Method under test: {@link LazyList#LazyList(List, Factory)}
   */
  @Test
  public void testNewLazyList3() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act and Assert
    assertEquals(list, new LazyList<>(list, new ConstantFactory<>("Constant To Return")));
  }
}
