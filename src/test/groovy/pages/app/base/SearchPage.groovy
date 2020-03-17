package pages
class SearchPage extends BaseAppPage {
     
     static at = {'Cooperatives Online'}
     static content = {
         enterCPNumber(wait: true, required: true) { $("#txtBusinessNumber")}
         searchButton(wait: true, required: true) { $("button", text: "Search") }
     }
     void enterCPNumber(String entity){
          enterCPNumber.value(entity)
     }
}