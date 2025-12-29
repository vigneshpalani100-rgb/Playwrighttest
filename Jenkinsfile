pipeline {
    agent any
    tools {
        nodejs 'NodeJS' // Use the name you gave Node in Global Tool Configuration
    }
    stages {
        stage('Install Dependencies') {
            steps {
                sh 'npm install'
                sh 'npx playwright install --with-deps'
            }
        }
        stage('Run Tests') {
            steps {
                sh 'npx playwright test'
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
