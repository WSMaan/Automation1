package Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Login {
    @Given("^sample 1$")
    public void sample_1() throws Throwable {
        System.out.println("sample 1");
        System.out.println("New comment");}
    @When("^sample 2$")
    public void sample_2() throws Throwable {
        System.out.println("sample 2");}
    @Then("^sample 3$")
    public void sample_3() throws Throwable {
        System.out.println("sample 3");
    }
}
