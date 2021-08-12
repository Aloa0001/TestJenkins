pipeline {
    agent any
    
    parameters {
        string(name: 'MAINTENANCE', defaultValue: 'Alex.Oachesu@tetrapak.com', description: 'Maintenance email address')
    }
    
    environment {
        VERSION = 'x.yz' // the version should be given by a groovy script function that retrieves it from the code 
        CREDENTIALS = credentials('testing-credentials')
    }
    stages {
        stage('Testing when && expression') {
            when {
                expression {
                    BRANCH_NAME == 'main' 
                }
            }
            steps {
                echo MAINTENANCE
                echo BRANCH_NAME
                echo 'Building ..'
            }
        }
    

        stage('Testing env vars && additions') { 
            steps {
                echo "version: ${VERSION}"
                echo "version: ${VERSION}"
                echo "build: ${BUILD_ID}"
                echo "ci: ${CI}"
                echo "build number: ${BUILD_NUMBER}"
                echo "job name: ${JOB_NAME}"
                echo "jenkins url: ${JENKINS_URL}"
                echo "build url: ${BUILD_URL}"
                echo "job url: ${JOB_URL}"
                echo "git url: ${GIT_URL}"
                // all env vars are available at *jenkins-dashbord*/env-vars.html
            }
        }

        stage('Testing credentials ussage in Jenkinsfile') { 
            steps {
                echo "Credentials being used: ${CREDENTIALS}"
                
                // retrieving credentials at steps-block-level
                // withCredentials([
                       // usernamePassword(credentials: 'testing-credentials', usernameVariable: USER, passwordVariable: PASSWORD )
                // ]) {
                    // echo "Username: ${USER}\nPassword: ${PSW}"
                    // sh "script ${USER} ${PSW}"
                 // }
            }
        }
    }
    
    /*post {
        success {
            mail to: "${params.MAINTENANCE}", subject: "Successful build!"
        }
        
        failure {
            mail to: "${params.MAINTENANCE}", subject: "Unsuccessful build!"
        }
    }*/
}
