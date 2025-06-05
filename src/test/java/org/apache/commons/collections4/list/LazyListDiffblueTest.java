package org.apache.commons.collections4.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.Transformer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LazyListDiffblueTest {
  /**
   * Test {@link LazyList#lazyList(List, Factory)} with {@code list}, {@code factory}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LazyList#lazyList(List, Factory)}
   */
  @Test
  @DisplayName("Test lazyList(List, Factory) with 'list', 'factory'; given '42'; when ArrayList() add '42'; then return ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"LazyList LazyList.lazyList(List, Factory)"})
  void testLazyListWithListFactory_given42_whenArrayListAdd42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    LazyList<Object> actualLazyListResult = LazyList.lazyList(list, mock(Factory.class));

    // Assert
    assertEquals(list, actualLazyListResult);
  }

  /**
   * Test {@link LazyList#lazyList(List, Factory)} with {@code list}, {@code factory}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LazyList#lazyList(List, Factory)}
   */
  @Test
  @DisplayName("Test lazyList(List, Factory) with 'list', 'factory'; given '42'; when ArrayList() add '42'; then return ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"LazyList LazyList.lazyList(List, Factory)"})
  void testLazyListWithListFactory_given42_whenArrayListAdd42_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    LazyList<Object> actualLazyListResult = LazyList.lazyList(list, mock(Factory.class));

    // Assert
    assertEquals(list, actualLazyListResult);
  }

  /**
   * Test {@link LazyList#lazyList(List, Factory)} with {@code list}, {@code factory}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LazyList#lazyList(List, Factory)}
   */
  @Test
  @DisplayName("Test lazyList(List, Factory) with 'list', 'factory'; when ArrayList(); then return ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"LazyList LazyList.lazyList(List, Factory)"})
  void testLazyListWithListFactory_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    LazyList<Object> actualLazyListResult = LazyList.lazyList(list, mock(Factory.class));

    // Assert
    assertEquals(list, actualLazyListResult);
  }

  /**
   * Test {@link LazyList#lazyList(List, Transformer)} with {@code list}, {@code transformer}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LazyList#lazyList(List, Transformer)}
   */
  @Test
  @DisplayName("Test lazyList(List, Transformer) with 'list', 'transformer'; given '42'; when ArrayList() add '42'; then return ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"LazyList LazyList.lazyList(List, Transformer)"})
  void testLazyListWithListTransformer_given42_whenArrayListAdd42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    LazyList<Object> actualLazyListResult = LazyList.lazyList(list, mock(Transformer.class));

    // Assert
    assertEquals(list, actualLazyListResult);
  }

  /**
   * Test {@link LazyList#lazyList(List, Transformer)} with {@code list}, {@code transformer}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LazyList#lazyList(List, Transformer)}
   */
  @Test
  @DisplayName("Test lazyList(List, Transformer) with 'list', 'transformer'; given '42'; when ArrayList() add '42'; then return ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"LazyList LazyList.lazyList(List, Transformer)"})
  void testLazyListWithListTransformer_given42_whenArrayListAdd42_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    LazyList<Object> actualLazyListResult = LazyList.lazyList(list, mock(Transformer.class));

    // Assert
    assertEquals(list, actualLazyListResult);
  }

  /**
   * Test {@link LazyList#lazyList(List, Transformer)} with {@code list}, {@code transformer}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LazyList#lazyList(List, Transformer)}
   */
  @Test
  @DisplayName("Test lazyList(List, Transformer) with 'list', 'transformer'; when ArrayList(); then return ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"LazyList LazyList.lazyList(List, Transformer)"})
  void testLazyListWithListTransformer_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    LazyList<Object> actualLazyListResult = LazyList.lazyList(list, mock(Transformer.class));

    // Assert
    assertEquals(list, actualLazyListResult);
  }

  /**
   * Test {@link LazyList#LazyList(List, Factory)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LazyList#LazyList(List, Factory)}
   */
  @Test
  @DisplayName("Test new LazyList(List, Factory); given '42'; when ArrayList() add '42'; then return ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LazyList.<init>(List, Factory)"})
  void testNewLazyList_given42_whenArrayListAdd42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act and Assert
    assertEquals(list, new LazyList<>(list, mock(Factory.class)));
  }

  /**
   * Test {@link LazyList#LazyList(List, Factory)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LazyList#LazyList(List, Factory)}
   */
  @Test
  @DisplayName("Test new LazyList(List, Factory); given '42'; when ArrayList() add '42'; then return ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LazyList.<init>(List, Factory)"})
  void testNewLazyList_given42_whenArrayListAdd42_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act and Assert
    assertEquals(list, new LazyList<>(list, mock(Factory.class)));
  }

  /**
   * Test {@link LazyList#LazyList(List, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LazyList#LazyList(List, Transformer)}
   */
  @Test
  @DisplayName("Test new LazyList(List, Transformer); given '42'; when ArrayList() add '42'; then return ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LazyList.<init>(List, Transformer)"})
  void testNewLazyList_given42_whenArrayListAdd42_thenReturnArrayList3() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act and Assert
    assertEquals(list, new LazyList<>(list, mock(Transformer.class)));
  }

  /**
   * Test {@link LazyList#LazyList(List, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LazyList#LazyList(List, Transformer)}
   */
  @Test
  @DisplayName("Test new LazyList(List, Transformer); given '42'; when ArrayList() add '42'; then return ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LazyList.<init>(List, Transformer)"})
  void testNewLazyList_given42_whenArrayListAdd42_thenReturnArrayList4() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act and Assert
    assertEquals(list, new LazyList<>(list, mock(Transformer.class)));
  }

  /**
   * Test {@link LazyList#LazyList(List, Factory)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LazyList#LazyList(List, Factory)}
   */
  @Test
  @DisplayName("Test new LazyList(List, Factory); when ArrayList(); then return ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LazyList.<init>(List, Factory)"})
  void testNewLazyList_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act and Assert
    assertEquals(list, new LazyList<>(list, mock(Factory.class)));
  }

  /**
   * Test {@link LazyList#LazyList(List, Transformer)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link LazyList#LazyList(List, Transformer)}
   */
  @Test
  @DisplayName("Test new LazyList(List, Transformer); when ArrayList(); then return ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void LazyList.<init>(List, Transformer)"})
  void testNewLazyList_whenArrayList_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act and Assert
    assertEquals(list, new LazyList<>(list, mock(Transformer.class)));
  }
}
