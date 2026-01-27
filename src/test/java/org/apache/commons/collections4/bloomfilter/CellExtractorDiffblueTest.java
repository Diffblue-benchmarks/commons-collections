package org.apache.commons.collections4.bloomfilter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CellExtractorDiffblueTest {
  /**
   * Test {@link CellExtractor#from(IndexExtractor)}.
   *
   * <ul>
   *   <li>When {@link IndexExtractor}.
   * </ul>
   *
   * <p>Method under test: {@link CellExtractor#from(IndexExtractor)}
   */
  @Test
  @DisplayName("Test from(IndexExtractor); when IndexExtractor")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CellExtractor CellExtractor.from(IndexExtractor)"})
  void testFrom_whenIndexExtractor() {
    // Arrange and Act
    CellExtractor actualFromResult = CellExtractor.from(mock(IndexExtractor.class));

    // Assert
    IndexExtractor actualUniqueIndicesResult = actualFromResult.uniqueIndices();
    assertSame(actualFromResult, actualUniqueIndicesResult);
    assertArrayEquals(new int[] {}, actualFromResult.asIndexArray());
  }
}
