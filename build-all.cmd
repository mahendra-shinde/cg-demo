@echo off
echo Build both maven projects...
cmd /c mvn clean package -DskipTests -f spring-boot-book-service\pom.xml
cmd /c mvn clean package -DskipTests -f spring-boot-student-service\pom.xml
echo .
echo Build docker images...
docker compose build
echo .
echo Running container services
docker compose up -d
timeout /T 10 /NOBREAK 
echo .
echo Now restarting the book-service
docker compose restart book-service
echo .
echo Launching the web browser
start http://localhost:8090/
