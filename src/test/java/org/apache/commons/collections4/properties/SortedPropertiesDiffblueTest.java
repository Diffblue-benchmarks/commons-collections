package org.apache.commons.collections4.properties;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Enumeration;
import org.apache.commons.collections4.iterators.IteratorEnumeration;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SortedPropertiesDiffblueTest {
  /**
   * Test new {@link SortedProperties} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link SortedProperties}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"void SortedProperties.<init>()"})
  public void testNewSortedProperties() {
    // Arrange, Act and Assert
    assertTrue((new SortedProperties()).isEmpty());
  }

  /**
   * Test {@link SortedProperties#entrySet()}.
   * <p>
   * Method under test: {@link SortedProperties#entrySet()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set SortedProperties.entrySet()"})
  public void testEntrySet() {
    // Arrange, Act and Assert
    assertTrue((new SortedProperties()).entrySet().isEmpty());
  }

  /**
   * Test {@link SortedProperties#keys()}.
   * <p>
   * Method under test: {@link SortedProperties#keys()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"Enumeration SortedProperties.keys()"})
  public void testKeys() {
    // Arrange and Act
    Enumeration<Object> actualKeysResult = (new SortedProperties()).keys();

    // Assert
    assertTrue(actualKeysResult instanceof IteratorEnumeration);
    assertFalse(actualKeysResult.hasMoreElements());
    assertFalse(((IteratorEnumeration<Object>) actualKeysResult).getIterator().hasNext());
  }
}
