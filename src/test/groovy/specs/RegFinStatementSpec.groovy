package specs
import pages.StartPage
import pages.DashboardPage
import pages.SearchPage
import pages.FilingsPage
import pages.DashboardResumePage
import spock.lang.*
class RegFinStatementSpec extends BaseSpec {
    //def env = System.getenv()
    def "Open First page"() {
        when: "I browse to the start page"
            to StartPage
        then: "I enter the credentials"
          idirUserName.value('')
          idirPassword.value('')
          continueButton.click()
        and: "I enter the Entity Number" 
               to SearchPage
              enterCPNumber.value('CP0001205')
              searchButton.click()
        then: "I click on the add detail block"
                to DashboardPage
                chevron.click()
                addDetailButton.click()
                addDetailBlock.value('Lets add a detail')
                saveButton.click()
        and: "Then I start the Filling for corection"
               to FilingsPage
               chevron.click()
               fileNowButton.click()
               detailBlock.value('lets add an other detail')
               legalNameField.value('Boss Baby')
               legalNameCheckbox.click()
               paymentField.value('123456789')
               saveAndResumeButton.click()
        then: "Complete the payment for the draft"
               to DashBoardResumePage
               resumeButton.click()
               legalNameCheckbox.click()
               priorityCheckBox.click()
               fileAndPayButton.click()
              
    }  
}