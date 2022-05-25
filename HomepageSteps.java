package stepDefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageFactory.BookTABPageFactory;
import java.io.IOException;
import java.util.List;


public class HomepageSteps extends TestBase {

    BookTABPageFactory bookpage = new BookTABPageFactory(driver);

    @Given("user open Browser")
    public void user_open_browser() throws IOException {
        openBrowser();
    }
    @When("user Enter URL")
    public void user_enter_url() throws IOException {
        navigateToUrl();
    }
   @When("user click on booktab")
    public void user_click_on_booktab() {
        bookpage.booktabMethod();
        }

    @When("user select flight option")
    public void user_select_flight_option() {
        bookpage.flightMenuMethod();
    }
    @When("user selects flight type as {string}")
    public void user_selects_flight_type_as(String flighttype) throws InterruptedException {
        bookpage.flighttypeRadioButton(flighttype);
    }
    @When("user selects from address as {string}")
    public void user_selects_from_address_as(String fromaddress) throws InterruptedException {
        bookpage.fromAddressInBooktab(fromaddress);
        System.out.println("frome address selected as" + fromaddress);
    }
    @When("user selects to address as {string}")
    public void user_selects_to_address_as(String toaddress) throws InterruptedException {
        bookpage.tooaddressInBookTab(toaddress);
        System.out.println("TO address select as" + toaddress);
    }
    @When("user select booking date as {string}")
    public void user_select_booking_date_as(String departdate) throws InterruptedException {
        bookpage.startDate(departdate);
        System.out.println("startdate entered as :"+departdate);
    }
    @And("user selects adult travellers as {string} and senior travelrs as {string}")
    public void userSelectsAdultTravellersAsAndSeniorTravelrsAs(String adulttravelers, String seniortravelers) throws InterruptedException {
        bookpage.traveletsTab();
        bookpage.adultIncrementTab(adulttravelers);
        System.out.println("adult travelers are :"+adulttravelers);
        bookpage.seniorTabIncrement(seniortravelers);
        System.out.println("senior citizen tab selected "+seniortravelers);
        bookpage.travelersTabCloseButton();
       System.out.println("clicked on close button");
    }
    @And("select Economy  {string}")
    public void selectEconomy(String economy) throws InterruptedException {
        bookpage.EconomyButton(economy);
    }
    @When("user click on find flights button")
    public void user_click_on_find_flights_button() {
        bookpage.findFlightButton();
       System.out.println("find flights button clicked");
    }
    @Then("available flights ar displayed")
    public void available_flights_ar_displayed() {
        System.out.println("available  flights are displayed");
    }
    @And("user selects book with miles  as {string}")
    public void userSelectsBookWithMilesAs(String checkbox) {
        bookpage.BookWithMiles();
        System.out.println("clicked on checkbo" + checkbox);
    }
    //hotel tab steps
    @When("user click on Hotel tab")
    public void user_click_on_hotel_tab() {
        bookpage.hotelMenu();
        System.out.println("clicked on hotel tab");
    }
    @When("use selects destination {string}")
    public void use_selects_destination(String Destination) throws InterruptedException {
        bookpage.goingToHotelMenu(Destination);
        System.out.println("Hyderabad is entered" + Destination);
    }
    @And("user selects check in date as {string}")
    public void userSelectsCheckInDateAs(String checkinDate) throws InterruptedException {
      bookpage.checkinHotelMenu(checkinDate);
      System.out.println("check in data is entered "+checkinDate);
    }
    @And("user selects check out date as {string}")
    public void userSelectsCheckOutDateAs(String checkoutDate) throws InterruptedException {
        bookpage.checkoutHotelMenu(checkoutDate);
        System.out.println("checkout date entered"+ checkoutDate);
    }
    @And("user select nofof rooms as {string}")
    public void userSelectNofofRoomsAs(String noOfRooms) {
       bookpage.noOfRoomsInHotekMenu(noOfRooms);

    }
    @And("user selects nof of adult travelers are {string}")
    public void userSelectsNofOfAdultTravelersAre(String noofAdultTravellers) {
        bookpage.travelOptions();
        bookpage.adultIncrement(noofAdultTravellers);
    }
    @And("user selects noof child travelers are {string}")
    public void userSelectsNoofChildTravelersAre(String childerns) {
        bookpage.childTravelersIncTab(childerns);
        bookpage.travelCloseButton();
    }
    @And("user click on book with miles")
    public void userClickOnBookWithMiles() {
        bookpage.bookWithMilesTab();
    }
    @When("click on Find Hotel button")
    public void click_on_find_hotel_button() {
        bookpage.findFlightsButton();
    }

    @Then("Available hotels will be displayed")
    public void availableHotelsWillBeDisplayed() {
        System.out.println("available hotels will be displayed");
    }

    //car tab steps

    @When("user  click on Car tab")
    public void user_click_on_car_tab() {
        bookpage.carTabButton();
        System.out.println("car tab is selected");
    }

