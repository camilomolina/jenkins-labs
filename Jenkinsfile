#!groovy



node {
    def antHome
    environment {
        JAVA_HOME = '/usr/lib/jvm/jdk1.7.0_80'
    }
    stage('Environment') {
        echo 'Environment'

        //antHome = '/usr/local/lib/apache-ant-1.8.4'
        antHome = '/usr/local/lib/apache-ant-1.10.0'

        echo "${antHome}"
        //git url: 'https://github.com/camilomolina/jenkins-labs.git', branch: 'develop'

        sh 'printenv'
        checkout scm

    }
    stage('Build') {
        echo 'Building'
        sh "${antHome}/bin/ant clean"
        sh "${antHome}/bin/ant war"
    }
    stage('Test') {
        echo 'Testing'
    }
    stage('Deploy') {
        echo 'deployment'
        //sh 'ssh deploy@xxxxx.xxxxx.com running/xxxxxxx/dockerRun.sh'
    }
}


