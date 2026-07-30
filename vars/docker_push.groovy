def call(String projectname, String imageTag, String dockerhubuser) {
    withCredentials([usernamePassword(credentialId:'docker',passwordVariable:'dockerhubpass',usernameVariable:'dockerhubuser')]){
        sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
    }
    sh "docker push ${dockerhubuser}/${projectname}:${imageTag}"
}
