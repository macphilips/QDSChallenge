pipeline {
  agent any
  stages {
    stage('build') {
      agent any
      steps {
        build(propagate: true, wait: true, quietPeriod: 5, job: 'build')
      }
    }
  }
}