package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.TestBase;

import java.util.List;

public class BookTABPageFactory extends TestBase {

    By booktab = By.xpath("//li[@id='travelTab']");
    By flightoption = By.xpath("//li[@id='bookFlightTab']");
    By Fromaddress = By.xpath("//input[@id='bookFlightOriginInput']");
    By tooaddress = By.xpath("//input[@id='bookFlightDestinationInput']");
    By passengertab = By.xpath("//div[@id='passengerSelector']");
    By adultIncrementtab = By.xpath("//button[@aria-label='Substract one Adult']");
    By seniorCitizenTab = By.xpath("//button[@aria-label='Substract one Seniors']");
    By closebutton = By.xpath("//button[@class='atm-c-btn atm-c-btn--bare']");
    By cabin = By.id("cabinType");
    By findflight = By.xpath("//button[@aria-label='Find flights']");
    By depar = By.xpath("//input[@id='DepartDate']");
    By returndate1 = By.xpath("//input[@id='ReturnDate']");
    By chckbox = By.xpath("//span[text()='Book with miles']");


    public BookTABPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void booktabMethod() {

        clickOnElement(booktab);
    }

    public void flightMenuMethod() {

        clickOnElement(flightoption);
    }

    public void flighttypeRadioButton(String flighttype) throws InterruptedException {
        WebElement flighttp = driver.findElement(By.xpath("//input[@id='" + flighttype.toLowerCase() + "']"));
        clickOnElement(flighttp);
        Thread.sleep(3000);
    }

    public void fromAddressInBooktab(String fromaddress) throws InterruptedException {
        sendKeysUisngByElement(Fromaddress, fromaddress);
    }

    public void tooaddressInBookTab(String toaddress) throws InterruptedException {
        sendKeysusingByElementKEYS(tooaddress, toaddress);
    }

    public void traveletsTab() {
        clickOnElement(passengertab);
    }

    public void adultIncrementTab(String adulttravelers) {
        for (int i = 0; i < Integer.parseInt(adulttravelers); i++)
            clickOnElement(adultIncrementtab);
    }

    public void seniorTabIncrement(String seniortravelers) {
        for (int j = 0; j < Integer.parseInt(seniortravelers); j++)
            clickOnElement(seniorCitizenTab);
    }

    public void travelersTabCloseButton() {
        clickOnElement(closebutton);
    }

    public void EconomyButton(String economy) {
        clickOnElement(cabin);
        List<WebElement> text = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
        System.out.println(text.size());
        for (int i = 0; i < text.size(); i++) {
            String dropdown = text.get(i).getText();
            System.out.println(dropdown);
            if (dropdown.equals(economy)) {
                text.get(i).click();
            }
        }
    }

    public void startDate(String departdate) throws InterruptedException {
        clearTextForByElement(depar);
        sendKeysUisngByElement(depar, departdate);
    }

    public void endDate(String returndate) throws InterruptedException {
        clearTextForByElement(returndate1);
        sendKeysUisngByElement(returndate1, returndate);
    }

    public void findFlightButton() {
        clickOnElement(findflight);
    }

    public void BookWithMiles() {
        clickOnElement(chckbox);
    }


    //hotel tab page factory

    By hoteltab = By.xpath("//li[@id='bookHotelTab']");
    By goingto = By.id("bookHotelInput");
    By checkin = By.xpath("//input[@id='bookHotelCheckinDate']");
    By checkout = By.xpath("//input[@id='bookHotelCheckoutDate']");
    By no_ofrooms = By.id("roomsDropdown");
    By noofTravelersOption = By.xpath("//input[@id='bookHotelModel.passengers']");
    By adultincreemntbutton = By.id("Adults plusBtn");
    By childrenIncrementButton = By.id("Children plusBtn");
    By closeButton = By.xpath("//button[@id='passengersCloseBtn']");
    By bookWithMiles = By.xpath("//span[text()='Book with miles']");
    By Findfhotel = By.xpath("//span[text()='Find hotels']");


    public void hotelMenu() {
        clickOnElement(hoteltab);
    }

    public void goingToHotelMenu(String Destination) throws InterruptedException {
        sendKeysusingByElementKEYS(goingto, Destination);
    }

    public void checkinHotelMenu(String checkinDate) throws InterruptedException {
        clickOnElement(checkin);
        sendKeysUisngByElement(checkin, checkinDate);
    }

