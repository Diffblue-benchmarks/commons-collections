package org.apache.commons.collections4.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FixedSizeListDiffblueTest {
  /**
   * Test {@link FixedSizeList#fixedSizeList(List)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link FixedSizeList#fixedSizeList(List)}
   */
  @Test
  @DisplayName("Test fixedSizeList(List); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link FixedSizeList#fixedSizeList(List)}
   */
  @Test
  @DisplayName("Test fixedSizeList(List); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link FixedSizeList#fixedSizeList(List)}
   */
  @Test
  @DisplayName("Test fixedSizeList(List); when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FixedSizeList#FixedSizeList(List)}
   *   <li>{@link FixedSizeList#isFull()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FixedSizeList.<init>(List)", "boolean FixedSizeList.isFull()"})
  void testGettersAndSetters() {
    // Arrange and Act
    FixedSizeList<Object> actualObjectList = new FixedSizeList<>(new ArrayList<>());

    // Assert
    assertTrue(actualObjectList.isFull());
  }
}
