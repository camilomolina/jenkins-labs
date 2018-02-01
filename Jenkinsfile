#!groovy

node {
    def antHome
    def sonarHome

    def app

    env.JAVA_HOME = '/usr/lib/jvm/jdk1.8.0_121'
    env.TOMCAT_HOME = '/usr/local/bin/apache-tomcat-9.0.0.M26'

    stage('Environment') {
        echo 'Environment'

        antHome = '/usr/local/lib/apache-ant-1.9.9'
        sonarHome = '/usr/local/lib/sonar-scanner-2.8'

        app = 'jenkins-labs.war'

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

        env.JAVA_HOME = '/usr/lib/jvm/jdk1.8.0_121'
        sh "${sonarHome}/bin/sonar-scanner"
    }
    stage('Deploy') {
        echo 'Deployment'

        ansiblePlaybook(playbook: 'deploy.yml')
    }
    stage('Results') {
        archive "build/${app}"

        def mailRecipients = "camilo@bennu.cl"
        def jobName = currentBuild.fullDisplayName

        emailext body: '''${SCRIPT, template="groovy-html.template"}''',
            mimeType: 'text/html',
            subject: "[Jenkins] ${jobName}",
            to: "${mailRecipients}",
            replyTo: "${mailRecipients}",
            recipientProviders: [[$class: 'CulpritsRecipientProvider']]
    }

}


