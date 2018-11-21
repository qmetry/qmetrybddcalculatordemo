package stepdefs;

import calculatorDemo.calculatorDemo.Calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CalculatorStepsTest {

	private Calculator calculator;
	
    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Given("^I have a calculator$")
    public void i_have_a_calculator() throws Throwable {
    	assertNotNull(calculator);
    }

	@When("^I add (-?\\d+) and (-?\\d+)$")
    public void i_add_and(int arg1, int arg2) throws Throwable {
        calculator.add(arg1, arg2);
    }
	
	@When("^I Substract (-?\\d+) from (-?\\d+)$")
    public void i_substract_and(int arg1, int arg2) throws Throwable {
        calculator.substract(arg1, arg2);
    }
	
	@When("^I Multiply (-?\\d+) with (-?\\d+)$")
    public void i_multiply_and(int arg1, int arg2) throws Throwable {
        calculator.multiply(arg1, arg2);
    }
	
	@When("^I Divide (-?\\d+) by (-?\\d+)$")
	public void i_Divide_by(int arg1, int arg2) throws Exception {
        calculator.division(arg1, arg2);
    }
	
	@Then("^the result should be (-?\\d+)$")
    public void the_result_should_be(int result) throws Throwable {
        assertEquals(result, calculator.getResult());
    }
}
