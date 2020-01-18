job('example') {
    logRotator(-1, 3)
    jdk('Java 8')
    scm {
        github('https://github.com/souravchatterjee1990/firstmavenproj.git', 'master')
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