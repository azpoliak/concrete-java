#!/bin/bash
cd ..
java -cp .:target/* edu.jhu.hlt.concrete.kb.TAC09KB2Concrete $1 $2
cd -