    @When("user selects pickup location {string}")
    public void user_selects_pickup_location(String pickUpLocation) throws InterruptedException {
        bookpage.pickUpPlace(pickUpLocation);
        System.out.println("pickup date selected as :" + pickUpLocation);
    }
    @When("user selects dropoff location {string}")
    public void user_selects_dropoff_location(String dropOffLocation) throws InterruptedException {
        bookpage.radioButtonForReturnLocationChckbox();
        System.out.println("return to sameplace checkbox is deselected");
        bookpage.dropPlaceLocation(dropOffLocation);
        System.out.println("drop location selected as :" + dropOffLocation);
    }
    @And("user selects pickup and dropup dates{string} and {string}")
    public void userSelectsPickupAndDropupDatesAnd(String pickUpDate, String dropUpDate) throws InterruptedException {
        bookpage.pickUp_Date(pickUpDate);
        System.out.println(" selected pickup  as : "+pickUpDate);
        bookpage.dropOF_Date(dropUpDate);
        System.out.println(" selected pickup  as : "+dropUpDate);
    }
    @When("user selects age of the cab driver {string}")
    public void user_selects_age_of_the_cab_driver(String ageofDriver) throws InterruptedException {
        bookpage.driverCheckBox(ageofDriver);
        System.out.println("driver age entered as: "+ageofDriver);
    }
    @When("user selects pickup time {string}")
    public void user_selects_pickup_time(String pickuptime) throws InterruptedException {
        bookpage.pickUpTimeBox(pickuptime);
       Thread.sleep(3000);
        System.out.println("================================================================");
    }
    @And("user selects dropoff time {string}")
    public void userSelectsDropoffTime(String dropOffTime) throws InterruptedException {
        bookpage.dropOff_Time(dropOffTime);
        System.out.println("Drop off time selected as: "+ dropOffTime);

    }
    @When("selects checkbox as book with miles")
    public void selects_checkbox_as_book_with_miles() throws InterruptedException {
        bookpage.chkBoxForBookWithMiles();
        System.out.println("check box for book with miles clicked");
    }

    @When("click on find car")
    public void click_on_find_car() {
        bookpage.findCarButton();
    }

    @Then("available cars will be displayed")
    public void available_cars_will_be_displayed() {
        System.out.println("availabel cars are displayed");
    }

    //book packages

    @When("user clik on Packages")
    public void user_clik_on_packages() {

        bookpage.packagesButton();
        System.out.println("package button clicked");
    }

    @And("user click on flight and hotel button {string}")
    public void userClickOnFlightAndHotelButton(String radioButton) throws InterruptedException {

        bookpage.flightAndHotelButton(radioButton);
        System.out.println("flight and hotel button selectd");
    }

    @When("user enter from address as {string}")
    public void user_enter_from_address_as(String from_address) throws InterruptedException {

        bookpage.fromAddress(from_address);
         System.out.println("from address selected as" + from_address);
    }

    @When("user enter to address as {string}")
    public void user_enter_to_address_as(String to_address) throws InterruptedException {

        bookpage.toAddress(to_address);
        System.out.println("to address selected as" + to_address);
    }

    @And("user selects departure date {string}")
    public void userSelectsDepartureDate(String departureDate) throws InterruptedException {

        bookpage.departDate(departureDate);
        System.out.println("departure Date is : "+departureDate);
    }

    @And("user selects return date  {string}")
    public void userSelectsReturnDate(String returnDate) throws InterruptedException {

        bookpage.return_Date(returnDate);
        System.out.println("return date selected as : "+returnDate);
    }
    @And("user selects noof travelers as {string} and {string}")
    public void userSelectsNoofTravelersAsAnd(String adult, String senior) {
        bookpage.travelTab(adult,senior);

    }
    @When("user selects noof rooms {string}")
    public void user_selects_noof_rooms(String rooms) throws InterruptedException {
        bookpage.NoofRoomsSelected(rooms);
     }
    @When("user click on findtrip button")
    public void user_click_on_findtrip_button() {

        bookpage.findTripsButton();
        System.out.println("user click on findtrip button");
    }

    //cruise steps

    @When("user click on cruice option")
    public void user_click_on_cruice_option() {
       WebElement cruisetab = driver.findElement(By.xpath("//a[@id='bookCruiseTab']"));
       cruisetab.click();
       System.out.println("crusietab selected");
    }

    @When("In cruise searches user selects desination {string}")
    public void in_cruise_searches_user_selects_desination(String string) {
       WebElement destinationtab = driver.findElement(By.id("destination"));
       destinationtab.click();
       System.out.println("destination tab selected");
    }

    @When("user selects cruise length as {string}")
    public void user_selects_cruise_length_as(String string) {
       System.out.println("cruise lenth ");
    }

    @When("user selects departure date as {string}")
    public void user_selects_departure_date_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user selects cruise line as {string}")
    public void user_selects_cruise_line_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user selects cruiseship as {string}")
    public void user_selects_cruiseship_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user selects departureport as {string}")
    public void user_selects_departureport_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user click on Additional discounts")
    public void user_click_on_additional_discounts() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user Enter u.s. zip code {string}")
    public void user_enter_u_s_zip_code(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user click on senior citizen checkbox")
    public void user_click_on_senior_citizen_checkbox() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("click on search box")
    public void click_on_search_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("available criuses are displayed")
    public void available_criuses_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @And("user select booking date as {string} and {string}")
    public void userSelectBookingDateAsAnd(String departdate, String returndate) throws InterruptedException {
          bookpage.startDate(departdate);
          bookpage.endDate(returndate);


    }



    }

