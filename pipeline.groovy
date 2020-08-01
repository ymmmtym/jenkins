pipelineJob('Pipeline Basic Job') {

  def repo = 'https://github.com/ymmmtym/sample-repo.git'

  description("Pipeline for $repo")

  triggers {
    scm('H/5 * * * *')
  }

  definition {
    cpsScm {
      scm {
        git {
          remote { url(repo) }
          branches('master')
          scriptPath('Jenkinsfile')
          extensions { }
        }
      }
    }
  }
}