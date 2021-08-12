pipeline {
    agent any
    
    parameters {
        string(name: 'MAINTENANCE', defaultValue: 'Alex.Oachesu@tetrapak.com', description: 'Maintenance email address')
    }
    
    environment {
        VERSION = 'x.yz' // the version should be given by a groovy script function that retrieves it from the code 
    }

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
    }
    stage('Testing environment additions') {
        steps {
            echo VERSION
            echo "${VERSION}"
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
