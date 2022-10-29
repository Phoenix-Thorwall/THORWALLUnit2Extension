import java.util.Scanner;
public class CalculatorRunner
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an expression with *, /, +, -, % or ^: ");
        String expression = scan.nextLine();
        int expressionLen = expression.length();
        double firstNum = Double.parseDouble(expression.substring(0, expression.indexOf(" ")));
        double secNum = Double.parseDouble(expression.substring(expression.indexOf(" ") + 2, expressionLen));

        Calculator calc = new Calculator(firstNum, secNum);

        if (expression.substring(expression.indexOf(" ") + 1, expression.indexOf(" ") + 2).equals("*"))
        {
            System.out.println(calc.multiply());
        }
        if (expression.substring(expression.indexOf(" ") + 1, expression.indexOf(" ") + 2).equals("/"))
        {
            System.out.println(calc.divide());
        }
        if (expression.substring(expression.indexOf(" ") + 1, expression.indexOf(" ") + 2).equals("+"))
        {
            System.out.println(calc.add());
        }
        if (expression.substring(expression.indexOf(" ") + 1, expression.indexOf(" ") + 2).equals("-"))
        {
            System.out.println(calc.subtract());
        }
        if (expression.substring(expression.indexOf(" ") + 1, expression.indexOf(" ") + 2).equals("%"))
        {
            System.out.println(calc.mod());
        }
        if (expression.substring(expression.indexOf(" ") + 1, expression.indexOf(" ") + 2).equals("^"))
        {
            System.out.println(calc.power());
        }
        
    }
}
