// vars/owasp_dependency.groovy
def call() {
    dependencyCheck additionalArguments: '--scan ./ --format XML --disableYarnAudit --disableNodeAudit',
                     odcInstallation: 'DP-Check'

    archiveArtifacts artifacts: 'dependency-check-report.xml', allowEmptyArchive: true
}
