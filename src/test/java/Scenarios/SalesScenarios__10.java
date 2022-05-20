package Scenarios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Sales Scenario")
public class SalesScenarios__10 extends OpenPage {

    @DisplayName("Scenario 10")
    @Test
    void ScenarioTEN() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ElementsJS.SoftDrink_MainMonitor();

        Elements.fourScreen().click();
        Elements.xScreen().click();
        ElementsJS.u_MainMonitor();

        assertEquals("block", Elements.ConfirmAgePopUp().getCssValue("display"),"The yes/no screen to confirm age did not pop up.\n");
        Elements.cigaretteOrTobaccoYes().click();
        assertEquals("none", Elements.ConfirmAgePopUp().getCssValue("display"),"The yes/no screen to confirm age did not close.");


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ElementsJS.x_MainMonitor();
        ElementsJS.n_MainMonitor();

        assertEquals("7", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£7.06", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.suspend().click();

        Elements.eightScreen().click();
        Elements.sixScreen().click();
        Elements.oneScreen().click();
        ElementsJS.e_MainMonitor();

        assertEquals("block", Elements.ConfirmAgePopUp().getCssValue("display"),"The yes/no screen to confirm age did not pop up.\n");
        Elements.cigaretteOrTobaccoYes().click();
        assertEquals("none", Elements.ConfirmAgePopUp().getCssValue("display"),"The yes/no screen to confirm age did not close.");


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("1", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");


        Elements.functions().click();
        Elements.voidLine().click();
        Elements.functions().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.eightScreen().click();
        Elements.sixScreen().click();
        Elements.oneScreen().click();
        Elements.xScreen().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ElementsJS.e_MainMonitor();

        assertEquals("861", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");

        ElementsJS.c_MainMonitor();
        ElementsJS.r_MainMonitor();
        ElementsJS.o_MainMonitor();

        Elements.twoScreen().click();
        Elements.sixScreen().click();
        Elements.xScreen().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ElementsJS.d_MainMonitor();
        ElementsJS.f_MainMonitor();
        ElementsJS.g_MainMonitor();


        assertEquals("892", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£8.92", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");


        Elements.cardScreen().click();
        assertEquals("block", Elements.StartcardtransactionYesNo().getCssValue("display"),"The yes/no screen to start card transaction did not pop up.\n");
        Elements.StartcardtransactionYes().click();

        try {
            Thread.sleep(500);
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


        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.resume().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ElementsJS.i_MainMonitor();

        ElementsJS.l_MainMonitor();

        ElementsJS.s_MainMonitor();

        ElementsJS.t_MainMonitor();

        ElementsJS.v_MainMonitor();

        ElementsJS.w_MainMonitor();


        assertEquals("13", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£7.12", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cash20Screen().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.Cscreen().click();

    }
}
