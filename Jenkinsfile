pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout the repository from Git and specify the branch
                checkout([$class: 'GitSCM', branches: [[name: 'master']], userRemoteConfigs: [[url: 'https://github.com/Georgiraychev7/RestAssured.git']]])
            }
        }
        stage('Build') {
            steps {
                // Your build steps here
                bat 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                // Run tests
                bat 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // Deploy artifacts using Maven
                bat 'mvn deploy'
            }
        }
    }
    
    post {
        always {
            // Publish JUnit test results
            junit '**/target/surefire-reports/*.xml'
        }
    }
}



