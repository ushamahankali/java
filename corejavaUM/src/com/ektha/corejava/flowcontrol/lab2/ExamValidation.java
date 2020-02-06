package com.ektha.corejava.flowcontrol.lab2;

/*Problem Description: Validation of the exam marks is to be done. The range of
exam marks is between 65 and 100 (both inclusive).

Write a method called hasPassed(int marks) that returns a boolean.

i.  If the qualifyingExamMarks is greater than or equal to 65 and less than or
equal to 100, return true
ii.  If not, return false

Add the following statements to the main method

a. Invoke the hasPassed () method
b. If it returns true,  Display “Passed Successfully!”
	    If not, display “Failed! The range of the qualifying exam marks
    is between 65 and 100”.

*/

public class ExamValidation {

	public boolean hasPassed(int marks) {

		if (marks >= 65 && marks <= 100) {
			return true;
		}
		return false;

	}

}
