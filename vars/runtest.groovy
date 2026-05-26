def call(String tech = 'node') {
    if (tech == 'node') {
        sh 'node -v'
        sh 'npm -v'
        sh 'npm ci'
        sh 'npm test'
    } else if (tech == 'python') {
        sh 'python3 --version'
        sh 'pip3 --version'
        sh 'pytest || python -m pytest'
    } else {
        error("Technologie non supportée: ${tech}")
    }
}