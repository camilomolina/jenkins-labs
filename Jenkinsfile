#!groovy

node {
    def antHome
    def sonarHome

    env.JAVA_HOME = '/usr/lib/jvm/jdk1.8.0_121'
    env.TOMCAT_HOME = '/usr/local/bin/apache-tomcat-9.0.0.M26'

    stage('Environment') {
        echo 'Environment'

        //antHome = '/usr/local/lib/apache-ant-1.8.4'
        antHome = '/usr/local/lib/apache-ant-1.9.9'
        sonarHome = '/usr/local/lib/sonar-scanner-2.8'

        sh 'printenv'

        //git url: 'https://github.com/camilomolina/jenkins-labs.git', branch: 'develop'
        checkout scm
    }
    stage('Build') {
        echo 'Building'
        sh "${antHome}/bin/ant clean"
        sh "${antHome}/bin/ant war"
    }
    stage('Test') {
        echo 'Testing'
        env.JAVA_HOME = '/usr/lib/jvm/jdk1.8.0_121'
        sh "${sonarHome}/bin/sonar-scanner"
    }
    stage('Deploy') {
        echo 'deployment'
        sh "sshpass -p '11042.' scp build/jenkins-labs.war it@10.96.0.202:/home/it"
        sh 'sudo cp /home/it/jenkins-labs.war /usr/local/bin/apache-tomcat-9.0.0.M26/webapps'
        //scp /path/to/file username@a:/path/to/destination
        //sh 'ssh deploy@xxxxx.xxxxx.com running/xxxxxxx/dockerRun.sh'
    }
}


