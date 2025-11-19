package org.apache.commons.collections4.properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Enumeration;
import org.apache.commons.collections4.iterators.IteratorEnumeration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SortedPropertiesDiffblueTest {
  /**
   * Test new {@link SortedProperties} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link SortedProperties}
   */
  @Test
  @DisplayName("Test new SortedProperties (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SortedProperties.<init>()"})
  void testNewSortedProperties() {
    // Arrange, Act and Assert
    assertTrue(new SortedProperties().isEmpty());
  }

  /**
   * Test {@link SortedProperties#entrySet()}.
   *
   * <ul>
   *   <li>Given {@link SortedProperties} (default constructor) {@code 42} is {@code Value}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link SortedProperties#entrySet()}
   */
  @Test
  @DisplayName(
      "Test entrySet(); given SortedProperties (default constructor) '42' is 'Value'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set SortedProperties.entrySet()"})
  void testEntrySet_givenSortedProperties42IsValue_thenReturnSizeIsTwo() {
    // Arrange
    SortedProperties sortedProperties = new SortedProperties();
    sortedProperties.put("42", "Value");
    sortedProperties.put("Key", "Value");

    // Act and Assert
    assertEquals(2, sortedProperties.entrySet().size());
  }

  /**
   * Test {@link SortedProperties#entrySet()}.
   *
   * <ul>
   *   <li>Given {@link SortedProperties} (default constructor) {@code Key} is {@code Value}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link SortedProperties#entrySet()}
   */
  @Test
  @DisplayName(
      "Test entrySet(); given SortedProperties (default constructor) 'Key' is 'Value'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set SortedProperties.entrySet()"})
  void testEntrySet_givenSortedPropertiesKeyIsValue_thenReturnSizeIsOne() {
    // Arrange
    SortedProperties sortedProperties = new SortedProperties();
    sortedProperties.put("Key", "Value");

    // Act and Assert
    assertEquals(1, sortedProperties.entrySet().size());
  }

  /**
   * Test {@link SortedProperties#entrySet()}.
   *
   * <ul>
   *   <li>Given {@link SortedProperties} (default constructor).
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link SortedProperties#entrySet()}
   */
  @Test
  @DisplayName("Test entrySet(); given SortedProperties (default constructor); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set SortedProperties.entrySet()"})
  void testEntrySet_givenSortedProperties_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertTrue(new SortedProperties().entrySet().isEmpty());
  }

  /**
   * Test {@link SortedProperties#keys()}.
   *
   * <ul>
   *   <li>Given {@link SortedProperties} (default constructor).
   *   <li>Then return {@link IteratorEnumeration}.
   * </ul>
   *
   * <p>Method under test: {@link SortedProperties#keys()}
   */
  @Test
  @DisplayName(
      "Test keys(); given SortedProperties (default constructor); then return IteratorEnumeration")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Enumeration SortedProperties.keys()"})
  void testKeys_givenSortedProperties_thenReturnIteratorEnumeration() {
    // Arrange and Act
    Enumeration<Object> actualKeysResult = new SortedProperties().keys();

    // Assert
    assertTrue(actualKeysResult instanceof IteratorEnumeration);
    assertFalse(actualKeysResult.hasMoreElements());
    assertFalse(((IteratorEnumeration<Object>) actualKeysResult).getIterator().hasNext());
  }
}
