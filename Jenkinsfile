pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                // Compile the source code using Maven
                bat 'mvn compile'
            }
            post {
                success {
                    echo 'Compilation successful!'
                }
                failure {
                    echo 'Compilation failed!'
                }
            }
        }
        stage('Test') {
            steps {
                // Run tests using Maven
                bat 'mvn test'
            }
            post {
                success {
                    echo 'Tests passed!'
                }
                failure {
                    echo 'Tests failed!'
                }
            }
        }
        stage('Deploy') {
            steps {
                // Deploy artifacts using Maven
                bat 'mvn deploy'
            }
            post {
                success {
                    echo 'Deployment successful!'
                }
                failure {
                    echo 'Deployment failed!'
                }
            }
        }
    }
}


