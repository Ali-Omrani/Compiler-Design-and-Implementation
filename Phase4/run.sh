#!/usr/bin/env bash
export CLASSPATH=".:/usr/local/lib/antlr-4.7-complete.jar:$CLASSPATH"
rm *.class
rm *.tokens
rm g*.java
rm g2*.java
java -jar /usr/local/lib/antlr-4.7-complete.jar g.g4
java -jar /usr/local/lib/antlr-4.7-complete.jar g2.g4
javac *.java
java phase3 DCodes/10.atk