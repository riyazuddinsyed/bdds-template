package pages
class StartPage extends BaseAppPage {
    static at =   
    {   
          title == "Government of British Columbia" 
    }
    static content = {
        idirUserName(wait: true, required: true) { $("#user")}
        idirPassword(wait: true, required: true) { $("#password")}
        continueButton(wait: true, required: true) { $("[name='btnSubmit']")}
    }
   
}
 