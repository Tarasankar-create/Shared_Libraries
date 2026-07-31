def call(String projectname, String imageTag, String dockerhubuser) {
    withCredentials([usernamePassword(credentialsId:'docker',passwordVariable:'dockerpass',usernameVariable:'dockeruser')]){
        sh "docker login -u ${dockeruser} -p ${dockerpass}"
    }
    sh "docker push ${dockerhubuser}/${projectname}:${imageTag}"
}
