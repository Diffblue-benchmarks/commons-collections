package org.apache.commons.collections4.bidimap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.commons.collections4.BidiMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnmodifiableBidiMapDiffblueTest {
  /**
   * Test {@link UnmodifiableBidiMap#unmodifiableBidiMap(BidiMap)}.
   * <p>
   * Method under test: {@link UnmodifiableBidiMap#unmodifiableBidiMap(BidiMap)}
   */
  @Test
  @DisplayName("Test unmodifiableBidiMap(BidiMap)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"BidiMap UnmodifiableBidiMap.unmodifiableBidiMap(BidiMap)"})
  void testUnmodifiableBidiMap() {
    // Arrange
    DualHashBidiMap<Object, Object> map = new DualHashBidiMap<>();

    // Act
    BidiMap<Object, Object> actualUnmodifiableBidiMapResult = UnmodifiableBidiMap.unmodifiableBidiMap(map);

    // Assert
    assertEquals(map, actualUnmodifiableBidiMapResult);
  }
}
