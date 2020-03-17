
package specs.traits
trait Users {
  Map env = System.getenv()
  Map getAdminUser() {
    [username:env['User'], password:env['Pwd']]
  }

  Map getViewerUser() {
    [username:env['PPR_VIEWER_USERNAME'], password:env['PPR_PASSWORD']]
  }

  Map getSubmissionUser() {
    [username:env['PPR_SUBMISSION_USERNAME'], password:env['PPR_PASSWORD']]
  }

}
