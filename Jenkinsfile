@Library('jenkinslibrary') _

node {
  stage('Checkout') {
    source()
  }

  stage('Tests') {
    dir('api') {
      runtest('node')
    }
  }
}