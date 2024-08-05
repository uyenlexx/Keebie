job('Keebie-Jenkins-DSL') {
    scm {
        git("https://github.com/uyenlexx/Keebie.git", master)
    }
    triggers {
        scm('H/5 * * * *')
    }
    steps {
        shell('echo "Hello World"')
    }
}