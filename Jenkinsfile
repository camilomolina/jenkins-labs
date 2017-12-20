#!groovy



node {
    def antHome
    env.JAVA_HOME = '/usr/lib/jvm/jdk1.7.0_80'

            env.TOMCAT_HOME = '/usr/local/bin/apache-tomcat-9.0.0.M26'
    environment {


        withEnv(['JAVA_HOME=/usr/lib/jvm/jdk1.7.0_80', 'TOMCAT_HOME=/usr/local/bin/apache-tomcat-9.0.0.M26']) {
            sh 'printenv'
        }



    }
    stage('Environment') {
        echo 'Environment'

        //antHome = '/usr/local/lib/apache-ant-1.8.4'
        antHome = '/usr/local/lib/apache-ant-1.10.0'

        echo "${antHome}"
        //git url: 'https://github.com/camilomolina/jenkins-labs.git', branch: 'develop'
  echo "jdk 1 installation path is: ${env.JAVA_HOME}"
    env.JAVA_HOME = '/usr/lib/jvm/jdk1.6.0_45'

  echo "jdk 2 installation path is: ${env.JAVA_HOME}"

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


