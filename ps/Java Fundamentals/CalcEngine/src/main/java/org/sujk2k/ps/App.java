package org.sujk2k.ps;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        MathEquation[] equations = new MathEquation[4];

        equations[0] = new MathEquation('a', 100, 50);
        equations[1] = new MathEquation('s', 100, 50);
        equations[2] = new MathEquation('m', 100, 50);
        equations[3] = new MathEquation('d', 100, 50);

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }

        System.out.println("Using method overloading");
        double leftDouble = 9.0d;
        double rightDouble = 4.0;

        MathEquation equationOverload = new MathEquation('d');
        equationOverload.execute(leftDouble, rightDouble);
        System.out.println(equationOverload.getResult());

        System.out.println("Using integers execute overload");
        int leftInt = 9;
        int rightInt = 4;

        MathEquation equationOverload2 = new MathEquation('d');
        equationOverload2.execute(leftInt, rightInt);
        System.out.println(equationOverload2.getResult());

        System.out.println("Using one double and one int execute overload");
        double leftDouble2 = 9;
        int rightInt2 = 4;

        MathEquation equationOverload3 = new MathEquation('d');
        equationOverload3.execute(leftDouble2, rightInt2);
        System.out.println(equationOverload3.getResult());
    }
}
