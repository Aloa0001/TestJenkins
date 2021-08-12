def testingWhenAndExpression() {
  echo params.MAINTENANCE
  echo "${BRANCH_NAME}"
  echo 'Building ..'
}

def testingParameters() {
  echo 'executing tests ...'
}

def testingEnvVarAndAddedEnvVar() {
  //echo "version: ${VERSION}"
  echo "version: ${params.VERSION}"
  //echo "build: ${env.BUILD_ID}"
  //echo "ci: ${env.CI}"
  //echo "build number: ${env.BUILD_NUMBER}"
  //echo "job name: ${env.JOB_NAME}"
  //echo "jenkins url: ${env.JENKINS_URL}"
  //echo "build url: ${env.BUILD_URL}"
  //echo "job url: ${env.JOB_URL}"
  //echo "git url: ${env.GIT_URL}
}

def testingCredentialsUssage() {
  echo "Credentials being used: ${CREDENTIALS}"
}

return this
