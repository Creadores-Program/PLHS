package org.CreadoresProgram.PLHS.objectsPLHS.lang;
import org.CreadoresProgram.PLHS.interfazes.PLHSDefinition;
@PLHSDefinition(
    name = "boolean",
    type = "Boolean",
    isStatic = true,
    isFinal = true
)
public class BooleanPLHS extends PLHSObject{
    private boolean value;
    public BooleanPLHS(boolean value) {
        this.value = value;
    }
    public BooleanPLHS(){
    }
    public BooleanPLHS(String value) {
        this.value = Boolean.parseBoolean(value);
    }
    public BooleanPLHS(float value) {
        this.value = value != 0;
    }
    public BooleanPLHS(ObjectPLHS value){
        if(value instanceof BooleanPLHS){
            this.value = ((BooleanPLHS) value).toJava();
        }else if(value instanceof StringPLHS){
            this.value = Boolean.parseBoolean(((StringPLHS) value).toJava());
        }else if(value instanceof NumberPLHS){
            this.value = ((NumberPLHS) value).toJava() != 0;
        }else if(value instanceof NullPLHS){
            this.value = false;
        }else if(value instanceof ArrayPLHS){
            this.value = ((ArrayPLHS) value).toJava().size() != 0;
        }else if(value instanceof PropertiesPLHS){
            this.value = ((PropertiesPLHS) value).toJava().size() != 0;
        }
    }
    @Override
    public Object toJava() {
        return value;
    }
}