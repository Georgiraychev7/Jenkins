package cucumber.StepDefinitions;

import io.restassured.response.Response;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

class Verify<T> {
    private T verificationObject;

    public Verify(T verifyObject) {
        this.verificationObject = verifyObject;
    }

    public static <T> Verify<T> that(T verifyObject) {
        return new Verify<>(verifyObject);
    }

    public Verify<T> and(T newObject) {
        this.verificationObject = newObject;
        return this;
    }

    public Verify<T> is(T value) {
        assertThat(verificationObject).isEqualTo(value);
        return this;
    }


    public Verify<T> isNot(T value) {
        assertThat(verificationObject).isNotEqualTo(value);
        return this;
    }

//    Verify<T> is(T value) {
//        assertEquals(verificationObject, value);
//        return this;
//    }
//
//    Verify<T> isNot(T value) {
//        assertNotEquals(verificationObject, value);
//        return this;
//    }


    Verify<T> contains(T value) {
        if(verificationObject instanceof Collection){
            assertTrue(((Collection) verificationObject).contains(value));
        }else if(verificationObject instanceof String){
            assertTrue(((String) verificationObject).contains(value.toString()));
        }
        return this;
    }

    Verify<T> doesNotContain(T value) {
        if(verificationObject instanceof Collection){
            assertFalse(((Collection) verificationObject).contains(value));
        }else if(verificationObject instanceof String){
            assertFalse(((String) verificationObject).contains(value.toString()));
        }
        return this;
    }

    Verify<T> hasSize(int value) {
        if(verificationObject instanceof Collection){
            assertEquals(((Collection) verificationObject).size(), value);
        }else if(verificationObject instanceof String){
            assertEquals(((String) verificationObject).length(), value);
        }
        return this;
    }

    Verify<T> isGreaterThan(T value) {
        if(verificationObject instanceof Comparable){
            assertTrue(((Comparable) verificationObject).compareTo(value) > 0);
        }
        return this;
    }

    Verify<T> hasStatusCode(int value) {
        if (verificationObject instanceof Response) {
            Response response = (Response) verificationObject;
            assertEquals(response.statusCode(), value);
        }
        return this;
    }
//    public Verify<T> isFalse() {
//        if (verificationObject != null && verificationObject.equals(Boolean.TRUE)) {
//            throw new AssertionError();
//        }
//        return this;
//    }
//
//    public Verify<T> isTrue() {
//        if (verificationObject == null || !verificationObject.equals(Boolean.TRUE)) {
//            throw new AssertionError();
//        }
//        return this;
//    }
}


