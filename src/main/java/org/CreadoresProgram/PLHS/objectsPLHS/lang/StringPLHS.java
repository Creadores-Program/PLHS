package org.CreadoresProgram.PLHS.objectsPLHS.lang;
import org.CreadoresProgram.PLHS.interfazes.PLHSDefinition;
@PLHSDefinition(
    name = "String",
    type = "String",
    isStatic = true,
    isFinal = true
)
public class StringPLHS extends ObjectPLHS {
    private String value;
    public StringPLHS(ObjectPLHS value) {
        this.value = String.valueOf(value.toJava());
    }
    public StringPLHS(String value) {
        this.value = value;
    }
    public StringPLHS() {
        this.value = "";
    }
    @Override
    public Object toJava() {
        return value;
    }
}