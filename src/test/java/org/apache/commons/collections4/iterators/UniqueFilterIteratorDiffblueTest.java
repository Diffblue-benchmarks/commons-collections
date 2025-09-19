package org.apache.commons.collections4.iterators;

import static org.junit.jupiter.api.Assertions.assertFalse;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UniqueFilterIteratorDiffblueTest {
  /**
   * Test {@link UniqueFilterIterator#UniqueFilterIterator(Iterator)}.
   *
   * <p>Method under test: {@link UniqueFilterIterator#UniqueFilterIterator(Iterator)}
   */
  @Test
  @DisplayName("Test new UniqueFilterIterator(Iterator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void UniqueFilterIterator.<init>(Iterator)"})
  void testNewUniqueFilterIterator() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();

    // Act
    UniqueFilterIterator<Object> actualUniqueFilterIterator =
        new UniqueFilterIterator<>(objectList.iterator());

    // Assert
    assertFalse(actualUniqueFilterIterator.hasNext());
  }
}
