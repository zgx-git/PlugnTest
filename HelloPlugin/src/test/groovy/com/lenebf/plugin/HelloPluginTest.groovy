/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
package com.lenebf.plugin

import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project
import spock.lang.Specification

/**
 * A simple unit test for the 'com.lenebf.plugin.greeting' plugin.
 */
public class HelloPluginTest extends Specification {
    def "plugin registers task"() {
        given:
        def project = ProjectBuilder.builder().build()

        when:
        project.plugins.apply("com.lenebf.plugin.greeting")

        then:
        project.tasks.findByName("greeting") != null
    }
}
