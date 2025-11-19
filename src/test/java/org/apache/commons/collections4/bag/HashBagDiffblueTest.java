package org.apache.commons.collections4.bag;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class HashBagDiffblueTest {
  /**
   * Test {@link HashBag#HashBag()}.
   *
   * <p>Method under test: {@link HashBag#HashBag()}
   */
  @Test
  @DisplayName("Test new HashBag()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void HashBag.<init>()"})
  void testNewHashBag() {
    // Arrange and Act
    HashBag<Object> actualHashBag = new HashBag<>();

    // Assert
    assertTrue(actualHashBag.isEmpty());
  }

  /**
   * Test {@link HashBag#HashBag(Iterable)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link HashBag#HashBag(Iterable)}
   */
  @Test
  @DisplayName(
      "Test new HashBag(Iterable); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void HashBag.<init>(Iterable)"})
  void testNewHashBag_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act
    HashBag<Object> actualHashBag = new HashBag<>((Iterable<?>) iterable);

    // Assert
    assertEquals(1, actualHashBag.size());
  }

  /**
   * Test {@link HashBag#HashBag(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link HashBag#HashBag(Collection)}
   */
  @Test
  @DisplayName(
      "Test new HashBag(Collection); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void HashBag.<init>(Collection)"})
  void testNewHashBag_given42_whenArrayListAdd42_thenReturnSizeIsOne2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    HashBag<Object> actualHashBag = new HashBag<>(collection);

    // Assert
    assertEquals(1, actualHashBag.size());
  }

  /**
   * Test {@link HashBag#HashBag(Iterable)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link HashBag#HashBag(Iterable)}
   */
  @Test
  @DisplayName(
      "Test new HashBag(Iterable); given '42'; when ArrayList() add '42'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void HashBag.<init>(Iterable)"})
  void testNewHashBag_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");

    // Act
    HashBag<Object> actualHashBag = new HashBag<>((Iterable<?>) iterable);

    // Assert
    assertEquals(2, actualHashBag.size());
  }

  /**
   * Test {@link HashBag#HashBag(Collection)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link HashBag#HashBag(Collection)}
   */
  @Test
  @DisplayName(
      "Test new HashBag(Collection); given '42'; when ArrayList() add '42'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void HashBag.<init>(Collection)"})
  void testNewHashBag_given42_whenArrayListAdd42_thenReturnSizeIsTwo2() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    HashBag<Object> actualHashBag = new HashBag<>(collection);

    // Assert
    assertEquals(2, actualHashBag.size());
  }

  /**
   * Test {@link HashBag#HashBag(Iterable)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link HashBag#HashBag(Iterable)}
   */
  @Test
  @DisplayName("Test new HashBag(Iterable); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void HashBag.<init>(Iterable)"})
  void testNewHashBag_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    HashBag<Object> actualHashBag = new HashBag<>((Iterable<?>) new ArrayList<>());

    // Assert
    assertTrue(actualHashBag.isEmpty());
  }

  /**
   * Test {@link HashBag#HashBag(Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link HashBag#HashBag(Collection)}
   */
  @Test
  @DisplayName("Test new HashBag(Collection); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void HashBag.<init>(Collection)"})
  void testNewHashBag_whenArrayList_thenReturnEmpty2() {
    // Arrange and Act
    HashBag<Object> actualHashBag = new HashBag<>(new ArrayList<>());

    // Assert
    assertTrue(actualHashBag.isEmpty());
  }
}
