def call() {
    dependencyCheck additionalArguments: '--scan . --format XML --format HTML',
                    odcInstallation: 'Dependency-Check'

    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
