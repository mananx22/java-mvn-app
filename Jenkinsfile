// adding jenkins-shared-library to be imported from jenkins 'which is defined in jenkins global configuration'
@Library('jenkins-shared-library')
def gv 

pipeline {
    agent any
    tools {
        maven 'maven 3.8.1'
    }
    stages {
         stage("init") {
            steps {
                script {
                   gv = load "script.groovy"
                }
            }
        }

        stage("building jar") {
            steps {
                script {
                    // taken from jenkins shared library
                  buildJar()
                }
            }
        }

        stage("building docker image") {
            steps {
                script {
                     // taken from jenkins shared library
                   buildImage 'motorollaman27/dock-jen-push-repo:java-mvn-app-3'
                }
            } 
        }
        
        
        stage("deploy") {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }   
}