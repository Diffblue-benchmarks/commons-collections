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

class UnmodifiableListDiffblueTest {
  /**
   * Test {@link UnmodifiableList#unmodifiableList(List)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableList#unmodifiableList(List)}
   */
  @Test
  @DisplayName(
      "Test unmodifiableList(List); given '42'; when ArrayList() add '42'; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List UnmodifiableList.unmodifiableList(List)"})
  void testUnmodifiableList_given42_whenArrayListAdd42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    List<Object> actualUnmodifiableListResult = UnmodifiableList.unmodifiableList(list);

    // Assert
    assertEquals(list, actualUnmodifiableListResult);
  }

  /**
   * Test {@link UnmodifiableList#unmodifiableList(List)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableList#unmodifiableList(List)}
   */
  @Test
  @DisplayName(
      "Test unmodifiableList(List); given '42'; when ArrayList() add '42'; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List UnmodifiableList.unmodifiableList(List)"})
  void testUnmodifiableList_given42_whenArrayListAdd42_thenReturnArrayList2() {
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
   * Test {@link UnmodifiableList#unmodifiableList(List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableList#unmodifiableList(List)}
   */
  @Test
  @DisplayName("Test unmodifiableList(List); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List UnmodifiableList.unmodifiableList(List)"})
  void testUnmodifiableList_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    List<Object> actualUnmodifiableListResult =
        UnmodifiableList.unmodifiableList(new ArrayList<>());

    // Assert
    assertTrue(actualUnmodifiableListResult.isEmpty());
  }

  /**
   * Test {@link UnmodifiableList#UnmodifiableList(List)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableList#UnmodifiableList(List)}
   */
  @Test
  @DisplayName("Test new UnmodifiableList(List); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void UnmodifiableList.<init>(List)"})
  void testNewUnmodifiableList_given42_whenArrayListAdd42() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    UnmodifiableList<Object> actualObjectList = new UnmodifiableList<>(list);

    // Assert
    assertEquals(list, actualObjectList);
  }

  /**
   * Test {@link UnmodifiableList#UnmodifiableList(List)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableList#UnmodifiableList(List)}
   */
  @Test
  @DisplayName("Test new UnmodifiableList(List); given '42'; when ArrayList() add '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void UnmodifiableList.<init>(List)"})
  void testNewUnmodifiableList_given42_whenArrayListAdd422() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    UnmodifiableList<Object> actualObjectList = new UnmodifiableList<>(list);

    // Assert
    assertEquals(list, actualObjectList);
  }

  /**
   * Test {@link UnmodifiableList#UnmodifiableList(List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link UnmodifiableList#UnmodifiableList(List)}
   */
  @Test
  @DisplayName("Test new UnmodifiableList(List); when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void UnmodifiableList.<init>(List)"})
  void testNewUnmodifiableList_whenArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    UnmodifiableList<Object> actualObjectList = new UnmodifiableList<>(list);

    // Assert
    assertEquals(list, actualObjectList);
  }
}
