pipeline {
    agent any
    
    parameters {
        string(name: 'MAINTENANCE', defaultValue: 'Alex.Oachesu@tetrapak.com', description: 'Maintenance email address')
    }

    stages {
        stage('Build') {
            when {
                expression {
                    BRANCH_NAME == 'develop' || CODE_CHANGES == true
                }
            }
            steps {
                echo MAINTENANCE
                echo BRANCH_NAME
                echo 'Building ..'
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
