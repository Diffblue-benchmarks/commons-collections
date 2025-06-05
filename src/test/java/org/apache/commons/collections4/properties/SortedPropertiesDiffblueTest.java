package org.apache.commons.collections4.properties;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Enumeration;
import org.apache.commons.collections4.iterators.IteratorEnumeration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SortedPropertiesDiffblueTest {
  /**
   * Test new {@link SortedProperties} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link SortedProperties}
   */
  @Test
  @DisplayName("Test new SortedProperties (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SortedProperties.<init>()"})
  void testNewSortedProperties() {
    // Arrange, Act and Assert
    assertTrue((new SortedProperties()).isEmpty());
  }

  /**
   * Test {@link SortedProperties#entrySet()}.
   * <p>
   * Method under test: {@link SortedProperties#entrySet()}
   */
  @Test
  @DisplayName("Test entrySet()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.Set SortedProperties.entrySet()"})
  void testEntrySet() {
    // Arrange, Act and Assert
    assertTrue((new SortedProperties()).entrySet().isEmpty());
  }

  /**
   * Test {@link SortedProperties#keys()}.
   * <p>
   * Method under test: {@link SortedProperties#keys()}
   */
  @Test
  @DisplayName("Test keys()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Enumeration SortedProperties.keys()"})
  void testKeys() {
    // Arrange and Act
    Enumeration<Object> actualKeysResult = (new SortedProperties()).keys();

    // Assert
    assertTrue(actualKeysResult instanceof IteratorEnumeration);
    assertFalse(actualKeysResult.hasMoreElements());
    assertFalse(((IteratorEnumeration<Object>) actualKeysResult).getIterator().hasNext());
  }
}
