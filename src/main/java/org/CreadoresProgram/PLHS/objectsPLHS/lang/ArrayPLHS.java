package org.CreadoresProgram.PLHS.objectsPLHS.lang;
import org.CreadoresProgram.PLHS.interfazes.PLHSDefinition;
import java.util.ArrayList;
@PLHSDefinition(
        name = "ArrayPLHS",
        type = "Array"
        isStatic = true,
        isFinal = true
)
public class ArrayPLHS extends ObjectPLHS {
    private ArrayList<ObjectPLHS> value = new ArrayList<>();
    public ArrayPLHS(ArrayList<ObjectPLHS> value) {
        this.value = value;
    }
    public ArrayPLHS(ArrayPLHS value) {
        this.value = value.toJava();
    }
    public ArrayPLHS() {
    }
}