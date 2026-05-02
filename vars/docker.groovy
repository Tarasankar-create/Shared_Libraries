def docker(){
  sh '''
  sudo apt update
  sudo apt install -y docker.io
  sudo apt install -y docker-compose-v2
  sudo systemctl start docker
  sudo systemctl enable docker
  '''
}
