grails.project.work.dir = 'target'
grails.project.docs.output.dir = 'docs/manual' // for backwards-compatibility, the docs are checked into gh-pages branch
grails.project.target.level=1.7
grails.project.source.level=1.7

grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		grailsCentral()
	}

	plugins {
		compile ':dynamic-controller:0.5.1'
		compile ':google-visualization:0.7.1'
		compile ':jquery:1.11.1'

		build ':release:2.2.1', ':rest-client-builder:1.0.3', {
			export = false
		}
	}
}
