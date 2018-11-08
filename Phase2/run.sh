export SHELL=/bin/zsh
export CLASSPATH=".:/usr/local/lib/antlr-4.7-complete.jar:$CLASSPATH"
alias antlr4='java -jar /usr/local/lib/antlr-4.7-complete.jar'
alias grun='java org.antlr.v4.gui.TestRig'

test_path="/Users/apple/Desktop/CDI_Phase2/DCodes/"
grammer_path="~/Desktop/CDI_Phase2/g.g4"
#antlr4 $grammer_path 
#if ["$1"="all"];
#then
#  echo "alllllll"
#fi
grun g program  < ${test_path}${1}".atk"
