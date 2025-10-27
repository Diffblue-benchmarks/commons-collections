package org.apache.commons.collections4.properties;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Enumeration;
import org.apache.commons.collections4.iterators.IteratorEnumeration;
import org.junit.Test;

public class SortedPropertiesDiffblueTest {
  /**
   * Method under test: {@link SortedProperties#entrySet()}
   */
  @Test
  public void testEntrySet() {
    // Arrange, Act and Assert
    assertTrue((new SortedProperties()).entrySet().isEmpty());
  }

  /**
   * Method under test: {@link SortedProperties#keys()}
   */
  @Test
  public void testKeys() {
    // Arrange and Act
    Enumeration<Object> actualKeysResult = (new SortedProperties()).keys();

    // Assert
    assertTrue(actualKeysResult instanceof IteratorEnumeration);
    assertFalse(actualKeysResult.hasMoreElements());
    assertFalse(((IteratorEnumeration<Object>) actualKeysResult).getIterator().hasNext());
  }

  /**
   * Method under test: default or parameterless constructor of
   * {@link SortedProperties}
   */
  @Test
  public void testNewSortedProperties() {
    // Arrange, Act and Assert
    assertTrue((new SortedProperties()).isEmpty());
  }
}
