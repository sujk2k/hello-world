package org.sujk2k.ps;

public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    public MathEquation(){

    }

    public MathEquation(char opCode){
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal){
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public double getLeftVal() { return leftVal; }
    public void setLeftVal(double leftVal) { this.leftVal = leftVal; }
    public double getRightVal() { return rightVal; }
    public void setRightVal(double rightVal) { this.rightVal = rightVal; }
    public char getOpCode() { return this.opCode; }
    public void setOpCode(char opCode) { this.opCode = opCode; }
    public double getResult() { return this.result; }

    // Overload 1
    // In case one int and one double is passed, system will pickup below overload since it matches the most
    public void execute(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();
    }

    // Overload 2
    public void execute(int leftInt, int rightInt){
        this.leftVal = leftInt;
        this.rightVal = rightInt;

        execute();

        // to truncate double result to integer
        result = (int) result;
    }

    public void execute(){
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
        
            case 's':
                result = leftVal - rightVal;
                break;

            case 'm':
                result = leftVal * rightVal;
                break;    
            
            case 'd':
                result = rightVal != 0.0d ? leftVal/rightVal : 0.0d;
                break;

            default:
                break;
        }
    }
}