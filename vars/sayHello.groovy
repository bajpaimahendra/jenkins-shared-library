def call(String name = 'World') {
    echo "Hello, ${name}! Welcome to Jenkins Shared Libraries."
}

// Named helpers: call as devOps.buildImage(), devOps.pushImage()
def buildImage(String tag) {
  sh "docker build -t ${tag} ."
}

def showAllContainers(String containerName) {
  sh "docker inspect ${containerName} ."
}