/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
package com.lenebf.plugin

import org.gradle.api.Project
import org.gradle.api.Plugin

/**
 * A simple 'hello world' plugin.
 */
public class HelloPlugin implements Plugin<Project> {
    public void apply(Project project) {
        // Register a task
        project.tasks.register("greeting") {
            doLast {
                println("Hello from plugin 'com.lenebf.plugin.greeting'")
            }
        }
    }
}
