package org.apache.commons.collections4.bidimap;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.MaintainedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.BidiMap;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class UnmodifiableBidiMapDiffblueTest {
  /**
   * Test {@link UnmodifiableBidiMap#unmodifiableBidiMap(BidiMap)}.
   * <p>
   * Method under test: {@link UnmodifiableBidiMap#unmodifiableBidiMap(BidiMap)}
   */
  @Test
  @Category(MaintainedByDiffblue.class)
  @MethodsUnderTest({"BidiMap UnmodifiableBidiMap.unmodifiableBidiMap(BidiMap)"})
  public void testUnmodifiableBidiMap() {
    // Arrange
    DualHashBidiMap<Object, Object> map = new DualHashBidiMap<>();

    // Act
    BidiMap<Object, Object> actualUnmodifiableBidiMapResult = UnmodifiableBidiMap.unmodifiableBidiMap(map);

    // Assert
    assertEquals(map, actualUnmodifiableBidiMapResult);
  }
}
