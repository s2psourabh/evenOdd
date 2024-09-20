 // vars/setBuildStatus.groovy
 void call() {
    def message = "Build #${env.BUILD_NUMBER} - ${currentBuild.currentResult}"
    def state = (currentBuild.currentResult == 'SUCCESS') ? 'SUCCESS' : 'FAILURE'
    step([
        $class: "GitHubCommitStatusSetter",
        reposSource: [$class: "ManuallyEnteredRepositorySource", url: "https://github.com/s2psourabh/evenOdd"],
        contextSource: [$class: "ManuallyEnteredCommitContextSource", context: "ci/jenkins/build-status"],
        errorHandlers: [[$class: "ChangingBuildStatusErrorHandler", result: "UNSTABLE"]],
        statusResultSource: [ $class: "ConditionalStatusResultSource", results: [[$class: "AnyBuildResult", message: message, state: state]] ]
    ]);
 }
