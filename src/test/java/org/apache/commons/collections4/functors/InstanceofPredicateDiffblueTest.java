package org.apache.commons.collections4.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.apache.commons.collections4.Predicate;
import org.junit.Test;

public class InstanceofPredicateDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link InstanceofPredicate#InstanceofPredicate(Class)}
   *   <li>{@link InstanceofPredicate#getType()}
   * </ul>
   */
  @Test
  public void testGettersAndSetters() {
    // Arrange
    Class<Object> type = Object.class;

    // Act
    Class<?> actualType = (new InstanceofPredicate(type)).getType();

    // Assert
    Class<Object> expectedType = Object.class;
    assertEquals(expectedType, actualType);
    assertSame(type, actualType);
  }

  /**
   * Method under test: {@link InstanceofPredicate#instanceOfPredicate(Class)}
   */
  @Test
  public void testInstanceOfPredicate() {
    // Arrange
    Class<Object> type = Object.class;

    // Act
    Predicate<Object> actualInstanceOfPredicateResult = InstanceofPredicate.instanceOfPredicate(type);

    // Assert
    assertTrue(actualInstanceOfPredicateResult instanceof InstanceofPredicate);
    assertTrue(actualInstanceOfPredicateResult.evaluate("42"));
    Class<Object> expectedType = Object.class;
    Class<?> type2 = ((InstanceofPredicate) actualInstanceOfPredicateResult).getType();
    assertEquals(expectedType, type2);
    assertSame(type, type2);
  }

  /**
   * Method under test: {@link InstanceofPredicate#instanceOfPredicate(Class)}
   */
  @Test
  public void testInstanceOfPredicate2() {
    // Arrange
    Class<Class> type = Class.class;

    // Act
    Predicate<Object> actualInstanceOfPredicateResult = InstanceofPredicate.instanceOfPredicate(type);

    // Assert
    assertTrue(actualInstanceOfPredicateResult instanceof InstanceofPredicate);
    assertFalse(actualInstanceOfPredicateResult.evaluate("42"));
    Class<Class> expectedType = Class.class;
    Class<?> type2 = ((InstanceofPredicate) actualInstanceOfPredicateResult).getType();
    assertEquals(expectedType, type2);
    assertSame(type, type2);
  }

  /**
   * Method under test: {@link InstanceofPredicate#test(Object)}
   */
  @Test
  public void testTest() {
    // Arrange
    Class<Object> type = Object.class;

    // Act and Assert
    assertTrue((new InstanceofPredicate(type)).test("Object"));
  }

  /**
   * Method under test: {@link InstanceofPredicate#test(Object)}
   */
  @Test
  public void testTest2() {
    // Arrange
    Class<Class> type = Class.class;

    // Act and Assert
    assertFalse((new InstanceofPredicate(type)).test("Object"));
  }
}
