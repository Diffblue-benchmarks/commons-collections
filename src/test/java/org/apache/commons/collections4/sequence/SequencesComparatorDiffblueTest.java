package org.apache.commons.collections4.sequence;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections4.Equator;
import org.apache.commons.collections4.functors.DefaultEquator;
import org.junit.Test;

public class SequencesComparatorDiffblueTest {
  /**
   * Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  public void testGetScript() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    SequencesComparator<Object> sequencesComparator = new SequencesComparator<>(sequence1, new ArrayList<>());

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(0, actualScript.getLCSLength());
    assertEquals(0, actualScript.getModifications());
  }

  /**
   * Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  public void testGetScript2() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");
    SequencesComparator<Object> sequencesComparator = new SequencesComparator<>(sequence1, new ArrayList<>());

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(0, actualScript.getLCSLength());
    assertEquals(1, actualScript.getModifications());
  }

  /**
   * Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  public void testGetScript3() {
    // Arrange
    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");
    SequencesComparator<Object> sequencesComparator = new SequencesComparator<>(new ArrayList<>(), sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(0, actualScript.getLCSLength());
    assertEquals(1, actualScript.getModifications());
  }

  /**
   * Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  public void testGetScript4() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");
    SequencesComparator<Object> sequencesComparator = new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(0, actualScript.getModifications());
    assertEquals(1, actualScript.getLCSLength());
  }

  /**
   * Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  public void testGetScript5() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");
    sequence2.add("42");
    SequencesComparator<Object> sequencesComparator = new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(1, actualScript.getLCSLength());
    assertEquals(1, actualScript.getModifications());
  }

  /**
   * Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  public void testGetScript6() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add(2);
    SequencesComparator<Object> sequencesComparator = new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(0, actualScript.getLCSLength());
    assertEquals(2, actualScript.getModifications());
  }

  /**
   * Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  public void testGetScript7() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");
    sequence2.add("42");
    sequence2.add("42");
    SequencesComparator<Object> sequencesComparator = new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(1, actualScript.getLCSLength());
    assertEquals(2, actualScript.getModifications());
  }

  /**
   * Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  public void testGetScript8() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");
    sequence1.add("42");

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");
    SequencesComparator<Object> sequencesComparator = new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(1, actualScript.getLCSLength());
    assertEquals(1, actualScript.getModifications());
  }

  /**
   * Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  public void testGetScript9() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");
    sequence1.add("42");
    sequence1.add("42");

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");
    SequencesComparator<Object> sequencesComparator = new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(1, actualScript.getLCSLength());
    assertEquals(2, actualScript.getModifications());
  }

  /**
   * Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  public void testGetScript10() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");
    sequence1.add("42");
    sequence1.add("42");
    sequence1.add("42");

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");
    SequencesComparator<Object> sequencesComparator = new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(1, actualScript.getLCSLength());
    assertEquals(3, actualScript.getModifications());
  }

  /**
   * Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  public void testGetScript11() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add(2);
    sequence1.add("42");

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");
    sequence2.add("42");
    SequencesComparator<Object> sequencesComparator = new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(1, actualScript.getLCSLength());
    assertEquals(2, actualScript.getModifications());
  }

  /**
   * Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  public void testGetScript12() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add(2);

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");
    sequence2.add("42");
    SequencesComparator<Object> sequencesComparator = new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(0, actualScript.getLCSLength());
    assertEquals(3, actualScript.getModifications());
  }

  /**
   * Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  public void testGetScript13() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");
    sequence2.add(2);
    SequencesComparator<Object> sequencesComparator = new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(1, actualScript.getLCSLength());
    assertEquals(1, actualScript.getModifications());
  }

  /**
   * Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  public void testGetScript14() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add(2);

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");
    sequence2.add("42");
    sequence2.add("42");
    SequencesComparator<Object> sequencesComparator = new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(0, actualScript.getLCSLength());
    assertEquals(4, actualScript.getModifications());
  }

  /**
   * Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  public void testGetScript15() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");
    sequence1.add("42");
    sequence1.add("42");

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add(2);
    sequence2.add("42");
    SequencesComparator<Object> sequencesComparator = new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(1, actualScript.getLCSLength());
    assertEquals(3, actualScript.getModifications());
  }

  /**
   * Method under test: {@link SequencesComparator#getScript()}
   */
  @Test
  public void testGetScript16() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add(2);

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add(2);
    sequence2.add("42");
    sequence2.add("42");
    sequence2.add("42");
    SequencesComparator<Object> sequencesComparator = new SequencesComparator<>(sequence1, sequence2);

    // Act
    EditScript<Object> actualScript = sequencesComparator.getScript();

