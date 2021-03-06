job('FirstDSLJob') {
    logRotator(-1, 3)
    jdk('Java 8')
    scm {
        github('souravchatterjee1990/firstmavenproj', 'master')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean install', 'com.sourav.projects/pom.xml')
    }
    publishers {
        archiveArtifacts('**/*.jar')
    }
}