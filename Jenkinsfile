#!groovy



node {
    def antHome
    env.JAVA_HOME = '/usr/lib/jvm/jdk1.7.0_80'
    env.TOMCAT_HOME = '/usr/local/bin/apache-tomcat-9.0.0.M26'

    stage('Environment') {
        echo 'Environment'

        //antHome = '/usr/local/lib/apache-ant-1.8.4'
        antHome = '/usr/local/lib/apache-ant-1.9.9'

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


