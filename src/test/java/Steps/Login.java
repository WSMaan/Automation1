package Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Login {
    @Given("^sample 1$")
    public void sample_1() {
       
        System.out.println("GTI REBASE COMMENT");
    System.out.println("pipeline build");
    }       
 
    @When("^sample 2$")
    public void sample_2()  {
        System.out.println("sample 2");}
    @Then("^sample 3$")
    public void sample_3() {
        System.out.println1("sample 3");
    }
}
