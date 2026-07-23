def call() {
    dependencyCheck additionalArguments: '--scan ./ --format XML --disableYarnAudit --disableNodeAudit', 
                     odcInstallation: 'DP-Check'
    dependencyCheckPublisher pattern: 'dependency-check-report.xml'
}
