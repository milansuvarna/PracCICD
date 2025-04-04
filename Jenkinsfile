pipeline {
    agent any

    tools {
        maven 'Maven 3.9.9'  // Make sure Maven is installed in Jenkins under "Global Tool Configuration"
        jdk 'JAVA 23'        // Same for JDK (Java 23 or whatever version you use)
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/milansuvarna/PracCICD.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Archive Artifacts') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo 'Build completed successfully!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
