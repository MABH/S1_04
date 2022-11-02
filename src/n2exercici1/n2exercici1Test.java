package n2exercici1;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.*;
import org.junit.jupiter.api.Test;
//import org.hamcrest.Matchers;

import static org.hamcrest.Matchers.*;

import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.equalTo;

//import org.junit.Test;


class n2exercici1Test {

	public static Matcher<String> length(Matcher<? super Integer> matcher) {
	    return new FeatureMatcher<String, Integer>(matcher,
	            "Cadena de longitud", "length") {
	        @Override
	        protected Integer featureValueOf(String actual) {
	            return actual.length();
	        }
	    };
	}
	
	@Test
	public void MordorTest() {
	    assertThat("Mordor", length(is(8)));
	}

}
