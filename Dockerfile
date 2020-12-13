FROM jenkins/jenkins:lts-alpine
LABEL Maintainer="ymmmtym"

USER root

RUN wget https://updates.jenkins-ci.org/latest/jenkins.war -O /tmp/jenkins.war && \
    mv /tmp/jenkins.war /usr/share/jenkins/

USER jenkins

EXPOSE 8080
EXPOSE 50000
