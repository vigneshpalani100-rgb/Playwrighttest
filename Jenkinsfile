pipeline {
    agent any
    tools {
        nodejs 'mynodejs' // Use the name you gave Node in Global Tool Configuration
    }
    stages {
        stage('Install Dependencies') {
            steps {
                bat 'npm install'
                bat 'npx playwright install --with-deps'
            }
        }
        stage('Run Tests') {
            steps {
                bat 'npx playwright test'
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: '**/test-results/**', allowEmptyArchive: true
            junit '**/test-results/results.xml'
        }
    }
}
