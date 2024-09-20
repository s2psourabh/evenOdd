//@Library('my-shared-library') _
 pipeline {
    agent any
    stages {
        stage('Build') {
    }
        }
 // Your build steps here
            steps {
                script {
                }
            }
    post {
        always {
            script {
 // Call the shared library function to set the build status
                setBuildStatus()
            }
        }
    }
 }
