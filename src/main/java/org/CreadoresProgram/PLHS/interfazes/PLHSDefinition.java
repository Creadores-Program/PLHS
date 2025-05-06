package org.CreadoresProgram.PLHS.interfazes;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.CreadoresProgram.PLHS.objectsPLHS.lang.ObjectPLHS;
import org.CreadoresProgram.PLHS.objectsPLHS.lang.NullPLHS;
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
public @interface PLHSDefinition {
    String type();// Class(body), Function(div), Import(import), Tag(tag), Annotation(interface anottation), Void(void), Null(null), String(string), Number(number), Boolean(boolean), Array(array), Error(error), Properties(props, jsons, hashmap)
    String name();
    boolean isStatic() default false;
    boolean isPrivate() default false;
    boolean isFinal() default false;
    boolean isBiStatic() default false;
}