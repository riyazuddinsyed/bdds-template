package pages
class PdfDownloadPage extends BaseAppPage {
    static at ={ title == 'Cooperatives Online'}
     static url = 'https://dev.bcregistry.ca/cooperatives/dashboard'
    static content = {
        viewDocuments(wait: true, required: true) { $("#filing-history-list > div.v-item-group.theme--light.v-expansion-panels > div:nth-child(2) > button > div.list-item > div.filing-item__actions > div.toggle-info > span")}
        pdfLink(wait: true, required: true){$("#filing-history-list > div.v-item-group.theme--light.v-expansion-panels > div.v-expansion-panel.align-items-top.filing-history-item.v-expansion-panel--active.v-item--active > div > div > div.v-list.mt-n1.mb-n3.pt-0.pb-0.v-sheet.v-sheet--tile.theme--light.v-list--dense > div:nth-child(1) > button > span")}
        pdfBytes = downloadBytes('https://legal-api-test.pathfinder.gov.bc.ca/api/v1/businesses/CP0002148/filings/47466')
    }
}