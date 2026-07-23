def call(String sonarEnv, String projectKey, String projectName) {
    withSonarQubeEnv(sonarEnv) {
        sh """
            ${SONAR_HOME}/bin/sonar-scanner \
              -Dsonar.projectKey=${projectKey} \
              -Dsonar.projectName=${projectName}
        """
    }
}
