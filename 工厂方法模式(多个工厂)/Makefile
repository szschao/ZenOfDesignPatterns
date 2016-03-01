JAVA:=java -Dfile.encoding=UTF-8
JAVAC:=javac -J-Dfile.encoding=UTF-8 -encoding UTF-8

ifndef VERBOSE
  QUIET:=@
endif

all:NvWa.java
	$(QUIET)$(JAVAC) $<

clean:
	rm -f *.class

run:
	$(QUIET)$(JAVA) NvWa
