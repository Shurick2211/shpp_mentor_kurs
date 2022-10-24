javac -d . *.java

echo main-class: Main > manifest.mf

jar -cmf manifest.mf app.jar *.class

rm manifest.mf

rm *.class

java -jar app.jar

rm *.jar