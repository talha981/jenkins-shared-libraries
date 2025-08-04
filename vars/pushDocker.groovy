def call(String imageName, String tag = 'latest', String credentialsId) {
    withCredentials([usernamePassword(credentialsId: credentialsId, usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
        echo "📤 Pushing Docker image to Docker Hub: $imageName:$tag"
        sh 'echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin'
        sh "docker push $imageName:$tag"
    }
}
