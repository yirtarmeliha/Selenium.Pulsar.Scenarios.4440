package Scenarios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Sales Scenario")
public class SalesScenarios__11 extends OpenPage {

    @DisplayName("Scenario 11")
    @Test
    void ScenarioEleven() {

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.singOnOff().click();
        for (WebElement webElement : Arrays.asList(Elements.threePopUp(), Elements.enterPopUp())) {
            webElement.click();
        }

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        ElementsJS.cigaretteOrTobacco_MainMonitor();

        assertEquals("block", Elements.ConfirmAgePopUp().getCssValue("display"),"The yes/no screen to confirm age did not pop up.\n");
        Elements.cigaretteOrTobaccoYes().click();
        assertEquals("none", Elements.ConfirmAgePopUp().getCssValue("display"),"The yes/no screen to confirm age did not close.");

        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the price of the product.");
        Elements.threePopUp().click();
        Elements.twoPopUp().click();
        Elements.ninePopUp().click();
        assertEquals("329", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.backPopUp().click();
        Elements.fivePopUp().click();
        assertEquals("325", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.");


                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the price of the product is not closed.");

        ElementsJS.e_MainMonitor();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        assertEquals("2", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£3.26", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");


                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.functions().click();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.eightScreen().click();
        Elements.oneScreen().click();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.discountAmount().click();

                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        assertEquals("2", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£0.81", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£2.45", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");

                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.productScreenThree().click();

                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.cancelDiscount().click();

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        assertEquals("2", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£3.26", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");

        Elements.cash5Screen().click();

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.Cscreen().click();

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }



        Elements.functions().click();

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


        Elements.singOnOff().click();
        for (WebElement webElement : Arrays.asList(Elements.twoPopUp(), Elements.enterPopUp())) {
            webElement.click();
        }

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        ElementsJS.q_MainMonitor();
        assertEquals("block", Elements.ConfirmAgePopUp().getCssValue("display"),"The yes/no screen to confirm age did not pop up.\n");
        Elements.cigaretteOrTobaccoYes().click();
        assertEquals("none", Elements.ConfirmAgePopUp().getCssValue("display"),"The yes/no screen to confirm age did not close.");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


        ElementsJS.s_MainMonitor();

        ElementsJS.SoftDrink_MainMonitor();

        ElementsJS.g_MainMonitor();

        ElementsJS.n_MainMonitor();


        assertEquals("5", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£7.04", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");

        Elements.voidScreen().click();

                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.oneScreen().click();
        Elements.twoScreen().click();
        Elements.threeScreen().click();
        Elements.xScreen().click();


                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        ElementsJS.n_MainMonitor();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        assertEquals("127", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£8.26", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.cash10Screen().click();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.Cscreen().click();

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }





        Elements.singOnOff().click();
        for (WebElement webElement : Arrays.asList(Elements.onePopUp(), Elements.enterPopUp())) {
            webElement.click();
        }


                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.enterCode().click();
        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the product's barcode.");
        Elements.threePopUp().click();
        Elements.fourPopUp().click();
        assertEquals("34", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the product's barcode is not closed.");

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the weight of the product.");
        Elements.threePopUp().click();
        Elements.fourPopUp().click();
        Elements.doubleZeroPopUp().click();
        assertEquals("3400", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the product's barcode is not closed.");

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        assertEquals("1", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£1.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£5.80", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");




                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.enterCode().click();
        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the product's barcode.");
        Elements.threePopUp().click();
        Elements.fourPopUp().click();
        assertEquals("34", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the product's barcode is not closed.");

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the weight of the product.");
        Elements.sixPopUp().click();
        Elements.doubleZeroPopUp().click();
        assertEquals("600", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the product's barcode is not closed.");

                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

        assertEquals("2", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£2.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£6.00", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");





        Elements.cardScreen().click();
        assertEquals("block", Elements.StartcardtransactionYesNo().getCssValue("display"),"The yes/no screen to start card transaction did not pop up.\n");
        Elements.StartcardtransactionYes().click();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        assertEquals("none", Elements.StartcardtransactionYesNo().getCssValue("display"),"The yes/no screen to start card transaction did not close.");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

        Elements.Cscreen().click();

    }
}