package org.CreadoresProgram.PLHS.objectsPLHS.lang;
import org.CreadoresProgram.PLHS.interfazes.PLHSDefinition;
import java.math.BigDecimal;
import java.math.BigInteger;
@PLHSDefinition(
        name = "BigNum",
        type = "Number",
        isStatic = true,
        isFinal = true
)
public class BigNumPLHS extends ObjectPLHS {
    private BigDecimal value;
    public BigNumPLHS(BigInteger value) {
        this.value = new BigDecimal(value);
    }
    public BigNumPLHS(BigDecimal value) {
        this.value = value;
    }
    public BigNumPLHS(){
        this.value = BigDecimal.ZERO;
    }
    public BigNumPLHS(String value) {
        this.value = new BigDecimal(value);
    }
    public BigNumPLHS(ObjectPLHS value) {
        this.value = new BigDecimal(value.toJava());
    }
    @Override
    public Object toJava() {
        return this.value;
    }
}