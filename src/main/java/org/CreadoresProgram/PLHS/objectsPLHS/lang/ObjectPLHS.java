package org.CreadoresProgram.PLHS.objectsPLHS.lang;
import org.CreadoresProgram.PLHS.interfazes.PLHSDefinition;
@PLHSDefinition(
    name = "Object",
    type = "Tag",
    isStatic = true,
    isFinal = true
)
public class ObjectPLHS {
    @PLHSDefinition(
        name = "equals",
        type = "function",
        isBiStatic = true,
        isFinal = true
    )
    public static boolean equals(ObjectPLHS obj1, ObjectPLHS obj2) {
        return obj1.toJava() == obj2.toJava();
    }
    @PLHSDefinition(
        name = "equals",
        type = "function",
        isFinal = true
    )
    public boolean equals(ObjectPLHS obj) {
        return this.toJava() == obj.toJava();
    }
    public Object toJava() {
        return this;
    }
}