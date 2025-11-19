package org.apache.commons.collections4.bidimap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Comparator;
import org.apache.commons.collections4.SortedBidiMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AbstractSortedBidiMapDecoratorDiffblueTest {
  @Mock private SortedBidiMap<Object, ?> sortedBidiMap;

  @InjectMocks private UnmodifiableSortedBidiMap<Object, Object> unmodifiableSortedBidiMap;

  /**
   * Test {@link AbstractSortedBidiMapDecorator#comparator()}.
   *
   * <p>Method under test: {@link AbstractSortedBidiMapDecorator#comparator()}
   */
  @Test
  @DisplayName("Test comparator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Comparator AbstractSortedBidiMapDecorator.comparator()"})
  void testComparator() {
    // Arrange
    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    Mockito.<Comparator<? super Object>>when(sortedBidiMap.comparator()).thenReturn(comparator);

    // Act
    int actualCompareResult = unmodifiableSortedBidiMap.comparator().compare("42", "42");

    // Assert
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    verify(sortedBidiMap).comparator();
    assertEquals(1, actualCompareResult);
  }
}
