public class Calculator
{
    double num1;
    double num2;
    Calculator (double num1, double num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    double multiply()
    {
        return num1 * num2;
    }

    double divide()
    {
        return num1 / num2;
    }

    double add()
    {
        return num1 + num2;
    }

    double subtract()
    {
        return num1 - num2;
    }

    double mod()
    {
        return num1 % num2;
    }

    double power()
    {
        return Math.pow(num1, num2);
    }
}
