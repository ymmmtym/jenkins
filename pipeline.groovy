pipelineJob('Pipeline Basic Job') {

  def repo = 'https://github.com/ymmmtym/jenkins.git'

  description("Pipeline for $repo")

  columns {
    cronTrigger('H/5 * * * *')
  }

  definition {
    cpsScm {
      scm {
        git {
          remote { url(repo) }
          branches('**')
          scriptPath('Jenkinsfile')
          extensions { }
        }
      }
    }
  }
}