import com.burtbeckwith.grails.plugins.appinfo.ContextListener

class AppInfoGrailsPlugin {

	def version = '1.1.1-frontlinesms'
	def grailsVersion = '2.0 > *'
	List pluginExcludes = [
		'scripts/CreateAppInfoTestApps.groovy'
	]

	def author = 'Burt Beckwith'
	def authorEmail = 'burt@burtbeckwith.com'
	def title = 'Application Info'
	def description = "UI for inspecting various aspects of the application's configuration"
	def documentation = 'http://grails.org/plugin/app-info'

	def license = 'APACHE'
	def issueManagement = [system: 'JIRA', url: 'http://jira.grails.org/browse/GPAPPINFO']
	def scm = [url: 'https://github.com/burtbeckwith/grails-app-info']

	def doWithWebDescriptor = { xml ->
		def useContextListener = application.config.grails.plugins.appinfo.useContextListener
		if (useContextListener == null || (useContextListener instanceof Boolean && useContextListener)) {
			def filterMapping = xml.'filter-mapping'
			filterMapping[filterMapping.size() - 1] + {
				listener {
					'listener-class'(ContextListener.name)
				}
			}
		}
	}
}
