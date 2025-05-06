package org.CreadoresProgram.PLHS.objectsPLHS.lang;
import org.CreadoresProgram.PLHS.interfazes.PLHSDefinition;
import java.util.HashMap;
@PLHSDefinition(
        name = "Properties",
        type = "Properties",
        isStatic = true,
        isFinal = true
)
public class PropertiesPLHS extends ObjectPLHS {
    private HashMap<String, ObjectPLHS> value = new HashMap<>();
    public PropertiesPLHS(HashMap<String, ObjectPLHS> value) {
        this.value = value;
    }
    public PropertiesPLHS() {
    }
    @Override
    public Object toJava() {
        return value;
    }
}