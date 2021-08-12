def groovyScript

pipeline {
    agent any
    
    parameters {
        string(name: 'MAINTENANCE', defaultValue: 'Alex.Oachesu@tetrapak.com', description: 'Maintenance email address')
        choice(name: 'VERSION', choices: ['1.1', '1.2', '1.3', '1.4'], description: 'Versions to be available')
        booleanParam(name: 'executeTests', defaultValue: true, description: 'Execute onli tests')
    }
    
    environment {
        // VERSION = 'x.yz' // the version should be given by a groovy script function that retrieves it from the code 
        CREDENTIALS = credentials('testing-credentials')
    }
    
    //tools{
        // maven 'Maven'
        // gradle
        // jdk
    //}
    
    stages {
        stage('init'){
            steps {
                script {
                   groovyScript = load "script.groovy"
                }
            }
        }
        
        stage('Testing when && expression') {
            when {
                expression {
                    BRANCH_NAME == 'main' 
                }
            }
            steps {
                echo #1
                //script {
                    //groovyScript.testingWhenAndExpression() 
                //}
            }
        }
        
        stage('Testing parameters'){
            when {
                expression {
                    params.executeTests == true
                }
            }
            steps{
                echo #2
                //script {
                    //groovyScript.testingParameters()
                //}
            }
        }
        
        stage('Testing env vars && additions') { 
            steps {
                echo #3
                //script {
                    //groovyScript.testingEnvVarAndAddedEnvVar() 
                //}
                // all env vars are available at *jenkins-dashbord*/env-vars.html
            }
        }

        stage('Testing credentials ussage in Jenkinsfile') { 
            steps {
                echo #4
                //script {
                    //groovyScript.testingCredentialsUssage()
                //}
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
