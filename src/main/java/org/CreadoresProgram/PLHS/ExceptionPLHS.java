package org.CreadoresProgram.PLHS;
public class ExceptionPLHS extends Exception {
    public ExceptionPLHS(String message) {
        super(message);
    }
    public ExceptionPLHS(){
        super("Error Unknown");
    }
}