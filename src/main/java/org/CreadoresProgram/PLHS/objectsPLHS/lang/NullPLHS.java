package org.CreadoresProgram.PLHS.objectsPLHS.lang;
import org.CreadoresProgram.PLHS.interfazes.PLHSDefinition;
@PLHSDefinition(
    name = "null",
    type = "Null",
    isStatic = true,
    isFinal = true
)
public class NullPLHS extends PLHSObject{
    private static final NullPLHS instance = new NullPLHS();
    public NullPLHS() {
        super();
    }
    public static NullPLHS getInstance() {
        return NullPLHS.instance;
    }
    @Override
    public Object toJava() {
        return null;
    }
}