    public void checkoutHotelMenu(String checkoutDate) throws InterruptedException {
        clearTextForByElement(checkout);
        sendKeysUisngByElement(checkout, checkoutDate);
    }

    public void noOfRoomsInHotekMenu(String noOfRooms) {
        clickOnElement(no_ofrooms);
        List<WebElement> listofRooms = driver.findElements(By.xpath("//ul[@class='app-components-ListBox-ListBox__listBoxExpandable--38-ZN']//li"));
        System.out.println("nof of rooms are booked  :" + listofRooms.size());
        for (int i = 0; i < listofRooms.size(); i++) {
            String text = listofRooms.get(i).getText();
            System.out.println(text);
            if (text.equalsIgnoreCase(noOfRooms)) {
                listofRooms.get(i).click();
                break;
            }
        }
    }

    public void travelOptions() {
        clickOnElement(noofTravelersOption);
    }

    public void adultIncrement(String noofAdultTravellers) {
        for (int i = 0; i < Integer.parseInt(noofAdultTravellers); i++) {
            clickOnElement(adultincreemntbutton);
        }
        System.out.println("no of adult travelers selecteded as  :" + noofAdultTravellers);
    }

    public void childTravelersIncTab(String childerns) {
        clickOnElement(childrenIncrementButton);
        for (int i = 0; i < Integer.parseInt(childerns); i++) {
            clickOnElement(childrenIncrementButton);
        }
        System.out.println("childerens button are clicked");
    }

    public void travelCloseButton() {
        clickOnElement(closeButton);
    }

    public void bookWithMilesTab() {
        clickOnElement(bookWithMiles);
    }

    public void findFlightsButton() {
        clickOnElement(Findfhotel);
    }

    //car tab methods

    By cartab = By.xpath("//li[@id='bookCarTab']");
    By picupplace = By.xpath("//input[@id='bookCarPickupInput']");
    By radioButtonForReturnLocationChckbx = By.xpath("//span[text()='Return car to same location']");
    By dropplace = By.xpath("//input[@id='bookCarDropoffInput']");
    By pickupdate = By.xpath("//input[@id='bookCarPickupDate']");
    By dropOfdate = By.xpath("//input[@id='bookCarDropoffDate']");
    By cabdrivercheckbox = By.xpath("//input[@id='hideAgeBox']");
    By enterdriverage = By.xpath("//input[@id='driversAge']");
    By pickTimeBox = By.xpath("//button[@id='pickupTime']");
    By dropTimeBox = By.xpath("//*[@id='dropoffTime']");
    By chkboxforbookwtihmiles = By.xpath("//span[text()='Book with miles']");
    By findcarbutton = By.xpath("//button[@aria-label='Find cars button.']");

    public void carTabButton() {
        clickOnElement(cartab);
    }

    public void pickUpPlace(String pickUpLocation) throws InterruptedException {
        sendKeysUisngByElement(picupplace, pickUpLocation);
    }

    public void radioButtonForReturnLocationChckbox() {
        clickOnElement(radioButtonForReturnLocationChckbx);
    }

    public void dropPlaceLocation(String dropOffLocation) throws InterruptedException {
        sendKeysUisngByElement(dropplace, dropOffLocation);
    }

    public void pickUp_Date(String pickUpDate) throws InterruptedException {
        clickOnElement(pickupdate);
        sendKeysUisngByElement(pickupdate, pickUpDate);
    }

    public void dropOF_Date(String dropUpDate) throws InterruptedException {
        clickOnElement(dropOfdate);
        sendKeysUisngByElement(dropOfdate, dropUpDate);
    }

    public void driverCheckBox(String ageofDriver) throws InterruptedException {
        clickOnElement(cabdrivercheckbox);
        sendKeysUisngByElement(enterdriverage, ageofDriver);
    }

    public void pickUpTimeBox(String pickuptime) throws InterruptedException {
        clickOnElement(pickTimeBox);
        List<WebElement> pTimes = driver.findElements(By.xpath("(//ul[@class='app-components-ListBox-ListBox__listBoxExpandable--38-ZN'])[1]/li"));
        System.out.println(pTimes.size());
        for (int i = 0; i < pTimes.size(); i++) {
            if (pTimes.get(i).getAttribute("aria-label").contains(pickuptime)) {
                Thread.sleep(3000);
                Actions action = new Actions(driver);
                clickOnElement(pickTimeBox);
                WebElement gTime = driver.findElement(By.xpath("//li[@id='pickupTime_item-" + i + "']"));
                System.out.println(gTime.getAttribute("aria-label"));
                Thread.sleep(2000);
                action.moveToElement(gTime).click(gTime).build().perform();
            }
        }
    }

