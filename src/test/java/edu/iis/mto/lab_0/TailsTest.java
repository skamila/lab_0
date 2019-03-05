package edu.iis.mto.lab_0;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class TailsTest {

    private static final String HELLO = "Hello";
    private TailsGenerator tailsGenerator;
    private List<String> tails;

    @Before
    public void setup() {
        tailsGenerator = new TailsGenerator();
    }

    @Test
    public void tailsShouldReturnEmptyListIfParameterIsNull() {
        tails = tailsGenerator.tails(null);
        assertThat(tails, empty());
    }

    @Test
    public void tailsShouldReturnListOfStringsOfSizeEqualsToInputStringLengthPlusOne() {
        tails = tailsGenerator.tails(HELLO);
        assertThat(tails, hasSize(HELLO.length() + 1));
    }

    @Test
    public void tailsShouldReturnFullStringAsFirstElement() {
        tails = tailsGenerator.tails(HELLO);
        assertThat(tails.get(0), equalTo(HELLO));
    }

    @Test
    public void tailsShouldReturnEmptyStringAsLastElement() {
        tails = tailsGenerator.tails(HELLO);
        assertThat(tails.get(tails.size() - 1), equalTo(""));
    }

}
