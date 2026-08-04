def call(String url, String branch){
  withCredentials([usernamePassword(credentialsId: jenkins ,passwordVariable: gitpass,usernameVariable:gituser)]){
    sh """
            echo "Checking git status"
            git status

            echo "Adding changes"
            git add .

            echo "Commit changes"
            git commit -m "Update docker tag in deployment"

            echo "Git push changes"
            git push ${url} ${branch}
          """
  }
}
