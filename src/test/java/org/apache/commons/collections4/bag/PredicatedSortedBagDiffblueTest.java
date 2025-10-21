package org.apache.commons.collections4.bag;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.SortedBag;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class PredicatedSortedBagDiffblueTest {
  /**
   * Test {@link PredicatedSortedBag#predicatedSortedBag(SortedBag, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedSortedBag#predicatedSortedBag(SortedBag, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedSortedBag PredicatedSortedBag.predicatedSortedBag(SortedBag, Predicate)"})
  public void testPredicatedSortedBag_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSortedBag<Object> actualPredicatedSortedBagResult = PredicatedSortedBag.predicatedSortedBag(bag,
        predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(bag, actualPredicatedSortedBagResult);
  }

  /**
   * Test {@link PredicatedSortedBag#predicatedSortedBag(SortedBag, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedSortedBag#predicatedSortedBag(SortedBag, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedSortedBag PredicatedSortedBag.predicatedSortedBag(SortedBag, Predicate)"})
  public void testPredicatedSortedBag_givenTrue_whenPredicateTestReturnTrue_thenCallsTest2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSortedBag<Object> actualPredicatedSortedBagResult = PredicatedSortedBag.predicatedSortedBag(bag,
        predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(bag, actualPredicatedSortedBagResult);
  }

  /**
   * Test {@link PredicatedSortedBag#predicatedSortedBag(SortedBag, Predicate)}.
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.</li>
   *   <li>Then return {@link TreeBag#TreeBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedSortedBag#predicatedSortedBag(SortedBag, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedSortedBag PredicatedSortedBag.predicatedSortedBag(SortedBag, Predicate)"})
  public void testPredicatedSortedBag_whenTreeBag_thenReturnTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act
    PredicatedSortedBag<Object> actualPredicatedSortedBagResult = PredicatedSortedBag.predicatedSortedBag(bag,
        mock(Predicate.class));

    // Assert
    assertEquals(bag, actualPredicatedSortedBagResult);
  }

  /**
   * Test {@link PredicatedSortedBag#PredicatedSortedBag(SortedBag, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedSortedBag#PredicatedSortedBag(SortedBag, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedSortedBag.<init>(SortedBag, Predicate)"})
  public void testNewPredicatedSortedBag_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSortedBag<Object> actualPredicatedSortedBag = new PredicatedSortedBag<>(bag, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(bag, actualPredicatedSortedBag);
  }

  /**
   * Test {@link PredicatedSortedBag#PredicatedSortedBag(SortedBag, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedSortedBag#PredicatedSortedBag(SortedBag, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedSortedBag.<init>(SortedBag, Predicate)"})
  public void testNewPredicatedSortedBag_givenTrue_whenPredicateTestReturnTrue_thenCallsTest2() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();
    bag.add("Object");
    bag.add("Object");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedSortedBag<Object> actualPredicatedSortedBag = new PredicatedSortedBag<>(bag, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(bag, actualPredicatedSortedBag);
  }

  /**
   * Test {@link PredicatedSortedBag#PredicatedSortedBag(SortedBag, Predicate)}.
   * <ul>
   *   <li>When {@link TreeBag#TreeBag()}.</li>
   *   <li>Then return {@link TreeBag#TreeBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedSortedBag#PredicatedSortedBag(SortedBag, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedSortedBag.<init>(SortedBag, Predicate)"})
  public void testNewPredicatedSortedBag_whenTreeBag_thenReturnTreeBag() {
    // Arrange
    TreeBag<Object> bag = new TreeBag<>();

    // Act and Assert
    assertEquals(bag, new PredicatedSortedBag<>(bag, mock(Predicate.class)));
  }
}
