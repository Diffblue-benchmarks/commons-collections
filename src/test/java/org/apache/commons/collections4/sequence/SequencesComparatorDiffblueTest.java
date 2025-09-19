package org.apache.commons.collections4.sequence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections4.Equator;
import org.apache.commons.collections4.functors.DefaultEquator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SequencesComparatorDiffblueTest {
  /**
   * Test {@link SequencesComparator#SequencesComparator(List, List)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return Script Modifications is one.
   * </ul>
   *
   * <p>Method under test: {@link SequencesComparator#SequencesComparator(List, List)}
   */
  @Test
  @DisplayName(
      "Test new SequencesComparator(List, List); given '42'; then return Script Modifications is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SequencesComparator.<init>(List, List)"})
  void testNewSequencesComparator_given42_thenReturnScriptModificationsIsOne() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");

    // Act
    SequencesComparator<Object> actualSequencesComparator =
        new SequencesComparator<>(sequence1, new ArrayList<>());

    // Assert
    EditScript<Object> script = actualSequencesComparator.getScript();
    assertEquals(0, script.getLCSLength());
    assertEquals(1, script.getModifications());
  }

  /**
   * Test {@link SequencesComparator#SequencesComparator(List, List)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return Script Modifications is one.
   * </ul>
   *
   * <p>Method under test: {@link SequencesComparator#SequencesComparator(List, List)}
   */
  @Test
  @DisplayName(
      "Test new SequencesComparator(List, List); given '42'; then return Script Modifications is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SequencesComparator.<init>(List, List)"})
  void testNewSequencesComparator_given42_thenReturnScriptModificationsIsOne2() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");

    // Act
    SequencesComparator<Object> actualSequencesComparator =
        new SequencesComparator<>(sequence1, sequence2);

    // Assert
    EditScript<Object> script = actualSequencesComparator.getScript();
    assertEquals(0, script.getLCSLength());
    assertEquals(1, script.getModifications());
  }

  /**
   * Test {@link SequencesComparator#SequencesComparator(List, List, Equator)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return Script Modifications is one.
   * </ul>
   *
   * <p>Method under test: {@link SequencesComparator#SequencesComparator(List, List, Equator)}
   */
  @Test
  @DisplayName(
      "Test new SequencesComparator(List, List, Equator); given '42'; then return Script Modifications is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SequencesComparator.<init>(List, List, Equator)"})
  void testNewSequencesComparator_given42_thenReturnScriptModificationsIsOne3() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");
    ArrayList<Object> sequence2 = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    SequencesComparator<Object> actualSequencesComparator =
        new SequencesComparator<>(sequence1, sequence2, equator);

    // Assert
    EditScript<Object> script = actualSequencesComparator.getScript();
    assertEquals(0, script.getLCSLength());
    assertEquals(1, script.getModifications());
  }

  /**
   * Test {@link SequencesComparator#SequencesComparator(List, List, Equator)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return Script Modifications is one.
   * </ul>
   *
   * <p>Method under test: {@link SequencesComparator#SequencesComparator(List, List, Equator)}
   */
  @Test
  @DisplayName(
      "Test new SequencesComparator(List, List, Equator); given '42'; then return Script Modifications is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SequencesComparator.<init>(List, List, Equator)"})
  void testNewSequencesComparator_given42_thenReturnScriptModificationsIsOne4() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    SequencesComparator<Object> actualSequencesComparator =
        new SequencesComparator<>(sequence1, sequence2, equator);

    // Assert
    EditScript<Object> script = actualSequencesComparator.getScript();
    assertEquals(0, script.getLCSLength());
    assertEquals(1, script.getModifications());
  }

  /**
   * Test {@link SequencesComparator#SequencesComparator(List, List)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return Script Modifications is two.
   * </ul>
   *
   * <p>Method under test: {@link SequencesComparator#SequencesComparator(List, List)}
   */
  @Test
  @DisplayName(
      "Test new SequencesComparator(List, List); given '42'; then return Script Modifications is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SequencesComparator.<init>(List, List)"})
  void testNewSequencesComparator_given42_thenReturnScriptModificationsIsTwo() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");
    sequence1.add("42");

    // Act
    SequencesComparator<Object> actualSequencesComparator =
        new SequencesComparator<>(sequence1, new ArrayList<>());

    // Assert
    EditScript<Object> script = actualSequencesComparator.getScript();
    assertEquals(0, script.getLCSLength());
    assertEquals(2, script.getModifications());
  }

  /**
   * Test {@link SequencesComparator#SequencesComparator(List, List)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return Script Modifications is two.
   * </ul>
   *
   * <p>Method under test: {@link SequencesComparator#SequencesComparator(List, List)}
   */
  @Test
  @DisplayName(
      "Test new SequencesComparator(List, List); given '42'; then return Script Modifications is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SequencesComparator.<init>(List, List)"})
  void testNewSequencesComparator_given42_thenReturnScriptModificationsIsTwo2() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");
    sequence2.add("42");

    // Act
    SequencesComparator<Object> actualSequencesComparator =
        new SequencesComparator<>(sequence1, sequence2);

    // Assert
    EditScript<Object> script = actualSequencesComparator.getScript();
    assertEquals(0, script.getLCSLength());
    assertEquals(2, script.getModifications());
  }

  /**
   * Test {@link SequencesComparator#SequencesComparator(List, List, Equator)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return Script Modifications is two.
   * </ul>
   *
   * <p>Method under test: {@link SequencesComparator#SequencesComparator(List, List, Equator)}
   */
  @Test
  @DisplayName(
      "Test new SequencesComparator(List, List, Equator); given '42'; then return Script Modifications is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SequencesComparator.<init>(List, List, Equator)"})
  void testNewSequencesComparator_given42_thenReturnScriptModificationsIsTwo3() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");
    sequence1.add("42");
    ArrayList<Object> sequence2 = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    SequencesComparator<Object> actualSequencesComparator =
        new SequencesComparator<>(sequence1, sequence2, equator);

    // Assert
    EditScript<Object> script = actualSequencesComparator.getScript();
    assertEquals(0, script.getLCSLength());
    assertEquals(2, script.getModifications());
  }

  /**
   * Test {@link SequencesComparator#SequencesComparator(List, List, Equator)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return Script Modifications is two.
   * </ul>
   *
   * <p>Method under test: {@link SequencesComparator#SequencesComparator(List, List, Equator)}
   */
  @Test
  @DisplayName(
      "Test new SequencesComparator(List, List, Equator); given '42'; then return Script Modifications is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SequencesComparator.<init>(List, List, Equator)"})
  void testNewSequencesComparator_given42_thenReturnScriptModificationsIsTwo4() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");
    sequence2.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    SequencesComparator<Object> actualSequencesComparator =
        new SequencesComparator<>(sequence1, sequence2, equator);

    // Assert
    EditScript<Object> script = actualSequencesComparator.getScript();
    assertEquals(0, script.getLCSLength());
    assertEquals(2, script.getModifications());
  }

  /**
   * Test {@link SequencesComparator#SequencesComparator(List, List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Script Modifications is zero.
   * </ul>
   *
   * <p>Method under test: {@link SequencesComparator#SequencesComparator(List, List)}
   */
  @Test
  @DisplayName(
      "Test new SequencesComparator(List, List); when ArrayList(); then return Script Modifications is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SequencesComparator.<init>(List, List)"})
  void testNewSequencesComparator_whenArrayList_thenReturnScriptModificationsIsZero() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();

    // Act
    SequencesComparator<Object> actualSequencesComparator =
        new SequencesComparator<>(sequence1, new ArrayList<>());

    // Assert
    EditScript<Object> script = actualSequencesComparator.getScript();
    assertEquals(0, script.getLCSLength());
    assertEquals(0, script.getModifications());
  }

  /**
   * Test {@link SequencesComparator#SequencesComparator(List, List, Equator)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Script Modifications is zero.
   * </ul>
   *
   * <p>Method under test: {@link SequencesComparator#SequencesComparator(List, List, Equator)}
   */
  @Test
  @DisplayName(
      "Test new SequencesComparator(List, List, Equator); when ArrayList(); then return Script Modifications is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SequencesComparator.<init>(List, List, Equator)"})
  void testNewSequencesComparator_whenArrayList_thenReturnScriptModificationsIsZero2() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    ArrayList<Object> sequence2 = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    SequencesComparator<Object> actualSequencesComparator =
        new SequencesComparator<>(sequence1, sequence2, equator);

    // Assert
    EditScript<Object> script = actualSequencesComparator.getScript();
    assertEquals(0, script.getLCSLength());
    assertEquals(0, script.getModifications());
  }

  /**
   * Test {@link SequencesComparator#getScript()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return Modifications is one.
   * </ul>
   *
   * <p>Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  @DisplayName("Test getScript(); given ArrayList() add '42'; then return Modifications is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EditScript SequencesComparator.getScript()"})
  void testGetScript_givenArrayListAdd42_thenReturnModificationsIsOne() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");
    SequencesComparator<Object> sequencesComparator =
        new SequencesComparator<>(sequence1, new ArrayList<>());

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(0, actualScript.getLCSLength());
    assertEquals(1, actualScript.getModifications());
  }

  /**
   * Test {@link SequencesComparator#getScript()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return Modifications is one.
   * </ul>
   *
   * <p>Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  @DisplayName("Test getScript(); given ArrayList() add '42'; then return Modifications is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EditScript SequencesComparator.getScript()"})
  void testGetScript_givenArrayListAdd42_thenReturnModificationsIsOne2() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");
    sequence2.add("42");

    SequencesComparator<Object> sequencesComparator =
        new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(1, actualScript.getLCSLength());
    assertEquals(1, actualScript.getModifications());
  }

  /**
   * Test {@link SequencesComparator#getScript()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return Modifications is one.
   * </ul>
   *
   * <p>Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  @DisplayName("Test getScript(); given ArrayList() add '42'; then return Modifications is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EditScript SequencesComparator.getScript()"})
  void testGetScript_givenArrayListAdd42_thenReturnModificationsIsOne3() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");
    sequence1.add("42");

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");

    SequencesComparator<Object> sequencesComparator =
        new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(1, actualScript.getLCSLength());
    assertEquals(1, actualScript.getModifications());
  }

  /**
   * Test {@link SequencesComparator#getScript()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return Modifications is three.
   * </ul>
   *
   * <p>Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  @DisplayName("Test getScript(); given ArrayList() add '42'; then return Modifications is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EditScript SequencesComparator.getScript()"})
  void testGetScript_givenArrayListAdd42_thenReturnModificationsIsThree() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");
    sequence1.add("42");
    sequence1.add("42");
    sequence1.add("42");

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");

    SequencesComparator<Object> sequencesComparator =
        new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(1, actualScript.getLCSLength());
    assertEquals(3, actualScript.getModifications());
  }

  /**
   * Test {@link SequencesComparator#getScript()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return Modifications is two.
   * </ul>
   *
   * <p>Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  @DisplayName("Test getScript(); given ArrayList() add '42'; then return Modifications is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EditScript SequencesComparator.getScript()"})
  void testGetScript_givenArrayListAdd42_thenReturnModificationsIsTwo() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");
    sequence2.add("42");
    sequence2.add("42");

    SequencesComparator<Object> sequencesComparator =
        new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(1, actualScript.getLCSLength());
    assertEquals(2, actualScript.getModifications());
  }

  /**
   * Test {@link SequencesComparator#getScript()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return Modifications is two.
   * </ul>
   *
   * <p>Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  @DisplayName("Test getScript(); given ArrayList() add '42'; then return Modifications is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EditScript SequencesComparator.getScript()"})
  void testGetScript_givenArrayListAdd42_thenReturnModificationsIsTwo2() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");
    sequence1.add("42");
    sequence1.add("42");

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");

    SequencesComparator<Object> sequencesComparator =
        new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(1, actualScript.getLCSLength());
    assertEquals(2, actualScript.getModifications());
  }

  /**
   * Test {@link SequencesComparator#getScript()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return Modifications is zero.
   * </ul>
   *
   * <p>Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  @DisplayName("Test getScript(); given ArrayList() add '42'; then return Modifications is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EditScript SequencesComparator.getScript()"})
  void testGetScript_givenArrayListAdd42_thenReturnModificationsIsZero() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");

    SequencesComparator<Object> sequencesComparator =
        new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(0, actualScript.getModifications());
    assertEquals(1, actualScript.getLCSLength());
  }

  /**
   * Test {@link SequencesComparator#getScript()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add two.
   *   <li>Then return Modifications is four.
   * </ul>
   *
   * <p>Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  @DisplayName("Test getScript(); given ArrayList() add two; then return Modifications is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EditScript SequencesComparator.getScript()"})
  void testGetScript_givenArrayListAddTwo_thenReturnModificationsIsFour() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add(2);

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");
    sequence2.add("42");
    sequence2.add("42");

    SequencesComparator<Object> sequencesComparator =
        new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(0, actualScript.getLCSLength());
    assertEquals(4, actualScript.getModifications());
  }

  /**
   * Test {@link SequencesComparator#getScript()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add two.
   *   <li>Then return Modifications is one.
   * </ul>
   *
   * <p>Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  @DisplayName("Test getScript(); given ArrayList() add two; then return Modifications is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EditScript SequencesComparator.getScript()"})
  void testGetScript_givenArrayListAddTwo_thenReturnModificationsIsOne() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");
    sequence2.add(2);

    SequencesComparator<Object> sequencesComparator =
        new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(1, actualScript.getLCSLength());
    assertEquals(1, actualScript.getModifications());
  }

  /**
   * Test {@link SequencesComparator#getScript()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add two.
   *   <li>Then return Modifications is three.
   * </ul>
   *
   * <p>Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  @DisplayName("Test getScript(); given ArrayList() add two; then return Modifications is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EditScript SequencesComparator.getScript()"})
  void testGetScript_givenArrayListAddTwo_thenReturnModificationsIsThree() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");
    sequence1.add("42");

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add(2);

    SequencesComparator<Object> sequencesComparator =
        new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(0, actualScript.getLCSLength());
    assertEquals(3, actualScript.getModifications());
  }

  /**
   * Test {@link SequencesComparator#getScript()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add two.
   *   <li>Then return Modifications is three.
   * </ul>
   *
   * <p>Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  @DisplayName("Test getScript(); given ArrayList() add two; then return Modifications is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EditScript SequencesComparator.getScript()"})
  void testGetScript_givenArrayListAddTwo_thenReturnModificationsIsThree2() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");
    sequence1.add("42");
    sequence1.add("42");

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add(2);
    sequence2.add("42");

    SequencesComparator<Object> sequencesComparator =
        new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(1, actualScript.getLCSLength());
    assertEquals(3, actualScript.getModifications());
  }

  /**
   * Test {@link SequencesComparator#getScript()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add two.
   *   <li>Then return Modifications is three.
   * </ul>
   *
   * <p>Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  @DisplayName("Test getScript(); given ArrayList() add two; then return Modifications is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EditScript SequencesComparator.getScript()"})
  void testGetScript_givenArrayListAddTwo_thenReturnModificationsIsThree3() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add(2);

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add(2);
    sequence2.add("42");
    sequence2.add("42");
    sequence2.add("42");

    SequencesComparator<Object> sequencesComparator =
        new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(1, actualScript.getLCSLength());
    assertEquals(3, actualScript.getModifications());
  }

  /**
   * Test {@link SequencesComparator#getScript()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add two.
   *   <li>Then return Modifications is two.
   * </ul>
   *
   * <p>Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  @DisplayName("Test getScript(); given ArrayList() add two; then return Modifications is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EditScript SequencesComparator.getScript()"})
  void testGetScript_givenArrayListAddTwo_thenReturnModificationsIsTwo() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add(2);

    SequencesComparator<Object> sequencesComparator =
        new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(0, actualScript.getLCSLength());
    assertEquals(2, actualScript.getModifications());
  }

  /**
   * Test {@link SequencesComparator#getScript()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add two.
   *   <li>Then return Modifications is two.
   * </ul>
   *
   * <p>Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  @DisplayName("Test getScript(); given ArrayList() add two; then return Modifications is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EditScript SequencesComparator.getScript()"})
  void testGetScript_givenArrayListAddTwo_thenReturnModificationsIsTwo2() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add(2);
    sequence1.add("42");

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");
    sequence2.add("42");

    SequencesComparator<Object> sequencesComparator =
        new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(1, actualScript.getLCSLength());
    assertEquals(2, actualScript.getModifications());
  }

  /**
   * Test {@link SequencesComparator#getScript()}.
   *
   * <ul>
   *   <li>Then return Modifications is zero.
   * </ul>
   *
   * <p>Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  @DisplayName("Test getScript(); then return Modifications is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EditScript SequencesComparator.getScript()"})
  void testGetScript_thenReturnModificationsIsZero() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    SequencesComparator<Object> sequencesComparator =
        new SequencesComparator<>(sequence1, new ArrayList<>());

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(0, actualScript.getLCSLength());
    assertEquals(0, actualScript.getModifications());
  }
}
