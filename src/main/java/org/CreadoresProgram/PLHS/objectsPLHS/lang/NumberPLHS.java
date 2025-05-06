package org.CreadoresProgram.PLHS.objectsPLHS.lang;
import org.CreadoresProgram.PLHS.interfazes.PLHSDefinition;
@PLHSDefinition(
        name = "Number",
        type = "Number",
        isStatic = true,
        isFinal = true
)
public class NumberPLHS extends ObjectPLHS {
    private long value;
    public NumberPLHS(long value) {
        this.value = value;
    }
    public NumberPLHS(){
        this.value = 0;
    }
    public NumberPLHS(String value) {
        this.value = Long.parseLong(value);
    }
    public NumberPLHS(ObjectPLHS value) {
        this.value = Long.parseLong(value.toJava());
    }
    @Override
    public Object toJava() {
        return this.value;
    }
}