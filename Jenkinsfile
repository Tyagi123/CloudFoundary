pipeline {
    agent any
    stages {

        stage ('Build') {
            steps {
                withMaven(maven: 'apache-maven-3.6.3') {
                    sh 'mvn clean package'
                }
            }
        }

        stage ('Deploy') {
            steps {
                  withCredentials([[$class          : 'UsernamePasswordMultiBinding',
                                                  credentialsId   : 'PCF_LOGIN',
                                                  usernameVariable: 'USERNAME',
                                                  passwordVariable: 'PASSWORD']]){

                    sh '/usr/local/bin/cf login -a http://api.run.pivotal.io -u gauravtyagi888@gmail.com -p Pune@786'
                    sh '/usr/local/bin/cf push -a CLOUDFOUNDRHELLOWORLD'
                }
            }

        }

    }

}