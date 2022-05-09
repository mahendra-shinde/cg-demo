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
echo .
echo Launching the web browser please wait...
timeout /T 10 /NOBREAK 
echo .
start http://localhost:8090/
