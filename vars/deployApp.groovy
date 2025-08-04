def call() {
    echo "🚀 Deploying application with Docker Compose"
    sh 'docker-compose down || true'
    sh 'docker-compose up --build -d'
}
