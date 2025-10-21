package org.apache.commons.collections4.list;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections4.Transformer;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class TransformedListDiffblueTest {
  /**
   * Test {@link TransformedList#transformedList(List, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedList#transformedList(List, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TransformedList TransformedList.transformedList(List, Transformer)"})
  public void testTransformedList_given42_whenArrayListAdd42_thenArrayListSizeIsOne() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    Transformer<Object, Object> transformer = mock(Transformer.class);
    when(transformer.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    TransformedList<Object> actualTransformedListResult = TransformedList.transformedList(list, transformer);

    // Assert
    verify(transformer).apply(isA(Object.class));
    assertEquals(1, list.size());
    assertEquals("Apply", list.get(0));
    assertEquals(list, actualTransformedListResult);
  }

  /**
   * Test {@link TransformedList#transformedList(List, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then {@link ArrayList#ArrayList()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedList#transformedList(List, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TransformedList TransformedList.transformedList(List, Transformer)"})
  public void testTransformedList_given42_whenArrayListAdd42_thenArrayListSizeIsTwo() {
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
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedList#transformedList(List, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TransformedList TransformedList.transformedList(List, Transformer)"})
  public void testTransformedList_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    TransformedList<Object> actualTransformedListResult = TransformedList.transformedList(list,
        mock(Transformer.class));

    // Assert
    assertEquals(list, actualTransformedListResult);
  }

  /**
   * Test {@link TransformedList#transformingList(List, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedList#transformingList(List, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TransformedList TransformedList.transformingList(List, Transformer)"})
  public void testTransformingList_given42_whenArrayListAdd42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    TransformedList<Object> actualTransformingListResult = TransformedList.transformingList(list,
        mock(Transformer.class));

    // Assert
    assertEquals(list, actualTransformingListResult);
  }

  /**
   * Test {@link TransformedList#transformingList(List, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedList#transformingList(List, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TransformedList TransformedList.transformingList(List, Transformer)"})
  public void testTransformingList_given42_whenArrayListAdd42_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    TransformedList<Object> actualTransformingListResult = TransformedList.transformingList(list,
        mock(Transformer.class));

    // Assert
    assertEquals(list, actualTransformingListResult);
  }

  /**
   * Test {@link TransformedList#transformingList(List, Transformer)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedList#transformingList(List, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"TransformedList TransformedList.transformingList(List, Transformer)"})
  public void testTransformingList_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    TransformedList<Object> actualTransformingListResult = TransformedList.transformingList(list,
        mock(Transformer.class));

    // Assert
    assertEquals(list, actualTransformingListResult);
  }

  /**
   * Test {@link TransformedList#TransformedList(List, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedList#TransformedList(List, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformedList.<init>(List, Transformer)"})
  public void testNewTransformedList_given42_whenArrayListAdd42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act and Assert
    assertEquals(list, new TransformedList<>(list, mock(Transformer.class)));
  }

  /**
   * Test {@link TransformedList#TransformedList(List, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedList#TransformedList(List, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformedList.<init>(List, Transformer)"})
  public void testNewTransformedList_given42_whenArrayListAdd42_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act and Assert
    assertEquals(list, new TransformedList<>(list, mock(Transformer.class)));
  }

  /**
   * Test {@link TransformedList#TransformedList(List, Transformer)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TransformedList#TransformedList(List, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void TransformedList.<init>(List, Transformer)"})
  public void testNewTransformedList_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act and Assert
    assertEquals(list, new TransformedList<>(list, mock(Transformer.class)));
  }
}
