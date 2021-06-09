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
                   gv.buildJar()
                }
            }
        }

        stage("building docker image") {
            steps {
                script {
                   gv.buildImage()
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