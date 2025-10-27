package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import org.apache.commons.collections4.functors.AllPredicate;
import org.apache.commons.collections4.functors.AndPredicate;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.apache.commons.collections4.functors.DefaultEquator;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.junit.Test;

public class ListUtilsDiffblueTest {
  /**
   * Method under test: {@link ListUtils#defaultIfNull(List, List)}
   */
  @Test
  public void testDefaultIfNull() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    List<Object> actualDefaultIfNullResult = ListUtils.defaultIfNull(list, new ArrayList<>());

    // Assert
    assertTrue(actualDefaultIfNullResult.isEmpty());
  }

  /**
   * Method under test: {@link ListUtils#defaultIfNull(List, List)}
   */
  @Test
  public void testDefaultIfNull2() {
    // Arrange and Act
    List<Object> actualDefaultIfNullResult = ListUtils.defaultIfNull(null, new ArrayList<>());

    // Assert
    assertTrue(actualDefaultIfNullResult.isEmpty());
  }

  /**
   * Method under test: {@link ListUtils#defaultIfNull(List, List)}
   */
  @Test
  public void testDefaultIfNull3() {
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
   * Method under test: {@link ListUtils#defaultIfNull(List, List)}
   */
  @Test
  public void testDefaultIfNull4() {
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
   * Method under test: {@link ListUtils#defaultIfNull(List, List)}
   */
  @Test
  public void testDefaultIfNull5() {
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
   * Method under test: {@link ListUtils#defaultIfNull(List, List)}
   */
  @Test
  public void testDefaultIfNull6() {
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
   * Method under test: {@link ListUtils#emptyIfNull(List)}
   */
  @Test
  public void testEmptyIfNull() {
    // Arrange and Act
    List<Object> actualEmptyIfNullResult = ListUtils.emptyIfNull(new ArrayList<>());

    // Assert
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Method under test: {@link ListUtils#emptyIfNull(List)}
   */
  @Test
  public void testEmptyIfNull2() {
    // Arrange and Act
    List<Object> actualEmptyIfNullResult = ListUtils.emptyIfNull(null);

    // Assert
    assertTrue(actualEmptyIfNullResult.isEmpty());
  }

  /**
   * Method under test: {@link ListUtils#emptyIfNull(List)}
   */
  @Test
  public void testEmptyIfNull3() {
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
   * Method under test: {@link ListUtils#emptyIfNull(List)}
   */
  @Test
  public void testEmptyIfNull4() {
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
   * Method under test: {@link ListUtils#fixedSizeList(List)}
   */
  @Test
  public void testFixedSizeList() {
    // Arrange and Act
    List<Object> actualFixedSizeListResult = ListUtils.fixedSizeList(new ArrayList<>());

    // Assert
    assertTrue(actualFixedSizeListResult.isEmpty());
  }

  /**
   * Method under test: {@link ListUtils#fixedSizeList(List)}
   */
  @Test
  public void testFixedSizeList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    List<Object> actualFixedSizeListResult = ListUtils.fixedSizeList(list);

    // Assert
    assertEquals(1, actualFixedSizeListResult.size());
    assertEquals("42", actualFixedSizeListResult.get(0));
  }

  /**
   * Method under test: {@link ListUtils#fixedSizeList(List)}
   */
  @Test
  public void testFixedSizeList3() {
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
   * Method under test: {@link ListUtils#getFirst(List)}
   */
  @Test
  public void testGetFirst() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act and Assert
    assertEquals("42", ListUtils.getFirst(list));
  }

  /**
   * Method under test: {@link ListUtils#getFirst(List)}
   */
  @Test
  public void testGetFirst2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act and Assert
    assertEquals("42", ListUtils.getFirst(list));
  }

  /**
   * Method under test: {@link ListUtils#getLast(List)}
   */
  @Test
  public void testGetLast() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act and Assert
    assertEquals("42", ListUtils.getLast(list));
  }

  /**
   * Method under test: {@link ListUtils#getLast(List)}
   */
  @Test
  public void testGetLast2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act and Assert
    assertEquals("42", ListUtils.getLast(list));
  }

  /**
   * Method under test: {@link ListUtils#hashCodeForList(Collection)}
   */
  @Test
  public void testHashCodeForList() {
    // Arrange, Act and Assert
    assertEquals(1, ListUtils.hashCodeForList(new ArrayList<>()));
    assertEquals(0, ListUtils.hashCodeForList(null));
  }

  /**
   * Method under test: {@link ListUtils#hashCodeForList(Collection)}
   */
  @Test
  public void testHashCodeForList2() {
    // Arrange
    LinkedHashSet<?> list = new LinkedHashSet<>();
    list.add(null);

    // Act and Assert
    assertEquals(31, ListUtils.hashCodeForList(list));
  }

  /**
   * Method under test: {@link ListUtils#hashCodeForList(Collection)}
   */
  @Test
  public void testHashCodeForList3() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act and Assert
    assertEquals(54145, ListUtils.hashCodeForList(list));
  }

  /**
   * Method under test: {@link ListUtils#indexOf(List, Predicate)}
   */
  @Test
  public void testIndexOf() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();

    // Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND,
        ListUtils.indexOf(list, new AllPredicate<>(new AndPredicate<>(predicate1, new UniquePredicate<>()))));
  }

  /**
   * Method under test: {@link ListUtils#indexOf(List, Predicate)}
   */
  @Test
  public void testIndexOf2() {
    // Arrange, Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, ListUtils.indexOf(null, null));
  }

  /**
   * Method under test: {@link ListUtils#indexOf(List, Predicate)}
   */
  @Test
  public void testIndexOf3() {
    // Arrange, Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND, ListUtils.indexOf(new ArrayList<>(), null));
  }

  /**
   * Method under test: {@link ListUtils#indexOf(List, Predicate)}
   */
  @Test
  public void testIndexOf4() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();

    // Act and Assert
    assertEquals(0,
        ListUtils.indexOf(list, new AllPredicate<>(new AndPredicate<>(predicate1, new UniquePredicate<>()))));
  }

  /**
   * Method under test: {@link ListUtils#indexOf(List, Predicate)}
   */
  @Test
  public void testIndexOf5() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();

    // Act and Assert
    assertEquals(0,
        ListUtils.indexOf(list, new AllPredicate<>(new AndPredicate<>(predicate1, new UniquePredicate<>()))));
  }

  /**
   * Method under test: {@link ListUtils#indexOf(List, Predicate)}
   */
  @Test
  public void testIndexOf6() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();
    EqualPredicate<? super Object> predicate1 = new EqualPredicate<>("Test", equator);

    // Act and Assert
    assertEquals(CollectionUtils.INDEX_NOT_FOUND,
        ListUtils.indexOf(list, new AllPredicate<>(new AndPredicate<>(predicate1, new UniquePredicate<>()))));
  }

  /**
   * Method under test: {@link ListUtils#indexOf(List, Predicate)}
   */
  @Test
  public void testIndexOf7() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();
    EqualPredicate<? super Object> predicate1 = new EqualPredicate<>("42", equator);

    // Act and Assert
    assertEquals(0,
        ListUtils.indexOf(list, new AllPredicate<>(new AndPredicate<>(predicate1, new UniquePredicate<>()))));
  }

  /**
   * Method under test: {@link ListUtils#intersection(List, List)}
   */
  @Test
  public void testIntersection() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();

    // Act
    List<Object> actualIntersectionResult = ListUtils.intersection(list1, new ArrayList<>());

    // Assert
    assertTrue(actualIntersectionResult.isEmpty());
  }

  /**
   * Method under test: {@link ListUtils#intersection(List, List)}
   */
  @Test
  public void testIntersection2() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");

    // Act
    List<Object> actualIntersectionResult = ListUtils.intersection(list1, new ArrayList<>());

    // Assert
    assertTrue(actualIntersectionResult.isEmpty());
  }

  /**
   * Method under test: {@link ListUtils#intersection(List, List)}
   */
  @Test
  public void testIntersection3() {
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
   * Method under test: {@link ListUtils#intersection(List, List)}
   */
  @Test
  public void testIntersection4() {
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
   * Method under test: {@link ListUtils#intersection(List, List)}
   */
  @Test
  public void testIntersection5() {
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
   * Method under test: {@link ListUtils#intersection(List, List)}
   */
  @Test
  public void testIntersection6() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("42");

    // Act
    List<Object> actualIntersectionResult = ListUtils.intersection(list1, list2);

    // Assert
    assertEquals(1, actualIntersectionResult.size());
    assertEquals("42", actualIntersectionResult.get(0));
  }

  /**
   * Method under test: {@link ListUtils#isEqualList(Collection, Collection)}
   */
  @Test
  public void testIsEqualList() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();

    // Act and Assert
    assertTrue(ListUtils.isEqualList(list1, new ArrayList<>()));
  }

  /**
   * Method under test: {@link ListUtils#isEqualList(Collection, Collection)}
   */
  @Test
  public void testIsEqualList2() {
    // Arrange, Act and Assert
    assertTrue(ListUtils.isEqualList(null, null));
  }

  /**
   * Method under test: {@link ListUtils#isEqualList(Collection, Collection)}
   */
  @Test
  public void testIsEqualList3() {
    // Arrange, Act and Assert
    assertFalse(ListUtils.isEqualList(null, new ArrayList<>()));
  }

  /**
   * Method under test: {@link ListUtils#isEqualList(Collection, Collection)}
   */
  @Test
  public void testIsEqualList4() {
    // Arrange, Act and Assert
    assertFalse(ListUtils.isEqualList(new ArrayList<>(), null));
  }

  /**
   * Method under test: {@link ListUtils#isEqualList(Collection, Collection)}
   */
  @Test
  public void testIsEqualList5() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");

    // Act and Assert
    assertFalse(ListUtils.isEqualList(list1, new ArrayList<>()));
  }

  /**
   * Method under test: {@link ListUtils#isEqualList(Collection, Collection)}
   */
  @Test
  public void testIsEqualList6() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");
    list1.add("42");

    // Act and Assert
    assertFalse(ListUtils.isEqualList(list1, new ArrayList<>()));
  }

  /**
   * Method under test: {@link ListUtils#isEqualList(Collection, Collection)}
   */
  @Test
  public void testIsEqualList7() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("42");

    // Act and Assert
    assertFalse(ListUtils.isEqualList(list1, list2));
  }

  /**
   * Method under test: {@link ListUtils#isEqualList(Collection, Collection)}
   */
  @Test
  public void testIsEqualList8() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("42");
    list2.add("42");

    // Act and Assert
    assertFalse(ListUtils.isEqualList(list1, list2));
  }

  /**
   * Method under test: {@link ListUtils#isEqualList(Collection, Collection)}
   */
  @Test
  public void testIsEqualList9() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("42");

    // Act and Assert
    assertTrue(ListUtils.isEqualList(list1, list2));
  }

  /**
   * Method under test: {@link ListUtils#isEqualList(Collection, Collection)}
   */
  @Test
  public void testIsEqualList10() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add(2);

    // Act and Assert
    assertFalse(ListUtils.isEqualList(list1, list2));
  }

  /**
   * Method under test: {@link ListUtils#lazyList(List, Factory)}
   */
  @Test
  public void testLazyList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    List<Object> actualLazyListResult = ListUtils.lazyList(list, new ConstantFactory<>("Constant To Return"));

    // Assert
    assertTrue(actualLazyListResult.isEmpty());
  }

  /**
   * Method under test: {@link ListUtils#lazyList(List, Factory)}
   */
  @Test
  public void testLazyList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    List<Object> actualLazyListResult = ListUtils.lazyList(list, new ConstantFactory<>("Constant To Return"));

    // Assert
    assertEquals(1, actualLazyListResult.size());
    assertEquals("42", actualLazyListResult.get(0));
  }

  /**
   * Method under test: {@link ListUtils#lazyList(List, Factory)}
   */
  @Test
  public void testLazyList3() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    List<Object> actualLazyListResult = ListUtils.lazyList(list, new ConstantFactory<>("Constant To Return"));

    // Assert
    assertEquals(list, actualLazyListResult);
  }

  /**
   * Method under test:
   * {@link ListUtils#longestCommonSubsequence(CharSequence, CharSequence)}
   */
  @Test
  public void testLongestCommonSubsequence() {
    // Arrange, Act and Assert
    assertEquals(CollectionUtils.COLON,
        ListUtils.longestCommonSubsequence(CollectionUtils.COLON, CollectionUtils.COLON));
    assertEquals("", ListUtils.longestCommonSubsequence(CollectionUtils.COMMA, CollectionUtils.COLON));
    assertEquals("", ListUtils.longestCommonSubsequence(CollectionUtils.DEFAULT_TOSTRING_PREFIX, "Char Sequence B"));
    assertEquals("", ListUtils.longestCommonSubsequence(CollectionUtils.DEFAULT_TOSTRING_PREFIX, "charSequenceB"));
    assertEquals("",
        ListUtils.longestCommonSubsequence(Integer.toString(CollectionUtils.INDEX_NOT_FOUND), CollectionUtils.COLON));
    assertEquals("", ListUtils.longestCommonSubsequence(Integer.toString(Integer.MIN_VALUE), CollectionUtils.COLON));
  }

  /**
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  public void testLongestCommonSubsequence2() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(a, new ArrayList<>());

    // Assert
    assertTrue(actualLongestCommonSubsequenceResult.isEmpty());
  }

  /**
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  public void testLongestCommonSubsequence3() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(a, new ArrayList<>());

    // Assert
    assertTrue(actualLongestCommonSubsequenceResult.isEmpty());
  }

  /**
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  public void testLongestCommonSubsequence4() {
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
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  public void testLongestCommonSubsequence5() {
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
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  public void testLongestCommonSubsequence6() {
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
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  public void testLongestCommonSubsequence7() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
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
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  public void testLongestCommonSubsequence8() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    b.add("42");

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(a, b);

    // Assert
    assertEquals(1, actualLongestCommonSubsequenceResult.size());
    assertEquals("42", actualLongestCommonSubsequenceResult.get(0));
  }

  /**
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  public void testLongestCommonSubsequence9() {
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
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  public void testLongestCommonSubsequence10() {
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
    assertEquals(1, actualLongestCommonSubsequenceResult.size());
    assertEquals("42", actualLongestCommonSubsequenceResult.get(0));
  }

  /**
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  public void testLongestCommonSubsequence11() {
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
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  public void testLongestCommonSubsequence12() {
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
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  public void testLongestCommonSubsequence13() {
    // Arrange
    ArrayList<Object> a = new ArrayList<>();
    a.add("42");

    ArrayList<Object> b = new ArrayList<>();
    b.add("42");
    b.add(2);

    // Act
    List<Object> actualLongestCommonSubsequenceResult = ListUtils.longestCommonSubsequence(a, b);

    // Assert
    assertEquals(1, actualLongestCommonSubsequenceResult.size());
    assertEquals("42", actualLongestCommonSubsequenceResult.get(0));
  }

  /**
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  public void testLongestCommonSubsequence14() {
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
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  public void testLongestCommonSubsequence15() {
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
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  public void testLongestCommonSubsequence16() {
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
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  public void testLongestCommonSubsequence17() {
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
    assertEquals(1, actualLongestCommonSubsequenceResult.size());
  }

  /**
   * Method under test: {@link ListUtils#longestCommonSubsequence(List, List)}
   */
  @Test
  public void testLongestCommonSubsequence18() {
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
   * Method under test:
   * {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  public void testLongestCommonSubsequence19() {
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
   * Method under test:
   * {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  public void testLongestCommonSubsequence20() {
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
   * Method under test:
   * {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  public void testLongestCommonSubsequence21() {
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
   * Method under test:
   * {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  public void testLongestCommonSubsequence22() {
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
   * Method under test:
   * {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  public void testLongestCommonSubsequence23() {
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
   * Method under test:
   * {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  public void testLongestCommonSubsequence24() {
    // Arrange
    ArrayList<Object> listA = new ArrayList<>();
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
   * Method under test:
   * {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  public void testLongestCommonSubsequence25() {
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
    assertEquals(1, actualLongestCommonSubsequenceResult.size());
    assertEquals("42", actualLongestCommonSubsequenceResult.get(0));
  }

  /**
   * Method under test:
   * {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  public void testLongestCommonSubsequence26() {
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
   * Method under test:
   * {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  public void testLongestCommonSubsequence27() {
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
    assertEquals(1, actualLongestCommonSubsequenceResult.size());
    assertEquals("42", actualLongestCommonSubsequenceResult.get(0));
  }

  /**
   * Method under test:
   * {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  public void testLongestCommonSubsequence28() {
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
   * Method under test:
   * {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  public void testLongestCommonSubsequence29() {
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
   * Method under test:
   * {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  public void testLongestCommonSubsequence30() {
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
    assertEquals(1, actualLongestCommonSubsequenceResult.size());
    assertEquals("42", actualLongestCommonSubsequenceResult.get(0));
  }

  /**
   * Method under test:
   * {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  public void testLongestCommonSubsequence31() {
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
   * Method under test:
   * {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  public void testLongestCommonSubsequence32() {
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
   * Method under test:
   * {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  public void testLongestCommonSubsequence33() {
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
   * Method under test:
   * {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  public void testLongestCommonSubsequence34() {
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
    assertEquals(1, actualLongestCommonSubsequenceResult.size());
  }

  /**
   * Method under test:
   * {@link ListUtils#longestCommonSubsequence(List, List, Equator)}
   */
  @Test
  public void testLongestCommonSubsequence35() {
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
   * Method under test: {@link ListUtils#partition(List, int)}
   */
  @Test
  public void testPartition() {
    // Arrange and Act
    List<List<Object>> actualPartitionResult = ListUtils.partition(new ArrayList<>(), 3);

    // Assert
    assertTrue(actualPartitionResult.isEmpty());
  }

  /**
   * Method under test: {@link ListUtils#partition(List, int)}
   */
  @Test
  public void testPartition2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ListUtils.partition(new ArrayList<>(), 0));
  }

  /**
   * Method under test: {@link ListUtils#partition(List, int)}
   */
  @Test
  public void testPartition3() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    List<List<Object>> actualPartitionResult = ListUtils.partition(list, 3);

    // Assert
    assertEquals(1, actualPartitionResult.size());
    List<Object> getResult = actualPartitionResult.get(0);
    assertEquals(1, getResult.size());
    assertEquals("42", getResult.get(0));
  }

  /**
   * Method under test: {@link ListUtils#partition(List, int)}
   */
  @Test
  public void testPartition4() {
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
   * Method under test: {@link ListUtils#predicatedList(List, Predicate)}
   */
  @Test
  public void testPredicatedList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();

    // Act
    List<Object> actualPredicatedListResult = ListUtils.predicatedList(list,
        new AllPredicate<>(new AndPredicate<>(predicate1, new UniquePredicate<>())));

    // Assert
    assertTrue(actualPredicatedListResult.isEmpty());
  }

  /**
   * Method under test: {@link ListUtils#predicatedList(List, Predicate)}
   */
  @Test
  public void testPredicatedList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    UniquePredicate<Object> predicate1 = new UniquePredicate<>();

    // Act
    List<Object> actualPredicatedListResult = ListUtils.predicatedList(list,
        new AllPredicate<>(new AndPredicate<>(predicate1, new UniquePredicate<>())));

    // Assert
    assertEquals(1, actualPredicatedListResult.size());
    assertEquals("42", actualPredicatedListResult.get(0));
  }

  /**
   * Method under test: {@link ListUtils#removeAll(Collection, Collection)}
   */
  @Test
  public void testRemoveAll() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act
    List<Object> actualRemoveAllResult = ListUtils.removeAll(collection, new ArrayList<>());

    // Assert
    assertTrue(actualRemoveAllResult.isEmpty());
  }

  /**
   * Method under test: {@link ListUtils#removeAll(Collection, Collection)}
   */
  @Test
  public void testRemoveAll2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    List<Object> actualRemoveAllResult = ListUtils.removeAll(collection, new ArrayList<>());

    // Assert
    assertEquals(1, actualRemoveAllResult.size());
    assertEquals("42", actualRemoveAllResult.get(0));
  }

  /**
   * Method under test: {@link ListUtils#removeAll(Collection, Collection)}
   */
  @Test
  public void testRemoveAll3() {
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
   * Method under test: {@link ListUtils#removeAll(Collection, Collection)}
   */
  @Test
  public void testRemoveAll4() {
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
   * Method under test: {@link ListUtils#removeAll(Collection, Collection)}
   */
  @Test
  public void testRemoveAll5() {
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
   * Method under test: {@link ListUtils#removeAll(Collection, Collection)}
   */
  @Test
  public void testRemoveAll6() {
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
   * Method under test: {@link ListUtils#retainAll(Collection, Collection)}
   */
  @Test
  public void testRetainAll() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();

    // Act
    List<Object> actualRetainAllResult = ListUtils.retainAll(collection, new ArrayList<>());

    // Assert
    assertTrue(actualRetainAllResult.isEmpty());
  }

  /**
   * Method under test: {@link ListUtils#retainAll(Collection, Collection)}
   */
  @Test
  public void testRetainAll2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    List<Object> actualRetainAllResult = ListUtils.retainAll(collection, new ArrayList<>());

    // Assert
    assertTrue(actualRetainAllResult.isEmpty());
  }

  /**
   * Method under test: {@link ListUtils#retainAll(Collection, Collection)}
   */
  @Test
  public void testRetainAll3() {
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
   * Method under test: {@link ListUtils#retainAll(Collection, Collection)}
   */
  @Test
  public void testRetainAll4() {
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
   * Method under test: {@link ListUtils#retainAll(Collection, Collection)}
   */
  @Test
  public void testRetainAll5() {
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
   * Method under test: {@link ListUtils#retainAll(Collection, Collection)}
   */
  @Test
  public void testRetainAll6() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    ArrayList<Object> retain = new ArrayList<>();
    retain.add("42");

    // Act
    List<Object> actualRetainAllResult = ListUtils.retainAll(collection, retain);

    // Assert
    assertEquals(1, actualRetainAllResult.size());
    assertEquals("42", actualRetainAllResult.get(0));
  }

  /**
   * Method under test: {@link ListUtils#subtract(List, List)}
   */
  @Test
  public void testSubtract() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();

    // Act
    List<Object> actualSubtractResult = ListUtils.subtract(list1, new ArrayList<>());

    // Assert
    assertTrue(actualSubtractResult.isEmpty());
  }

  /**
   * Method under test: {@link ListUtils#subtract(List, List)}
   */
  @Test
  public void testSubtract2() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");

    // Act
    List<Object> actualSubtractResult = ListUtils.subtract(list1, new ArrayList<>());

    // Assert
    assertEquals(1, actualSubtractResult.size());
    assertEquals("42", actualSubtractResult.get(0));
  }

  /**
   * Method under test: {@link ListUtils#subtract(List, List)}
   */
  @Test
  public void testSubtract3() {
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
   * Method under test: {@link ListUtils#subtract(List, List)}
   */
  @Test
  public void testSubtract4() {
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
   * Method under test: {@link ListUtils#subtract(List, List)}
   */
  @Test
  public void testSubtract5() {
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
   * Method under test: {@link ListUtils#subtract(List, List)}
   */
  @Test
  public void testSubtract6() {
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
   * Method under test: {@link ListUtils#subtract(List, List)}
   */
  @Test
  public void testSubtract7() {
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
   * Method under test: {@link ListUtils#sum(List, List)}
   */
  @Test
  public void testSum() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();

    // Act
    List<Object> actualSumResult = ListUtils.sum(list1, new ArrayList<>());

    // Assert
    assertTrue(actualSumResult.isEmpty());
  }

  /**
   * Method under test: {@link ListUtils#sum(List, List)}
   */
  @Test
  public void testSum2() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");

    // Act
    List<Object> actualSumResult = ListUtils.sum(list1, new ArrayList<>());

    // Assert
    assertEquals(1, actualSumResult.size());
    assertEquals("42", actualSumResult.get(0));
  }

  /**
   * Method under test: {@link ListUtils#sum(List, List)}
   */
  @Test
  public void testSum3() {
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
   * Method under test: {@link ListUtils#sum(List, List)}
   */
  @Test
  public void testSum4() {
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
   * Method under test: {@link ListUtils#sum(List, List)}
   */
  @Test
  public void testSum5() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("42");
    list2.add("42");

    // Act
    List<Object> actualSumResult = ListUtils.sum(list1, list2);

    // Assert
    assertEquals(list2, actualSumResult);
  }

  /**
   * Method under test: {@link ListUtils#sum(List, List)}
   */
  @Test
  public void testSum6() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("42");

    // Act
    List<Object> actualSumResult = ListUtils.sum(list1, list2);

    // Assert
    assertEquals(1, actualSumResult.size());
    assertEquals("42", actualSumResult.get(0));
  }

  /**
   * Method under test: {@link ListUtils#synchronizedList(List)}
   */
  @Test
  public void testSynchronizedList() {
    // Arrange and Act
    List<Object> actualSynchronizedListResult = ListUtils.synchronizedList(new ArrayList<>());

    // Assert
    assertTrue(actualSynchronizedListResult.isEmpty());
  }

  /**
   * Method under test: {@link ListUtils#synchronizedList(List)}
   */
  @Test
  public void testSynchronizedList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    List<Object> actualSynchronizedListResult = ListUtils.synchronizedList(list);

    // Assert
    assertEquals(1, actualSynchronizedListResult.size());
    assertEquals("42", actualSynchronizedListResult.get(0));
  }

  /**
   * Method under test: {@link ListUtils#synchronizedList(List)}
   */
  @Test
  public void testSynchronizedList3() {
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
   * Method under test: {@link ListUtils#union(List, List)}
   */
  @Test
  public void testUnion() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();

    // Act
    List<Object> actualUnionResult = ListUtils.union(list1, new ArrayList<>());

    // Assert
    assertTrue(actualUnionResult.isEmpty());
  }

  /**
   * Method under test: {@link ListUtils#union(List, List)}
   */
  @Test
  public void testUnion2() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();
    list1.add("42");

    // Act
    List<Object> actualUnionResult = ListUtils.union(list1, new ArrayList<>());

    // Assert
    assertEquals(1, actualUnionResult.size());
    assertEquals("42", actualUnionResult.get(0));
  }

  /**
   * Method under test: {@link ListUtils#union(List, List)}
   */
  @Test
  public void testUnion3() {
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
   * Method under test: {@link ListUtils#union(List, List)}
   */
  @Test
  public void testUnion4() {
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
   * Method under test: {@link ListUtils#union(List, List)}
   */
  @Test
  public void testUnion5() {
    // Arrange
    ArrayList<Object> list1 = new ArrayList<>();

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("42");
    list2.add("42");

    // Act
    List<Object> actualUnionResult = ListUtils.union(list1, list2);

    // Assert
    assertEquals(list2, actualUnionResult);
  }

  /**
   * Method under test: {@link ListUtils#unmodifiableList(List)}
   */
  @Test
  public void testUnmodifiableList() {
    // Arrange and Act
    List<Object> actualUnmodifiableListResult = ListUtils.unmodifiableList(new ArrayList<>());

    // Assert
    assertTrue(actualUnmodifiableListResult.isEmpty());
  }

  /**
   * Method under test: {@link ListUtils#unmodifiableList(List)}
   */
  @Test
  public void testUnmodifiableList2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");

    // Act
    List<Object> actualUnmodifiableListResult = ListUtils.unmodifiableList(list);

    // Assert
    assertEquals(1, actualUnmodifiableListResult.size());
    assertEquals("42", actualUnmodifiableListResult.get(0));
  }

  /**
   * Method under test: {@link ListUtils#unmodifiableList(List)}
   */
  @Test
  public void testUnmodifiableList3() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");

    // Act
    List<Object> actualUnmodifiableListResult = ListUtils.unmodifiableList(list);

    // Assert
    assertEquals(list, actualUnmodifiableListResult);
  }
}
