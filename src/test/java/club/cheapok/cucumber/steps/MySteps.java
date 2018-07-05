package club.cheapok.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class MySteps {

    private List<Integer> numbers;

    @Given("I have numbers: (.*)")
    public void iHaveNumbers(final List<Integer> numbers) {
        this.numbers = numbers;
    }

    @When("there are (\\d+) numbers")
    public void thereAreNumbers(final int count) {
        assertEquals(count, numbers.size());
    }

    @Then("their sum is equal to (\\d+)")
    public void theirSumIsEqualTo(final int sum) {
        assertEquals(sum, numbers.stream().mapToInt(i -> i).sum());
    }

}