    // Assert
    assertEquals(1, actualScript.getLCSLength());
    assertEquals(3, actualScript.getModifications());
  }

  /**
   * Method under test:
   * {@link SequencesComparator#SequencesComparator(List, List)}
   */
  @Test
  public void testNewSequencesComparator() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();

    // Act
    SequencesComparator<Object> actualSequencesComparator = new SequencesComparator<>(sequence1, new ArrayList<>());

    // Assert
    EditScript<Object> script = actualSequencesComparator.getScript();
    assertEquals(0, script.getLCSLength());
    assertEquals(0, script.getModifications());
  }

  /**
   * Method under test:
   * {@link SequencesComparator#SequencesComparator(List, List)}
   */
  @Test
  public void testNewSequencesComparator2() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");

    // Act
    SequencesComparator<Object> actualSequencesComparator = new SequencesComparator<>(sequence1, new ArrayList<>());

    // Assert
    EditScript<Object> script = actualSequencesComparator.getScript();
    assertEquals(0, script.getLCSLength());
    assertEquals(1, script.getModifications());
  }

  /**
   * Method under test:
   * {@link SequencesComparator#SequencesComparator(List, List)}
   */
  @Test
  public void testNewSequencesComparator3() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");
    sequence1.add("42");

    // Act
    SequencesComparator<Object> actualSequencesComparator = new SequencesComparator<>(sequence1, new ArrayList<>());

    // Assert
    EditScript<Object> script = actualSequencesComparator.getScript();
    assertEquals(0, script.getLCSLength());
    assertEquals(2, script.getModifications());
  }

  /**
   * Method under test:
   * {@link SequencesComparator#SequencesComparator(List, List)}
   */
  @Test
  public void testNewSequencesComparator4() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");

    // Act
    SequencesComparator<Object> actualSequencesComparator = new SequencesComparator<>(sequence1, sequence2);

    // Assert
    EditScript<Object> script = actualSequencesComparator.getScript();
    assertEquals(0, script.getLCSLength());
    assertEquals(1, script.getModifications());
  }

  /**
   * Method under test:
   * {@link SequencesComparator#SequencesComparator(List, List)}
   */
  @Test
  public void testNewSequencesComparator5() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");
    sequence2.add("42");

    // Act
    SequencesComparator<Object> actualSequencesComparator = new SequencesComparator<>(sequence1, sequence2);

    // Assert
    EditScript<Object> script = actualSequencesComparator.getScript();
    assertEquals(0, script.getLCSLength());
    assertEquals(2, script.getModifications());
  }

  /**
   * Method under test:
   * {@link SequencesComparator#SequencesComparator(List, List, Equator)}
   */
  @Test
  public void testNewSequencesComparator6() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    ArrayList<Object> sequence2 = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    SequencesComparator<Object> actualSequencesComparator = new SequencesComparator<>(sequence1, sequence2, equator);

    // Assert
    EditScript<Object> script = actualSequencesComparator.getScript();
    assertEquals(0, script.getLCSLength());
    assertEquals(0, script.getModifications());
  }

  /**
   * Method under test:
   * {@link SequencesComparator#SequencesComparator(List, List, Equator)}
   */
  @Test
  public void testNewSequencesComparator7() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");
    ArrayList<Object> sequence2 = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    SequencesComparator<Object> actualSequencesComparator = new SequencesComparator<>(sequence1, sequence2, equator);

    // Assert
    EditScript<Object> script = actualSequencesComparator.getScript();
    assertEquals(0, script.getLCSLength());
    assertEquals(1, script.getModifications());
  }

  /**
   * Method under test:
   * {@link SequencesComparator#SequencesComparator(List, List, Equator)}
   */
  @Test
  public void testNewSequencesComparator8() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();
    sequence1.add("42");
    sequence1.add("42");
    ArrayList<Object> sequence2 = new ArrayList<>();
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    SequencesComparator<Object> actualSequencesComparator = new SequencesComparator<>(sequence1, sequence2, equator);

    // Assert
    EditScript<Object> script = actualSequencesComparator.getScript();
    assertEquals(0, script.getLCSLength());
    assertEquals(2, script.getModifications());
  }

  /**
   * Method under test:
   * {@link SequencesComparator#SequencesComparator(List, List, Equator)}
   */
  @Test
  public void testNewSequencesComparator9() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    SequencesComparator<Object> actualSequencesComparator = new SequencesComparator<>(sequence1, sequence2, equator);

    // Assert
    EditScript<Object> script = actualSequencesComparator.getScript();
    assertEquals(0, script.getLCSLength());
    assertEquals(1, script.getModifications());
  }

  /**
   * Method under test:
   * {@link SequencesComparator#SequencesComparator(List, List, Equator)}
   */
  @Test
  public void testNewSequencesComparator10() {
    // Arrange
    ArrayList<Object> sequence1 = new ArrayList<>();

    ArrayList<Object> sequence2 = new ArrayList<>();
    sequence2.add("42");
    sequence2.add("42");
    DefaultEquator<? super Object> equator = DefaultEquator.defaultEquator();

    // Act
    SequencesComparator<Object> actualSequencesComparator = new SequencesComparator<>(sequence1, sequence2, equator);

    // Assert
    EditScript<Object> script = actualSequencesComparator.getScript();
    assertEquals(0, script.getLCSLength());
    assertEquals(2, script.getModifications());
  }
}
