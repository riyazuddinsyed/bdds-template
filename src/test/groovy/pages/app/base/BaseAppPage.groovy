

package pages

import geb.Page

import modules.HeaderModule
import modules.ModalModule
import modules.CommonLinkModule
import modules.FooterModule
class BaseAppPage extends Page {
  static content = {
    headerModule { module(HeaderModule) }
    modalModule { module(ModalModule) }
    commonModule { module(CommonLinkModule) }
    footerModule { module(FooterModule) }
  }
}
