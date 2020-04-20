pipeline {
  agent any
  stages {
    stage('Build') {
      parallel {
        stage('Build') {
          steps {
            echo 'Build step'
            echo 'build2'
          }
        }

        stage('Run Smokes') {
          steps {
            echo 'running step'
          }
        }

        stage('Sonar') {
          steps {
            echo 'sonar analyse'
          }
        }

      }
    }

    stage('TestNG') {
      steps {
        echo 'test NG step'
        echo 'hello'
      }
    }

  }
}