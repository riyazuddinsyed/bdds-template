package pages
class DashboardPage extends BaseAppPage {
    static at =   
    {   
          title == "Cooperatives Online" 
    }
    static content = {
        chevron(wait: true, required: true) { $("#filing-history-list > div.v-item-group.theme--light.v-expansion-panels > div:nth-child(3) > button > div.list-item > div.filing-item__actions > button > span > i")}
        addDetailButton(wait: true, required: true) {$("#app > div.v-menu__content.theme--light.menuable__content__active > div > div > div:nth-child(2)")}
        addDetailBlock(wait:true, required: true){$("#detail-comment-textarea")}
        saveButton(wait:true, required: true) {$("#dialog-save-button")}
        } 
}