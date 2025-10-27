package org.apache.commons.collections4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.multiset.HashMultiSet;
import org.junit.Test;

public class MultiSetUtilsDiffblueTest {
  /**
   * Method under test: {@link MultiSetUtils#emptyMultiSet()}
   */
  @Test
  public void testEmptyMultiSet() {
    // Arrange and Act
    MultiSet<Object> actualEmptyMultiSetResult = MultiSetUtils.emptyMultiSet();

    // Assert
    assertTrue(actualEmptyMultiSetResult.isEmpty());
  }

  /**
   * Method under test: {@link MultiSetUtils#synchronizedMultiSet(MultiSet)}
   */
  @Test
  public void testSynchronizedMultiSet() {
    // Arrange and Act
    MultiSet<Object> actualSynchronizedMultiSetResult = MultiSetUtils.synchronizedMultiSet(new HashMultiSet<>());

    // Assert
    assertTrue(actualSynchronizedMultiSetResult.isEmpty());
  }

  /**
   * Method under test: {@link MultiSetUtils#synchronizedMultiSet(MultiSet)}
   */
  @Test
  public void testSynchronizedMultiSet2() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");

    // Act
    MultiSet<Object> actualSynchronizedMultiSetResult = MultiSetUtils.synchronizedMultiSet(multiset);

    // Assert
    assertEquals(1, actualSynchronizedMultiSetResult.size());
  }

  /**
   * Method under test: {@link MultiSetUtils#synchronizedMultiSet(MultiSet)}
   */
  @Test
  public void testSynchronizedMultiSet3() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");
    multiset.add("Object");

    // Act
    MultiSet<Object> actualSynchronizedMultiSetResult = MultiSetUtils.synchronizedMultiSet(multiset);

    // Assert
    assertEquals(multiset, actualSynchronizedMultiSetResult);
  }

  /**
   * Method under test: {@link MultiSetUtils#unmodifiableMultiSet(MultiSet)}
   */
  @Test
  public void testUnmodifiableMultiSet() {
    // Arrange and Act
    MultiSet<Object> actualUnmodifiableMultiSetResult = MultiSetUtils.unmodifiableMultiSet(new HashMultiSet<>());

    // Assert
    assertTrue(actualUnmodifiableMultiSetResult.isEmpty());
  }

  /**
   * Method under test: {@link MultiSetUtils#unmodifiableMultiSet(MultiSet)}
   */
  @Test
  public void testUnmodifiableMultiSet2() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");

    // Act
    MultiSet<Object> actualUnmodifiableMultiSetResult = MultiSetUtils.unmodifiableMultiSet(multiset);

    // Assert
    assertEquals(1, actualUnmodifiableMultiSetResult.size());
  }

  /**
   * Method under test: {@link MultiSetUtils#unmodifiableMultiSet(MultiSet)}
   */
  @Test
  public void testUnmodifiableMultiSet3() {
    // Arrange
    HashMultiSet<Object> multiset = new HashMultiSet<>();
    multiset.add("Object");
    multiset.add("Object");

    // Act
    MultiSet<Object> actualUnmodifiableMultiSetResult = MultiSetUtils.unmodifiableMultiSet(multiset);

    // Assert
    assertEquals(multiset, actualUnmodifiableMultiSetResult);
  }
}
