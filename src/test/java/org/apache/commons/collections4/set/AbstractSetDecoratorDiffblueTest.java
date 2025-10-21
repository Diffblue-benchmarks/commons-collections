package org.apache.commons.collections4.set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AbstractSetDecoratorDiffblueTest {
  /**
   * Test {@link AbstractSetDecorator#decorated()}.
   * <p>
   * Method under test: {@link AbstractSetDecorator#decorated()}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"java.util.Set AbstractSetDecorator.decorated()"})
  public void testDecorated() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertTrue(objectSet.decorated().isEmpty());
  }

  /**
   * Test {@link AbstractSetDecorator#equals(Object)}, and {@link AbstractSetDecorator#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractSetDecorator#equals(Object)}
   *   <li>{@link AbstractSetDecorator#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractSetDecorator.equals(Object)", "int AbstractSetDecorator.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    ListOrderedSet<Object> objectSet2 = new ListOrderedSet<>();

    // Act and Assert
    assertEquals(objectSet, objectSet2);
    int expectedHashCodeResult = objectSet.hashCode();
    assertEquals(expectedHashCodeResult, objectSet2.hashCode());
  }

  /**
   * Test {@link AbstractSetDecorator#equals(Object)}, and {@link AbstractSetDecorator#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractSetDecorator#equals(Object)}
   *   <li>{@link AbstractSetDecorator#hashCode()}
   * </ul>
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractSetDecorator.equals(Object)", "int AbstractSetDecorator.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertEquals(objectSet, objectSet);
    int expectedHashCodeResult = objectSet.hashCode();
    assertEquals(expectedHashCodeResult, objectSet.hashCode());
  }

  /**
   * Test {@link AbstractSetDecorator#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractSetDecorator#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractSetDecorator.equals(Object)", "int AbstractSetDecorator.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();
    objectSet.add("Object");

    // Act and Assert
    assertNotEquals(objectSet, new ListOrderedSet<>());
  }

  /**
   * Test {@link AbstractSetDecorator#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractSetDecorator#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractSetDecorator.equals(Object)", "int AbstractSetDecorator.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertNotEquals(objectSet, null);
  }

  /**
   * Test {@link AbstractSetDecorator#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractSetDecorator#equals(Object)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractSetDecorator.equals(Object)", "int AbstractSetDecorator.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ListOrderedSet<Object> objectSet = new ListOrderedSet<>();

    // Act and Assert
    assertNotEquals(objectSet, "Different type to AbstractSetDecorator");
  }
}
