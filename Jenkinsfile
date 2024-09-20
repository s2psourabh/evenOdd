pipeline{
    agent any
    stages{
        stage('Checkout'){
            steps{
                echo 'Checkout'
            }            
        }
        stage('Build'){
            steps{
                echo 'Build'
            } 
        }
        stage('Test'){
            steps{
                echo 'Test'
            }
        }    
    }
    post{
        always{
            script{
                
             // Call the shared library function to set the build status
                setBuildStatus()
            }
        }
        }
    }

