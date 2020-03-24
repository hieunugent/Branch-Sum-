JC=javac
JA=java
JFLAG = -g
CP= -cp

default: clean program test run
clean:
	rm -f *.class
program:
	$(JC) $(JFLAG) BranchSum.java
test:
	$(JC) $(JFLAG) TestBranchSum.java TestRunner.java
run:
	$(JA) TestRunner
