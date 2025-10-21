package org.apache.commons.collections4.list;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class LazyListDiffblueTest {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"LazyList LazyList.lazyList(List, Factory)"})
  public void testLazyListWithListFactory_given42_whenArrayListAdd42_thenReturnArrayList() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"LazyList LazyList.lazyList(List, Factory)"})
  public void testLazyListWithListFactory_given42_whenArrayListAdd42_thenReturnArrayList2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"LazyList LazyList.lazyList(List, Factory)"})
  public void testLazyListWithListFactory_whenArrayList_thenReturnArrayList() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"LazyList LazyList.lazyList(List, Transformer)"})
  public void testLazyListWithListTransformer_given42_whenArrayListAdd42_thenReturnArrayList() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"LazyList LazyList.lazyList(List, Transformer)"})
  public void testLazyListWithListTransformer_given42_whenArrayListAdd42_thenReturnArrayList2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"LazyList LazyList.lazyList(List, Transformer)"})
  public void testLazyListWithListTransformer_whenArrayList_thenReturnArrayList() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LazyList.<init>(List, Factory)"})
  public void testNewLazyList_given42_whenArrayListAdd42_thenReturnArrayList() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LazyList.<init>(List, Factory)"})
  public void testNewLazyList_given42_whenArrayListAdd42_thenReturnArrayList2() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LazyList.<init>(List, Transformer)"})
  public void testNewLazyList_given42_whenArrayListAdd42_thenReturnArrayList3() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LazyList.<init>(List, Transformer)"})
  public void testNewLazyList_given42_whenArrayListAdd42_thenReturnArrayList4() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LazyList.<init>(List, Factory)"})
  public void testNewLazyList_whenArrayList_thenReturnArrayList() {
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
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void LazyList.<init>(List, Transformer)"})
  public void testNewLazyList_whenArrayList_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act and Assert
    assertEquals(list, new LazyList<>(list, mock(Transformer.class)));
  }
}
