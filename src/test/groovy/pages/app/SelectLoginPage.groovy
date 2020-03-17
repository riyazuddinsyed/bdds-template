
package pages

class SelectLoginPage extends BaseAppPage {
 static at = {title=="BC Services Card Login" }
 static url = "https://idtest.gov.bc.ca/login/entry#start"
 static content ={
      virtualCardTesting(wait: true, required: true) { $("#tile_btn_virtual_device_div_id")}
      cardNumber(wait: true, required: true) { $("#csn")}
      continueButton(wait: true, required: true) { $("#continue")}
      passCode(wait: true, required: true) { $("#passcode") }
      continuebutton(wait: true, required: true) { $("#btnSubmit") }
 }
 void  fillInValidEntries( String userId, String pWd) {
     virtualCardTesting.click()
     cardNumber.value("${userId}")
     continueButton.click()
     passCode.value("${pWd}")
     continuebutton.click()
 }
}
