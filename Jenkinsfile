pipeline {
  agent {
    docker {
      image 'ubuntu'
    }

  }
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
          agent {
            docker {
              image 'sonarqube'
            }

          }
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

    stage('Code coverage') {
      steps {
        sh 'echo "Hello from my pipeline"'
      }
    }

  }
}