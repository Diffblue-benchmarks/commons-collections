package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import org.apache.commons.collections4.functors.DefaultEquator;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class ListUtilsDiffblueTest {
  /**
   * Test {@link ListUtils#defaultIfNull(List, List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#defaultIfNull(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.defaultIfNull(List, List)"})
  public void testDefaultIfNull_given42_whenArrayListAdd42_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    ArrayList<Object> defaultList = new ArrayList<>();
    defaultList.add("42");

    // Act
    List<Object> actualDefaultIfNullResult = ListUtils.defaultIfNull(list, defaultList);

    // Assert
    assertTrue(actualDefaultIfNullResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#defaultIfNull(List, List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#defaultIfNull(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.defaultIfNull(List, List)"})
  public void testDefaultIfNull_given42_whenArrayListAdd42_thenReturnEmpty2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    ArrayList<Object> defaultList = new ArrayList<>();
    defaultList.add("42");
    defaultList.add("42");

    // Act
    List<Object> actualDefaultIfNullResult = ListUtils.defaultIfNull(list, defaultList);

    // Assert
    assertTrue(actualDefaultIfNullResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#defaultIfNull(List, List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#defaultIfNull(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.defaultIfNull(List, List)"})
  public void testDefaultIfNull_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    List<Object> actualDefaultIfNullResult = ListUtils.defaultIfNull(list, new ArrayList<>());

    // Assert
    assertEquals(1, actualDefaultIfNullResult.size());
    assertEquals("42", actualDefaultIfNullResult.get(0));
  }

  /**
   * Test {@link ListUtils#defaultIfNull(List, List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#defaultIfNull(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.defaultIfNull(List, List)"})
  public void testDefaultIfNull_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    List<Object> actualDefaultIfNullResult = ListUtils.defaultIfNull(list, new ArrayList<>());

    // Assert
    assertEquals(2, actualDefaultIfNullResult.size());
    assertEquals("42", actualDefaultIfNullResult.get(0));
    assertEquals("42", actualDefaultIfNullResult.get(1));
  }

  /**
   * Test {@link ListUtils#defaultIfNull(List, List)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#defaultIfNull(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.defaultIfNull(List, List)"})
  public void testDefaultIfNull_whenArrayList_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    List<Object> actualDefaultIfNullResult = ListUtils.defaultIfNull(list, new ArrayList<>());

    // Assert
    assertTrue(actualDefaultIfNullResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#defaultIfNull(List, List)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#defaultIfNull(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.defaultIfNull(List, List)"})
  public void testDefaultIfNull_whenNull_thenReturnEmpty() {
    // Arrange and Act
    List<Object> actualDefaultIfNullResult = ListUtils.defaultIfNull(null, new ArrayList<>());

    // Assert
    assertTrue(actualDefaultIfNullResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#emptyIfNull(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#emptyIfNull(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.emptyIfNull(List)"})
  public void testEmptyIfNull_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    List<Object> actualEmptyIfNullResult = ListUtils.emptyIfNull(list);

    // Assert
    assertEquals(1, actualEmptyIfNullResult.size());
    assertEquals("42", actualEmptyIfNullResult.get(0));
  }

  /**
   * Test {@link ListUtils#emptyIfNull(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#emptyIfNull(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.emptyIfNull(List)"})
  public void testEmptyIfNull_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    List<Object> actualEmptyIfNullResult = ListUtils.emptyIfNull(list);

    // Assert
    assertEquals(2, actualEmptyIfNullResult.size());
    assertEquals("42", actualEmptyIfNullResult.get(0));
    assertEquals("42", actualEmptyIfNullResult.get(1));
  }

  /**
   * Test {@link ListUtils#emptyIfNull(List)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#emptyIfNull(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.emptyIfNull(List)"})
  public void testEmptyIfNull_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    List<Object> actualEmptyIfNullResult = ListUtils.emptyIfNull(new ArrayList<>());

    // Assert
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#emptyIfNull(List)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#emptyIfNull(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.emptyIfNull(List)"})
  public void testEmptyIfNull_whenNull_thenReturnEmpty() {
    // Arrange and Act
    List<Object> actualEmptyIfNullResult = ListUtils.emptyIfNull(null);

    // Assert
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#fixedSizeList(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#fixedSizeList(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.fixedSizeList(List)"})
  public void testFixedSizeList_given42_whenArrayListAdd42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    List<Object> actualFixedSizeListResult = ListUtils.fixedSizeList(list);

    // Assert
    assertEquals(list, actualFixedSizeListResult);
  }

  /**
   * Test {@link ListUtils#fixedSizeList(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#fixedSizeList(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.fixedSizeList(List)"})
  public void testFixedSizeList_given42_whenArrayListAdd42_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    List<Object> actualFixedSizeListResult = ListUtils.fixedSizeList(list);

    // Assert
    assertEquals(list, actualFixedSizeListResult);
  }

  /**
   * Test {@link ListUtils#fixedSizeList(List)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#fixedSizeList(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.fixedSizeList(List)"})
  public void testFixedSizeList_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    List<Object> actualFixedSizeListResult = ListUtils.fixedSizeList(new ArrayList<>());

    // Assert
    assertTrue(actualFixedSizeListResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#getFirst(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#getFirst(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ListUtils.getFirst(List)"})
  public void testGetFirst_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act and Assert
    assertEquals("42", ListUtils.getFirst(list));
  }

  /**
   * Test {@link ListUtils#getFirst(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#getFirst(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ListUtils.getFirst(List)"})
  public void testGetFirst_given42_whenArrayListAdd42_thenReturn422() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act and Assert
    assertEquals("42", ListUtils.getFirst(list));
  }

  /**
   * Test {@link ListUtils#getLast(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#getLast(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ListUtils.getLast(List)"})
  public void testGetLast_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act and Assert
    assertEquals("42", ListUtils.getLast(list));
  }

  /**
   * Test {@link ListUtils#getLast(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#getLast(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Object ListUtils.getLast(List)"})
  public void testGetLast_given42_whenArrayListAdd42_thenReturn422() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act and Assert
    assertEquals("42", ListUtils.getLast(list));
  }

  /**
   * Test {@link ListUtils#hashCodeForList(Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code 54145}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#hashCodeForList(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ListUtils.hashCodeForList(Collection)"})
  public void testHashCodeForList_given42_whenArrayListAdd42_thenReturn54145() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act and Assert
    assertEquals(54145, ListUtils.hashCodeForList(list));
  }

  /**
   * Test {@link ListUtils#hashCodeForList(Collection)}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add {@code null}.</li>
   *   <li>Then return thirty-one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#hashCodeForList(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ListUtils.hashCodeForList(Collection)"})
  public void testHashCodeForList_givenNull_whenLinkedHashSetAddNull_thenReturnThirtyOne() {
    // Arrange
    LinkedHashSet<?> list = new LinkedHashSet<>();
    list.add(null);

    // Act and Assert
    assertEquals(31, ListUtils.hashCodeForList(list));
  }

  /**
   * Test {@link ListUtils#hashCodeForList(Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#hashCodeForList(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ListUtils.hashCodeForList(Collection)"})
  public void testHashCodeForList_whenArrayList_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, ListUtils.hashCodeForList(new ArrayList<>()));
  }

  /**
   * Test {@link ListUtils#hashCodeForList(Collection)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#hashCodeForList(Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ListUtils.hashCodeForList(Collection)"})
  public void testHashCodeForList_whenNull_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, ListUtils.hashCodeForList(null));
  }

  /**
   * Test {@link ListUtils#indexOf(List, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@link CollectionUtils#INDEX_NOT_FOUND}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#indexOf(List, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ListUtils.indexOf(List, Predicate)"})
  public void testIndexOf_givenFalse_whenPredicateTestReturnFalse_thenReturnIndex_not_found() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    int actualIndexOfResult = ListUtils.indexOf(list, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, actualIndexOfResult);
  }

  /**
   * Test {@link ListUtils#indexOf(List, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#indexOf(List, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ListUtils.indexOf(List, Predicate)"})
  public void testIndexOf_givenTrue_whenPredicateTestReturnTrue_thenReturnZero() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    int actualIndexOfResult = ListUtils.indexOf(list, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(0, actualIndexOfResult);
  }

  /**
   * Test {@link ListUtils#indexOf(List, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return zero.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#indexOf(List, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ListUtils.indexOf(List, Predicate)"})
  public void testIndexOf_givenTrue_whenPredicateTestReturnTrue_thenReturnZero2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    int actualIndexOfResult = ListUtils.indexOf(list, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(0, actualIndexOfResult);
  }

  /**
   * Test {@link ListUtils#indexOf(List, Predicate)}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#indexOf(List, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ListUtils.indexOf(List, Predicate)"})
  public void testIndexOf_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ListUtils.indexOf(list, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link ListUtils#indexOf(List, Predicate)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link CollectionUtils#INDEX_NOT_FOUND}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#indexOf(List, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ListUtils.indexOf(List, Predicate)"})
  public void testIndexOf_whenArrayList_thenReturnIndex_not_found() {
    // Arrange, Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, ListUtils.indexOf(new ArrayList<>(), null));
  }

  /**
   * Test {@link ListUtils#indexOf(List, Predicate)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@link CollectionUtils#INDEX_NOT_FOUND}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#indexOf(List, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ListUtils.indexOf(List, Predicate)"})
  public void testIndexOf_whenNull_thenReturnIndex_not_found() {
    // Arrange, Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, ListUtils.indexOf(null, null));
  }

  /**
   * Test {@link ListUtils#indexOf(List, Predicate)}.
   * <ul>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return {@link CollectionUtils#INDEX_NOT_FOUND}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#indexOf(List, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"int ListUtils.indexOf(List, Predicate)"})
  public void testIndexOf_whenPredicate_thenReturnIndex_not_found() {
    // Arrange, Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, ListUtils.indexOf(new ArrayList<>(), mock(Predicate.class)));
  }

  /**
   * Test {@link ListUtils#intersection(List, List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#intersection(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.intersection(List, List)"})
  public void testIntersection_given42_whenArrayListAdd42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("42");

    // Act
    List<Object> actualIntersectionResult = ListUtils.intersection(list1, list2);

    // Assert
    assertEquals(list1, actualIntersectionResult);
  }

  /**
   * Test {@link ListUtils#intersection(List, List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#intersection(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.intersection(List, List)"})
  public void testIntersection_given42_whenArrayListAdd42_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");

    // Act
    List<Object> actualIntersectionResult = ListUtils.intersection(list1, new ArrayList<>());

    // Assert
    assertTrue(actualIntersectionResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#intersection(List, List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#intersection(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.intersection(List, List)"})
  public void testIntersection_given42_whenArrayListAdd42_thenReturnEmpty2() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");
    list1.add("42");

    // Act
    List<Object> actualIntersectionResult = ListUtils.intersection(list1, new ArrayList<>());

    // Assert
    assertTrue(actualIntersectionResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#intersection(List, List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#intersection(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.intersection(List, List)"})
  public void testIntersection_given42_whenArrayList_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("42");

    // Act
    List<Object> actualIntersectionResult = ListUtils.intersection(list1, list2);

    // Assert
    assertTrue(actualIntersectionResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#intersection(List, List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#intersection(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.intersection(List, List)"})
  public void testIntersection_given42_whenArrayList_thenReturnEmpty2() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("42");
    list2.add("42");

    // Act
    List<Object> actualIntersectionResult = ListUtils.intersection(list1, list2);

    // Assert
    assertTrue(actualIntersectionResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#intersection(List, List)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#intersection(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.intersection(List, List)"})
  public void testIntersection_whenArrayList_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();

    // Act
    List<Object> actualIntersectionResult = ListUtils.intersection(list1, new ArrayList<>());

    // Assert
    assertTrue(actualIntersectionResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#isEqualList(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#isEqualList(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListUtils.isEqualList(Collection, Collection)"})
  public void testIsEqualList_given42_whenArrayListAdd42_thenReturnFalse() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");

    // Act and Assert
    assertFalse(ListUtils.isEqualList(list1, new ArrayList<>()));
  }

  /**
   * Test {@link ListUtils#isEqualList(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#isEqualList(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListUtils.isEqualList(Collection, Collection)"})
  public void testIsEqualList_given42_whenArrayListAdd42_thenReturnFalse2() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");
    list1.add("42");

    // Act and Assert
    assertFalse(ListUtils.isEqualList(list1, new ArrayList<>()));
  }

  /**
   * Test {@link ListUtils#isEqualList(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#isEqualList(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListUtils.isEqualList(Collection, Collection)"})
  public void testIsEqualList_given42_whenArrayListAdd42_thenReturnFalse3() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("42");

    // Act and Assert
    assertFalse(ListUtils.isEqualList(list1, list2));
  }

  /**
   * Test {@link ListUtils#isEqualList(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#isEqualList(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListUtils.isEqualList(Collection, Collection)"})
  public void testIsEqualList_given42_whenArrayListAdd42_thenReturnFalse4() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("42");
    list2.add("42");

    // Act and Assert
    assertFalse(ListUtils.isEqualList(list1, list2));
  }

  /**
   * Test {@link ListUtils#isEqualList(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#isEqualList(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListUtils.isEqualList(Collection, Collection)"})
  public void testIsEqualList_given42_whenArrayListAdd42_thenReturnTrue() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("42");

    // Act and Assert
    assertTrue(ListUtils.isEqualList(list1, list2));
  }

  /**
   * Test {@link ListUtils#isEqualList(Collection, Collection)}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link ArrayList#ArrayList()} add two.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#isEqualList(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListUtils.isEqualList(Collection, Collection)"})
  public void testIsEqualList_givenTwo_whenArrayListAddTwo_thenReturnFalse() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add(2);

    // Act and Assert
    assertFalse(ListUtils.isEqualList(list1, list2));
  }

  /**
   * Test {@link ListUtils#isEqualList(Collection, Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#isEqualList(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListUtils.isEqualList(Collection, Collection)"})
  public void testIsEqualList_whenArrayList_thenReturnTrue() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();

    // Act and Assert
    assertTrue(ListUtils.isEqualList(list1, new ArrayList<>()));
  }

  /**
   * Test {@link ListUtils#isEqualList(Collection, Collection)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#isEqualList(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListUtils.isEqualList(Collection, Collection)"})
  public void testIsEqualList_whenNull_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(ListUtils.isEqualList(null, new ArrayList<>()));
  }

  /**
   * Test {@link ListUtils#isEqualList(Collection, Collection)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#isEqualList(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListUtils.isEqualList(Collection, Collection)"})
  public void testIsEqualList_whenNull_thenReturnFalse2() {
    // Arrange, Act and Assert
    assertFalse(ListUtils.isEqualList(new ArrayList<>(), null));
  }

  /**
   * Test {@link ListUtils#isEqualList(Collection, Collection)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#isEqualList(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean ListUtils.isEqualList(Collection, Collection)"})
  public void testIsEqualList_whenNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(ListUtils.isEqualList(null, null));
  }

  /**
   * Test {@link ListUtils#lazyList(List, Factory)} with {@code list}, {@code factory}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#lazyList(List, Factory)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.lazyList(List, Factory)"})
  public void testLazyListWithListFactory_given42_whenArrayListAdd42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    List<Object> actualLazyListResult = ListUtils.lazyList(list, mock(Factory.class));

    // Assert
    assertEquals(list, actualLazyListResult);
  }

  /**
   * Test {@link ListUtils#lazyList(List, Factory)} with {@code list}, {@code factory}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#lazyList(List, Factory)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.lazyList(List, Factory)"})
  public void testLazyListWithListFactory_given42_whenArrayListAdd42_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    List<Object> actualLazyListResult = ListUtils.lazyList(list, mock(Factory.class));

    // Assert
    assertEquals(list, actualLazyListResult);
  }

  /**
   * Test {@link ListUtils#lazyList(List, Factory)} with {@code list}, {@code factory}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#lazyList(List, Factory)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.lazyList(List, Factory)"})
  public void testLazyListWithListFactory_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    List<Object> actualLazyListResult = ListUtils.lazyList(new ArrayList<>(), mock(Factory.class));

    // Assert
    assertTrue(actualLazyListResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#lazyList(List, Transformer)} with {@code list}, {@code transformer}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#lazyList(List, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.lazyList(List, Transformer)"})
  public void testLazyListWithListTransformer_given42_whenArrayListAdd42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    List<Object> actualLazyListResult = ListUtils.lazyList(list, mock(Transformer.class));

    // Assert
    assertEquals(list, actualLazyListResult);
  }

  /**
   * Test {@link ListUtils#lazyList(List, Transformer)} with {@code list}, {@code transformer}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#lazyList(List, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.lazyList(List, Transformer)"})
  public void testLazyListWithListTransformer_given42_whenArrayListAdd42_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    List<Object> actualLazyListResult = ListUtils.lazyList(list, mock(Transformer.class));

    // Assert
    assertEquals(list, actualLazyListResult);
  }

  /**
   * Test {@link ListUtils#lazyList(List, Transformer)} with {@code list}, {@code transformer}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#lazyList(List, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.lazyList(List, Transformer)"})
  public void testLazyListWithListTransformer_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    List<Object> actualLazyListResult = ListUtils.lazyList(new ArrayList<>(), mock(Transformer.class));

    // Assert
    assertTrue(actualLazyListResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List)"})
  public void testLongestCommonSubsequenceWithAB_given42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(a, b);

    // Assert
    assertEquals(a, actualLongestCommonSubsequenceResult);
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List)"})
  public void testLongestCommonSubsequenceWithAB_given42_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    b.add("42");

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(a, b);

    // Assert
    assertEquals(a, actualLongestCommonSubsequenceResult);
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List)"})
  public void testLongestCommonSubsequenceWithAB_given42_thenReturnArrayList3() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    b.add("42");
    b.add("42");

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(a, b);

    // Assert
    assertEquals(a, actualLongestCommonSubsequenceResult);
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List)"})
  public void testLongestCommonSubsequenceWithAB_given42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(a, b);

    // Assert
    assertEquals(1, actualLongestCommonSubsequenceResult.size());
    assertEquals("42", actualLongestCommonSubsequenceResult.get(0));
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List)"})
  public void testLongestCommonSubsequenceWithAB_given42_thenReturnSizeIsOne2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");
    a.add("42");
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(a, b);

    // Assert
    assertEquals(1, actualLongestCommonSubsequenceResult.size());
    assertEquals("42", actualLongestCommonSubsequenceResult.get(0));
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List)"})
  public void testLongestCommonSubsequenceWithAB_given42_whenArrayList_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(a, new ArrayList<>());

    // Assert
    assertTrue(actualLongestCommonSubsequenceResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List)"})
  public void testLongestCommonSubsequenceWithAB_given42_whenArrayList_thenReturnEmpty2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");
    a.add("42");

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(a, new ArrayList<>());

    // Assert
    assertTrue(actualLongestCommonSubsequenceResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List)"})
  public void testLongestCommonSubsequenceWithAB_given42_whenArrayList_thenReturnEmpty3() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(a, b);

    // Assert
    assertTrue(actualLongestCommonSubsequenceResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List)"})
  public void testLongestCommonSubsequenceWithAB_given42_whenArrayList_thenReturnEmpty4() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    b.add("42");

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(a, b);

    // Assert
    assertTrue(actualLongestCommonSubsequenceResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List)"})
  public void testLongestCommonSubsequenceWithAB_givenTwo_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    b.add(2);

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(a, b);

    // Assert
    assertEquals(a, actualLongestCommonSubsequenceResult);
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List)"})
  public void testLongestCommonSubsequenceWithAB_givenTwo_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add(2);

    ArrayList<Object> b = new ArrayList<>();
    b.add(2);
    b.add("42");
    b.add("42");
    b.add("42");

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(a, b);

    // Assert
    assertEquals(a, actualLongestCommonSubsequenceResult);
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List)"})
  public void testLongestCommonSubsequenceWithAB_givenTwo_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add(2);
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    b.add("42");
    b.add("42");

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(a, b);

    // Assert
    assertEquals(1, actualLongestCommonSubsequenceResult.size());
    assertEquals("42", actualLongestCommonSubsequenceResult.get(0));
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List)"})
  public void testLongestCommonSubsequenceWithAB_givenTwo_thenReturnSizeIsOne2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");
    a.add("42");
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add(2);
    b.add("42");

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(a, b);

    // Assert
    assertEquals(1, actualLongestCommonSubsequenceResult.size());
    assertEquals("42", actualLongestCommonSubsequenceResult.get(0));
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link ArrayList#ArrayList()} add two.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List)"})
  public void testLongestCommonSubsequenceWithAB_givenTwo_whenArrayListAddTwo_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add(2);

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(a, b);

    // Assert
    assertTrue(actualLongestCommonSubsequenceResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link ArrayList#ArrayList()} add two.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List)"})
  public void testLongestCommonSubsequenceWithAB_givenTwo_whenArrayListAddTwo_thenReturnEmpty2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add(2);

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(a, b);

    // Assert
    assertTrue(actualLongestCommonSubsequenceResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List)} with {@code a}, {@code b}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link ArrayList#ArrayList()} add two.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List)"})
  public void testLongestCommonSubsequenceWithAB_givenTwo_whenArrayListAddTwo_thenReturnEmpty3() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add(2);

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    b.add("42");
    b.add("42");

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(a, b);

    // Assert
    assertTrue(actualLongestCommonSubsequenceResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List)} with {@code a}, {@code b}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List)"})
  public void testLongestCommonSubsequenceWithAB_whenArrayList_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(a, new ArrayList<>());

    // Assert
    assertTrue(actualLongestCommonSubsequenceResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(CharSequence, CharSequence)} with {@code charSequenceA}, {@code charSequenceB}.
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(CharSequence, CharSequence)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String ListUtils.longestCommonSubsequence(CharSequence, CharSequence)"})
  public void testLongestCommonSubsequenceWithCharSequenceACharSequenceB() {
    // Arrange, Act and Assert
    assertEquals("",
        ListUtils.longestCommonSubsequence(Integer.toString(CollectionUtils.INDEX_NOT_FOUND), CollectionUtils.COLON));
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(CharSequence, CharSequence)} with {@code charSequenceA}, {@code charSequenceB}.
   * <ul>
   *   <li>Then return {@link CollectionUtils#COLON}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(CharSequence, CharSequence)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String ListUtils.longestCommonSubsequence(CharSequence, CharSequence)"})
  public void testLongestCommonSubsequenceWithCharSequenceACharSequenceB_thenReturnColon() {
    // Arrange, Act and Assert
    assertEquals(CollectionUtils.COLON,
        ListUtils.longestCommonSubsequence(CollectionUtils.COLON, CollectionUtils.COLON));
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(CharSequence, CharSequence)} with {@code charSequenceA}, {@code charSequenceB}.
   * <ul>
   *   <li>When {@code Char Sequence B}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(CharSequence, CharSequence)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String ListUtils.longestCommonSubsequence(CharSequence, CharSequence)"})
  public void testLongestCommonSubsequenceWithCharSequenceACharSequenceB_whenCharSequenceB() {
    // Arrange, Act and Assert
    assertEquals("", ListUtils.longestCommonSubsequence(CollectionUtils.DEFAULT_TOSTRING_PREFIX, "Char Sequence B"));
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(CharSequence, CharSequence)} with {@code charSequenceA}, {@code charSequenceB}.
   * <ul>
   *   <li>When {@code charSequenceB}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(CharSequence, CharSequence)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String ListUtils.longestCommonSubsequence(CharSequence, CharSequence)"})
  public void testLongestCommonSubsequenceWithCharSequenceACharSequenceB_whenCharSequenceB2() {
    // Arrange, Act and Assert
    assertEquals("", ListUtils.longestCommonSubsequence(CollectionUtils.DEFAULT_TOSTRING_PREFIX, "charSequenceB"));
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(CharSequence, CharSequence)} with {@code charSequenceA}, {@code charSequenceB}.
   * <ul>
   *   <li>When {@link CollectionUtils#COMMA}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(CharSequence, CharSequence)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String ListUtils.longestCommonSubsequence(CharSequence, CharSequence)"})
  public void testLongestCommonSubsequenceWithCharSequenceACharSequenceB_whenComma() {
    // Arrange, Act and Assert
    assertEquals("", ListUtils.longestCommonSubsequence(CollectionUtils.COMMA, CollectionUtils.COLON));
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(CharSequence, CharSequence)} with {@code charSequenceA}, {@code charSequenceB}.
   * <ul>
   *   <li>When toString {@link Integer#MIN_VALUE}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(CharSequence, CharSequence)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.lang.String ListUtils.longestCommonSubsequence(CharSequence, CharSequence)"})
  public void testLongestCommonSubsequenceWithCharSequenceACharSequenceB_whenToStringMin_value() {
    // Arrange, Act and Assert
    assertEquals("", ListUtils.longestCommonSubsequence(Integer.toString(Integer.MIN_VALUE), CollectionUtils.COLON));
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List, Equator)} with {@code listA}, {@code listB}, {@code equator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List, Equator)"})
  public void testLongestCommonSubsequenceWithListAListBEquator_given42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> listA = new ArrayList<>();
    listA.add("42");

    ArrayList<Object> listB = new ArrayList<>();
    listB.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(listA, listB, equator);

    // Assert
    assertEquals(listA, actualLongestCommonSubsequenceResult);
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List, Equator)} with {@code listA}, {@code listB}, {@code equator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List, Equator)"})
  public void testLongestCommonSubsequenceWithListAListBEquator_given42_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> listA = new ArrayList<>();
    listA.add("42");

    ArrayList<Object> listB = new ArrayList<>();
    listB.add("42");
    listB.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(listA, listB, equator);

    // Assert
    assertEquals(listA, actualLongestCommonSubsequenceResult);
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List, Equator)} with {@code listA}, {@code listB}, {@code equator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List, Equator)"})
  public void testLongestCommonSubsequenceWithListAListBEquator_given42_thenReturnArrayList3() {
    // Arrange
    ArrayList<Object> listA = new ArrayList<>();
    listA.add("42");

    ArrayList<Object> listB = new ArrayList<>();
    listB.add("42");
    listB.add("42");
    listB.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(listA, listB, equator);

    // Assert
    assertEquals(listA, actualLongestCommonSubsequenceResult);
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List, Equator)} with {@code listA}, {@code listB}, {@code equator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List, Equator)"})
  public void testLongestCommonSubsequenceWithListAListBEquator_given42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> listA = new ArrayList<>();
    listA.add("42");
    listA.add("42");

    ArrayList<Object> listB = new ArrayList<>();
    listB.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(listA, listB, equator);

    // Assert
    assertEquals(1, actualLongestCommonSubsequenceResult.size());
    assertEquals("42", actualLongestCommonSubsequenceResult.get(0));
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List, Equator)} with {@code listA}, {@code listB}, {@code equator}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List, Equator)"})
  public void testLongestCommonSubsequenceWithListAListBEquator_given42_thenReturnSizeIsOne2() {
    // Arrange
    ArrayList<Object> listA = new ArrayList<>();
    listA.add("42");
    listA.add("42");
    listA.add("42");

    ArrayList<Object> listB = new ArrayList<>();
    listB.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(listA, listB, equator);

    // Assert
    assertEquals(1, actualLongestCommonSubsequenceResult.size());
    assertEquals("42", actualLongestCommonSubsequenceResult.get(0));
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List, Equator)} with {@code listA}, {@code listB}, {@code equator}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List, Equator)"})
  public void testLongestCommonSubsequenceWithListAListBEquator_givenTwo_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> listA = new ArrayList<>();
    listA.add("42");

    ArrayList<Object> listB = new ArrayList<>();
    listB.add("42");
    listB.add(2);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(listA, listB, equator);

    // Assert
    assertEquals(listA, actualLongestCommonSubsequenceResult);
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List, Equator)} with {@code listA}, {@code listB}, {@code equator}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List, Equator)"})
  public void testLongestCommonSubsequenceWithListAListBEquator_givenTwo_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> listA = new ArrayList<>();
    listA.add(2);

    ArrayList<Object> listB = new ArrayList<>();
    listB.add(2);
    listB.add("42");
    listB.add("42");
    listB.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(listA, listB, equator);

    // Assert
    assertEquals(listA, actualLongestCommonSubsequenceResult);
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List, Equator)} with {@code listA}, {@code listB}, {@code equator}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List, Equator)"})
  public void testLongestCommonSubsequenceWithListAListBEquator_givenTwo_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> listA = new ArrayList<>();
    listA.add(2);
    listA.add("42");

    ArrayList<Object> listB = new ArrayList<>();
    listB.add("42");
    listB.add("42");
    listB.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(listA, listB, equator);

    // Assert
    assertEquals(1, actualLongestCommonSubsequenceResult.size());
    assertEquals("42", actualLongestCommonSubsequenceResult.get(0));
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List, Equator)} with {@code listA}, {@code listB}, {@code equator}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List, Equator)"})
  public void testLongestCommonSubsequenceWithListAListBEquator_givenTwo_thenReturnSizeIsOne2() {
    // Arrange
    ArrayList<Object> listA = new ArrayList<>();
    listA.add("42");
    listA.add("42");
    listA.add("42");

    ArrayList<Object> listB = new ArrayList<>();
    listB.add(2);
    listB.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(listA, listB, equator);

    // Assert
    assertEquals(1, actualLongestCommonSubsequenceResult.size());
    assertEquals("42", actualLongestCommonSubsequenceResult.get(0));
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List, Equator)} with {@code listA}, {@code listB}, {@code equator}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link ArrayList#ArrayList()} add two.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List, Equator)"})
  public void testLongestCommonSubsequenceWithListAListBEquator_givenTwo_whenArrayListAddTwo() {
    // Arrange
    ArrayList<Object> listA = new ArrayList<>();
    listA.add("42");

    ArrayList<Object> listB = new ArrayList<>();
    listB.add(2);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(listA, listB, equator);

    // Assert
    assertTrue(actualLongestCommonSubsequenceResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List, Equator)} with {@code listA}, {@code listB}, {@code equator}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link ArrayList#ArrayList()} add two.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List, Equator)"})
  public void testLongestCommonSubsequenceWithListAListBEquator_givenTwo_whenArrayListAddTwo2() {
    // Arrange
    ArrayList<Object> listA = new ArrayList<>();
    listA.add("42");
    listA.add("42");

    ArrayList<Object> listB = new ArrayList<>();
    listB.add(2);
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(listA, listB, equator);

    // Assert
    assertTrue(actualLongestCommonSubsequenceResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List, Equator)} with {@code listA}, {@code listB}, {@code equator}.
   * <ul>
   *   <li>Given two.</li>
   *   <li>When {@link ArrayList#ArrayList()} add two.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List, Equator)"})
  public void testLongestCommonSubsequenceWithListAListBEquator_givenTwo_whenArrayListAddTwo3() {
    // Arrange
    ArrayList<Object> listA = new ArrayList<>();
    listA.add(2);

    ArrayList<Object> listB = new ArrayList<>();
    listB.add("42");
    listB.add("42");
    listB.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(listA, listB, equator);

    // Assert
    assertTrue(actualLongestCommonSubsequenceResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List, Equator)} with {@code listA}, {@code listB}, {@code equator}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List, Equator)"})
  public void testLongestCommonSubsequenceWithListAListBEquator_whenArrayList_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> listA = new ArrayList<>();
    ArrayList<Object> listB = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(listA, listB, equator);

    // Assert
    assertTrue(actualLongestCommonSubsequenceResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List, Equator)} with {@code listA}, {@code listB}, {@code equator}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List, Equator)"})
  public void testLongestCommonSubsequenceWithListAListBEquator_whenArrayList_thenReturnEmpty2() {
    // Arrange
    ArrayList<Object> listA = new ArrayList<>();
    listA.add("42");
    ArrayList<Object> listB = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(listA, listB, equator);

    // Assert
    assertTrue(actualLongestCommonSubsequenceResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List, Equator)} with {@code listA}, {@code listB}, {@code equator}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List, Equator)"})
  public void testLongestCommonSubsequenceWithListAListBEquator_whenArrayList_thenReturnEmpty3() {
    // Arrange
    ArrayList<Object> listA = new ArrayList<>();
    listA.add("42");
    listA.add("42");
    ArrayList<Object> listB = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(listA, listB, equator);

    // Assert
    assertTrue(actualLongestCommonSubsequenceResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List, Equator)} with {@code listA}, {@code listB}, {@code equator}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List, Equator)"})
  public void testLongestCommonSubsequenceWithListAListBEquator_whenArrayList_thenReturnEmpty4() {
    // Arrange
    ArrayList<Object> listA = new ArrayList<>();

    ArrayList<Object> listB = new ArrayList<>();
    listB.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(listA, listB, equator);

    // Assert
    assertTrue(actualLongestCommonSubsequenceResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#longestCommonSubsequence(List, List, Equator)} with {@code listA}, {@code listB}, {@code equator}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.longestCommonSubsequence(List, List, Equator)"})
  public void testLongestCommonSubsequenceWithListAListBEquator_whenArrayList_thenReturnEmpty5() {
    // Arrange
    ArrayList<Object> listA = new ArrayList<>();

    ArrayList<Object> listB = new ArrayList<>();
    listB.add("42");
    listB.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(listA, listB, equator);

    // Assert
    assertTrue(actualLongestCommonSubsequenceResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#partition(List, int)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#partition(List, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.partition(List, int)"})
  public void testPartition_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    List<List<Object>> actualPartitionResult = ListUtils.partition(list, 3);

    // Assert
    assertEquals(1, actualPartitionResult.size());
    assertEquals(list, actualPartitionResult.get(0));
  }

  /**
   * Test {@link ListUtils#partition(List, int)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#partition(List, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.partition(List, int)"})
  public void testPartition_given42_whenArrayListAdd42_thenReturnSizeIsOne2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    List<List<Object>> actualPartitionResult = ListUtils.partition(list, 3);

    // Assert
    assertEquals(1, actualPartitionResult.size());
    assertEquals(list, actualPartitionResult.get(0));
  }

  /**
   * Test {@link ListUtils#partition(List, int)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#partition(List, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.partition(List, int)"})
  public void testPartition_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    List<List<Object>> actualPartitionResult = ListUtils.partition(new ArrayList<>(), 3);

    // Assert
    assertTrue(actualPartitionResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#partition(List, int)}.
   * <ul>
   *   <li>When zero.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#partition(List, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.partition(List, int)"})
  public void testPartition_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ListUtils.partition(new ArrayList<>(), 0));
  }

  /**
   * Test {@link ListUtils#predicatedList(List, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#predicatedList(List, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.predicatedList(List, Predicate)"})
  public void testPredicatedList_givenTrue_whenPredicateTestReturnTrue_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    List<Object> actualPredicatedListResult = ListUtils.predicatedList(list, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(list, actualPredicatedListResult);
  }

  /**
   * Test {@link ListUtils#predicatedList(List, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#predicatedList(List, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.predicatedList(List, Predicate)"})
  public void testPredicatedList_givenTrue_whenPredicateTestReturnTrue_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    List<Object> actualPredicatedListResult = ListUtils.predicatedList(list, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(list, actualPredicatedListResult);
  }

  /**
   * Test {@link ListUtils#predicatedList(List, Predicate)}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#predicatedList(List, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.predicatedList(List, Predicate)"})
  public void testPredicatedList_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("collection"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ListUtils.predicatedList(list, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link ListUtils#predicatedList(List, Predicate)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#predicatedList(List, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.predicatedList(List, Predicate)"})
  public void testPredicatedList_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    List<Object> actualPredicatedListResult = ListUtils.predicatedList(new ArrayList<>(), mock(Predicate.class));

    // Assert
    assertTrue(actualPredicatedListResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#removeAll(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#removeAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.removeAll(Collection, Collection)"})
  public void testRemoveAll_given42_whenArrayListAdd42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    List<Object> actualRemoveAllResult = ListUtils.removeAll(collection, new ArrayList<>());

    // Assert
    assertEquals(collection, actualRemoveAllResult);
  }

  /**
   * Test {@link ListUtils#removeAll(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#removeAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.removeAll(Collection, Collection)"})
  public void testRemoveAll_given42_whenArrayListAdd42_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    List<Object> actualRemoveAllResult = ListUtils.removeAll(collection, new ArrayList<>());

    // Assert
    assertEquals(collection, actualRemoveAllResult);
  }

  /**
   * Test {@link ListUtils#removeAll(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#removeAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.removeAll(Collection, Collection)"})
  public void testRemoveAll_given42_whenArrayListAdd42_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    ArrayList<Object> remove = new ArrayList<>();
    remove.add("42");

    // Act
    List<Object> actualRemoveAllResult = ListUtils.removeAll(collection, remove);

    // Assert
    assertTrue(actualRemoveAllResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#removeAll(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#removeAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.removeAll(Collection, Collection)"})
  public void testRemoveAll_given42_whenArrayList_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> remove = new ArrayList<>();
    remove.add("42");

    // Act
    List<Object> actualRemoveAllResult = ListUtils.removeAll(collection, remove);

    // Assert
    assertTrue(actualRemoveAllResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#removeAll(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#removeAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.removeAll(Collection, Collection)"})
  public void testRemoveAll_given42_whenArrayList_thenReturnEmpty2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> remove = new ArrayList<>();
    remove.add("42");
    remove.add("42");

    // Act
    List<Object> actualRemoveAllResult = ListUtils.removeAll(collection, remove);

    // Assert
    assertTrue(actualRemoveAllResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#removeAll(Collection, Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#removeAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.removeAll(Collection, Collection)"})
  public void testRemoveAll_whenArrayList_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act
    List<Object> actualRemoveAllResult = ListUtils.removeAll(collection, new ArrayList<>());

    // Assert
    assertTrue(actualRemoveAllResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#retainAll(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#retainAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.retainAll(Collection, Collection)"})
  public void testRetainAll_given42_whenArrayListAdd42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    ArrayList<Object> retain = new ArrayList<>();
    retain.add("42");

    // Act
    List<Object> actualRetainAllResult = ListUtils.retainAll(collection, retain);

    // Assert
    assertEquals(collection, actualRetainAllResult);
  }

  /**
   * Test {@link ListUtils#retainAll(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#retainAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.retainAll(Collection, Collection)"})
  public void testRetainAll_given42_whenArrayListAdd42_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    List<Object> actualRetainAllResult = ListUtils.retainAll(collection, new ArrayList<>());

    // Assert
    assertTrue(actualRetainAllResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#retainAll(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#retainAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.retainAll(Collection, Collection)"})
  public void testRetainAll_given42_whenArrayListAdd42_thenReturnEmpty2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    List<Object> actualRetainAllResult = ListUtils.retainAll(collection, new ArrayList<>());

    // Assert
    assertTrue(actualRetainAllResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#retainAll(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#retainAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.retainAll(Collection, Collection)"})
  public void testRetainAll_given42_whenArrayList_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> retain = new ArrayList<>();
    retain.add("42");

    // Act
    List<Object> actualRetainAllResult = ListUtils.retainAll(collection, retain);

    // Assert
    assertTrue(actualRetainAllResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#retainAll(Collection, Collection)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#retainAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.retainAll(Collection, Collection)"})
  public void testRetainAll_given42_whenArrayList_thenReturnEmpty2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    ArrayList<Object> retain = new ArrayList<>();
    retain.add("42");
    retain.add("42");

    // Act
    List<Object> actualRetainAllResult = ListUtils.retainAll(collection, retain);

    // Assert
    assertTrue(actualRetainAllResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#retainAll(Collection, Collection)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#retainAll(Collection, Collection)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.retainAll(Collection, Collection)"})
  public void testRetainAll_whenArrayList_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act
    List<Object> actualRetainAllResult = ListUtils.retainAll(collection, new ArrayList<>());

    // Assert
    assertTrue(actualRetainAllResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#select(Collection, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#select(Collection, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.select(Collection, Predicate)"})
  public void testSelect_givenFalse_whenPredicateTestReturnFalse_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    List<Object> actualSelectResult = ListUtils.select(inputCollection, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#select(Collection, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#select(Collection, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.select(Collection, Predicate)"})
  public void testSelect_givenTrue_whenPredicateTestReturnTrue_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    List<Object> actualSelectResult = ListUtils.select(inputCollection, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(inputCollection, actualSelectResult);
  }

  /**
   * Test {@link ListUtils#select(Collection, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#select(Collection, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.select(Collection, Predicate)"})
  public void testSelect_givenTrue_whenPredicateTestReturnTrue_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    inputCollection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    List<Object> actualSelectResult = ListUtils.select(inputCollection, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(inputCollection, actualSelectResult);
  }

  /**
   * Test {@link ListUtils#select(Collection, Predicate)}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#select(Collection, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.select(Collection, Predicate)"})
  public void testSelect_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ListUtils.select(inputCollection, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link ListUtils#select(Collection, Predicate)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#select(Collection, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.select(Collection, Predicate)"})
  public void testSelect_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    List<Object> actualSelectResult = ListUtils.select(new ArrayList<>(), null);

    // Assert
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#select(Collection, Predicate)}.
   * <ul>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#select(Collection, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.select(Collection, Predicate)"})
  public void testSelect_whenPredicate_thenReturnEmpty() {
    // Arrange and Act
    List<Object> actualSelectResult = ListUtils.select(new ArrayList<>(), mock(Predicate.class));

    // Assert
    assertTrue(actualSelectResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#selectRejected(Collection, Predicate)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code false}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#selectRejected(Collection, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.selectRejected(Collection, Predicate)"})
  public void testSelectRejected_givenFalse_whenPredicateTestReturnFalse_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    // Act
    List<Object> actualSelectRejectedResult = ListUtils.selectRejected(inputCollection, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(inputCollection, actualSelectRejectedResult);
  }

  /**
   * Test {@link ListUtils#selectRejected(Collection, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#selectRejected(Collection, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.selectRejected(Collection, Predicate)"})
  public void testSelectRejected_givenTrue_whenPredicateTestReturnTrue_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    List<Object> actualSelectRejectedResult = ListUtils.selectRejected(inputCollection, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertTrue(actualSelectRejectedResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#selectRejected(Collection, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#selectRejected(Collection, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.selectRejected(Collection, Predicate)"})
  public void testSelectRejected_givenTrue_whenPredicateTestReturnTrue_thenReturnEmpty2() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    inputCollection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    List<Object> actualSelectRejectedResult = ListUtils.selectRejected(inputCollection, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertTrue(actualSelectRejectedResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#selectRejected(Collection, Predicate)}.
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#selectRejected(Collection, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.selectRejected(Collection, Predicate)"})
  public void testSelectRejected_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<Object> inputCollection = new ArrayList<>();
    inputCollection.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenThrow(new IllegalArgumentException("foo"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ListUtils.selectRejected(inputCollection, predicate));
    verify(predicate).test(isA(Object.class));
  }

  /**
   * Test {@link ListUtils#selectRejected(Collection, Predicate)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#selectRejected(Collection, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.selectRejected(Collection, Predicate)"})
  public void testSelectRejected_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    List<Object> actualSelectRejectedResult = ListUtils.selectRejected(new ArrayList<>(), null);

    // Assert
    assertTrue(actualSelectRejectedResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#selectRejected(Collection, Predicate)}.
   * <ul>
   *   <li>When {@link Predicate}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#selectRejected(Collection, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.selectRejected(Collection, Predicate)"})
  public void testSelectRejected_whenPredicate_thenReturnEmpty() {
    // Arrange and Act
    List<Object> actualSelectRejectedResult = ListUtils.selectRejected(new ArrayList<>(), mock(Predicate.class));

    // Assert
    assertTrue(actualSelectRejectedResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#subtract(List, List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#subtract(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.subtract(List, List)"})
  public void testSubtract_given42_whenArrayListAdd42_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("42");

    // Act
    List<Object> actualSubtractResult = ListUtils.subtract(list1, list2);

    // Assert
    assertTrue(actualSubtractResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#subtract(List, List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#subtract(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.subtract(List, List)"})
  public void testSubtract_given42_whenArrayListAdd42_thenReturnEmpty2() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("42");
    list2.add("42");

    // Act
    List<Object> actualSubtractResult = ListUtils.subtract(list1, list2);

    // Assert
    assertTrue(actualSubtractResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#subtract(List, List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#subtract(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.subtract(List, List)"})
  public void testSubtract_given42_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");

    // Act
    List<Object> actualSubtractResult = ListUtils.subtract(list1, new ArrayList<>());

    // Assert
    assertEquals(list1, actualSubtractResult);
  }

  /**
   * Test {@link ListUtils#subtract(List, List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#subtract(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.subtract(List, List)"})
  public void testSubtract_given42_whenArrayList_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");
    list1.add("42");

    // Act
    List<Object> actualSubtractResult = ListUtils.subtract(list1, new ArrayList<>());

    // Assert
    assertEquals(list1, actualSubtractResult);
  }

  /**
   * Test {@link ListUtils#subtract(List, List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#subtract(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.subtract(List, List)"})
  public void testSubtract_given42_whenArrayList_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("42");

    // Act
    List<Object> actualSubtractResult = ListUtils.subtract(list1, list2);

    // Assert
    assertTrue(actualSubtractResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#subtract(List, List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#subtract(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.subtract(List, List)"})
  public void testSubtract_given42_whenArrayList_thenReturnEmpty2() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("42");
    list2.add("42");

    // Act
    List<Object> actualSubtractResult = ListUtils.subtract(list1, list2);

    // Assert
    assertTrue(actualSubtractResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#subtract(List, List)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#subtract(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.subtract(List, List)"})
  public void testSubtract_whenArrayList_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();

    // Act
    List<Object> actualSubtractResult = ListUtils.subtract(list1, new ArrayList<>());

    // Assert
    assertTrue(actualSubtractResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#sum(List, List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#sum(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.sum(List, List)"})
  public void testSum_given42_whenArrayListAdd42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");

    // Act
    List<Object> actualSumResult = ListUtils.sum(list1, new ArrayList<>());

    // Assert
    assertEquals(list1, actualSumResult);
  }

  /**
   * Test {@link ListUtils#sum(List, List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#sum(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.sum(List, List)"})
  public void testSum_given42_whenArrayListAdd42_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");
    list1.add("42");

    // Act
    List<Object> actualSumResult = ListUtils.sum(list1, new ArrayList<>());

    // Assert
    assertEquals(list1, actualSumResult);
  }

  /**
   * Test {@link ListUtils#sum(List, List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#sum(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.sum(List, List)"})
  public void testSum_given42_whenArrayListAdd42_thenReturnArrayList3() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("42");

    // Act
    List<Object> actualSumResult = ListUtils.sum(list1, list2);

    // Assert
    assertEquals(list1, actualSumResult);
  }

  /**
   * Test {@link ListUtils#sum(List, List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#sum(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.sum(List, List)"})
  public void testSum_given42_whenArrayList_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("42");

    // Act
    List<Object> actualSumResult = ListUtils.sum(list1, list2);

    // Assert
    assertEquals(1, actualSumResult.size());
    assertEquals("42", actualSumResult.get(0));
  }

  /**
   * Test {@link ListUtils#sum(List, List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#sum(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.sum(List, List)"})
  public void testSum_given42_whenArrayList_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("42");
    list2.add("42");

    // Act
    List<Object> actualSumResult = ListUtils.sum(list1, list2);

    // Assert
    assertEquals(2, actualSumResult.size());
    assertEquals("42", actualSumResult.get(0));
    assertEquals("42", actualSumResult.get(1));
  }

  /**
   * Test {@link ListUtils#sum(List, List)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#sum(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.sum(List, List)"})
  public void testSum_whenArrayList_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();

    // Act
    List<Object> actualSumResult = ListUtils.sum(list1, new ArrayList<>());

    // Assert
    assertTrue(actualSumResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#synchronizedList(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#synchronizedList(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.synchronizedList(List)"})
  public void testSynchronizedList_given42_whenArrayListAdd42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    List<Object> actualSynchronizedListResult = ListUtils.synchronizedList(list);

    // Assert
    assertEquals(list, actualSynchronizedListResult);
  }

  /**
   * Test {@link ListUtils#synchronizedList(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#synchronizedList(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.synchronizedList(List)"})
  public void testSynchronizedList_given42_whenArrayListAdd42_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    List<Object> actualSynchronizedListResult = ListUtils.synchronizedList(list);

    // Assert
    assertEquals(list, actualSynchronizedListResult);
  }

  /**
   * Test {@link ListUtils#synchronizedList(List)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#synchronizedList(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.synchronizedList(List)"})
  public void testSynchronizedList_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    List<Object> actualSynchronizedListResult = ListUtils.synchronizedList(new ArrayList<>());

    // Assert
    assertTrue(actualSynchronizedListResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#transformedList(List, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#transformedList(List, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.transformedList(List, Transformer)"})
  public void testTransformedList_given42_whenArrayListAdd42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    List<Object> actualTransformedListResult = ListUtils.transformedList(list, mock(Transformer.class));

    // Assert
    assertEquals(list, actualTransformedListResult);
  }

  /**
   * Test {@link ListUtils#transformedList(List, Transformer)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#transformedList(List, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.transformedList(List, Transformer)"})
  public void testTransformedList_given42_whenArrayListAdd42_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    List<Object> actualTransformedListResult = ListUtils.transformedList(list, mock(Transformer.class));

    // Assert
    assertEquals(list, actualTransformedListResult);
  }

  /**
   * Test {@link ListUtils#transformedList(List, Transformer)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#transformedList(List, Transformer)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.transformedList(List, Transformer)"})
  public void testTransformedList_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    List<Object> actualTransformedListResult = ListUtils.transformedList(new ArrayList<>(), mock(Transformer.class));

    // Assert
    assertTrue(actualTransformedListResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#union(List, List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#union(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.union(List, List)"})
  public void testUnion_given42_whenArrayListAdd42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");

    // Act
    List<Object> actualUnionResult = ListUtils.union(list1, new ArrayList<>());

    // Assert
    assertEquals(list1, actualUnionResult);
  }

  /**
   * Test {@link ListUtils#union(List, List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#union(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.union(List, List)"})
  public void testUnion_given42_whenArrayListAdd42_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");
    list1.add("42");

    // Act
    List<Object> actualUnionResult = ListUtils.union(list1, new ArrayList<>());

    // Assert
    assertEquals(list1, actualUnionResult);
  }

  /**
   * Test {@link ListUtils#union(List, List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#union(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.union(List, List)"})
  public void testUnion_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("42");

    // Act
    List<Object> actualUnionResult = ListUtils.union(list1, list2);

    // Assert
    assertEquals(1, actualUnionResult.size());
    assertEquals("42", actualUnionResult.get(0));
  }

  /**
   * Test {@link ListUtils#union(List, List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#union(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.union(List, List)"})
  public void testUnion_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("42");
    list2.add("42");

    // Act
    List<Object> actualUnionResult = ListUtils.union(list1, list2);

    // Assert
    assertEquals(2, actualUnionResult.size());
    assertEquals("42", actualUnionResult.get(0));
    assertEquals("42", actualUnionResult.get(1));
  }

  /**
   * Test {@link ListUtils#union(List, List)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#union(List, List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.union(List, List)"})
  public void testUnion_whenArrayList_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();

    // Act
    List<Object> actualUnionResult = ListUtils.union(list1, new ArrayList<>());

    // Assert
    assertTrue(actualUnionResult.isEmpty());
  }

  /**
   * Test {@link ListUtils#unmodifiableList(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#unmodifiableList(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.unmodifiableList(List)"})
  public void testUnmodifiableList_given42_whenArrayListAdd42_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    List<Object> actualUnmodifiableListResult = ListUtils.unmodifiableList(list);

    // Assert
    assertEquals(list, actualUnmodifiableListResult);
  }

  /**
   * Test {@link ListUtils#unmodifiableList(List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#unmodifiableList(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.unmodifiableList(List)"})
  public void testUnmodifiableList_given42_whenArrayListAdd42_thenReturnArrayList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    List<Object> actualUnmodifiableListResult = ListUtils.unmodifiableList(list);

    // Assert
    assertEquals(list, actualUnmodifiableListResult);
  }

  /**
   * Test {@link ListUtils#unmodifiableList(List)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ListUtils#unmodifiableList(List)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"List ListUtils.unmodifiableList(List)"})
  public void testUnmodifiableList_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    List<Object> actualUnmodifiableListResult = ListUtils.unmodifiableList(new ArrayList<>());

    // Assert
    assertTrue(actualUnmodifiableListResult.isEmpty());
  }
}
