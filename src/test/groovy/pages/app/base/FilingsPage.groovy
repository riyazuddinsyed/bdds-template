package pages
class FilingsPage extends BaseAppPage {
    static at =   
    {   
          title == "Government of British Columbia" 
    }
    static content = {
        addDetailButton(wait: true, required: true) {$("#app > div.v-menu__content.theme--light.menuable__content__active > div > div > div:nth-child(2)")}
        fileNowButton(wait: true,required: true){$([role="listitem"],3)}
        detailBlock(wait :true, required: true){$("#detail-comment-container")}
        legalNameField(wait: true,required: true){$("#certified-by-textfield")}
        legalNameCheckbox(wait: true,required: true){$("[role='checkbox']",1)}
        paymentField(wait: true,required: true){$("#routing-slip-number-textfield")}
        saveAndResumeButton(wait: true, required: true){$("#correction-save-resume-btn")}
    }
}
