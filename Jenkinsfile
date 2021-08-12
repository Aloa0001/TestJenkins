pipeline {
    agent any
    
    parameters {
        string(name: 'MAINTENANCE', defaultValue: 'Alex.Oachesu@tetrapak.com', description: 'Maintenance email address')
    }
    
    environment {
        VERSION = 'x.yz' // the version should be given by a groovy script function that retrieves it from the code 
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
                echo VERSION
                echo "${VERSION}"
                echo BUILD_ID
                echo CI
                echo BUILD_NUMBER
                echo JOB_NAME
                echo JENKINS_URL
                echo BUILD_URL
                echo JOB_URL
                echo GIT_URL
                // all env vars are available at *jenkins-dashbord*/env-vars.html
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
