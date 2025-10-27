package org.apache.commons.collections4.bag;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;

public class HashBagDiffblueTest {
  /**
   * Method under test: {@link HashBag#HashBag()}
   */
  @Test
  public void testNewHashBag() {
    // Arrange and Act
    HashBag<Object> actualHashBag = new HashBag<>();

    // Assert
    assertTrue(actualHashBag.isEmpty());
  }

  /**
   * Method under test: {@link HashBag#HashBag(Iterable)}
   */
  @Test
  public void testNewHashBag2() {
    // Arrange and Act
    HashBag<Object> actualHashBag = new HashBag<>((Iterable<?>) new ArrayList<>());

    // Assert
    assertTrue(actualHashBag.isEmpty());
  }

  /**
   * Method under test: {@link HashBag#HashBag(Iterable)}
   */
  @Test
  public void testNewHashBag3() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act
    HashBag<Object> actualHashBag = new HashBag<>((Iterable<?>) iterable);

    // Assert
    assertEquals(1, actualHashBag.size());
  }

  /**
   * Method under test: {@link HashBag#HashBag(Iterable)}
   */
  @Test
  public void testNewHashBag4() {
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
   * Method under test: {@link HashBag#HashBag(Collection)}
   */
  @Test
  public void testNewHashBag5() {
    // Arrange and Act
    HashBag<Object> actualHashBag = new HashBag<>(new ArrayList<>());

    // Assert
    assertTrue(actualHashBag.isEmpty());
  }

  /**
   * Method under test: {@link HashBag#HashBag(Collection)}
   */
  @Test
  public void testNewHashBag6() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");

    // Act
    HashBag<Object> actualHashBag = new HashBag<>(collection);

    // Assert
    assertEquals(1, actualHashBag.size());
  }

  /**
   * Method under test: {@link HashBag#HashBag(Collection)}
   */
  @Test
  public void testNewHashBag7() {
    // Arrange
    ArrayList<Object> collection = new ArrayList<>();
    collection.add("42");
    collection.add("42");

    // Act
    HashBag<Object> actualHashBag = new HashBag<>(collection);

    // Assert
    assertEquals(2, actualHashBag.size());
  }
}
