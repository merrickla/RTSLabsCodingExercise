package driverfunctions;

public class GoogleFunctions {

    private GoogleFunctions(){}

    public static void google(){
        Functions.navigate("http://www.google.com");
    }

    public static void searchFor(String text){
        Functions.sendKeys(".//input[@title = 'Search']", text);
        Functions.hitEnter(".//input[@title = 'Search']");
    }

    public static void clickOnFirstLink(){
        Functions.click(".//h3");
        Functions.waitForPageToLoad();
    }

}
