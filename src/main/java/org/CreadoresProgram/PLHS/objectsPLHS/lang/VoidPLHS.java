package org.CreadoresProgram.PLHS.objectsPLHS.lang;
import org.CreadoresProgram.PLHS.interfazes.PLHSDefinition;
@PLHSDefinition(
    name = "void",
    type = "Void",
    isStatic = true,
    isFinal = true
)
public class VoidPLHS extends PLHSObject{
    private static final VoidPLHS instance = new VoidPLHS();
    public NullPLHS() {
        super();
    }
    public static VoidPLHS getInstance() {
        return VoidPLHS.instance;
    }
    @Override
    public Object toJava() {
        return null;
    }
}