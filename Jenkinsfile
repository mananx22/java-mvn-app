pipeline {
    agent any
    tools {
        maven 'maven 3.8.1'
    }
    stages {
        stage("building jar") {
            steps {
                script {
                   echo "building our java application"
                   sh "mvn package"
                }
            }
        }

        stage("building docker image") {
            steps {
                script {
                   echo "building our docker image"                    
                    withCredentials([usernamePassword(credentialsId: 'dockerhub', usernameVariable: 'USER', passwordVariable: 'PASS')]) {                    
                    sh 'docker build -t motorollaman27/dock-jen-push-repo:java-mvn-app-2 .'
                    sh "echo $PASS | docker login -u $USER --password-stdin"
                    sh 'docker push  motorollaman27/dock-jen-push-repo:java-mvn-app-2'
                    }
                }
            } 
        }
        
        
        stage("deploy") {
            steps {
                script {
                    echo "deploying our application"
                    //gv.deployApp()
                }
            }
        }
    }   
}