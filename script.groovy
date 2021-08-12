def testingWhenAndExpression() {
  echo params.MAINTENANCE
  echo "${BRANCH_NAME}"
  echo 'Building ..'
}

def testingParameters() {
  echo 'executing tests ...'
}

def testingEnvVarAndAddedEnvVar() {
  echo "version: ${VERSION}"
                echo "version: ${VERSION}"
                echo "build: ${BUILD_ID}"
                echo "ci: ${CI}"
                echo "build number: ${BUILD_NUMBER}"
                echo "job name: ${JOB_NAME}"
                echo "jenkins url: ${JENKINS_URL}"
                echo "build url: ${BUILD_URL}"
                echo "job url: ${JOB_URL}"
                echo "git url: ${GIT_URL}
}

def testingCredentialsUssage() {
  echo "Credentials being used: ${CREDENTIALS}"
}

return this
