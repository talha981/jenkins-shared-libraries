def call(String branch = 'master', String repoUrl) {
    echo "📥 Cloning repo: $repoUrl on branch: $branch"
    git branch: branch, url: repoUrl
}
