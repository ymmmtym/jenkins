# Jenkins

## Usage

```bash
docker-compose up -d
```

1. Access to <http://localhost:8080>
2. login via admin and folloing password

```bash
cat jenkins_home/secrets/initialAdminPassword
```

### Initialize

- Create New Job
  - Free Style
- Put your github repository URL
- Procerss Job DSLs
- In-process Script Approval

### Plugins

#### Show Installed Plugin list

Paste on Script Console

```groovy
Jenkins.instance.pluginManager.plugins.each{
  plugin -> 
    println ("${plugin.getShortName()}:${plugin.getVersion()}")
}
```
