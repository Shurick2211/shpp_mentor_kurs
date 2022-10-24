mvn package -D skipTests=true -P env-prod
java -cp ./target/my-app-1.0-SNAPSHOT.jar com/onimko/App
mvn clean