package org.apache.commons.collections4.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;

public class UnmodifiableCollectionDiffblueTest {
  /**
   * Method under test:
   * {@link UnmodifiableCollection#unmodifiableCollection(Collection)}
   */
  @Test
  public void testUnmodifiableCollection() {
    // Arrange and Act
    Collection<Object> actualUnmodifiableCollectionResult = UnmodifiableCollection
        .unmodifiableCollection(new ArrayList<>());

    // Assert
    assertTrue(actualUnmodifiableCollectionResult.isEmpty());
  }

  /**
   * Method under test:
   * {@link UnmodifiableCollection#unmodifiableCollection(Collection)}
   */
  @Test
  public void testUnmodifiableCollection2() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");

    // Act
    Collection<Object> actualUnmodifiableCollectionResult = UnmodifiableCollection.unmodifiableCollection(coll);

    // Assert
    assertEquals(1, actualUnmodifiableCollectionResult.size());
  }

  /**
   * Method under test:
   * {@link UnmodifiableCollection#unmodifiableCollection(Collection)}
   */
  @Test
  public void testUnmodifiableCollection3() {
    // Arrange
    ArrayList<Object> coll = new ArrayList<>();
    coll.add("42");
    coll.add("42");

    // Act
    Collection<Object> actualUnmodifiableCollectionResult = UnmodifiableCollection.unmodifiableCollection(coll);

    // Assert
    assertEquals(2, actualUnmodifiableCollectionResult.size());
  }
}
