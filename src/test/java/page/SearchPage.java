package page;
import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends Base {

        @FindBy(id = "searchText")
        WebElement searchBox;

        @FindBy(xpath = "//i[@onclick='SearchByText()']")
        WebElement searchButton;

        @FindBy(xpath = "//img[@alt='topPostallPost']")
        WebElement topPostallPost;

        public SearchPage(WebDriver driver) {
                this.driver = driver;
                PageFactory.initElements(driver, this);
        }
        public void navigateUrl(String url){
                if(driver !=null){
                        driver.get(url);
                } else {
                        System.out.print("Webserver is not initialized");
                }

        }
       public void searchBox(String keyword){
                searchBox.sendKeys(keyword);
       }
       public void searchButton(){
                searchButton.click();
       }
       public  void topPostallPost(){
                topPostallPost.click();
       }



}

