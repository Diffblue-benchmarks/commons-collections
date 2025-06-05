package org.apache.commons.collections4.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FixedSizeListDiffblueTest {
  /**
   * Test {@link FixedSizeList#fixedSizeList(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FixedSizeList#fixedSizeList(List)}
   */
  @Test
  @DisplayName("Test fixedSizeList(List); given '42'; when ArrayList() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"FixedSizeList FixedSizeList.fixedSizeList(List)"})
  void testFixedSizeList_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    FixedSizeList<Object> actualFixedSizeListResult = FixedSizeList.fixedSizeList(list);

    // Assert
    assertEquals(list, actualFixedSizeListResult);
  }

  /**
   * Test {@link FixedSizeList#fixedSizeList(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FixedSizeList#fixedSizeList(List)}
   */
  @Test
  @DisplayName("Test fixedSizeList(List); given '42'; when ArrayList() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"FixedSizeList FixedSizeList.fixedSizeList(List)"})
  void testFixedSizeList_given42_whenArrayListAdd422() {
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
   * Test {@link FixedSizeList#fixedSizeList(List)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FixedSizeList#fixedSizeList(List)}
   */
  @Test
  @DisplayName("Test fixedSizeList(List); when ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"FixedSizeList FixedSizeList.fixedSizeList(List)"})
  void testFixedSizeList_whenArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    FixedSizeList<Object> actualFixedSizeListResult = FixedSizeList.fixedSizeList(list);

    // Assert
    assertEquals(list, actualFixedSizeListResult);
  }

  /**
   * Test {@link FixedSizeList#FixedSizeList(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FixedSizeList#FixedSizeList(List)}
   */
  @Test
  @DisplayName("Test new FixedSizeList(List); given '42'; when ArrayList() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void FixedSizeList.<init>(List)"})
  void testNewFixedSizeList_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act and Assert
    assertEquals(list, new FixedSizeList<>(list));
  }

  /**
   * Test {@link FixedSizeList#FixedSizeList(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FixedSizeList#FixedSizeList(List)}
   */
  @Test
  @DisplayName("Test new FixedSizeList(List); given '42'; when ArrayList() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void FixedSizeList.<init>(List)"})
  void testNewFixedSizeList_given42_whenArrayListAdd422() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act and Assert
    assertEquals(list, new FixedSizeList<>(list));
  }

  /**
   * Test {@link FixedSizeList#FixedSizeList(List)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FixedSizeList#FixedSizeList(List)}
   */
  @Test
  @DisplayName("Test new FixedSizeList(List); when ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void FixedSizeList.<init>(List)"})
  void testNewFixedSizeList_whenArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act and Assert
    assertEquals(list, new FixedSizeList<>(list));
  }

  /**
   * Test {@link FixedSizeList#isFull()}.
   * <p>
   * Method under test: {@link FixedSizeList#isFull()}
   */
  @Test
  @DisplayName("Test isFull()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean FixedSizeList.isFull()"})
  void testIsFull() {
    // Arrange
    FixedSizeList<Object> fixedSizeListResult = FixedSizeList.fixedSizeList(new ArrayList<>());

    // Act and Assert
    assertTrue(fixedSizeListResult.isFull());
  }
}
