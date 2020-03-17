package pages
class DashboardResumePage extends BaseAppPage {
     static at = {'Cooperatives Online'}
     static content = {
         resumeButton(wait: true,required: true){ $("button", text: "Resume") }
         legalNameCheckbox(wait: true,required: true){$("[role='checkbox']",1)}
         priorityCheckBox(wait: true,required: true){$("#priority-checkbox")}
         fileAndPayButton(wait: true,required: true){ $("button", text: "File & Pay") }
     }
}

          