    public void dropOff_Time(String dropOffTime) throws InterruptedException {
        clickOnElement(dropTimeBox);
        List<WebElement> droptime = driver.findElements(By.xpath("(//ul[@class='app-components-ListBox-ListBox__listBoxExpandable--38-ZN'])[2]//li"));
        Thread.sleep(3000);
        System.out.println(droptime.size());
        for (int i = 0; i < droptime.size(); i++) {
            String text = droptime.get(i).getText();
            //  System.out.println(text);
            if (text.equals(dropOffTime)) {
                droptime.get(i).click();
                break;
            }
        }
    }

    public void chkBoxForBookWithMiles() {
        clickOnElement(chkboxforbookwtihmiles);

    }

    public void findCarButton() {
        clickOnElement(findcarbutton);
    }

    //package tab

    By packagesbutton = By.id("bookPackageTab");
    By fromaddress = By.xpath("//div[@class='app-components-AutoComplete-Legacy-styles__autoComplete--yHULS app-components-BookVacationForm-bookVacationForm__originDestinationInput--2TBtQ']//input[@id='vacationOriginInput']");
    By toaddress = By.id("vacationDestinationInput");
    By departdate = By.xpath("//input[@id='DepartDate']");
    By returndate = By.xpath("//input[@id='ReturnDate']");
    By travelerstab = By.id("containerId");
    By adultincrementtab = By.xpath("//button[@aria-label='Substract one Adult']");
    By seniorincrement = By.xpath("//button[@aria-label='Substract one Seniors']");
   By close_Button=By.xpath("//button[@class='atm-c-btn atm-c-btn--bare']");
   By noofrooms =By.id("selectedRooms");
   By findTrips=By.xpath("//span[text()='Find trips']");
    public void packagesButton() {
        clickOnElement(packagesbutton);
    }

    public void flightAndHotelButton(String radioButton) {
        WebElement flightandhotelselectRadioButton = driver.findElement(By.xpath("//li[@type='radio']//label[text()='" + radioButton + "']"));
        clickOnElement(flightandhotelselectRadioButton);
    }

    public void fromAddress(String from_address) throws InterruptedException {
        sendKeysusingByElementKEYS(fromaddress, from_address);
    }

    public void toAddress(String to_address) throws InterruptedException {
        sendKeysusingByElementKEYS(toaddress, to_address);
    }

    public void departDate(String departureDate) throws InterruptedException {
        clickOnElement(departdate);
        sendKeysUisngByElement(departdate, departureDate);
    }

    public void return_Date(String returnDate) throws InterruptedException {
        clickOnElement(returndate);
        sendKeysUisngByElement(returndate, returnDate);
    }

    public void travelTab(String adult, String senior) {
        clickOnElement(travelerstab);
        for (int i = 0; i < Integer.parseInt(adult); i++) {
            clickOnElement(adultincrementtab);
        }
        System.out.println("no of adult travelers selecteded as  :" + adult);
        for (int i = 0; i < Integer.parseInt(senior); i++) {
            clickOnElement(seniorincrement);
        }
        System.out.println("no of senior travelers selecteded as  :" + seniorincrement);
      clickOnElement(close_Button);
    }
    public void NoofRoomsSelected(String rooms) throws InterruptedException {
        clickOnElement(noofrooms);
        List<WebElement>  listofrroms = driver.findElements(By.xpath("//ul[@class='app-components-ListBox-ListBox__listBoxExpandable--38-ZN']//li"));
        System.out.println(listofrroms.size());
        for (int i=0;i<listofrroms.size();i++){
            String text =listofrroms.get(i).getText();
            System.out.println(text);
            if(text.equalsIgnoreCase(rooms)){
                listofrroms.get(i).click();
            }
        }
        Thread.sleep(3000);
        System.out.println("selected rooms are : " + rooms);

    }
    public void findTripsButton(){
        clickOnElement(findTrips);
    }
}