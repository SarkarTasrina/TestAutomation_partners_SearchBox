
package step_definitions;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.SearchPage;

public class SearchStep extends Base {

    SearchPage searchPage = new SearchPage(driver);

    @Given("I am in the homepage")
    public void iAmInTheHomepage() {
        searchPage.navigateUrl("https://partners.com.bd/");
    }

    @Then("write a product name user wants to be for search")
    public void writeaproductnameuserwantstobeforsearch() {
    }
    @And("Click on search btn")
    public void clickOnSearchBtn() {
    }
    @Then("user can see the searched product")
    public void usercanseethesearchedproduct() {
    }


    @And("see the details of the product")
    public void seeTheDetailsOfTheProduct() {
    }


}
