def call(String projectname, String imageTag, String Username) {
    sh "docker build -t ${Username}/${projectname}:${imageTag} ."
}
