package Scenarios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Sales Scenario")
public class SalesScenarios__4 extends OpenPage {

    @DisplayName("Scenario 4")
    @Test
    void ScenarioFour() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        ElementsJS.pointVegMenu();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ElementsJS.pointVegMenuBeansBroad1kg();
        ElementsJS.pointVegMenuBeansBroad1kg();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("2", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£2.20", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£6.00", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");


        Elements.pointVegAndFruitMenuOK().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ElementsJS.grocery_MainMonitor();
        ElementsJS.k_MainMonitor();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("block", Elements.ConfirmAgePopUp().getCssValue("display"),"The yes/no screen to confirm age did not pop up.\n");
        Elements.cigaretteOrTobaccoYes().click();
        assertEquals("none", Elements.ConfirmAgePopUp().getCssValue("display"),"The yes/no screen to confirm age did not close.");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ElementsJS.cigaretteOrTobacco_MainMonitor();
        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the price of the product.\n");
        Elements.fivePopUp().click();
        Elements.zeroPopUp().click();
        Elements.twoPopUp().click();
        assertEquals("502", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.");


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the price of the product is not closed");



        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        ElementsJS.pointFruitMenu();


        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ElementsJS.pointFruitMenuAVOCADO();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        assertEquals("6", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£2.20", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£18.04", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");



        Elements.twoScreen().click();
        Elements.xScreen().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ElementsJS.pointFruitMenuAVOCADO();
        ElementsJS.pointFruitMenuAPPLEGREEN1kg();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.pointVegAndFruitMenuOK().click();

        assertEquals("9", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£7.20", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£32.04", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");


        Elements.fiveScreen().click();
        Elements.doubleZeroScreen().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.functions().click();
        Elements.discountAmount().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.functions().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.suspend().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.homeMode().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.management().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.mixAndMatch().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.create().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.MixandMacthcurrentRecordName().sendKeys("BANANA 1kg, 2kg for £5.00");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.MixandMatchquantity().sendKeys("2");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.MixandMacthcurrentRewardAmount().sendKeys("£5.00");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.MixandMacthSubmenuProduct().sendKeys("BANANA 1kg");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ElementsJS.pointFruitMenuBanana1kg();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.SAVEmm().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.homeModeBack().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.resume().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.enterCode().click();
        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the product's barcode.");
        Elements.onePopUp().click();
        Elements.sevenPopUp().click();
        assertEquals("17", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the product's barcode is not closed.");


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.enterCode().click();
        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the product's barcode.");
        Elements.onePopUp().click();
        Elements.sevenPopUp().click();
        assertEquals("17", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the product's barcode is not closed.");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        assertEquals("11", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£13.62", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£32.04", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");


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
