[![Work in Repl.it](https://classroom.github.com/assets/work-in-replit-14baed9a392b3a25080506f3b7b6d57f295ec2978f6f33ec97e36a161684cbe9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=4099143&assignment_repo_type=AssignmentRepo)
# CalculatorTemplate

MVC Architecture Assignment:

First: Read through the code and comment it. If there is anything you don't understand, research it and then write a comment describe the element.

Second: Create a Pythagorean theorem button (Label = Pytha) in the View (CalculatorApp) 

-> Create a getter for the Pytha button in the View

-> Create a Pythagorean theorem method in the TriangleCalculator class (return type: double, params: double a, double b)

-> Declare and initialize an instance of the TriangleCalculator class as an attribute of the CalcController Class

-> Call the Pytha Button getter in the controller in an action listener in the initController method in the CalcController Class

-> When the Pytha button is pressed the operation variable in CalcController should be set to "Pytha"

-> Add an if statement to equalOperation() method in CalcController that calls the Pythagorean Theorem method from your TriangleCalculator object and 

--> parse double values from num1 and num2 (String) Attributes from CalcController class and

--> pass the two double values to your Pythagorean Theorem method from your TriangleCalculator object which should return a double

--> print result in the calcArea using .getClacArea().setText(result);

Third: repeat this process to provide Circumference and area of a circle calculations 
