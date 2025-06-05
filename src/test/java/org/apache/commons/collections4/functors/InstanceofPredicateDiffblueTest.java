package org.apache.commons.collections4.functors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class InstanceofPredicateDiffblueTest {
  /**
   * Test {@link InstanceofPredicate#instanceOfPredicate(Class)}.
   * <ul>
   *   <li>When {@code Class}.</li>
   *   <li>Then return not evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InstanceofPredicate#instanceOfPredicate(Class)}
   */
  @Test
  @DisplayName("Test instanceOfPredicate(Class); when 'java.lang.Class'; then return not evaluate '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate InstanceofPredicate.instanceOfPredicate(Class)"})
  void testInstanceOfPredicate_whenJavaLangClass_thenReturnNotEvaluate42() {
    // Arrange
    Class<Class> type = Class.class;

    // Act
    Predicate<Object> actualInstanceOfPredicateResult = InstanceofPredicate.instanceOfPredicate(type);

    // Assert
    assertTrue(actualInstanceOfPredicateResult instanceof InstanceofPredicate);
    assertFalse(actualInstanceOfPredicateResult.evaluate("42"));
    Class<Class> expectedType = Class.class;
    assertEquals(expectedType, ((InstanceofPredicate) actualInstanceOfPredicateResult).getType());
  }

  /**
   * Test {@link InstanceofPredicate#instanceOfPredicate(Class)}.
   * <ul>
   *   <li>When {@code Object}.</li>
   *   <li>Then return evaluate {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InstanceofPredicate#instanceOfPredicate(Class)}
   */
  @Test
  @DisplayName("Test instanceOfPredicate(Class); when 'java.lang.Object'; then return evaluate '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Predicate InstanceofPredicate.instanceOfPredicate(Class)"})
  void testInstanceOfPredicate_whenJavaLangObject_thenReturnEvaluate42() {
    // Arrange
    Class<Object> type = Object.class;

    // Act
    Predicate<Object> actualInstanceOfPredicateResult = InstanceofPredicate.instanceOfPredicate(type);

    // Assert
    assertTrue(actualInstanceOfPredicateResult instanceof InstanceofPredicate);
    assertTrue(actualInstanceOfPredicateResult.evaluate("42"));
    Class<Object> expectedType = Object.class;
    assertEquals(expectedType, ((InstanceofPredicate) actualInstanceOfPredicateResult).getType());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link InstanceofPredicate#InstanceofPredicate(Class)}
   *   <li>{@link InstanceofPredicate#getType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void InstanceofPredicate.<init>(Class)", "Class InstanceofPredicate.getType()"})
  void testGettersAndSetters() {
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
   * Test {@link InstanceofPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@code Class}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InstanceofPredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); given 'java.lang.Class'; then return 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean InstanceofPredicate.test(Object)"})
  void testTest_givenJavaLangClass_thenReturnFalse() {
    // Arrange
    Class<Class> type = Class.class;

    // Act and Assert
    assertFalse((new InstanceofPredicate(type)).test("Object"));
  }

  /**
   * Test {@link InstanceofPredicate#test(Object)}.
   * <ul>
   *   <li>Given {@code Object}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link InstanceofPredicate#test(Object)}
   */
  @Test
  @DisplayName("Test test(Object); given 'java.lang.Object'; then return 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean InstanceofPredicate.test(Object)"})
  void testTest_givenJavaLangObject_thenReturnTrue() {
    // Arrange
    Class<Object> type = Object.class;

    // Act and Assert
    assertTrue((new InstanceofPredicate(type)).test("Object"));
  }
}
