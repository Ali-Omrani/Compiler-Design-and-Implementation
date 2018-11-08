#!/usr/bin/env bash
export CLASSPATH=".:/usr/local/lib/antlr-4.7-complete.jar:$CLASSPATH"
alias antlr4='java -jar /usr/local/lib/antlr-4.7-complete.jar'
alias grun='java org.antlr.v4.gui.TestRig'

#rm *.java *.class *.tokens
antlr4 g.g4
antlr4 g2.g4
javac g*.java
