package com.agualis.refactoring.longmethod;

import org.junit.Test;

import static com.agualis.refactoring.utils.JodaUtils.june;
import static com.agualis.refactoring.utils.JodaUtils.october;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestDecomposeConditional {

    @Test public void
    test() {

        assertThat(new WTF().calculateCharge(june(5, 2014)), is(6.0));
        assertThat(new WTF().calculateCharge(october(5, 2014)), is(8.0));
    }

}
