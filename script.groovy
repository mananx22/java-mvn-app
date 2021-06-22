// def buildJar() {
//     echo "building our java application"
//     sh "mvn package"
// }

// def buildImage() {
//     echo "building our docker image"                    
//      withCredentials([usernamePassword(credentialsId: 'dockerhub', usernameVariable: 'USER', passwordVariable: 'PASS')]) {                    
//      sh 'docker build -t motorollaman27/dock-jen-push-repo:java-mvn-app-2 .'
//      sh "echo $PASS | docker login -u $USER --password-stdin"
//      sh 'docker push  motorollaman27/dock-jen-push-repo:java-mvn-app-2'
//      }
// }

def deployApp() {
    echo "deploying our artifact man"
}
 
return this