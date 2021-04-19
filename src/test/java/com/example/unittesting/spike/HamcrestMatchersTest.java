package com.example.unittesting.spike;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.isEmptyString;
import static org.assertj.core.api.Assertions.assertThat;


public class HamcrestMatchersTest {

    @Test
    public void learning(){
        List<Integer> numbers = Arrays.asList(12,15,45);
//        assertThat(numbers, hasSize(3));
        assertThat(numbers).hasSize(3).contains(12,15).allMatch(x->x>10).allMatch(x->x<100).noneMatch(x->x<0);

        assertThat("").isEmpty();
        assertThat("ABCDE").contains("BCD").startsWith("ABC").endsWith("CDE");

//        assertThat(numbers, hasItems(12,45));
//        assertThat(numbers, everyItem(greaterThan(10)));
//        assertThat(numbers, everyItem(lessThan(100)));
//
//        assertThat("",isEmptyString());
//        assertThat("ABCDE", containsString("BCD"));
//        assertThat("ABCDE", startsWith("ABC"));
//        assertThat("ABCDE", endsWith("CDE"));
    }
}
