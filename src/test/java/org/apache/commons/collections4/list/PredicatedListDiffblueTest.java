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
import org.apache.commons.collections4.Predicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class PredicatedListDiffblueTest {
  /**
   * Test {@link PredicatedList#predicatedList(List, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedList#predicatedList(List, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedList PredicatedList.predicatedList(List, Predicate)"})
  public void testPredicatedList_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedList<Object> actualPredicatedListResult = PredicatedList.predicatedList(list, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(list, actualPredicatedListResult);
  }

  /**
   * Test {@link PredicatedList#predicatedList(List, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedList#predicatedList(List, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedList PredicatedList.predicatedList(List, Predicate)"})
  public void testPredicatedList_givenTrue_whenPredicateTestReturnTrue_thenCallsTest2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedList<Object> actualPredicatedListResult = PredicatedList.predicatedList(list, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(list, actualPredicatedListResult);
  }

  /**
   * Test {@link PredicatedList#predicatedList(List, Predicate)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedList#predicatedList(List, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedList PredicatedList.predicatedList(List, Predicate)"})
  public void testPredicatedList_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act
    PredicatedList<Object> actualPredicatedListResult = PredicatedList.predicatedList(list, mock(Predicate.class));

    // Assert
    assertEquals(list, actualPredicatedListResult);
  }

  /**
   * Test {@link PredicatedList#PredicatedList(List, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedList#PredicatedList(List, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedList.<init>(List, Predicate)"})
  public void testNewPredicatedList_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedList<Object> actualObjectList = new PredicatedList<>(list, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(list, actualObjectList);
  }

  /**
   * Test {@link PredicatedList#PredicatedList(List, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedList#PredicatedList(List, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedList.<init>(List, Predicate)"})
  public void testNewPredicatedList_givenTrue_whenPredicateTestReturnTrue_thenCallsTest2() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();
    list.add("42");
    list.add("42");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedList<Object> actualObjectList = new PredicatedList<>(list, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(list, actualObjectList);
  }

  /**
   * Test {@link PredicatedList#PredicatedList(List, Predicate)}.
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedList#PredicatedList(List, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedList.<init>(List, Predicate)"})
  public void testNewPredicatedList_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> list = new ArrayList<>();

    // Act and Assert
    assertEquals(list, new PredicatedList<>(list, mock(Predicate.class)));
  }
}
