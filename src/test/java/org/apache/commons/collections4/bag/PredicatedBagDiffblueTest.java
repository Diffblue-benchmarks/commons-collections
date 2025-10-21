package org.apache.commons.collections4.bag;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class PredicatedBagDiffblueTest {
  /**
   * Test {@link PredicatedBag#predicatedBag(Bag, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedBag#predicatedBag(Bag, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedBag PredicatedBag.predicatedBag(Bag, Predicate)"})
  public void testPredicatedBag_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedBag<Object> actualPredicatedBagResult = PredicatedBag.predicatedBag(bag, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(bag, actualPredicatedBagResult);
  }

  /**
   * Test {@link PredicatedBag#predicatedBag(Bag, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedBag#predicatedBag(Bag, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedBag PredicatedBag.predicatedBag(Bag, Predicate)"})
  public void testPredicatedBag_givenTrue_whenPredicateTestReturnTrue_thenCallsTest2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedBag<Object> actualPredicatedBagResult = PredicatedBag.predicatedBag(bag, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(bag, actualPredicatedBagResult);
  }

  /**
   * Test {@link PredicatedBag#predicatedBag(Bag, Predicate)}.
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.</li>
   *   <li>Then return {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedBag#predicatedBag(Bag, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"PredicatedBag PredicatedBag.predicatedBag(Bag, Predicate)"})
  public void testPredicatedBag_whenHashBag_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act
    PredicatedBag<Object> actualPredicatedBagResult = PredicatedBag.predicatedBag(bag, mock(Predicate.class));

    // Assert
    assertEquals(bag, actualPredicatedBagResult);
  }

  /**
   * Test {@link PredicatedBag#PredicatedBag(Bag, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedBag#PredicatedBag(Bag, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedBag.<init>(Bag, Predicate)"})
  public void testNewPredicatedBag_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedBag<Object> actualPredicatedBag = new PredicatedBag<>(bag, predicate);

    // Assert
    verify(predicate).test(isA(Object.class));
    assertEquals(bag, actualPredicatedBag);
  }

  /**
   * Test {@link PredicatedBag#PredicatedBag(Bag, Predicate)}.
   * <ul>
   *   <li>Given {@code true}.</li>
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.</li>
   *   <li>Then calls {@link Predicate#test(Object)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedBag#PredicatedBag(Bag, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedBag.<init>(Bag, Predicate)"})
  public void testNewPredicatedBag_givenTrue_whenPredicateTestReturnTrue_thenCallsTest2() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();
    bag.add("Object");
    bag.add("Object");
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    // Act
    PredicatedBag<Object> actualPredicatedBag = new PredicatedBag<>(bag, predicate);

    // Assert
    verify(predicate, atLeast(1)).test(isA(Object.class));
    assertEquals(bag, actualPredicatedBag);
  }

  /**
   * Test {@link PredicatedBag#PredicatedBag(Bag, Predicate)}.
   * <ul>
   *   <li>When {@link HashBag#HashBag()}.</li>
   *   <li>Then return {@link HashBag#HashBag()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PredicatedBag#PredicatedBag(Bag, Predicate)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void PredicatedBag.<init>(Bag, Predicate)"})
  public void testNewPredicatedBag_whenHashBag_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act and Assert
    assertEquals(bag, new PredicatedBag<>(bag, mock(Predicate.class)));
  }
}
