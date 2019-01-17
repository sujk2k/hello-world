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
    }
}
