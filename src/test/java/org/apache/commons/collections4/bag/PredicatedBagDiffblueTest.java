package org.apache.commons.collections4.bag;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PredicatedBagDiffblueTest {
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
  @DisplayName("Test predicatedBag(Bag, Predicate); given 'true'; when Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PredicatedBag PredicatedBag.predicatedBag(Bag, Predicate)"})
  void testPredicatedBag_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
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
  @DisplayName("Test predicatedBag(Bag, Predicate); given 'true'; when Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PredicatedBag PredicatedBag.predicatedBag(Bag, Predicate)"})
  void testPredicatedBag_givenTrue_whenPredicateTestReturnTrue_thenCallsTest2() {
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
  @DisplayName("Test predicatedBag(Bag, Predicate); when HashBag(); then return HashBag()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"PredicatedBag PredicatedBag.predicatedBag(Bag, Predicate)"})
  void testPredicatedBag_whenHashBag_thenReturnHashBag() {
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
  @DisplayName("Test new PredicatedBag(Bag, Predicate); given 'true'; when Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedBag.<init>(Bag, Predicate)"})
  void testNewPredicatedBag_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
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
  @DisplayName("Test new PredicatedBag(Bag, Predicate); given 'true'; when Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedBag.<init>(Bag, Predicate)"})
  void testNewPredicatedBag_givenTrue_whenPredicateTestReturnTrue_thenCallsTest2() {
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
  @DisplayName("Test new PredicatedBag(Bag, Predicate); when HashBag(); then return HashBag()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void PredicatedBag.<init>(Bag, Predicate)"})
  void testNewPredicatedBag_whenHashBag_thenReturnHashBag() {
    // Arrange
    HashBag<Object> bag = new HashBag<>();

    // Act and Assert
    assertEquals(bag, new PredicatedBag<>(bag, mock(Predicate.class)));
  }
}
