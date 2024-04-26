/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

import java.time.OffsetDateTime;
import java.time.LocalDate;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.formance.formance_sdk.utils.TypedObject;
import com.formance.formance_sdk.utils.Utils.JsonShape;


@JsonDeserialize(using = V2Subject._Deserializer.class)
public class V2Subject {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private V2Subject(TypedObject value) {
        this.value = value;
    }

    public static V2Subject of(V2LedgerAccountSubject value) {
        Utils.checkNotNull(value, "value");
        return new V2Subject(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<V2LedgerAccountSubject>(){}));
    }

    public static V2Subject of(V2WalletSubject value) {
        Utils.checkNotNull(value, "value");
        return new V2Subject(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<V2WalletSubject>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code V2LedgerAccountSubject}</li>
     * <li>{@code V2WalletSubject}</li>
     * </ul>
     * 
     * <p>Use {@code instanceof} to determine what type is returned. For example:
     * 
     * <pre>
     * if (obj.value() instanceof String) {
     *     String answer = (String) obj.value();
     *     System.out.println("answer=" + answer);
     * }
     * </pre>
     * 
     * @return value of oneOf type
     **/ 
    public java.lang.Object value() {
        return value.value();
    }    
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V2Subject other = (V2Subject) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.formance.formance_sdk.utils.OneOfDeserializer<V2Subject> {

        public _Deserializer() {
            super(V2Subject.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<V2LedgerAccountSubject>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<V2WalletSubject>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2Subject.class,
                "value", value);
    }
 
}
