pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                // Compile the source code
                sh 'mvn compile'
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
                // Run tests
                sh 'mvn test'
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
    }
}
