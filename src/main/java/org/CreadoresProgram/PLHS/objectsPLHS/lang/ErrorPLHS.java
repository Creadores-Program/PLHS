package org.CreadoresProgram.PLHS.objectsPLHS.lang;
import org.CreadoresProgram.PLHS.ExceptionPLHS;
import org.CreadoresProgram.PLHS.interfazes.PLHSDefinition;
@PLHSDefinition(
    name = "Error",
    type = "Error",
    isStatic = true
)
public class ErrorPLHS extends ObjectPLHS{
    private ExceptionPLHS value;
    public ErrorPLHS(){
        this.value = new ExceptionPLHS("Error Unknown");
    }
    public ErrorPLHS(ObjectPLHS message){
        this.value = new ExceptionPLHS(String.valueOf(message.toJava()));
    }
    public ErrorPLHS(String message){
        this.value = new ExceptionPLHS(message);
    }
    @PLHSDefinition(
        name = "getMessage",
        type = "Function"
    )
    public ObjectPLHS getMessage(){
        return new StringPLHS(value.getMessage());
    }
    @Override
    public Object toJava(){
        return value;
    }
}