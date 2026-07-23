def call() {
    dependencyCheck(
        odcInstallation: 'OWASP',
        additionalArguments: '--scan . --format XML --format HTML'
    )

    dependencyCheckPublisher(
        pattern: '**/dependency-check-report.xml'
    )
}
