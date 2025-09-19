package org.apache.commons.collections4.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TransformedListDiffblueTest {
  /**
   * Test {@link TransformedList#transformedList(List, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then {@link ArrayList#ArrayList()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link TransformedList#transformedList(List, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedList(List, Transformer); given '42'; when ArrayList() add '42'; then ArrayList() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TransformedList TransformedList.transformedList(List, Transformer)"})
  void testTransformedList_given42_whenArrayListAdd42_thenArrayListSizeIsOne() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    TransformedList<Object> actualTransformedListResult =
        TransformedList.transformedList(list, transformer);

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals(1, list.size());
    assertEquals("Apply", list.get(0));
    assertEquals(list, actualTransformedListResult);
  }

  /**
   * Test {@link TransformedList#transformedList(List, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then {@link ArrayList#ArrayList()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link TransformedList#transformedList(List, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformedList(List, Transformer); given '42'; when ArrayList() add '42'; then ArrayList() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TransformedList TransformedList.transformedList(List, Transformer)"})
  void testTransformedList_given42_whenArrayListAdd42_thenArrayListSizeIsTwo() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    TransformedList.transformedList(list, transformer);

    // Assert
    verify(transformer, atLeast(1)).apply(isA(Object.class));
    assertEquals(2, list.size());
    assertEquals("Apply", list.get(0));
    assertEquals("Apply", list.get(1));
  }

  /**
   * Test {@link TransformedList#transformedList(List, Transformer)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedList#transformedList(List, Transformer)}
   */
  @Test
  @DisplayName("Test transformedList(List, Transformer); when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TransformedList TransformedList.transformedList(List, Transformer)"})
  void testTransformedList_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    TransformedList<Object> actualTransformedListResult =
        TransformedList.transformedList(list, mock(Transformer.class));

    // Assert
    assertEquals(list, actualTransformedListResult);
  }

  /**
   * Test {@link TransformedList#transformingList(List, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedList#transformingList(List, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingList(List, Transformer); given '42'; when ArrayList() add '42'; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TransformedList TransformedList.transformingList(List, Transformer)"})
  void testTransformingList_given42_whenArrayListAdd42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    TransformedList<Object> actualTransformingListResult =
        TransformedList.transformingList(list, mock(Transformer.class));

    // Assert
    assertEquals(list, actualTransformingListResult);
  }

  /**
   * Test {@link TransformedList#transformingList(List, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedList#transformingList(List, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingList(List, Transformer); given '42'; when ArrayList() add '42'; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TransformedList TransformedList.transformingList(List, Transformer)"})
  void testTransformingList_given42_whenArrayListAdd42_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    TransformedList<Object> actualTransformingListResult =
        TransformedList.transformingList(list, mock(Transformer.class));

    // Assert
    assertEquals(list, actualTransformingListResult);
  }

  /**
   * Test {@link TransformedList#transformingList(List, Transformer)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedList#transformingList(List, Transformer)}
   */
  @Test
  @DisplayName(
      "Test transformingList(List, Transformer); when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TransformedList TransformedList.transformingList(List, Transformer)"})
  void testTransformingList_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    TransformedList<Object> actualTransformingListResult =
        TransformedList.transformingList(list, mock(Transformer.class));

    // Assert
    assertEquals(list, actualTransformingListResult);
  }

  /**
   * Test {@link TransformedList#TransformedList(List, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedList#TransformedList(List, Transformer)}
   */
  @Test
  @DisplayName(
      "Test new TransformedList(List, Transformer); given '42'; when ArrayList() add '42'; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransformedList.<init>(List, Transformer)"})
  void testNewTransformedList_given42_whenArrayListAdd42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    TransformedList<Object> actualObjectList = new TransformedList<>(list, mock(Transformer.class));

    // Assert
    assertEquals(list, actualObjectList);
  }

  /**
   * Test {@link TransformedList#TransformedList(List, Transformer)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedList#TransformedList(List, Transformer)}
   */
  @Test
  @DisplayName(
      "Test new TransformedList(List, Transformer); given '42'; when ArrayList() add '42'; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransformedList.<init>(List, Transformer)"})
  void testNewTransformedList_given42_whenArrayListAdd42_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    TransformedList<Object> actualObjectList = new TransformedList<>(list, mock(Transformer.class));

    // Assert
    assertEquals(list, actualObjectList);
  }

  /**
   * Test {@link TransformedList#TransformedList(List, Transformer)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link TransformedList#TransformedList(List, Transformer)}
   */
  @Test
  @DisplayName(
      "Test new TransformedList(List, Transformer); when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TransformedList.<init>(List, Transformer)"})
  void testNewTransformedList_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    TransformedList<Object> actualObjectList = new TransformedList<>(list, mock(Transformer.class));

    // Assert
    assertEquals(list, actualObjectList);
  }
}
