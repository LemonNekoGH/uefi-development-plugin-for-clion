package com.github.lemonnekogh.uefidevelopmentpluginforclion.services

import com.intellij.openapi.project.Project
import com.github.lemonnekogh.uefidevelopmentpluginforclion.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
