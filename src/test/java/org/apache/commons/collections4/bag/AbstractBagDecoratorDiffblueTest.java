package org.apache.commons.collections4.bag;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

public class AbstractBagDecoratorDiffblueTest {
  /**
   * Test {@link AbstractBagDecorator#remove(Object, int)} with {@code object}, {@code count}.
   * <ul>
   *   <li>Given {@link AbstractBagDecorator} {@link AbstractBagDecorator#remove(Object, int)} return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractBagDecorator#remove(Object, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractBagDecorator.remove(Object, int)"})
  public void testRemoveWithObjectCount_givenAbstractBagDecoratorRemoveReturnFalse() {
    // Arrange
    AbstractBagDecorator<Object> abstractBagDecorator = mock(AbstractBagDecorator.class);
    when(abstractBagDecorator.remove(Mockito.<Object>any(), anyInt())).thenReturn(false);

    // Act
    abstractBagDecorator.remove("Object", 3);

    // Assert
    verify(abstractBagDecorator).remove(isA(Object.class), eq(3));
  }

  /**
   * Test {@link AbstractBagDecorator#remove(Object, int)} with {@code object}, {@code count}.
   * <ul>
   *   <li>Given {@link AbstractBagDecorator} {@link AbstractBagDecorator#remove(Object, int)} return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractBagDecorator#remove(Object, int)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"boolean AbstractBagDecorator.remove(Object, int)"})
  public void testRemoveWithObjectCount_givenAbstractBagDecoratorRemoveReturnTrue() {
    // Arrange
    AbstractBagDecorator<Object> abstractBagDecorator = mock(AbstractBagDecorator.class);
    when(abstractBagDecorator.remove(Mockito.<Object>any(), anyInt())).thenReturn(true);

    // Act
    abstractBagDecorator.remove("Object", 3);

    // Assert
    verify(abstractBagDecorator).remove(isA(Object.class), eq(3));
  }
}
