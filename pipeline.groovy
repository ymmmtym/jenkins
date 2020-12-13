pipelineJob('Pipeline Basic Job') {

  def repo = 'https://github.com/ymmmtym/jenkins.git'

  description("Pipeline for $repo")

  triggers {
    scm('H/5 * * * *')
  }

  definition {
    cpsScm {
      scm {
        git {
          remote { url(repo) }
          branches('main')
          scriptPath('Jenkinsfile')
          extensions { }
        }
      }
    }
  }
}