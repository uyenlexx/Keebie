job('Keebie-Jenkins-DSL') {
    scm {
        git("https://github.com/uyenlexx/Keebie.git", main)
    }
    steps {
        shell('echo "Hello World"')
    }
}